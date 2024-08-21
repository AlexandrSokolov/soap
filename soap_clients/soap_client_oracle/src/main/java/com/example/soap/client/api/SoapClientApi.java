package com.example.soap.client.api;

public interface SoapClientApi {

  Asset byId(Integer id);
  Asset byIdWithCookie(Integer id, String cookieName, String cookieValue);
}
