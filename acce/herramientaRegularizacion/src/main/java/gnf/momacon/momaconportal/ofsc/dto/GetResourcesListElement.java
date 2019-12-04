
package gnf.momacon.momaconportal.ofsc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetResourcesListElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetResourcesListElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="user" type="{urn:toatech:ResourceManagement:1.0}AuthNodeElement" minOccurs="0"/>
 *         &lt;element name="root_resource_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="include_children" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="select_from" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="select_count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="required_properties" type="{urn:toatech:ResourceManagement:1.0}RequiredPropertiesElement" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResourcesListElement", propOrder = {

})
public class GetResourcesListElement {

    private AuthNodeElement user;
    @XmlElement(name = "root_resource_id")
    private String rootResourceId;
    @XmlElement(name = "include_children")
    private String includeChildren;
    @XmlElement(name = "select_from")
    private Integer selectFrom;
    @XmlElement(name = "select_count")
    private Integer selectCount;
    private String date;
    @XmlElement(name = "required_properties")
    private RequiredPropertiesElement requiredProperties;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link AuthNodeElement }
     *     
     */
    public AuthNodeElement getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthNodeElement }
     *     
     */
    public void setUser(AuthNodeElement value) {
        this.user = value;
    }

    /**
     * Gets the value of the rootResourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootResourceId() {
        return rootResourceId;
    }

    /**
     * Sets the value of the rootResourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootResourceId(String value) {
        this.rootResourceId = value;
    }

    /**
     * Gets the value of the includeChildren property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeChildren() {
        return includeChildren;
    }

    /**
     * Sets the value of the includeChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeChildren(String value) {
        this.includeChildren = value;
    }

    /**
     * Gets the value of the selectFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSelectFrom() {
        return selectFrom;
    }

    /**
     * Sets the value of the selectFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSelectFrom(Integer value) {
        this.selectFrom = value;
    }

    /**
     * Gets the value of the selectCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSelectCount() {
        return selectCount;
    }

    /**
     * Sets the value of the selectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSelectCount(Integer value) {
        this.selectCount = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the requiredProperties property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredPropertiesElement }
     *     
     */
    public RequiredPropertiesElement getRequiredProperties() {
        return requiredProperties;
    }

    /**
     * Sets the value of the requiredProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredPropertiesElement }
     *     
     */
    public void setRequiredProperties(RequiredPropertiesElement value) {
        this.requiredProperties = value;
    }

}
