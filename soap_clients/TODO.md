### add ignore list, drop all idea-specific files

### lazy client init:

```java
  @Autowired
  private MpSoapConfigApi mpSoapConfigApi;

  private final AtomicReference<MediaPoolWebServicePortV2> mediaPoolWebServicePortV2 = new AtomicReference<>();

  private MediaPoolWebServicePortV2 getLazy() {
    var result = mediaPoolWebServicePortV2.get();
    if (result == null) {
      result = soapWebServicePortV2();
      if (!mediaPoolWebServicePortV2.compareAndSet(null, result)) {
        return mediaPoolWebServicePortV2.get();
      }
    }
    return result;
  }

  private MediaPoolWebServicePortV2 soapWebServicePortV2() {
    try {
      var wsdlUrl = mpSoapConfigApi.systemUrl() + "/webservices/qqq/v2/";
      var url = URI.create(wsdlUrl)
        .toURL();
      var service = new MediaPoolServiceV2(url);
      var mediaPoolWebServicePortV2 = service.getMediaPoolPortV2(new MTOMFeature());

      var bindingProvider = (BindingProvider) mediaPoolWebServicePortV2;
      bindingProvider.getRequestContext().putAll(
        Map.of(
          BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsdlUrl,
          BindingProvider.USERNAME_PROPERTY, mpSoapConfigApi.login(),
          BindingProvider.PASSWORD_PROPERTY, mpSoapConfigApi.password(),
          JAXWSProperties.CONNECT_TIMEOUT, 30000, //in MS 30000, 30 seconds, default: 30000, 30 seconds
          JAXWSProperties.REQUEST_TIMEOUT, 120000, //in MS 120000, 120 seconds, default: 60000, 60 seconds
          JAXWSProperties.HTTP_CLIENT_STREAMING_CHUNK_SIZE, 20971520 //20 Mb
        ));
      ((SOAPBinding) bindingProvider.getBinding()).setMTOMEnabled(true);
      return mediaPoolWebServicePortV2;
    } catch (MalformedURLException e) {
      throw new IllegalStateException("Could not parse url", e);
    }
  }

  @Override
  public Asset assetById(Integer id) {
    var mediaDetails = new GetMediaDetailsArgument()
      .withMediaGuid(id.toString());
    var soapDto = getLazy().getMediaDetails(mediaDetails);
    return new Asset(id, soapDto.getFileName());
  }
```


### file uploading

```java

  @Override
  public Integer uploadAsNewAsset(String fileName, InputStream inputStream) {
    var r = getLazy().uploadMediaAsStream(
      fileName,
      new StreamDataHandler(fileName, inputStream));

    if (!r.getWarnings().isEmpty()) {
      logger.warn(() -> "File uploading contains warnings: "
        + r.getWarnings().stream()
        .map(Warning::getWarning)
        .collect(Collectors.joining()));
    }

    if (r.isSuccess()) {
      return Integer.parseInt(r.getMediaGuid());
    } else {
      throw new IllegalStateException(
        "Failed to upload asset " + fileName
        + ". Errors: " + r.getError());
    }
  }

  public static class StreamDataHandler extends DataHandler {

    public StreamDataHandler(String fileName, InputStream inputStream) {
      super(new StreamDataSource(fileName, inputStream));
    }

    public static class StreamDataSource implements DataSource {
      private final String fileName;
      private final InputStream inputStream;

      public StreamDataSource(String fileName, InputStream inputStream) {
        this.fileName = fileName;
        this.inputStream = inputStream;
      }

      @Override
      public InputStream getInputStream() throws IOException {
        return inputStream;
      }

      @Override
      public OutputStream getOutputStream() throws IOException {
        throw new UnsupportedOperationException();
      }

      @Override
      public String getContentType() {
        return "";
      }

      @Override
      public String getName() {
        return fileName;
      }
    }
  }
```
https://stackoverflow.com/questions/2830561/how-can-i-convert-an-inputstream-to-a-datahandler

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