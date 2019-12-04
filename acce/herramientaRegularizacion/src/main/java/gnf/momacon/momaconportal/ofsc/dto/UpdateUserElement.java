
package gnf.momacon.momaconportal.ofsc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateUserElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateUserElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="user" type="{urn:toatech:ResourceManagement:1.0}AuthNodeElement" minOccurs="0"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="properties" type="{urn:toatech:ResourceManagement:1.0}PropertiesElement"/>
 *         &lt;element name="resources" type="{urn:toatech:ResourceManagement:1.0}ResourceIdListElement" minOccurs="0"/>
 *         &lt;element name="profiles" type="{urn:toatech:ResourceManagement:1.0}ProfileListElement" minOccurs="0"/>
 *         &lt;element name="managed_profiles" type="{urn:toatech:ResourceManagement:1.0}ProfileListElement" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateUserElement", propOrder = {

})
public class UpdateUserElement {

    private AuthNodeElement user;
    @XmlElement(required = true)
    private String login;
    @XmlElement(required = true)
    private PropertiesElement properties;
    private ResourceIdListElement resources;
    private ProfileListElement profiles;
    @XmlElement(name = "managed_profiles")
    private ProfileListElement managedProfiles;

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
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesElement }
     *     
     */
    public PropertiesElement getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesElement }
     *     
     */
    public void setProperties(PropertiesElement value) {
        this.properties = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceIdListElement }
     *     
     */
    public ResourceIdListElement getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceIdListElement }
     *     
     */
    public void setResources(ResourceIdListElement value) {
        this.resources = value;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileListElement }
     *     
     */
    public ProfileListElement getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileListElement }
     *     
     */
    public void setProfiles(ProfileListElement value) {
        this.profiles = value;
    }

    /**
     * Gets the value of the managedProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileListElement }
     *     
     */
    public ProfileListElement getManagedProfiles() {
        return managedProfiles;
    }

    /**
     * Sets the value of the managedProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileListElement }
     *     
     */
    public void setManagedProfiles(ProfileListElement value) {
        this.managedProfiles = value;
    }

}
