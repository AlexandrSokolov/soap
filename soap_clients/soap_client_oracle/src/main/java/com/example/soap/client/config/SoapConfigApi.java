package com.example.soap.client.config;

import java.util.Optional;

public interface SoapConfigApi {

  String SYSTEM_EXTERNAL_URL_PROPERTY = "SYSTEM_EXTERNAL_URL";
  String SYSTEM_LOGIN_PROPERTY = "SOAP_LOGIN";
  String SYSTEM_PASSWORD_PROPERTY = "SOAP_PASSWORD";

  default String systemUrl() {
    return getOrThrow(SYSTEM_EXTERNAL_URL_PROPERTY);
  }

  default String login() {
    return getOrThrow(SYSTEM_LOGIN_PROPERTY);
  }

  default String password() {
    return getOrThrow(SYSTEM_PASSWORD_PROPERTY);
  }

  private String getOrThrow(String envVariableName) {
    return Optional.ofNullable(System.getenv(envVariableName))
      .orElseThrow(() -> new IllegalStateException(
        "Environment variable: '" + envVariableName + "' is not set or empty."));
  }
}
