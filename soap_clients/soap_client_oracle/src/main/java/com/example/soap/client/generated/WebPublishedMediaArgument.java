
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for webPublishedMediaArgument complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="webPublishedMediaArgument">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mediaGUID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="publishedFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="publishedTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webPublishedMediaArgument", propOrder = {
    "fileName",
    "mediaGUID",
    "publishedFrom",
    "publishedTo"
})
public class WebPublishedMediaArgument {

    protected String fileName;
    protected Integer mediaGUID;
    protected String publishedFrom;
    protected String publishedTo;

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
     * Gets the value of the mediaGUID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMediaGUID() {
        return mediaGUID;
    }

    /**
     * Sets the value of the mediaGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMediaGUID(Integer value) {
        this.mediaGUID = value;
    }

    /**
     * Gets the value of the publishedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedFrom() {
        return publishedFrom;
    }

    /**
     * Sets the value of the publishedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedFrom(String value) {
        this.publishedFrom = value;
    }

    /**
     * Gets the value of the publishedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedTo() {
        return publishedTo;
    }

    /**
     * Sets the value of the publishedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedTo(String value) {
        this.publishedTo = value;
    }

    public WebPublishedMediaArgument withFileName(String value) {
        setFileName(value);
        return this;
    }

    public WebPublishedMediaArgument withMediaGUID(Integer value) {
        setMediaGUID(value);
        return this;
    }

    public WebPublishedMediaArgument withPublishedFrom(String value) {
        setPublishedFrom(value);
        return this;
    }

    public WebPublishedMediaArgument withPublishedTo(String value) {
        setPublishedTo(value);
        return this;
    }

}
