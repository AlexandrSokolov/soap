
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteMedia complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="deleteMedia">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="deleteMediaData" type="{http://brandmaker.com/webservices/MediaPool/}deleteMediaArgument" form="qualified"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteMedia", propOrder = {
    "deleteMediaData"
})
public class DeleteMedia {

    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/", required = true)
    protected DeleteMediaArgument deleteMediaData;

    /**
     * Gets the value of the deleteMediaData property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteMediaArgument }
     *     
     */
    public DeleteMediaArgument getDeleteMediaData() {
        return deleteMediaData;
    }

    /**
     * Sets the value of the deleteMediaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteMediaArgument }
     *     
     */
    public void setDeleteMediaData(DeleteMediaArgument value) {
        this.deleteMediaData = value;
    }

    public DeleteMedia withDeleteMediaData(DeleteMediaArgument value) {
        setDeleteMediaData(value);
        return this;
    }

}
