
package com.example.soap.client.generated;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadMediaResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="uploadMediaResult">
 *   <complexContent>
 *     <extension base="{http://brandmaker.com/webservices/MediaPool/}result">
 *       <sequence>
 *         <element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mediaGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "uploadMediaResult", propOrder = {
    "error",
    "mediaGuid",
    "warnings"
})
public class UploadMediaResult
    extends Result
{

    protected String error;
    protected String mediaGuid;
    @XmlElement(nillable = true)
    protected List<Warning> warnings;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
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

    public UploadMediaResult withError(String value) {
        setError(value);
        return this;
    }

    public UploadMediaResult withMediaGuid(String value) {
        setMediaGuid(value);
        return this;
    }

    public UploadMediaResult withWarnings(Warning... values) {
        if (values!= null) {
            for (Warning value: values) {
                getWarnings().add(value);
            }
        }
        return this;
    }

    public UploadMediaResult withWarnings(Collection<Warning> values) {
        if (values!= null) {
            getWarnings().addAll(values);
        }
        return this;
    }

    @Override
    public UploadMediaResult withSuccess(boolean value) {
        setSuccess(value);
        return this;
    }

}
