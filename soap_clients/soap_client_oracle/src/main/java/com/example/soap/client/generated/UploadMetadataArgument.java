
package com.example.soap.client.generated;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadMetadataArgument complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="uploadMetadataArgument">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="addAssociations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="approve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="approveDescription" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="articleDescription" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="articleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="associations" type="{http://brandmaker.com/webservices/MediaPool/}themeDto" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="countryCodes" type="{http://brandmaker.com/webservices/MediaPool/}code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="creatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="description" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="designationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fontChecked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="freeField1" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField10" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField11" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField12" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField13" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField14" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField15" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField16" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField17" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField18" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField19" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField2" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField20" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField3" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField4" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField5" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField6" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField7" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField8" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="freeField9" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="hideIfNotValid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="isHires" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="keepIfEmtpy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="keyword" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="license" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="licenseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mediaGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mediaHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mediaIsins" type="{http://brandmaker.com/webservices/MediaPool/}isin" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="mediaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mediaTitle" type="{http://brandmaker.com/webservices/MediaPool/}languageItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="official" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="platform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="programVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="selectedAffiliate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="show" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="strict" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="structuredKeywords" type="{http://brandmaker.com/webservices/MediaPool/}structuredKeywords" minOccurs="0"/>
 *         <element name="validDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="validDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="virtualDbName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadMetadataArgument", propOrder = {
    "addAssociations",
    "approve",
    "approveDescription",
    "articleDescription",
    "articleNumber",
    "associations",
    "countryCodes",
    "creatorName",
    "description",
    "designationType",
    "fileName",
    "fontChecked",
    "freeField1",
    "freeField10",
    "freeField11",
    "freeField12",
    "freeField13",
    "freeField14",
    "freeField15",
    "freeField16",
    "freeField17",
    "freeField18",
    "freeField19",
    "freeField2",
    "freeField20",
    "freeField3",
    "freeField4",
    "freeField5",
    "freeField6",
    "freeField7",
    "freeField8",
    "freeField9",
    "hideIfNotValid",
    "isHires",
    "keepIfEmtpy",
    "keyword",
    "license",
    "licenseName",
    "mediaGuid",
    "mediaHash",
    "mediaIsins",
    "mediaNumber",
    "mediaTitle",
    "official",
    "platform",
    "programVersion",
    "selectedAffiliate",
    "show",
    "strict",
    "structuredKeywords",
    "validDateFrom",
    "validDateTo",
    "virtualDbName"
})
@XmlSeeAlso({
    GetMediaDetailsResult.class
})
public class UploadMetadataArgument {

    protected Boolean addAssociations;
    protected String approve;
    @XmlElement(nillable = true)
    protected List<LanguageItem> approveDescription;
    @XmlElement(nillable = true)
    protected List<LanguageItem> articleDescription;
    protected String articleNumber;
    @XmlElement(nillable = true)
    protected List<ThemeDto> associations;
    @XmlElement(nillable = true)
    protected List<Code> countryCodes;
    protected String creatorName;
    @XmlElement(nillable = true)
    protected List<LanguageItem> description;
    protected String designationType;
    protected String fileName;
    protected String fontChecked;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField1;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField10;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField11;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField12;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField13;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField14;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField15;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField16;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField17;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField18;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField19;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField2;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField20;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField3;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField4;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField5;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField6;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField7;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField8;
    @XmlElement(nillable = true)
    protected List<LanguageItem> freeField9;
    protected String hideIfNotValid;
    protected String isHires;
    protected Boolean keepIfEmtpy;
    @XmlElement(nillable = true)
    protected List<LanguageItem> keyword;
    protected String license;
    protected String licenseName;
    protected String mediaGuid;
    protected String mediaHash;
    @XmlElement(nillable = true)
    protected List<Isin> mediaIsins;
    protected String mediaNumber;
    @XmlElement(nillable = true)
    protected List<LanguageItem> mediaTitle;
    protected Boolean official;
    protected String platform;
    protected String programVersion;
    protected String selectedAffiliate;
    protected String show;
    protected Boolean strict;
    protected StructuredKeywords structuredKeywords;
    protected String validDateFrom;
    protected String validDateTo;
    protected String virtualDbName;

