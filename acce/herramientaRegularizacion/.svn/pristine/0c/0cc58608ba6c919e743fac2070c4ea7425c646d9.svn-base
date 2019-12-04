package gnf.momacon.momaconportal.toa.activity.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for get_activity_work_skills_response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="get_activity_work_skills_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="error_msg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="work_skill" type="{urn:toa:activity}work_skill" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="capacity_category" type="{urn:toa:activity}capacity_category" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_activity_work_skills_response", propOrder = {
    "resultCode",
    "errorMsg",
    "workSkill",
    "capacityCategory"
})
public class GetActivityWorkSkillsResponse {

    @XmlElement(name = "result_code")
    private int resultCode;
    @XmlElement(name = "error_msg")
    private String errorMsg;
    @XmlElement(name = "work_skill")
    private List<WorkSkill> workSkill;
    @XmlElement(name = "capacity_category")
    private List<CapacityCategory> capacityCategory;

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    /**
     * Gets the value of the workSkill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workSkill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkSkill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkSkill }
     * 
     * 
     */
    public List<WorkSkill> getWorkSkill() {
        if (workSkill == null) {
            workSkill = new ArrayList<WorkSkill>();
        }
        return this.workSkill;
    }

    /**
     * Gets the value of the capacityCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capacityCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapacityCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapacityCategory }
     * 
     * 
     */
    public List<CapacityCategory> getCapacityCategory() {
        if (capacityCategory == null) {
            capacityCategory = new ArrayList<CapacityCategory>();
        }
        return this.capacityCategory;
    }

}
