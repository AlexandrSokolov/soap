This document describes topics, related to soap/jax-ws/jakarta-ws client programming. 

1. [Check what WS SPI provider is used](#check-what-ws-spi-provider-is-used)
2. [Soap client creation](#soap-client-creation)
3. [Configure soap client wit specific features, if needed.](#soap-client-configuration)
4. [Add basic authentication](#add-basic-authentication)
5. [SOAP requests and responses logging](#soap-requests-and-responses-logging)
6. [Add integration tests to send soap requests](../soap_client_oracle/src/test/java/com/example/soap/client/api/SoapClientApiIT.java)

- [todo Application Authentication with JAX-WS](https://mkyong.com/webservices/jax-ws/application-authentication-with-jax-ws/)
- [todo Setting a custom cookie in the HTTP headers inside a SOAP Message handler](https://stackoverflow.com/questions/18006210/setting-a-custom-cookie-in-the-http-headers-inside-a-soap-message-handler)
- [todo custo header with mac data](https://mkyong.com/webservices/jax-ws/jax-ws-soap-handler-in-client-side/)

### Check what WS SPI provider is used

It is required to understand how to configure soap client.

Open `jakarta.xml.ws.spi.Provider` type and find its inheritors.

If you configured your project correctly you must get exactly a single inheritor.

If you find more than a single inheritor you've misconfigured the dependencies.
If one of those multiple inheritors is `com.sun.xml.ws.spi.ProviderImpl`, then it will be used at runtime because it is  
marked as the default in `jakarta.xml.ws.spi.Provider`.

Anyway, correct the dependencies to have only a single implementation of `jakarta.xml.ws.spi.Provider`.

If you have no inheritors, the application will try to load the default `com.sun.xml.ws.spi.ProviderImpl`
and you'll the error:
> Caused by: java.lang.ClassNotFoundException: com.sun.xml.ws.spi.ProviderImpl

### Soap client creation

After the soap client code generation you have the following types:

```java
@WebService()
public interface MyServicePort {}
```
and:

```java
import jakarta.xml.ws.Service;

@WebServiceClient()
public class MyService extends Service {}
```
You need to get a proxy for `MyServicePort` interface via `MyService` class and invoke methods of `MyServicePort`:
```java
var soapServiceUrl = URI.create(soapConfigApi.systemUrl())
  .toURL();
var myService = new MyService(soapServiceUrl);
var soapClient = myService.getMyServicePort(); //returns instance of `MyServicePort`

var items = soapClient.findItems();
```

[See `SoapClient.init()`](../soap_client_oracle/src/main/java/com/example/soap/client/api/SoapClient.java)

#### Note: we pass domain/system url when create a soap client!
```java
var soapServiceUrl = URI.create(soapConfigApi.systemUrl()).toURL();
var myService = new MyService(soapServiceUrl);
```

### Soap client configuration

The configuration depends on WS SPI Provider you use
- [See `SoapClient.init()` for Oracle](../soap_client_oracle/src/main/java/com/example/soap/client/api/SoapClient.java)
- [TODO See `SoapClient.init()` for Apache Cxf](../soap_client_apache_cxf/src/main/java/com/example/soap/client/api/SoapClient.java)

### Add basic authentication

```java
      var bindingProvider = (BindingProvider)webServicePort;
      bindingProvider.getRequestContext().putAll(
        Map.of(
          BindingProvider.USERNAME_PROPERTY, soapConfigApi.login(),
          BindingProvider.PASSWORD_PROPERTY, soapConfigApi.password()));
```

[See `SoapClient.init()` for Oracle](../soap_client_oracle/src/main/java/com/example/soap/client/api/SoapClient.java)

### SOAP requests and responses logging

[Tracing XML request/responses with JAX-WS](https://stackoverflow.com/questions/1945618/tracing-xml-request-responses-with-jax-ws)
[JAX-WS Logging with Handler Example](https://examples.javacodegeeks.com/java-development/enterprise-java/jws/jax-ws-logging-with-handler-example/)

1. Logging of all communication to the console

  [See `SoapClientApiIT.beforeAll()`:](../soap_client_oracle/src/test/java/com/example/soap/client/api/SoapClientApiIT.java)

  ```java
        Map.of(
        "com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true",
          "com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true",
          "com.sun.xml.ws.transport.http.HttpAdapter.dump", "true",
          "com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true",
          "com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "999999")
        .forEach(System::setProperty);
  ```
  or the same result via properties:
  ```bash
  -Dcom.sun.xml.ws.transport.http.client.HttpTransportPipe.dump=true
  -Dcom.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump=true
  -Dcom.sun.xml.ws.transport.http.HttpAdapter.dump=true
  -Dcom.sun.xml.internal.ws.transport.http.HttpAdapter.dump=true
  -Dcom.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold=999999
  ```

2. [Using `SOAPHandler`](../soap_client_oracle/src/main/java/com/example/soap/client/config/SoapLoggingHandler.java)

Additional dependency for pretty output:
```xml
    <!-- https://mvnrepository.com/artifact/org.jdom/jdom2 -->
    <dependency>
      <groupId>org.jdom</groupId>
      <artifactId>jdom2</artifactId>
    </dependency>
```

`SOAPHandler` handler for debug logging:
```java
public class SoapLoggingHandler implements SOAPHandler<SOAPMessageContext> {

  private static final Logger logger = LogManager.getLogger(SoapLoggingHandler.class.getName());

  @Override
  public Set<QName> getHeaders() {
    return Set.of();
  }

  @Override
  public boolean handleMessage(SOAPMessageContext soapMessageContext) {
    if (!logger.isDebugEnabled()) {
      return true;
    }
    var isRequest = (Boolean) soapMessageContext.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY);
    if (isRequest) {
      logger.debug("SOAP Request:");
    } else {
      logger.debug("SOAP Response:");
    }
    try {
      var soapMsg = soapMessageContext.getMessage();
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      soapMsg.writeTo(baos);
      var originalXml = baos.toString(StandardCharsets.UTF_8);
      var doc = new SAXBuilder().build(new StringReader(originalXml));
      var prettyFormatXml = convertXmlDocumentToString(doc);
      logger.debug(prettyFormatXml);
    } catch (IOException | SOAPException | JDOMException e) {
      throw new IllegalStateException(e);
    }
    return true;
  }

  @Override
  public boolean handleFault(SOAPMessageContext soapMessageContext) {
    return false;
  }

  @Override
  public void close(MessageContext messageContext) {
  }

  private String convertXmlDocumentToString(Document doc) {
    XMLOutputter xmlOutput = new XMLOutputter();
    xmlOutput.setFormat(Format.getPrettyFormat());

    var result = new StringWriter();
    try {
      xmlOutput.output(doc, result);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return result.toString();
  }
}
```
[Register the handler:](../soap_client_oracle/src/main/java/com/example/soap/client/api/SoapClient.java):
```java
  var currentChain = bindingProvider.getBinding().getHandlerChain();
  currentChain.add(new SoapLoggingHandler());
  bindingProvider.getBinding().setHandlerChain(currentChain);
```

To understand, why setting a chain is required after its getting:
```java
/**
 * Gets a copy of the handler chain for a protocol binding instance.
 * If the returned chain is modified a call to 
 <code>setHandlerChain</code>
 * is required to configure the binding instance with the new chain.
 *
 *  @return java.util.List&lt;Handler> Handler chain
 */
 public java.util.List<javax.xml.ws.handler.Handler> getHandlerChain();
```

3. [todo Apache CXF Soap Request and Soap Response using Log4j](https://stackoverflow.com/questions/8065737/how-to-log-apache-cxf-soap-request-and-soap-response-using-log4j)

```xml
<!-- Log WebService's inputs and outputs -->
<logger name="org.apache.cxf.interceptor">
    <level value="INFO" />
    <appender-ref ref="[YOUR_LOGGER]" />
</logger>
```