    /**
     * Gets the value of the addAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddAssociations() {
        return addAssociations;
    }

    /**
     * Sets the value of the addAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddAssociations(Boolean value) {
        this.addAssociations = value;
    }

    /**
     * Gets the value of the approve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprove() {
        return approve;
    }

    /**
     * Sets the value of the approve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprove(String value) {
        this.approve = value;
    }

    /**
     * Gets the value of the approveDescription property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approveDescription property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getApproveDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the approveDescription property.
     */
    public List<LanguageItem> getApproveDescription() {
        if (approveDescription == null) {
            approveDescription = new ArrayList<>();
        }
        return this.approveDescription;
    }

    /**
     * Gets the value of the articleDescription property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articleDescription property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getArticleDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the articleDescription property.
     */
    public List<LanguageItem> getArticleDescription() {
        if (articleDescription == null) {
            articleDescription = new ArrayList<>();
        }
        return this.articleDescription;
    }

    /**
     * Gets the value of the articleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleNumber() {
        return articleNumber;
    }

    /**
     * Sets the value of the articleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleNumber(String value) {
        this.articleNumber = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associations property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThemeDto }
     * </p>
     * 
     * 
     * @return
     *     The value of the associations property.
     */
    public List<ThemeDto> getAssociations() {
        if (associations == null) {
            associations = new ArrayList<>();
        }
        return this.associations;
    }

    /**
     * Gets the value of the countryCodes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryCodes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCountryCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Code }
     * </p>
     * 
     * 
     * @return
     *     The value of the countryCodes property.
     */
    public List<Code> getCountryCodes() {
        if (countryCodes == null) {
            countryCodes = new ArrayList<>();
        }
        return this.countryCodes;
    }

    /**
     * Gets the value of the creatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * Sets the value of the creatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorName(String value) {
        this.creatorName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the description property.
     */
    public List<LanguageItem> getDescription() {
        if (description == null) {
            description = new ArrayList<>();
        }
        return this.description;
    }

    /**
     * Gets the value of the designationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignationType() {
        return designationType;
    }

    /**
     * Sets the value of the designationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignationType(String value) {
        this.designationType = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fontChecked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontChecked() {
        return fontChecked;
    }

    /**
     * Sets the value of the fontChecked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontChecked(String value) {
        this.fontChecked = value;
    }

    /**
     * Gets the value of the freeField1 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField1 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField1 property.
     */
    public List<LanguageItem> getFreeField1() {
        if (freeField1 == null) {
            freeField1 = new ArrayList<>();
        }
        return this.freeField1;
    }

    /**
     * Gets the value of the freeField10 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField10 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField10().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField10 property.
     */
    public List<LanguageItem> getFreeField10() {
        if (freeField10 == null) {
            freeField10 = new ArrayList<>();
        }
        return this.freeField10;
    }

    /**
     * Gets the value of the freeField11 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField11 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField11().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField11 property.
     */
    public List<LanguageItem> getFreeField11() {
        if (freeField11 == null) {
            freeField11 = new ArrayList<>();
        }
        return this.freeField11;
    }

    /**
     * Gets the value of the freeField12 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField12 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField12().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField12 property.
     */
    public List<LanguageItem> getFreeField12() {
        if (freeField12 == null) {
            freeField12 = new ArrayList<>();
        }
        return this.freeField12;
    }

    /**
     * Gets the value of the freeField13 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField13 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField13().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField13 property.
     */
    public List<LanguageItem> getFreeField13() {
        if (freeField13 == null) {
            freeField13 = new ArrayList<>();
        }
        return this.freeField13;
    }

    /**
     * Gets the value of the freeField14 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField14 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField14().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField14 property.
     */
    public List<LanguageItem> getFreeField14() {
        if (freeField14 == null) {
            freeField14 = new ArrayList<>();
        }
        return this.freeField14;
    }

    /**
     * Gets the value of the freeField15 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField15 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField15().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField15 property.
     */
    public List<LanguageItem> getFreeField15() {
        if (freeField15 == null) {
            freeField15 = new ArrayList<>();
        }
        return this.freeField15;
    }

