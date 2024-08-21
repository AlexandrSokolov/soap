
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMediaGuidByHash complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getMediaGuidByHash">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mediaGuidByHashData" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMediaGuidByHash", propOrder = {
    "mediaGuidByHashData"
})
public class GetMediaGuidByHash {

    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/", required = true)
    protected String mediaGuidByHashData;

    /**
     * Gets the value of the mediaGuidByHashData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaGuidByHashData() {
        return mediaGuidByHashData;
    }

    /**
     * Sets the value of the mediaGuidByHashData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaGuidByHashData(String value) {
        this.mediaGuidByHashData = value;
    }

    public GetMediaGuidByHash withMediaGuidByHashData(String value) {
        setMediaGuidByHashData(value);
        return this;
    }

}
