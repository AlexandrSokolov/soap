
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadMediaArgument complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="uploadMediaArgument">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fileData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadMediaArgument", propOrder = {
    "fileName",
    "fileData"
})
@XmlSeeAlso({
    UploadMediaVersionArgument.class
})
public class UploadMediaArgument {

    @XmlElement(required = true)
    protected String fileName;
    @XmlElement(required = true)
    protected byte[] fileData;

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
     *     byte[]
     */
    public byte[] getFileData() {
        return fileData;
    }

    /**
     * Sets the value of the fileData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileData(byte[] value) {
        this.fileData = value;
    }

    public UploadMediaArgument withFileName(String value) {
        setFileName(value);
        return this;
    }

    public UploadMediaArgument withFileData(byte[] value) {
        setFileData(value);
        return this;
    }

}
