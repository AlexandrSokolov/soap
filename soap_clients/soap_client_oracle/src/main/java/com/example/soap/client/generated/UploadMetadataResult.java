
package com.example.soap.client.generated;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadMetadataResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="uploadMetadataResult">
 *   <complexContent>
 *     <extension base="{http://brandmaker.com/webservices/MediaPool/}result">
 *       <sequence>
 *         <element name="errors" type="{http://brandmaker.com/webservices/MediaPool/}error" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "uploadMetadataResult", propOrder = {
    "errors",
    "warnings"
})
public class UploadMetadataResult
    extends Result
{

    @XmlElement(nillable = true)
    protected List<Error> errors;
    @XmlElement(nillable = true)
    protected List<Warning> warnings;

    /**
     * Gets the value of the errors property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getErrors().add(newItem);
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
     *     The value of the errors property.
     */
    public List<Error> getErrors() {
        if (errors == null) {
            errors = new ArrayList<>();
        }
        return this.errors;
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

    public UploadMetadataResult withErrors(Error... values) {
        if (values!= null) {
            for (Error value: values) {
                getErrors().add(value);
            }
        }
        return this;
    }

    public UploadMetadataResult withErrors(Collection<Error> values) {
        if (values!= null) {
            getErrors().addAll(values);
        }
        return this;
    }

    public UploadMetadataResult withWarnings(Warning... values) {
        if (values!= null) {
            for (Warning value: values) {
                getWarnings().add(value);
            }
        }
        return this;
    }

    public UploadMetadataResult withWarnings(Collection<Warning> values) {
        if (values!= null) {
            getWarnings().addAll(values);
        }
        return this;
    }

    @Override
    public UploadMetadataResult withSuccess(boolean value) {
        setSuccess(value);
        return this;
    }

}
