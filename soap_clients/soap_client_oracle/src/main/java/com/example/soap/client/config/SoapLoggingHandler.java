package com.example.soap.client.config;

import jakarta.xml.soap.SOAPException;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import javax.xml.namespace.QName;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Set;

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
