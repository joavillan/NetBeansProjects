
package gnf.momacon.momaconportal.ofsc.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkSkillList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkSkillList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workskill" type="{urn:toatech:ResourceManagement:1.0}WorkSkillElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="workskill_group" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkSkillList", propOrder = {
    "workskill",
    "workskillGroup"
})
public class WorkSkillList {

    private List<WorkSkillElement> workskill;
    @XmlElement(name = "workskill_group")
    private List<String> workskillGroup;

    /**
     * Gets the value of the workskill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workskill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkskill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkSkillElement }
     * 
     * 
     */
    public List<WorkSkillElement> getWorkskill() {
        if (workskill == null) {
            workskill = new ArrayList<WorkSkillElement>();
        }
        return this.workskill;
    }

    /**
     * Gets the value of the workskillGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workskillGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkskillGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWorkskillGroup() {
        if (workskillGroup == null) {
            workskillGroup = new ArrayList<String>();
        }
        return this.workskillGroup;
    }

}
