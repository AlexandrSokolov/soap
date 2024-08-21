
package com.example.soap.client.generated;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for webPublishedMediaResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="webPublishedMediaResult">
 *   <complexContent>
 *     <extension base="{http://brandmaker.com/webservices/MediaPool/}result">
 *       <sequence>
 *         <element name="error" type="{http://brandmaker.com/webservices/MediaPool/}error" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mediaGuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="newFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="warnings" type="{http://brandmaker.com/webservices/MediaPool/}warning" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webPublishedMediaResult", propOrder = {
    "error",
    "info",
    "mediaGuid",
    "newFileName",
    "warnings"
})
public class WebPublishedMediaResult
    extends Result
{

    @XmlElement(nillable = true)
    protected List<Error> error;
    protected String info;
    protected Integer mediaGuid;
    protected String newFileName;
    @XmlElement(nillable = true)
    protected List<Warning> warnings;

    /**
     * Gets the value of the error property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Error }
     * </p>
     * 
     * 
     * @return
     *     The value of the error property.
     */
    public List<Error> getError() {
        if (error == null) {
            error = new ArrayList<>();
        }
        return this.error;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

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

    /**
     * Gets the value of the newFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewFileName() {
        return newFileName;
    }

    /**
     * Sets the value of the newFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewFileName(String value) {
        this.newFileName = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warnings property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Warning }
     * </p>
     * 
     * 
     * @return
     *     The value of the warnings property.
     */
    public List<Warning> getWarnings() {
        if (warnings == null) {
            warnings = new ArrayList<>();
        }
        return this.warnings;
    }

    public WebPublishedMediaResult withError(Error... values) {
        if (values!= null) {
            for (Error value: values) {
                getError().add(value);
            }
        }
        return this;
    }

    public WebPublishedMediaResult withError(Collection<Error> values) {
        if (values!= null) {
            getError().addAll(values);
        }
        return this;
    }

    public WebPublishedMediaResult withInfo(String value) {
        setInfo(value);
        return this;
    }

    public WebPublishedMediaResult withMediaGuid(Integer value) {
        setMediaGuid(value);
        return this;
    }

    public WebPublishedMediaResult withNewFileName(String value) {
        setNewFileName(value);
        return this;
    }

    public WebPublishedMediaResult withWarnings(Warning... values) {
        if (values!= null) {
            for (Warning value: values) {
                getWarnings().add(value);
            }
        }
        return this;
    }

    public WebPublishedMediaResult withWarnings(Collection<Warning> values) {
        if (values!= null) {
            getWarnings().addAll(values);
        }
        return this;
    }

    @Override
    public WebPublishedMediaResult withSuccess(boolean value) {
        setSuccess(value);
        return this;
    }

}
