
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadMediaVersion complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="uploadMediaVersion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="uploadMediaVersionData" type="{http://brandmaker.com/webservices/MediaPool/}uploadMediaVersionArgument" form="qualified"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadMediaVersion", propOrder = {
    "uploadMediaVersionData"
})
public class UploadMediaVersion {

    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/", required = true)
    protected UploadMediaVersionArgument uploadMediaVersionData;

    /**
     * Gets the value of the uploadMediaVersionData property.
     * 
     * @return
     *     possible object is
     *     {@link UploadMediaVersionArgument }
     *     
     */
    public UploadMediaVersionArgument getUploadMediaVersionData() {
        return uploadMediaVersionData;
    }

    /**
     * Sets the value of the uploadMediaVersionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadMediaVersionArgument }
     *     
     */
    public void setUploadMediaVersionData(UploadMediaVersionArgument value) {
        this.uploadMediaVersionData = value;
    }

    public UploadMediaVersion withUploadMediaVersionData(UploadMediaVersionArgument value) {
        setUploadMediaVersionData(value);
        return this;
    }

}
