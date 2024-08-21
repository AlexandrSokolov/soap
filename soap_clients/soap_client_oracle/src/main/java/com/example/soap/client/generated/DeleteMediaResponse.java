
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteMediaResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="deleteMediaResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://brandmaker.com/webservices/MediaPool/}deleteMediaResult" minOccurs="0" form="qualified"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteMediaResponse", propOrder = {
    "_return"
})
public class DeleteMediaResponse {

    @XmlElement(name = "return", namespace = "http://brandmaker.com/webservices/MediaPool/")
    protected DeleteMediaResult _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteMediaResult }
     *     
     */
    public DeleteMediaResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteMediaResult }
     *     
     */
    public void setReturn(DeleteMediaResult value) {
        this._return = value;
    }

    public DeleteMediaResponse withReturn(DeleteMediaResult value) {
        setReturn(value);
        return this;
    }

}
