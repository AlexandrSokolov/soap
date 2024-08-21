
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setOfficialArgument complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="setOfficialArgument">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mediaGuid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setOfficialArgument", propOrder = {
    "mediaGuid",
    "versionNumber"
})
public class SetOfficialArgument {

    protected int mediaGuid;
    protected Integer versionNumber;

    /**
     * Gets the value of the mediaGuid property.
     * 
     */
    public int getMediaGuid() {
        return mediaGuid;
    }

    /**
     * Sets the value of the mediaGuid property.
     * 
     */
    public void setMediaGuid(int value) {
        this.mediaGuid = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersionNumber(Integer value) {
        this.versionNumber = value;
    }

    public SetOfficialArgument withMediaGuid(int value) {
        setMediaGuid(value);
        return this;
    }

    public SetOfficialArgument withVersionNumber(Integer value) {
        setVersionNumber(value);
        return this;
    }

}
