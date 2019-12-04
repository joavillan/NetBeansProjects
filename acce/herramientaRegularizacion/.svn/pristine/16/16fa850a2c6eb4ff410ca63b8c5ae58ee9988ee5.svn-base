
package org.datacontract.schemas._2004._07.sealsigndsstypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerificationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VerificationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Valid"/>
 *     &lt;enumeration value="SignatureCorrupted"/>
 *     &lt;enumeration value="SignerNotFound"/>
 *     &lt;enumeration value="IncompleteChain"/>
 *     &lt;enumeration value="BadCountersignature"/>
 *     &lt;enumeration value="BadTimestamp"/>
 *     &lt;enumeration value="CertificateExpired"/>
 *     &lt;enumeration value="CertificateRevoked"/>
 *     &lt;enumeration value="CertificateCorrupted"/>
 *     &lt;enumeration value="UntrustedCA"/>
 *     &lt;enumeration value="RevInfoNotFound"/>
 *     &lt;enumeration value="TimestampInfoNotFound"/>
 *     &lt;enumeration value="Failure"/>
 *     &lt;enumeration value="CertificateMalformed"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="InvalidPolicy"/>
 *     &lt;enumeration value="NotValidForUsage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VerificationStatus")
@XmlEnum
public enum VerificationStatus {

    @XmlEnumValue("Valid")
    VALID("Valid"),
    @XmlEnumValue("SignatureCorrupted")
    SIGNATURE_CORRUPTED("SignatureCorrupted"),
    @XmlEnumValue("SignerNotFound")
    SIGNER_NOT_FOUND("SignerNotFound"),
    @XmlEnumValue("IncompleteChain")
    INCOMPLETE_CHAIN("IncompleteChain"),
    @XmlEnumValue("BadCountersignature")
    BAD_COUNTERSIGNATURE("BadCountersignature"),
    @XmlEnumValue("BadTimestamp")
    BAD_TIMESTAMP("BadTimestamp"),
    @XmlEnumValue("CertificateExpired")
    CERTIFICATE_EXPIRED("CertificateExpired"),
    @XmlEnumValue("CertificateRevoked")
    CERTIFICATE_REVOKED("CertificateRevoked"),
    @XmlEnumValue("CertificateCorrupted")
    CERTIFICATE_CORRUPTED("CertificateCorrupted"),
    @XmlEnumValue("UntrustedCA")
    UNTRUSTED_CA("UntrustedCA"),
    @XmlEnumValue("RevInfoNotFound")
    REV_INFO_NOT_FOUND("RevInfoNotFound"),
    @XmlEnumValue("TimestampInfoNotFound")
    TIMESTAMP_INFO_NOT_FOUND("TimestampInfoNotFound"),
    @XmlEnumValue("Failure")
    FAILURE("Failure"),
    @XmlEnumValue("CertificateMalformed")
    CERTIFICATE_MALFORMED("CertificateMalformed"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("InvalidPolicy")
    INVALID_POLICY("InvalidPolicy"),
    @XmlEnumValue("NotValidForUsage")
    NOT_VALID_FOR_USAGE("NotValidForUsage");
    private final String value;

    VerificationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VerificationStatus fromValue(String v) {
        for (VerificationStatus c: VerificationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
