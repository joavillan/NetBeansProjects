
package gnf.momacon.momaconportal.ofsc.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SkillResultList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SkillResultList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="skill_result" type="{urn:toatech:ResourceManagement:1.0}SkillResultElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkillResultList", propOrder = {
    "skillResult"
})
public class SkillResultList {

    @XmlElement(name = "skill_result")
    private List<SkillResultElement> skillResult;

    /**
     * Gets the value of the skillResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skillResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkillResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SkillResultElement }
     * 
     * 
     */
    public List<SkillResultElement> getSkillResult() {
        if (skillResult == null) {
            skillResult = new ArrayList<SkillResultElement>();
        }
        return this.skillResult;
    }

}
