
package com.example.soap.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMediaDetails complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getMediaDetails">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mediaDetailsData" type="{http://brandmaker.com/webservices/MediaPool/}getMediaDetailsArgument" form="qualified"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMediaDetails", propOrder = {
    "mediaDetailsData"
})
public class GetMediaDetails {

    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/", required = true)
    protected GetMediaDetailsArgument mediaDetailsData;

    /**
     * Gets the value of the mediaDetailsData property.
     * 
     * @return
     *     possible object is
     *     {@link GetMediaDetailsArgument }
     *     
     */
    public GetMediaDetailsArgument getMediaDetailsData() {
        return mediaDetailsData;
    }

    /**
     * Sets the value of the mediaDetailsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMediaDetailsArgument }
     *     
     */
    public void setMediaDetailsData(GetMediaDetailsArgument value) {
        this.mediaDetailsData = value;
    }

    public GetMediaDetails withMediaDetailsData(GetMediaDetailsArgument value) {
        setMediaDetailsData(value);
        return this;
    }

}
