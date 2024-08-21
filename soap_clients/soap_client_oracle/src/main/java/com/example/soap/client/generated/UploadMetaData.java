
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadMetaData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="uploadMetaData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="uploadMetaData" type="{http://brandmaker.com/webservices/MediaPool/}uploadMetadataArgument" form="qualified"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadMetaData", propOrder = {
    "uploadMetaData"
})
public class UploadMetaData {

    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/", required = true)
    protected UploadMetadataArgument uploadMetaData;

    /**
     * Gets the value of the uploadMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link UploadMetadataArgument }
     *     
     */
    public UploadMetadataArgument getUploadMetaData() {
        return uploadMetaData;
    }

    /**
     * Sets the value of the uploadMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadMetadataArgument }
     *     
     */
    public void setUploadMetaData(UploadMetadataArgument value) {
        this.uploadMetaData = value;
    }

    public UploadMetaData withUploadMetaData(UploadMetadataArgument value) {
        setUploadMetaData(value);
        return this;
    }

}
