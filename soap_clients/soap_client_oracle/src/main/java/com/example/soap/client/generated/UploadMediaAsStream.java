
package com.example.soap.client.generated;

import jakarta.activation.DataHandler;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlMimeType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadMediaAsStream complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="uploadMediaAsStream">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         <element name="fileData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" form="qualified"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadMediaAsStream", propOrder = {
    "fileName",
    "fileData"
})
public class UploadMediaAsStream {

    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/", required = true)
    protected String fileName;
    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/", required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler fileData;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileData property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getFileData() {
        return fileData;
    }

    /**
     * Sets the value of the fileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setFileData(DataHandler value) {
        this.fileData = value;
    }

    public UploadMediaAsStream withFileName(String value) {
        setFileName(value);
        return this;
    }

    public UploadMediaAsStream withFileData(DataHandler value) {
        setFileData(value);
        return this;
    }

}
