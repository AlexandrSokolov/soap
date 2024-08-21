
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setOfficial complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="setOfficial">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="setOfficialArgument" type="{http://brandmaker.com/webservices/MediaPool/}setOfficialArgument" minOccurs="0" form="qualified"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setOfficial", propOrder = {
    "setOfficialArgument"
})
public class SetOfficial {

    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/")
    protected SetOfficialArgument setOfficialArgument;

    /**
     * Gets the value of the setOfficialArgument property.
     * 
     * @return
     *     possible object is
     *     {@link SetOfficialArgument }
     *     
     */
    public SetOfficialArgument getSetOfficialArgument() {
        return setOfficialArgument;
    }

    /**
     * Sets the value of the setOfficialArgument property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetOfficialArgument }
     *     
     */
    public void setSetOfficialArgument(SetOfficialArgument value) {
        this.setOfficialArgument = value;
    }

    public SetOfficial withSetOfficialArgument(SetOfficialArgument value) {
        setSetOfficialArgument(value);
        return this;
    }

}
