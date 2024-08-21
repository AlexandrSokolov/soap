package com.example.soap.client.api;

import com.example.soap.client.config.SoapConfigApi;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@TestConfiguration
public class TestSoapConfigApi {

  public static String DOMAIN = "https://system.url.com";
  public static final String LOGIN = "my-login";
  public static final String PASSWORD = "qqq";

  @Bean
  public SoapConfigApi soapConfigApi() {
    return new SoapConfigApi() {
      @Override
      public String systemUrl() {
        return DOMAIN;
      }

      @Override
      public String login() {
        return LOGIN;
      }

      @Override
      public String password() {
        return PASSWORD;
      }
    };
  }


}
