
package org.datacontract.schemas._2004._07.sealsigndsstypes;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.sealsigndsstypes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HashAlgorithm_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "HashAlgorithm");
    private final static QName _SignatureFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "SignatureFlags");
    private final static QName _TimestampReference_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "TimestampReference");
    private final static QName _ArrayOfTimestampReference_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "ArrayOfTimestampReference");
    private final static QName _SignatureReference_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "SignatureReference");
    private final static QName _PDFSignatureParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "PDFSignatureParameters");
    private final static QName _VerificationStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "VerificationStatus");
    private final static QName _ArrayOfSignatureReference_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "ArrayOfSignatureReference");
    private final static QName _SignatureVerification_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "SignatureVerification");
    private final static QName _SignatureType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "SignatureType");
    private final static QName _VerificationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "VerificationResult");
    private final static QName _SignatureParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "SignatureParameters");
    private final static QName _SignatureProfile_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "SignatureProfile");
    private final static QName _TimestampType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "TimestampType");
    private final static QName _SignatureVerificationSignatures_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "signatures");
    private final static QName _PDFSignatureParametersPDFPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "PDFPassword");
    private final static QName _PDFSignatureParametersPDFSignatureFieldName_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "PDFSignatureFieldName");
    private final static QName _SignatureReferenceCounterSignatures_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "counterSignatures");
    private final static QName _SignatureReferenceSignatureID_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "signatureID");
    private final static QName _SignatureReferenceTimestamps_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "timestamps");
    private final static QName _SignatureReferenceSignatureCertificate_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "signatureCertificate");
    private final static QName _SignatureReferenceValidationTimestamps_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "validationTimestamps");
    private final static QName _TimestampReferenceTimestampSignatures_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "timestampSignatures");
    private final static QName _SignatureParametersReference_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "reference");
    private final static QName _SignatureParametersCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "country");
    private final static QName _SignatureParametersCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "city");
    private final static QName _SignatureParametersPolicyCMSQualifierURI_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "policyCMSQualifierURI");
    private final static QName _SignatureParametersState_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "state");
    private final static QName _SignatureParametersPolicyIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "policyIdentifier");
    private final static QName _SignatureParametersSignerRole_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "signerRole");
    private final static QName _SignatureParametersPdfParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "pdfParameters");
    private final static QName _SignatureParametersReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "reason");
    private final static QName _SignatureParametersPostalCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "postalCode");
    private final static QName _SignatureParametersPolicyDigest_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignDSSTypes", "policyDigest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.sealsigndsstypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfTimestampReference }
     * 
     */
    public ArrayOfTimestampReference createArrayOfTimestampReference() {
        return new ArrayOfTimestampReference();
    }

    /**
     * Create an instance of {@link SignatureVerification }
     * 
     */
    public SignatureVerification createSignatureVerification() {
        return new SignatureVerification();
    }

    /**
     * Create an instance of {@link ArrayOfSignatureReference }
     * 
     */
    public ArrayOfSignatureReference createArrayOfSignatureReference() {
        return new ArrayOfSignatureReference();
    }

    /**
     * Create an instance of {@link PDFSignatureParameters }
     * 
     */
    public PDFSignatureParameters createPDFSignatureParameters() {
        return new PDFSignatureParameters();
    }

    /**
     * Create an instance of {@link SignatureReference }
     * 
     */
    public SignatureReference createSignatureReference() {
        return new SignatureReference();
    }

    /**
     * Create an instance of {@link TimestampReference }
     * 
     */
    public TimestampReference createTimestampReference() {
        return new TimestampReference();
    }

    /**
     * Create an instance of {@link SignatureParameters }
     * 
     */
    public SignatureParameters createSignatureParameters() {
        return new SignatureParameters();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HashAlgorithm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "HashAlgorithm")
    public JAXBElement<HashAlgorithm> createHashAlgorithm(HashAlgorithm value) {
        return new JAXBElement<HashAlgorithm>(_HashAlgorithm_QNAME, HashAlgorithm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "SignatureFlags")
    public JAXBElement<List<String>> createSignatureFlags(List<String> value) {
        return new JAXBElement<List<String>>(_SignatureFlags_QNAME, ((Class) List.class), null, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimestampReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "TimestampReference")
    public JAXBElement<TimestampReference> createTimestampReference(TimestampReference value) {
        return new JAXBElement<TimestampReference>(_TimestampReference_QNAME, TimestampReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimestampReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "ArrayOfTimestampReference")
    public JAXBElement<ArrayOfTimestampReference> createArrayOfTimestampReference(ArrayOfTimestampReference value) {
        return new JAXBElement<ArrayOfTimestampReference>(_ArrayOfTimestampReference_QNAME, ArrayOfTimestampReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "SignatureReference")
    public JAXBElement<SignatureReference> createSignatureReference(SignatureReference value) {
        return new JAXBElement<SignatureReference>(_SignatureReference_QNAME, SignatureReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDFSignatureParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "PDFSignatureParameters")
    public JAXBElement<PDFSignatureParameters> createPDFSignatureParameters(PDFSignatureParameters value) {
        return new JAXBElement<PDFSignatureParameters>(_PDFSignatureParameters_QNAME, PDFSignatureParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "VerificationStatus")
    public JAXBElement<VerificationStatus> createVerificationStatus(VerificationStatus value) {
        return new JAXBElement<VerificationStatus>(_VerificationStatus_QNAME, VerificationStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSignatureReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "ArrayOfSignatureReference")
    public JAXBElement<ArrayOfSignatureReference> createArrayOfSignatureReference(ArrayOfSignatureReference value) {
        return new JAXBElement<ArrayOfSignatureReference>(_ArrayOfSignatureReference_QNAME, ArrayOfSignatureReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureVerification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "SignatureVerification")
    public JAXBElement<SignatureVerification> createSignatureVerification(SignatureVerification value) {
        return new JAXBElement<SignatureVerification>(_SignatureVerification_QNAME, SignatureVerification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "SignatureType")
    public JAXBElement<SignatureType> createSignatureType(SignatureType value) {
        return new JAXBElement<SignatureType>(_SignatureType_QNAME, SignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "VerificationResult")
    public JAXBElement<VerificationResult> createVerificationResult(VerificationResult value) {
        return new JAXBElement<VerificationResult>(_VerificationResult_QNAME, VerificationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "SignatureParameters")
    public JAXBElement<SignatureParameters> createSignatureParameters(SignatureParameters value) {
        return new JAXBElement<SignatureParameters>(_SignatureParameters_QNAME, SignatureParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "SignatureProfile")
    public JAXBElement<SignatureProfile> createSignatureProfile(SignatureProfile value) {
        return new JAXBElement<SignatureProfile>(_SignatureProfile_QNAME, SignatureProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimestampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "TimestampType")
    public JAXBElement<TimestampType> createTimestampType(TimestampType value) {
        return new JAXBElement<TimestampType>(_TimestampType_QNAME, TimestampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSignatureReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "signatures", scope = SignatureVerification.class)
    public JAXBElement<ArrayOfSignatureReference> createSignatureVerificationSignatures(ArrayOfSignatureReference value) {
        return new JAXBElement<ArrayOfSignatureReference>(_SignatureVerificationSignatures_QNAME, ArrayOfSignatureReference.class, SignatureVerification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "PDFPassword", scope = PDFSignatureParameters.class)
    public JAXBElement<String> createPDFSignatureParametersPDFPassword(String value) {
        return new JAXBElement<String>(_PDFSignatureParametersPDFPassword_QNAME, String.class, PDFSignatureParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "PDFSignatureFieldName", scope = PDFSignatureParameters.class)
    public JAXBElement<String> createPDFSignatureParametersPDFSignatureFieldName(String value) {
        return new JAXBElement<String>(_PDFSignatureParametersPDFSignatureFieldName_QNAME, String.class, PDFSignatureParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSignatureReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "counterSignatures", scope = SignatureReference.class)
    public JAXBElement<ArrayOfSignatureReference> createSignatureReferenceCounterSignatures(ArrayOfSignatureReference value) {
        return new JAXBElement<ArrayOfSignatureReference>(_SignatureReferenceCounterSignatures_QNAME, ArrayOfSignatureReference.class, SignatureReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "signatureID", scope = SignatureReference.class)
    public JAXBElement<String> createSignatureReferenceSignatureID(String value) {
        return new JAXBElement<String>(_SignatureReferenceSignatureID_QNAME, String.class, SignatureReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimestampReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "timestamps", scope = SignatureReference.class)
    public JAXBElement<ArrayOfTimestampReference> createSignatureReferenceTimestamps(ArrayOfTimestampReference value) {
        return new JAXBElement<ArrayOfTimestampReference>(_SignatureReferenceTimestamps_QNAME, ArrayOfTimestampReference.class, SignatureReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "signatureCertificate", scope = SignatureReference.class)
    public JAXBElement<byte[]> createSignatureReferenceSignatureCertificate(byte[] value) {
        return new JAXBElement<byte[]>(_SignatureReferenceSignatureCertificate_QNAME, byte[].class, SignatureReference.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimestampReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "validationTimestamps", scope = SignatureReference.class)
    public JAXBElement<ArrayOfTimestampReference> createSignatureReferenceValidationTimestamps(ArrayOfTimestampReference value) {
        return new JAXBElement<ArrayOfTimestampReference>(_SignatureReferenceValidationTimestamps_QNAME, ArrayOfTimestampReference.class, SignatureReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSignatureReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "timestampSignatures", scope = TimestampReference.class)
    public JAXBElement<ArrayOfSignatureReference> createTimestampReferenceTimestampSignatures(ArrayOfSignatureReference value) {
        return new JAXBElement<ArrayOfSignatureReference>(_TimestampReferenceTimestampSignatures_QNAME, ArrayOfSignatureReference.class, TimestampReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "reference", scope = SignatureParameters.class)
    public JAXBElement<String> createSignatureParametersReference(String value) {
        return new JAXBElement<String>(_SignatureParametersReference_QNAME, String.class, SignatureParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "country", scope = SignatureParameters.class)
    public JAXBElement<String> createSignatureParametersCountry(String value) {
        return new JAXBElement<String>(_SignatureParametersCountry_QNAME, String.class, SignatureParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "city", scope = SignatureParameters.class)
    public JAXBElement<String> createSignatureParametersCity(String value) {
        return new JAXBElement<String>(_SignatureParametersCity_QNAME, String.class, SignatureParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "policyCMSQualifierURI", scope = SignatureParameters.class)
    public JAXBElement<String> createSignatureParametersPolicyCMSQualifierURI(String value) {
        return new JAXBElement<String>(_SignatureParametersPolicyCMSQualifierURI_QNAME, String.class, SignatureParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "state", scope = SignatureParameters.class)
    public JAXBElement<String> createSignatureParametersState(String value) {
        return new JAXBElement<String>(_SignatureParametersState_QNAME, String.class, SignatureParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "policyIdentifier", scope = SignatureParameters.class)
    public JAXBElement<String> createSignatureParametersPolicyIdentifier(String value) {
        return new JAXBElement<String>(_SignatureParametersPolicyIdentifier_QNAME, String.class, SignatureParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "signerRole", scope = SignatureParameters.class)
    public JAXBElement<String> createSignatureParametersSignerRole(String value) {
        return new JAXBElement<String>(_SignatureParametersSignerRole_QNAME, String.class, SignatureParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDFSignatureParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "pdfParameters", scope = SignatureParameters.class)
    public JAXBElement<PDFSignatureParameters> createSignatureParametersPdfParameters(PDFSignatureParameters value) {
        return new JAXBElement<PDFSignatureParameters>(_SignatureParametersPdfParameters_QNAME, PDFSignatureParameters.class, SignatureParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "reason", scope = SignatureParameters.class)
    public JAXBElement<String> createSignatureParametersReason(String value) {
        return new JAXBElement<String>(_SignatureParametersReason_QNAME, String.class, SignatureParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "postalCode", scope = SignatureParameters.class)
    public JAXBElement<String> createSignatureParametersPostalCode(String value) {
        return new JAXBElement<String>(_SignatureParametersPostalCode_QNAME, String.class, SignatureParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignDSSTypes", name = "policyDigest", scope = SignatureParameters.class)
    public JAXBElement<String> createSignatureParametersPolicyDigest(String value) {
        return new JAXBElement<String>(_SignatureParametersPolicyDigest_QNAME, String.class, SignatureParameters.class, value);
    }

}
