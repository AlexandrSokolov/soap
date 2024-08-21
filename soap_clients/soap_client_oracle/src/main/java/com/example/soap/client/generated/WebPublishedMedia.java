
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for webPublishedMedia complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="webPublishedMedia">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="webPublishedMediaData" type="{http://brandmaker.com/webservices/MediaPool/}webPublishedMediaArgument" minOccurs="0" form="qualified"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webPublishedMedia", propOrder = {
    "webPublishedMediaData"
})
public class WebPublishedMedia {

    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/")
    protected WebPublishedMediaArgument webPublishedMediaData;

    /**
     * Gets the value of the webPublishedMediaData property.
     * 
     * @return
     *     possible object is
     *     {@link WebPublishedMediaArgument }
     *     
     */
    public WebPublishedMediaArgument getWebPublishedMediaData() {
        return webPublishedMediaData;
    }

    /**
     * Sets the value of the webPublishedMediaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebPublishedMediaArgument }
     *     
     */
    public void setWebPublishedMediaData(WebPublishedMediaArgument value) {
        this.webPublishedMediaData = value;
    }

    public WebPublishedMedia withWebPublishedMediaData(WebPublishedMediaArgument value) {
        setWebPublishedMediaData(value);
        return this;
    }

}
