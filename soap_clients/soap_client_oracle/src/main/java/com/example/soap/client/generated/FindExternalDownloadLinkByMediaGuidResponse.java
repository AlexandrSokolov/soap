
package com.example.soap.client.generated;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findExternalDownloadLinkByMediaGuidResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="findExternalDownloadLinkByMediaGuidResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="externalDownloadLinks" type="{http://brandmaker.com/webservices/MediaPool/}externalDownloadLink" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findExternalDownloadLinkByMediaGuidResponse", propOrder = {
    "externalDownloadLinks"
})
public class FindExternalDownloadLinkByMediaGuidResponse {

    @XmlElement(namespace = "http://brandmaker.com/webservices/MediaPool/")
    protected List<ExternalDownloadLink> externalDownloadLinks;

    /**
     * Gets the value of the externalDownloadLinks property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalDownloadLinks property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExternalDownloadLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalDownloadLink }
     * </p>
     * 
     * 
     * @return
     *     The value of the externalDownloadLinks property.
     */
    public List<ExternalDownloadLink> getExternalDownloadLinks() {
        if (externalDownloadLinks == null) {
            externalDownloadLinks = new ArrayList<>();
        }
        return this.externalDownloadLinks;
    }

    public FindExternalDownloadLinkByMediaGuidResponse withExternalDownloadLinks(ExternalDownloadLink... values) {
        if (values!= null) {
            for (ExternalDownloadLink value: values) {
                getExternalDownloadLinks().add(value);
            }
        }
        return this;
    }

    public FindExternalDownloadLinkByMediaGuidResponse withExternalDownloadLinks(Collection<ExternalDownloadLink> values) {
        if (values!= null) {
            getExternalDownloadLinks().addAll(values);
        }
        return this;
    }

}
