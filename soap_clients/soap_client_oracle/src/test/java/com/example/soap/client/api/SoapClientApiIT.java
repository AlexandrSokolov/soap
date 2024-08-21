package com.example.soap.client.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Map;

@SpringBootTest
@ContextConfiguration(classes = { TestSoapConfigApi.class })
public class SoapClientApiIT {

  public static final Integer ASSET_ID = 2919144;

  @Autowired
  private SoapClientApi soapClientApi;

  @BeforeAll
  public static void beforeAll() {
    Map.of(
        "com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true",
        "com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true",
        "com.sun.xml.ws.transport.http.HttpAdapter.dump", "true",
        "com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true",
        "com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "999999")
      .forEach(System::setProperty);
  }

  @Test
  public void testById() {
    var asset = soapClientApi.byId(ASSET_ID);
    Assertions.assertNotNull(asset);
    Assertions.assertEquals(ASSET_ID, asset.id());
  }
}
