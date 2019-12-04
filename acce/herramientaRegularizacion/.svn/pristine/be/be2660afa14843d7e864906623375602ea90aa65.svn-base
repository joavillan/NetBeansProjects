
package org.datacontract.schemas._2004._07.sealsignbsstypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiometricVerificationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BiometricVerificationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Match"/>
 *     &lt;enumeration value="NoMatch"/>
 *     &lt;enumeration value="SignatureCorrupted"/>
 *     &lt;enumeration value="Failure"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BiometricVerificationStatus")
@XmlEnum
public enum BiometricVerificationStatus {

    @XmlEnumValue("Match")
    MATCH("Match"),
    @XmlEnumValue("NoMatch")
    NO_MATCH("NoMatch"),
    @XmlEnumValue("SignatureCorrupted")
    SIGNATURE_CORRUPTED("SignatureCorrupted"),
    @XmlEnumValue("Failure")
    FAILURE("Failure"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    BiometricVerificationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BiometricVerificationStatus fromValue(String v) {
        for (BiometricVerificationStatus c: BiometricVerificationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
