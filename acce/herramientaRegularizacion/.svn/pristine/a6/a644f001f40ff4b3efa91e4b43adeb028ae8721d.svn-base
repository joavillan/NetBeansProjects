package gnf.momacon.momaconportal.toa.activity.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for result_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="result_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="single"/>
 *     &lt;enumeration value="list"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "result_type")
@XmlEnum
public enum ResultType {

    @XmlEnumValue("single")
    SINGLE("single"),
    @XmlEnumValue("list")
    LIST("list");
    private final String value;

    ResultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultType fromValue(String v) {
        for (ResultType c: ResultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
