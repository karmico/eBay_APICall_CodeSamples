//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Configuration of a Store custom listing header.
 * 		
 * 
 * <p>Java class for StoreCustomListingHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreCustomListingHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayType" type="{urn:ebay:apis:eBLBaseComponents}StoreCustomListingHeaderDisplayCodeType" minOccurs="0"/>
 *         &lt;element name="Logo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SearchBox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LinkToInclude" type="{urn:ebay:apis:eBLBaseComponents}StoreCustomListingHeaderLinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddToFavoriteStores" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SignUpForStoreNewsletter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreCustomListingHeaderType", propOrder = {
    "displayType",
    "logo",
    "searchBox",
    "linkToInclude",
    "addToFavoriteStores",
    "signUpForStoreNewsletter"
})
public class StoreCustomListingHeaderType {

    @XmlElement(name = "DisplayType")
    protected StoreCustomListingHeaderDisplayCodeType displayType;
    @XmlElement(name = "Logo")
    protected Boolean logo;
    @XmlElement(name = "SearchBox")
    protected Boolean searchBox;
    @XmlElement(name = "LinkToInclude")
    protected List<StoreCustomListingHeaderLinkType> linkToInclude;
    @XmlElement(name = "AddToFavoriteStores")
    protected Boolean addToFavoriteStores;
    @XmlElement(name = "SignUpForStoreNewsletter")
    protected Boolean signUpForStoreNewsletter;

    /**
     * Gets the value of the displayType property.
     * 
     * @return
     *     possible object is
     *     {@link StoreCustomListingHeaderDisplayCodeType }
     *     
     */
    public StoreCustomListingHeaderDisplayCodeType getDisplayType() {
        return displayType;
    }

    /**
     * Sets the value of the displayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreCustomListingHeaderDisplayCodeType }
     *     
     */
    public void setDisplayType(StoreCustomListingHeaderDisplayCodeType value) {
        this.displayType = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogo(Boolean value) {
        this.logo = value;
    }

    /**
     * Gets the value of the searchBox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchBox() {
        return searchBox;
    }

    /**
     * Sets the value of the searchBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchBox(Boolean value) {
        this.searchBox = value;
    }

    /**
     * Gets the value of the linkToInclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkToInclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkToInclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoreCustomListingHeaderLinkType }
     * 
     * 
     */
    public List<StoreCustomListingHeaderLinkType> getLinkToInclude() {
        if (linkToInclude == null) {
            linkToInclude = new ArrayList<StoreCustomListingHeaderLinkType>();
        }
        return this.linkToInclude;
    }

    /**
     * Gets the value of the addToFavoriteStores property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddToFavoriteStores() {
        return addToFavoriteStores;
    }

    /**
     * Sets the value of the addToFavoriteStores property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddToFavoriteStores(Boolean value) {
        this.addToFavoriteStores = value;
    }

    /**
     * Gets the value of the signUpForStoreNewsletter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignUpForStoreNewsletter() {
        return signUpForStoreNewsletter;
    }

    /**
     * Sets the value of the signUpForStoreNewsletter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignUpForStoreNewsletter(Boolean value) {
        this.signUpForStoreNewsletter = value;
    }

}