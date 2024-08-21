
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMediaDetailsArgument complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getMediaDetailsArgument">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mediaGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mediaHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMediaDetailsArgument", propOrder = {
    "mediaGuid",
    "mediaHash"
})
public class GetMediaDetailsArgument {

    protected String mediaGuid;
    protected String mediaHash;

    /**
     * Gets the value of the mediaGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaGuid() {
        return mediaGuid;
    }

    /**
     * Sets the value of the mediaGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaGuid(String value) {
        this.mediaGuid = value;
    }

    /**
     * Gets the value of the mediaHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaHash() {
        return mediaHash;
    }

    /**
     * Sets the value of the mediaHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaHash(String value) {
        this.mediaHash = value;
    }

    public GetMediaDetailsArgument withMediaGuid(String value) {
        setMediaGuid(value);
        return this;
    }

    public GetMediaDetailsArgument withMediaHash(String value) {
        setMediaHash(value);
        return this;
    }

}
