
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadMetaDataResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="uploadMetaDataResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://brandmaker.com/webservices/MediaPool/}uploadMetadataResult" minOccurs="0" form="qualified"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadMetaDataResponse", propOrder = {
    "_return"
})
public class UploadMetaDataResponse {

    @XmlElement(name = "return", namespace = "http://brandmaker.com/webservices/MediaPool/")
    protected UploadMetadataResult _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link UploadMetadataResult }
     *     
     */
    public UploadMetadataResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadMetadataResult }
     *     
     */
    public void setReturn(UploadMetadataResult value) {
        this._return = value;
    }

    public UploadMetaDataResponse withReturn(UploadMetadataResult value) {
        setReturn(value);
        return this;
    }

}
