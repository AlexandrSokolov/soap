
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findExternalDownloadLinkByIdResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="findExternalDownloadLinkByIdResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="externalDownloadLink" type="{http://brandmaker.com/webservices/MediaPool/}externalDownloadLink" minOccurs="0" form="qualified"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findExternalDownloadLinkByIdResponse", propOrder = {
    "externalDownloadLink"
})
public class FindExternalDownloadLinkByIdResponse {

    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/")
    protected ExternalDownloadLink externalDownloadLink;

    /**
     * Gets the value of the externalDownloadLink property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalDownloadLink }
     *     
     */
    public ExternalDownloadLink getExternalDownloadLink() {
        return externalDownloadLink;
    }

    /**
     * Sets the value of the externalDownloadLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalDownloadLink }
     *     
     */
    public void setExternalDownloadLink(ExternalDownloadLink value) {
        this.externalDownloadLink = value;
    }

    public FindExternalDownloadLinkByIdResponse withExternalDownloadLink(ExternalDownloadLink value) {
        setExternalDownloadLink(value);
        return this;
    }

}
