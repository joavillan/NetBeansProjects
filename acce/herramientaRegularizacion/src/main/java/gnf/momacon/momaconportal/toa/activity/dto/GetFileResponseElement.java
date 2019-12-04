package gnf.momacon.momaconportal.toa.activity.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for get_file_response_element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="get_file_response_element">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="error_msg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="file_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="file_data" type="{http://www.w3.org/2005/05/xmlmime}base64Binary" minOccurs="0"/>
 *         &lt;element name="file_mime_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_file_response_element", propOrder = {
    "resultCode",
    "errorMsg",
    "fileName",
    "fileData",
    "fileMimeType"
})
public class GetFileResponseElement {

    @XmlElement(name = "result_code")
    private int resultCode;
    @XmlElement(name = "error_msg")
    private String errorMsg;
    @XmlElement(name = "file_name")
    private String fileName;
    @XmlElement(name = "file_data")
    private Base64Binary fileData;
    @XmlElement(name = "file_mime_type")
    private String fileMimeType;

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
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileData property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getFileData() {
        return fileData;
    }

    /**
     * Sets the value of the fileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setFileData(Base64Binary value) {
        this.fileData = value;
    }

    /**
     * Gets the value of the fileMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileMimeType() {
        return fileMimeType;
    }

    /**
     * Sets the value of the fileMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileMimeType(String value) {
        this.fileMimeType = value;
    }

}
