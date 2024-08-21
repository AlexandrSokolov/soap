
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateExternalDownloadLink complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="updateExternalDownloadLink">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="link" type="{http://brandmaker.com/webservices/MediaPool/}externalDownloadLink" minOccurs="0" form="qualified"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateExternalDownloadLink", propOrder = {
    "link"
})
public class UpdateExternalDownloadLink {

    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/")
    protected ExternalDownloadLink link;

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalDownloadLink }
     *     
     */
    public ExternalDownloadLink getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalDownloadLink }
     *     
     */
    public void setLink(ExternalDownloadLink value) {
        this.link = value;
    }

    public UpdateExternalDownloadLink withLink(ExternalDownloadLink value) {
        setLink(value);
        return this;
    }

}
