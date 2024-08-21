
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadMediaVersionArgument complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="uploadMediaVersionArgument">
 *   <complexContent>
 *     <extension base="{http://brandmaker.com/webservices/MediaPool/}uploadMediaArgument">
 *       <sequence>
 *         <element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mediaGuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadMediaVersionArgument", propOrder = {
    "comment",
    "mediaGuid"
})
public class UploadMediaVersionArgument
    extends UploadMediaArgument
{

    protected String comment;
    @XmlElement(required = true)
    protected String mediaGuid;

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

    public UploadMediaVersionArgument withComment(String value) {
        setComment(value);
        return this;
    }

    public UploadMediaVersionArgument withMediaGuid(String value) {
        setMediaGuid(value);
        return this;
    }

    @Override
    public UploadMediaVersionArgument withFileName(String value) {
        setFileName(value);
        return this;
    }

    @Override
    public UploadMediaVersionArgument withFileData(byte[] value) {
        setFileData(value);
        return this;
    }

}