    /**
     * Gets the value of the freeField16 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField16 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField16().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField16 property.
     */
    public List<LanguageItem> getFreeField16() {
        if (freeField16 == null) {
            freeField16 = new ArrayList<>();
        }
        return this.freeField16;
    }

    /**
     * Gets the value of the freeField17 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField17 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField17().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField17 property.
     */
    public List<LanguageItem> getFreeField17() {
        if (freeField17 == null) {
            freeField17 = new ArrayList<>();
        }
        return this.freeField17;
    }

    /**
     * Gets the value of the freeField18 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField18 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField18().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField18 property.
     */
    public List<LanguageItem> getFreeField18() {
        if (freeField18 == null) {
            freeField18 = new ArrayList<>();
        }
        return this.freeField18;
    }

    /**
     * Gets the value of the freeField19 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField19 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField19().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField19 property.
     */
    public List<LanguageItem> getFreeField19() {
        if (freeField19 == null) {
            freeField19 = new ArrayList<>();
        }
        return this.freeField19;
    }

    /**
     * Gets the value of the freeField2 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField2 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField2 property.
     */
    public List<LanguageItem> getFreeField2() {
        if (freeField2 == null) {
            freeField2 = new ArrayList<>();
        }
        return this.freeField2;
    }

    /**
     * Gets the value of the freeField20 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField20 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField20 property.
     */
    public List<LanguageItem> getFreeField20() {
        if (freeField20 == null) {
            freeField20 = new ArrayList<>();
        }
        return this.freeField20;
    }

    /**
     * Gets the value of the freeField3 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField3 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField3 property.
     */
    public List<LanguageItem> getFreeField3() {
        if (freeField3 == null) {
            freeField3 = new ArrayList<>();
        }
        return this.freeField3;
    }

    /**
     * Gets the value of the freeField4 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField4 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField4 property.
     */
    public List<LanguageItem> getFreeField4() {
        if (freeField4 == null) {
            freeField4 = new ArrayList<>();
        }
        return this.freeField4;
    }

    /**
     * Gets the value of the freeField5 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField5 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField5 property.
     */
    public List<LanguageItem> getFreeField5() {
        if (freeField5 == null) {
            freeField5 = new ArrayList<>();
        }
        return this.freeField5;
    }

    /**
     * Gets the value of the freeField6 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField6 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField6().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField6 property.
     */
    public List<LanguageItem> getFreeField6() {
        if (freeField6 == null) {
            freeField6 = new ArrayList<>();
        }
        return this.freeField6;
    }

    /**
     * Gets the value of the freeField7 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField7 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField7().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField7 property.
     */
    public List<LanguageItem> getFreeField7() {
        if (freeField7 == null) {
            freeField7 = new ArrayList<>();
        }
        return this.freeField7;
    }

    /**
     * Gets the value of the freeField8 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField8 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField8().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField8 property.
     */
    public List<LanguageItem> getFreeField8() {
        if (freeField8 == null) {
            freeField8 = new ArrayList<>();
        }
        return this.freeField8;
    }

    /**
     * Gets the value of the freeField9 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeField9 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFreeField9().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the freeField9 property.
     */
    public List<LanguageItem> getFreeField9() {
        if (freeField9 == null) {
            freeField9 = new ArrayList<>();
        }
        return this.freeField9;
    }

