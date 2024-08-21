
package com.example.soap.client.generated;

import jakarta.activation.DataHandler;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlMimeType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadMediaVersionAsStream complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="uploadMediaVersionAsStream">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mediaGuid" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         <element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
@XmlType(name = "uploadMediaVersionAsStream", propOrder = {
    "mediaGuid",
    "comment",
    "fileName",
    "fileData"
})
public class UploadMediaVersionAsStream {

    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/", required = true)
    protected String mediaGuid;
    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/")
    protected String comment;
    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/", required = true)
    protected String fileName;
    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/", required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler fileData;

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
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

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

    public UploadMediaVersionAsStream withMediaGuid(String value) {
        setMediaGuid(value);
        return this;
    }

    public UploadMediaVersionAsStream withComment(String value) {
        setComment(value);
        return this;
    }

    public UploadMediaVersionAsStream withFileName(String value) {
        setFileName(value);
        return this;
    }

    public UploadMediaVersionAsStream withFileData(DataHandler value) {
        setFileData(value);
        return this;
    }

}
