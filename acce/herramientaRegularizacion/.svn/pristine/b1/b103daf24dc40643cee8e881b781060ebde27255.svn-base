
package org.datacontract.schemas._2004._07.sealsigndsstypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerificationResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VerificationResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Valid"/>
 *     &lt;enumeration value="IncompleteValidation"/>
 *     &lt;enumeration value="Invalid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VerificationResult")
@XmlEnum
public enum VerificationResult {

    @XmlEnumValue("Valid")
    VALID("Valid"),
    @XmlEnumValue("IncompleteValidation")
    INCOMPLETE_VALIDATION("IncompleteValidation"),
    @XmlEnumValue("Invalid")
    INVALID("Invalid");
    private final String value;

    VerificationResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VerificationResult fromValue(String v) {
        for (VerificationResult c: VerificationResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
