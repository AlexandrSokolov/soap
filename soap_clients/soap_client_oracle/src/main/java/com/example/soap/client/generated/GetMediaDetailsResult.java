
package com.example.soap.client.generated;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMediaDetailsResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getMediaDetailsResult">
 *   <complexContent>
 *     <extension base="{http://brandmaker.com/webservices/MediaPool/}uploadMetadataArgument">
 *       <sequence>
 *         <element name="errors" type="{http://brandmaker.com/webservices/MediaPool/}error" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "getMediaDetailsResult", propOrder = {
    "errors",
    "success",
    "warnings"
})
public class GetMediaDetailsResult
    extends UploadMetadataArgument
{

    @XmlElement(nillable = true)
    protected List<Error> errors;
    protected boolean success;
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
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
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

    public GetMediaDetailsResult withErrors(Error... values) {
        if (values!= null) {
            for (Error value: values) {
                getErrors().add(value);
            }
        }
        return this;
    }

    public GetMediaDetailsResult withErrors(Collection<Error> values) {
        if (values!= null) {
            getErrors().addAll(values);
        }
        return this;
    }

    public GetMediaDetailsResult withSuccess(boolean value) {
        setSuccess(value);
        return this;
    }

    public GetMediaDetailsResult withWarnings(Warning... values) {
        if (values!= null) {
            for (Warning value: values) {
                getWarnings().add(value);
            }
        }
        return this;
    }

    public GetMediaDetailsResult withWarnings(Collection<Warning> values) {
        if (values!= null) {
            getWarnings().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withAddAssociations(Boolean value) {
        setAddAssociations(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withApprove(String value) {
        setApprove(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withApproveDescription(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getApproveDescription().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withApproveDescription(Collection<LanguageItem> values) {
        if (values!= null) {
            getApproveDescription().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withArticleDescription(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getArticleDescription().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withArticleDescription(Collection<LanguageItem> values) {
        if (values!= null) {
            getArticleDescription().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withArticleNumber(String value) {
        setArticleNumber(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withAssociations(ThemeDto... values) {
        if (values!= null) {
            for (ThemeDto value: values) {
                getAssociations().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withAssociations(Collection<ThemeDto> values) {
        if (values!= null) {
            getAssociations().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withCountryCodes(Code... values) {
        if (values!= null) {
            for (Code value: values) {
                getCountryCodes().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withCountryCodes(Collection<Code> values) {
        if (values!= null) {
            getCountryCodes().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withCreatorName(String value) {
        setCreatorName(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withDescription(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withDescription(Collection<LanguageItem> values) {
        if (values!= null) {
            getDescription().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withDesignationType(String value) {
        setDesignationType(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withFileName(String value) {
        setFileName(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withFontChecked(String value) {
        setFontChecked(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField1(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField1().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField1(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField1().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField10(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField10().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField10(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField10().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField11(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField11().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField11(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField11().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField12(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField12().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField12(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField12().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField13(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField13().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField13(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField13().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField14(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField14().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField14(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField14().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField15(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField15().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField15(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField15().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField16(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField16().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField16(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField16().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField17(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField17().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField17(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField17().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField18(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField18().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField18(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField18().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField19(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField19().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField19(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField19().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField2(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField2().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField2(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField2().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField20(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField20().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField20(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField20().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField3(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField3().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField3(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField3().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField4(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField4().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField4(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField4().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField5(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField5().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField5(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField5().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField6(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField6().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField6(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField6().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField7(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField7().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField7(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField7().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField8(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField8().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField8(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField8().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField9(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getFreeField9().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withFreeField9(Collection<LanguageItem> values) {
        if (values!= null) {
            getFreeField9().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withHideIfNotValid(String value) {
        setHideIfNotValid(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withIsHires(String value) {
        setIsHires(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withKeepIfEmtpy(Boolean value) {
        setKeepIfEmtpy(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withKeyword(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getKeyword().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withKeyword(Collection<LanguageItem> values) {
        if (values!= null) {
            getKeyword().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withLicense(String value) {
        setLicense(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withLicenseName(String value) {
        setLicenseName(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withMediaGuid(String value) {
        setMediaGuid(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withMediaHash(String value) {
        setMediaHash(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withMediaIsins(Isin... values) {
        if (values!= null) {
            for (Isin value: values) {
                getMediaIsins().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withMediaIsins(Collection<Isin> values) {
        if (values!= null) {
            getMediaIsins().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withMediaNumber(String value) {
        setMediaNumber(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withMediaTitle(LanguageItem... values) {
        if (values!= null) {
            for (LanguageItem value: values) {
                getMediaTitle().add(value);
            }
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withMediaTitle(Collection<LanguageItem> values) {
        if (values!= null) {
            getMediaTitle().addAll(values);
        }
        return this;
    }

    @Override
    public GetMediaDetailsResult withOfficial(Boolean value) {
        setOfficial(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withPlatform(String value) {
        setPlatform(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withProgramVersion(String value) {
        setProgramVersion(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withSelectedAffiliate(String value) {
        setSelectedAffiliate(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withShow(String value) {
        setShow(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withStrict(Boolean value) {
        setStrict(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withStructuredKeywords(StructuredKeywords value) {
        setStructuredKeywords(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withValidDateFrom(String value) {
        setValidDateFrom(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withValidDateTo(String value) {
        setValidDateTo(value);
        return this;
    }

    @Override
    public GetMediaDetailsResult withVirtualDbName(String value) {
        setVirtualDbName(value);
        return this;
    }

}
