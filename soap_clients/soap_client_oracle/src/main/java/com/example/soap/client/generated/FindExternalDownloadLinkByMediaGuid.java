
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findExternalDownloadLinkByMediaGuid complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="findExternalDownloadLinkByMediaGuid">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mediaGuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findExternalDownloadLinkByMediaGuid", propOrder = {
    "mediaGuid"
})
public class FindExternalDownloadLinkByMediaGuid {

    protected Integer mediaGuid;

    /**
     * Gets the value of the mediaGuid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMediaGuid() {
        return mediaGuid;
    }

    /**
     * Sets the value of the mediaGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMediaGuid(Integer value) {
        this.mediaGuid = value;
    }

    public FindExternalDownloadLinkByMediaGuid withMediaGuid(Integer value) {
        setMediaGuid(value);
        return this;
    }

}
