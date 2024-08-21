
package com.example.soap.client.generated;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for structuredKeywords complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="structuredKeywords">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="structuredKeyword" type="{http://brandmaker.com/webservices/MediaPool/}nameAndIdItem" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "structuredKeywords", propOrder = {
    "structuredKeyword"
})
public class StructuredKeywords {

    @XmlElement(nillable = true)
    protected List<NameAndIdItem> structuredKeyword;

    /**
     * Gets the value of the structuredKeyword property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structuredKeyword property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStructuredKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameAndIdItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the structuredKeyword property.
     */
    public List<NameAndIdItem> getStructuredKeyword() {
        if (structuredKeyword == null) {
            structuredKeyword = new ArrayList<>();
        }
        return this.structuredKeyword;
    }

    public StructuredKeywords withStructuredKeyword(NameAndIdItem... values) {
        if (values!= null) {
            for (NameAndIdItem value: values) {
                getStructuredKeyword().add(value);
            }
        }
        return this;
    }

    public StructuredKeywords withStructuredKeyword(Collection<NameAndIdItem> values) {
        if (values!= null) {
            getStructuredKeyword().addAll(values);
        }
        return this;
    }

}
