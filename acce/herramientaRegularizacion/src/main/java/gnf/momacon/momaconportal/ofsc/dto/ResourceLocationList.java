
package gnf.momacon.momaconportal.ofsc.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceLocationList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceLocationList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resource_location" type="{urn:toatech:ResourceManagement:1.0}ResourceLocationElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceLocationList", propOrder = {
    "resourceLocation"
})
public class ResourceLocationList {

    @XmlElement(name = "resource_location")
    private List<ResourceLocationElement> resourceLocation;

    /**
     * Gets the value of the resourceLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceLocationElement }
     * 
     * 
     */
    public List<ResourceLocationElement> getResourceLocation() {
        if (resourceLocation == null) {
            resourceLocation = new ArrayList<ResourceLocationElement>();
        }
        return this.resourceLocation;
    }

}
