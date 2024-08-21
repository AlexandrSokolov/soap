## Notes:

This file describes only topics specific to the default spi provider from Oracle and its configurations.

[Here you can find how to use soap client and the related topics](../README.md)

## Topics:
- [how to enable a default `com.sun.xml.ws.spi.ProviderImpl` spi provider from Oracle](#enable-comsunxmlwsspiproviderimpl-ws-spi-provider-from-oracle)
- [where to find the configuration properties](#ws-soap-configuration-constants)
- 
- [SOAP Client timeouts configuration](#soap-client-timeouts-configuration)
- [Streaming SOAP Attachments (MTOM support)](#streaming-soap-attachments-mtom-support)


### Enable `com.sun.xml.ws.spi.ProviderImpl` WS SPI provider from Oracle

Add the following dependencies:

```xml
  <dependencies>
  <!-- https://mvnrepository.com/artifact/com.sun.xml.ws/jaxws-rt -->
  <dependency>
    <groupId>com.sun.xml.ws</groupId>
    <artifactId>jaxws-rt</artifactId>
    <version>4.0.3</version>
    <scope>runtime</scope>
  </dependency>
  <!-- https://mvnrepository.com/artifact/com.sun.xml.ws/jaxws-ri -->
  <dependency>
    <groupId>com.sun.xml.ws</groupId>
    <artifactId>jaxws-ri</artifactId>
    <version>4.0.3</version>
    <type>pom</type>
  </dependency>
</dependencies>
```

### Ws Soap Configuration constants

1. Defined in `jakarta.xml.ws.BindingProvider` interface

  This type is part of:
  ```xml
  <!-- https://mvnrepository.com/artifact/jakarta.xml.ws/jakarta.xml.ws-api -->
  <dependency>
    <groupId>jakarta.xml.ws</groupId>
    <artifactId>jakarta.xml.ws-api</artifactId>
    <version>4.0.2</version>
  </dependency>
  ```

  ```java
    String USERNAME_PROPERTY = "jakarta.xml.ws.security.auth.username";
    String PASSWORD_PROPERTY = "jakarta.xml.ws.security.auth.password";
    String ENDPOINT_ADDRESS_PROPERTY = "jakarta.xml.ws.service.endpoint.address";
    String SESSION_MAINTAIN_PROPERTY = "jakarta.xml.ws.session.maintain";
    String SOAPACTION_USE_PROPERTY = "jakarta.xml.ws.soap.http.soapaction.use";
    String SOAPACTION_URI_PROPERTY = "jakarta.xml.ws.soap.http.soapaction.uri";
  ```

2. Defined in `com.sun.xml.ws.developer.JAXWSProperties` interface

  ```java
  package com.sun.xml.ws.developer;

  public interface JAXWSProperties {
    String MTOM_THRESHOLOD_VALUE = "com.sun.xml.ws.common.MtomThresholdValue";
    String HTTP_EXCHANGE = "com.sun.xml.ws.http.exchange";
    String CONNECT_TIMEOUT = "com.sun.xml.ws.connect.timeout";
    String REQUEST_TIMEOUT = "com.sun.xml.ws.request.timeout";
    String HTTP_CLIENT_STREAMING_CHUNK_SIZE = "com.sun.xml.ws.transport.http.client.streaming.chunk.size";
    String HOSTNAME_VERIFIER = "com.sun.xml.ws.transport.https.client.hostname.verifier";
    String SSL_SOCKET_FACTORY = "com.sun.xml.ws.transport.https.client.SSLSocketFactory";
    String INBOUND_HEADER_LIST_PROPERTY = "com.sun.xml.ws.api.message.HeaderList";
    String WSENDPOINT = "com.sun.xml.ws.api.server.WSEndpoint";
    String ADDRESSING_TO = "com.sun.xml.ws.api.addressing.to";
    String ADDRESSING_FROM = "com.sun.xml.ws.api.addressing.from";
    String ADDRESSING_ACTION = "com.sun.xml.ws.api.addressing.action";
    String ADDRESSING_MESSAGEID = "com.sun.xml.ws.api.addressing.messageId";
    String HTTP_REQUEST_URL = "com.sun.xml.ws.transport.http.servlet.requestURL";
    String REST_BINDING = "http://jax-ws.dev.java.net/rest";
    String REQUEST_AUTHENTICATOR = "com.sun.xml.ws.request.authenticator";
  }
  ```
3. Defined in `com.sun.xml.ws.client.BindingProviderProperties` interface:

  ```java
  package com.sun.xml.ws.client;
  
  public interface BindingProviderProperties extends JAXWSProperties {
    String HTTP_COOKIE_JAR = "com.sun.xml.ws.client.http.CookieJar";
    String REDIRECT_REQUEST_PROPERTY = "com.sun.xml.ws.client.http.RedirectRequestProperty";
    String ONE_WAY_OPERATION = "com.sun.xml.ws.server.OneWayOperation";
    String JAXWS_HANDLER_CONFIG = "com.sun.xml.ws.handler.config";
    String JAXWS_CLIENT_HANDLE_PROPERTY = "com.sun.xml.ws.client.handle";
  }
  ```

### SOAP Client timeouts configuration

[See `SoapClient.init()`](src/main/java/com/example/soap/client/api/SoapClient.java)
```java
    var bindingProvider = (BindingProvider)webServicePort;
    bindingProvider.getRequestContext().putAll(
      Map.of(
        JAXWSProperties.CONNECT_TIMEOUT, 30000, //in MS 30000, 30 seconds, default: 30000, 30 seconds
        JAXWSProperties.REQUEST_TIMEOUT, 120000 //in MS 120000, 120 seconds, default: 60000, 60 seconds
      ));
```

Timeout properties:
```java
  String CONNECT_TIMEOUT = "com.sun.xml.ws.connect.timeout";
  String REQUEST_TIMEOUT = "com.sun.xml.ws.request.timeout";
```

### Streaming SOAP Attachments (MTOM support)

[Optimizing Binary Data Transmission Using MTOM/XOP](https://docs.oracle.com/cd/E15523_01/web.1111/e13734/mtom.htm#WSADV130)

1. enable MTOM, pass the `javax.xml.ws.soap.MTOMFeature` as a parameter when creating the Web Service proxy or dispatch.
2. Configure HTTP streaming support by enabling HTTP chunking on the MTOM streaming client.

  You cannot pass `MTOMFeature` when service is created:
  ```java
  var service = new MyService(url, /* with default 0 Threshold */ new MTOMFeature());
  ```
  You'll get:
  > Caused by: jakarta.xml.ws.WebServiceException: Doesn't support any Service specific features

  You must pass the `MTOMFeature` when get the port:
```java
      var service = new MyService(url);
      var webServicePort = service.getMediaPoolPort(/* with default 0 Threshold */ new MTOMFeature());

      var bindingProvider = (BindingProvider)webServicePort;
      bindingProvider.getRequestContext().putAll(
        Map.of(
          ...
          JAXWSProperties.HTTP_CLIENT_STREAMING_CHUNK_SIZE, 20971520 //20 Mb
        ));
```


