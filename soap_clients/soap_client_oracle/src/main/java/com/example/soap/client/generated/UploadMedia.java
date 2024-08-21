
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadMedia complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="uploadMedia">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="uploadMediaData" type="{http://brandmaker.com/webservices/MediaPool/}uploadMediaArgument" form="qualified"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadMedia", propOrder = {
    "uploadMediaData"
})
public class UploadMedia {

    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/", required = true)
    protected UploadMediaArgument uploadMediaData;

    /**
     * Gets the value of the uploadMediaData property.
     * 
     * @return
     *     possible object is
     *     {@link UploadMediaArgument }
     *     
     */
    public UploadMediaArgument getUploadMediaData() {
        return uploadMediaData;
    }

    /**
     * Sets the value of the uploadMediaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadMediaArgument }
     *     
     */
    public void setUploadMediaData(UploadMediaArgument value) {
        this.uploadMediaData = value;
    }

    public UploadMedia withUploadMediaData(UploadMediaArgument value) {
        setUploadMediaData(value);
        return this;
    }

}