    /**
     * Gets the value of the hideIfNotValid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHideIfNotValid() {
        return hideIfNotValid;
    }

    /**
     * Sets the value of the hideIfNotValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHideIfNotValid(String value) {
        this.hideIfNotValid = value;
    }

    /**
     * Gets the value of the isHires property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHires() {
        return isHires;
    }

    /**
     * Sets the value of the isHires property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHires(String value) {
        this.isHires = value;
    }

    /**
     * Gets the value of the keepIfEmtpy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepIfEmtpy() {
        return keepIfEmtpy;
    }

    /**
     * Sets the value of the keepIfEmtpy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepIfEmtpy(Boolean value) {
        this.keepIfEmtpy = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the keyword property.
     */
    public List<LanguageItem> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<>();
        }
        return this.keyword;
    }

    /**
     * Gets the value of the license property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicense(String value) {
        this.license = value;
    }

    /**
     * Gets the value of the licenseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseName() {
        return licenseName;
    }

    /**
     * Sets the value of the licenseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseName(String value) {
        this.licenseName = value;
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
     * Gets the value of the mediaHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaHash() {
        return mediaHash;
    }

    /**
     * Sets the value of the mediaHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaHash(String value) {
        this.mediaHash = value;
    }

    /**
     * Gets the value of the mediaIsins property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaIsins property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMediaIsins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Isin }
     * </p>
     * 
     * 
     * @return
     *     The value of the mediaIsins property.
     */
    public List<Isin> getMediaIsins() {
        if (mediaIsins == null) {
            mediaIsins = new ArrayList<>();
        }
        return this.mediaIsins;
    }

    /**
     * Gets the value of the mediaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaNumber() {
        return mediaNumber;
    }

    /**
     * Sets the value of the mediaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaNumber(String value) {
        this.mediaNumber = value;
    }

    /**
     * Gets the value of the mediaTitle property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaTitle property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMediaTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the mediaTitle property.
     */
    public List<LanguageItem> getMediaTitle() {
        if (mediaTitle == null) {
            mediaTitle = new ArrayList<>();
        }
        return this.mediaTitle;
    }

    /**
     * Gets the value of the official property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfficial() {
        return official;
    }

    /**
     * Sets the value of the official property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfficial(Boolean value) {
        this.official = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatform(String value) {
        this.platform = value;
    }

    /**
     * Gets the value of the programVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramVersion() {
        return programVersion;
    }

    /**
     * Sets the value of the programVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramVersion(String value) {
        this.programVersion = value;
    }

    /**
     * Gets the value of the selectedAffiliate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedAffiliate() {
        return selectedAffiliate;
    }

    /**
     * Sets the value of the selectedAffiliate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedAffiliate(String value) {
        this.selectedAffiliate = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    /**
     * Gets the value of the strict property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrict() {
        return strict;
    }

    /**
     * Sets the value of the strict property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrict(Boolean value) {
        this.strict = value;
    }

    /**
     * Gets the value of the structuredKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredKeywords }
     *     
     */
    public StructuredKeywords getStructuredKeywords() {
        return structuredKeywords;
    }

    /**
     * Sets the value of the structuredKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredKeywords }
     *     
     */
    public void setStructuredKeywords(StructuredKeywords value) {
        this.structuredKeywords = value;
    }

    /**
     * Gets the value of the validDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidDateFrom() {
        return validDateFrom;
    }

    /**
     * Sets the value of the validDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidDateFrom(String value) {
        this.validDateFrom = value;
    }

    /**
     * Gets the value of the validDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidDateTo() {
        return validDateTo;
    }

    /**
     * Sets the value of the validDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidDateTo(String value) {
        this.validDateTo = value;
    }

    /**
     * Gets the value of the virtualDbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualDbName() {
        return virtualDbName;
    }

    /**
     * Sets the value of the virtualDbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualDbName(String value) {
        this.virtualDbName = value;
    }

    public UploadMetadataArgument withAddAssociations(Boolean value) {
        setAddAssociations(value);
        return this;
    }

    public UploadMetadataArgument withApprove(String value) {
        setApprove(value);
        return this;
    }

    public UploadMetadataArgument withApproveDescription(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getApproveDescription().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withApproveDescription(Collection<LanguageItem> values) {
        if (values!= null) {
            getApproveDescription().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withArticleDescription(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getArticleDescription().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withArticleDescription(Collection<LanguageItem> values) {
        if (values!= null) {
            getArticleDescription().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withArticleNumber(String value) {
        setArticleNumber(value);
        return this;
    }

    public UploadMetadataArgument withAssociations(ThemeDto... values) {
        if (values!= null) {
            for (ThemeDto value: values) {
                getAssociations().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withAssociations(Collection<ThemeDto> values) {
        if (values!= null) {
            getAssociations().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withCountryCodes(Code... values) {
        if (values!= null) {
            for (Code value: values) {
                getCountryCodes().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withCountryCodes(Collection<Code> values) {
        if (values!= null) {
            getCountryCodes().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withCreatorName(String value) {
        setCreatorName(value);
        return this;
    }

    public UploadMetadataArgument withDescription(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withDescription(Collection<LanguageItem> values) {
        if (values!= null) {
            getDescription().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withDesignationType(String value) {
        setDesignationType(value);
        return this;
    }

    public UploadMetadataArgument withFileName(String value) {
        setFileName(value);
        return this;
    }

    public UploadMetadataArgument withFontChecked(String value) {
        setFontChecked(value);
        return this;
    }

    public UploadMetadataArgument withFreeField1(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField1().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField1(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField1().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField10(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField10().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField10(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField10().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField11(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField11().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField11(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField11().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField12(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField12().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField12(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField12().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField13(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField13().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField13(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField13().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField14(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField14().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField14(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField14().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField15(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField15().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField15(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField15().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField16(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField16().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField16(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField16().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField17(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField17().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField17(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField17().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField18(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField18().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField18(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField18().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField19(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField19().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField19(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField19().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField2(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField2().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField2(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField2().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField20(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField20().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField20(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField20().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField3(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField3().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField3(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField3().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField4(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField4().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField4(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField4().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField5(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField5().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField5(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField5().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField6(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField6().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField6(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField6().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField7(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField7().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField7(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField7().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField8(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField8().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField8(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField8().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withFreeField9(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField9().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withFreeField9(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField9().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withHideIfNotValid(String value) {
        setHideIfNotValid(value);
        return this;
    }

    public UploadMetadataArgument withIsHires(String value) {
        setIsHires(value);
        return this;
    }

    public UploadMetadataArgument withKeepIfEmtpy(Boolean value) {
        setKeepIfEmtpy(value);
        return this;
    }

    public UploadMetadataArgument withKeyword(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getKeyword().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withKeyword(Collection<LanguageItem> values) {
        if (values!= null) {
            getKeyword().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withLicense(String value) {
        setLicense(value);
        return this;
    }

    public UploadMetadataArgument withLicenseName(String value) {
        setLicenseName(value);
        return this;
    }

    public UploadMetadataArgument withMediaGuid(String value) {
        setMediaGuid(value);
        return this;
    }

    public UploadMetadataArgument withMediaHash(String value) {
        setMediaHash(value);
        return this;
    }

    public UploadMetadataArgument withMediaIsins(Isin... values) {
        if (values!= null) {
            for (Isin value: values) {
                getMediaIsins().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withMediaIsins(Collection<Isin> values) {
        if (values!= null) {
            getMediaIsins().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withMediaNumber(String value) {
        setMediaNumber(value);
        return this;
    }

    public UploadMetadataArgument withMediaTitle(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getMediaTitle().add(value);
            }
        }
        return this;
    }

    public UploadMetadataArgument withMediaTitle(Collection<LanguageItem> values) {
        if (values!= null) {
            getMediaTitle().addAll(values);
        }
        return this;
    }

    public UploadMetadataArgument withOfficial(Boolean value) {
        setOfficial(value);
        return this;
    }

    public UploadMetadataArgument withPlatform(String value) {
        setPlatform(value);
        return this;
    }

    public UploadMetadataArgument withProgramVersion(String value) {
        setProgramVersion(value);
        return this;
    }

    public UploadMetadataArgument withSelectedAffiliate(String value) {
        setSelectedAffiliate(value);
        return this;
    }

    public UploadMetadataArgument withShow(String value) {
        setShow(value);
        return this;
    }

    public UploadMetadataArgument withStrict(Boolean value) {
        setStrict(value);
        return this;
    }

    public UploadMetadataArgument withStructuredKeywords(StructuredKeywords value) {
        setStructuredKeywords(value);
        return this;
    }

    public UploadMetadataArgument withValidDateFrom(String value) {
        setValidDateFrom(value);
        return this;
    }

    public UploadMetadataArgument withValidDateTo(String value) {
        setValidDateTo(value);
        return this;
    }

    public UploadMetadataArgument withVirtualDbName(String value) {
        setVirtualDbName(value);
        return this;
    }

}
