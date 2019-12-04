
package gnf.momacon.momaconportal.ofsc.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetResourcesLocationsElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetResourcesLocationsElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="user" type="{urn:toatech:ResourceManagement:1.0}AuthNodeElement" minOccurs="0"/>
 *         &lt;element name="resources" type="{urn:toatech:ResourceManagement:1.0}LocationResourceParamsList"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResourcesLocationsElement", propOrder = {

})
public class GetResourcesLocationsElement {

    private AuthNodeElement user;
    @XmlElement(required = true)
    private LocationResourceParamsList resources;

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
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link LocationResourceParamsList }
     *     
     */
    public LocationResourceParamsList getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationResourceParamsList }
     *     
     */
    public void setResources(LocationResourceParamsList value) {
        this.resources = value;
    }

}
