
package gnf.momacon.momaconportal.ofsc.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetLocationResultList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetLocationResultList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location_result" type="{urn:toatech:ResourceManagement:1.0}LocationResultElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetLocationResultList", propOrder = {
    "locationResult"
})
public class SetLocationResultList {

    @XmlElement(name = "location_result")
    private List<LocationResultElement> locationResult;

    /**
     * Gets the value of the locationResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationResultElement }
     * 
     * 
     */
    public List<LocationResultElement> getLocationResult() {
        if (locationResult == null) {
            locationResult = new ArrayList<LocationResultElement>();
        }
        return this.locationResult;
    }

}
