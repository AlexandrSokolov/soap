### https://docs.oracle.com/middleware/1212/wls/WSGET/jax-ws-mtom.htm#WSGET3469


### 

[03.4 Web Service Client Interceptor (SOAPHandler)](https://docs.google.com/document/d/1PmbiMnGY8I9vTGp07Y-ZmO66AGQYcqtRDs_2SN2m6mE/edit)

### add you own soap server with its own wsdl, use that wsdl in soap client

### run tests to make sure timeout constants work as expected!

### add sending cookie example

### sending file via stream - backend and soap client

[see also](https://docs.google.com/document/d/1H2ScoZ43kqLavJjkqBEUBquJZf9P1hYQ7nbZvMiPpMs/edit)

### [google soap docs](https://docs.google.com/document/d/17n21d16arS2SG8jmjjruxtfcw-Uggk9R_RnDs7H6KH8/edit)

### [Advanced Features of JAX-WS Web Services](https://docs.oracle.com/cd/E15523_01/web.1111/e13734)

### [Programming Advanced Features of JAX-WS Web Services for Oracle](https://docs.oracle.com/cd/E15523_01/web.1111/e13734/toc.htm)



### Add additional configuration

`setAllowChunking` - what is it?

```java
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

final HTTPConduit httpConduit = (HTTPConduit) ClientProxy.getClient(this.port).getConduit();
httpConduit.setClient(getHttpClientPolicy());

private HTTPClientPolicy getHttpClientPolicy() {
  final HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
  httpClientPolicy.setAllowChunking(true);
  httpClientPolicy.setConnectionTimeout(BaseConfig.SOAP_TIMEOUT);
  httpClientPolicy.setReceiveTimeout(BaseConfig.SOAP_TIMEOUT);
  return httpClientPolicy;
}
```

### Add proxy configuration 
```java
URL url = new URL(Config.getMediapoolEndpoint());
MediaPoolService mediaPoolService = new MediaPoolService(url);
if(Config.getProxyEnabled())
{
Client client = ClientProxy.getClient(mediaPoolService);
HTTPConduit http = (HTTPConduit) client.getConduit();
http.getClient().setProxyServer(Config.getProxyHTTPHost());
http.getClient().setProxyServerPort(Integer.parseInt(Config.getProxyHTTPPort()));
HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
httpClientPolicy.setNonProxyHosts(Config.getNonProxyHosts());
http.setClient(httpClientPolicy);
}
```

### [Stateful web services with CXF and annotation](https://docs.google.com/document/d/1ij-uH7SpLXuE4v8FCV46_nD-zwSVQBMQRSlSDEuDSqk/edit)



###

logging.level.org.apache.cxf.services = INFO

    @Bean
    public LoggingFeature loggingFeature() {
        LoggingFeature loggingFeature = new LoggingFeature();
        loggingFeature.setPrettyLogging(true);
        return loggingFeature;
    }

        JaxWsProxyFactoryBean fb = new JaxWsProxyFactoryBean();
        fb.setServiceClass(HelloWorldWS.class);
        fb.setWsdlLocation("/META-INF/wsdl/HelloWorldWSService.wsdl");
        fb.setServiceName(new QName("http://ws.soapcxfconsumer.cfxconsumer.com/",
                "HelloWorldWSImplService"));

        Map<String, Object> properties = fb.getProperties();
        if(properties == null){
            properties = new HashMap<>();
        }

        properties.put("javax.xml.ws.client.connectionTimeout", 5000);
        properties.put("javax.xml.ws.client.receiveTimeout", 3000);

        fb.setProperties(properties);

        fb.getFeatures().add(loggingFeature);

https://dzone.com/articles/consuming-soap-service-with-apache-cxf-and-spring

      <dependency>
         <groupId>org.apache.cxf</groupId>
         <artifactId>cxf-rt-features-logging</artifactId>
         <version>3.3.0</version>
         <type>jar</type>
      </dependency>
      <dependency>
         <groupId>org.apache.cxf</groupId>
         <artifactId>cxf-rt-frontend-simple</artifactId>
         <version>3.3.0</version>
         <type>jar</type>
      </dependency>
      <dependency>
         <groupId>org.apache.cxf</groupId>
         <artifactId>cxf-rt-transports-http</artifactId>
         <version>3.3.0</version>
      </dependency>
      <dependency>
         <groupId>org.apache.cxf</groupId>
         <artifactId>cxf-rt-frontend-jaxws</artifactId>
         <version>3.3.0</version>
      </dependency>
###

amazon project

      URL url = new URL(soapUrl);
      DsePortTypeV2 portV2 = new DseServiceV2(url).getDsePortV2();
      BindingProvider bindingProvider = (BindingProvider) portV2;
      final Map<String, Object> requestContext =
        bindingProvider.getRequestContext();
      requestContext.put(BindingProvider.USERNAME_PROPERTY,
        login);
      requestContext.put(BindingProvider.PASSWORD_PROPERTY,
        password);

      final HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
      httpClientPolicy.setAllowChunking(true);

      final HTTPConduit httpConduit =
        (HTTPConduit) ClientProxy.getClient(portV2)
          .getConduit();
      httpConduit.setClient(httpClientPolicy);

### jax ws features

check the other:

jakarta.xml.ws.WebServiceFeature and its inheritors,

like jakarta.xml.ws.soap.MTOMFeature