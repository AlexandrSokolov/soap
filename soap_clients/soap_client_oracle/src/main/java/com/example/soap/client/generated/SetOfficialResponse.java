
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setOfficialResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="setOfficialResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://brandmaker.com/webservices/MediaPool/}setOfficialResult" minOccurs="0" form="qualified"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setOfficialResponse", propOrder = {
    "_return"
})
public class SetOfficialResponse {

    @XmlElement(name = "return", namespace = "http://brandmaker.com/webservices/MediaPool/")
    protected SetOfficialResult _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SetOfficialResult }
     *     
     */
    public SetOfficialResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetOfficialResult }
     *     
     */
    public void setReturn(SetOfficialResult value) {
        this._return = value;
    }

    public SetOfficialResponse withReturn(SetOfficialResult value) {
        setReturn(value);
        return this;
    }

}
