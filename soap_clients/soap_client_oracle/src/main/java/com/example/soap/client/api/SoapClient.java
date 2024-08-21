package com.example.soap.client.api;

import com.example.soap.client.config.SoapConfigApi;
import com.example.soap.client.config.SoapLoggingHandler;
import com.example.soap.client.generated.GetMediaDetailsArgument;
import com.example.soap.client.generated.MediaPoolService;
import com.example.soap.client.generated.MediaPoolWebServicePort;
import com.sun.xml.ws.developer.JAXWSProperties;
import jakarta.annotation.PostConstruct;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.soap.MTOMFeature;
import jakarta.xml.ws.soap.SOAPBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.Collections;
import java.util.Map;
import java.util.Set;


@Service
public class SoapClient implements SoapClientApi {

  @Autowired
  private SoapConfigApi soapConfigApi;

  private MediaPoolWebServicePort webServicePort;

  @PostConstruct
  public void init() {
    try {
      var wsdlUrl = soapConfigApi.systemUrl() + "/webservices/MediaPool/";
      var url = URI.create(wsdlUrl)
        .toURL();
      //Caused by: jakarta.xml.ws.WebServiceException: Doesn't support any Service specific features
      //var service = new MediaPoolService(url, /* with default 0 Threshold */ new MTOMFeature());
      var service = new MediaPoolService(url);
      this.webServicePort = service.getMediaPoolPort(/* with default 0 Threshold */ new MTOMFeature());

      var bindingProvider = (BindingProvider)webServicePort;
      bindingProvider.getRequestContext().putAll(
        Map.of(
          BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsdlUrl,
          BindingProvider.USERNAME_PROPERTY, soapConfigApi.login(),
          BindingProvider.PASSWORD_PROPERTY, soapConfigApi.password(),
          JAXWSProperties.CONNECT_TIMEOUT, 30000, //in MS 30000, 30 seconds, default: 30000, 30 seconds
          JAXWSProperties.REQUEST_TIMEOUT, 120000, //in MS 120000, 120 seconds, default: 60000, 60 seconds
          JAXWSProperties.HTTP_CLIENT_STREAMING_CHUNK_SIZE, 20971520 //20 Mb
        ));
      ((SOAPBinding) bindingProvider.getBinding()).setMTOMEnabled(true);

      var currentChain = bindingProvider.getBinding().getHandlerChain();
      currentChain.add(new SoapLoggingHandler());
      bindingProvider.getBinding().setHandlerChain(currentChain);

    } catch (MalformedURLException e) {
      throw new IllegalStateException("Could not parse url", e);
    }
  }

  @Override
  public Asset byId(Integer id) {
    var mediaDetails = new GetMediaDetailsArgument()
      .withMediaGuid(id.toString());
    var soapDto = this.webServicePort.getMediaDetails(mediaDetails);
    return new Asset(id, soapDto.getFileName());
  }

  @Override
  public Asset byIdWithCookie(Integer id, String cookieName, String cookieValue) {

    var bindingProvider = (BindingProvider)webServicePort;
    bindingProvider.getRequestContext().put(
      MessageContext.HTTP_REQUEST_HEADERS,
      Collections.singletonMap("Cookie", Collections.singletonList("xxx")));

    return byId(id);
  }


}
