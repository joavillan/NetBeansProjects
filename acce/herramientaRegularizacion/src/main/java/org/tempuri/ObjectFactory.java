
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.sealsignbssservice.ArrayOfOfflineBiometricSignature;
import org.datacontract.schemas._2004._07.sealsignbssservice.BiometricSignatureBeginResponseBasic;
import org.datacontract.schemas._2004._07.sealsignbsstypes.BiometricSignatureParameters;
import org.datacontract.schemas._2004._07.sealsignbsstypes.BiometricSignatureVerification;
import org.datacontract.schemas._2004._07.sealsignbsstypes.BiometricVerificationParameters;
import org.datacontract.schemas._2004._07.sealsigndsstypes.SignatureParameters;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _GetInfoFromBiometricStateResponseGetInfoFromBiometricStateResult_QNAME = new QName("http://tempuri.org/", "GetInfoFromBiometricStateResult");
    private final static QName _VerifyBiometricState_QNAME = new QName("http://tempuri.org/", "biometricState");
    private final static QName _VerifyBiometricParameters_QNAME = new QName("http://tempuri.org/", "biometricParameters");
    private final static QName _VerifyDocument_QNAME = new QName("http://tempuri.org/", "document");
    private final static QName _VerifyId_QNAME = new QName("http://tempuri.org/", "id");
    private final static QName _VerifyDetachedSignature_QNAME = new QName("http://tempuri.org/", "detachedSignature");
    private final static QName _VerifyAccount_QNAME = new QName("http://tempuri.org/", "account");
    private final static QName _VerifyResponseVerifyResult_QNAME = new QName("http://tempuri.org/", "VerifyResult");
    private final static QName _EndSignatureResponseEndSignatureResult_QNAME = new QName("http://tempuri.org/", "EndSignatureResult");
    private final static QName _SyncOfflineSignaturesResponseSyncOfflineSignaturesResult_QNAME = new QName("http://tempuri.org/", "SyncOfflineSignaturesResult");
    private final static QName _BeginSignatureResponseBeginSignatureResult_QNAME = new QName("http://tempuri.org/", "BeginSignatureResult");
    private final static QName _BeginSignatureSigningDocument_QNAME = new QName("http://tempuri.org/", "signingDocument");
    private final static QName _BeginSignatureParameters_QNAME = new QName("http://tempuri.org/", "parameters");
    private final static QName _GetInfoResponseGetInfoResult_QNAME = new QName("http://tempuri.org/", "GetInfoResult");
    private final static QName _SyncOfflineSignatureOfflineBiometricState_QNAME = new QName("http://tempuri.org/", "offlineBiometricState");
    private final static QName _SyncOfflineSignaturesOfflineSignatures_QNAME = new QName("http://tempuri.org/", "offlineSignatures");
    private final static QName _SyncOfflineSignatureResponseSyncOfflineSignatureResult_QNAME = new QName("http://tempuri.org/", "SyncOfflineSignatureResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInfoFromBiometricStateResponse }
     * 
     */
    public GetInfoFromBiometricStateResponse createGetInfoFromBiometricStateResponse() {
        return new GetInfoFromBiometricStateResponse();
    }

    /**
     * Create an instance of {@link Verify }
     * 
     */
    public Verify createVerify() {
        return new Verify();
    }

    /**
     * Create an instance of {@link HeartBeatResponse }
     * 
     */
    public HeartBeatResponse createHeartBeatResponse() {
        return new HeartBeatResponse();
    }

    /**
     * Create an instance of {@link EndSignatureResponse }
     * 
     */
    public EndSignatureResponse createEndSignatureResponse() {
        return new EndSignatureResponse();
    }

    /**
     * Create an instance of {@link SyncOfflineSignaturesResponse }
     * 
     */
    public SyncOfflineSignaturesResponse createSyncOfflineSignaturesResponse() {
        return new SyncOfflineSignaturesResponse();
    }

    /**
     * Create an instance of {@link VerifyResponse }
     * 
     */
    public VerifyResponse createVerifyResponse() {
        return new VerifyResponse();
    }

    /**
     * Create an instance of {@link EndSignature }
     * 
     */
    public EndSignature createEndSignature() {
        return new EndSignature();
    }

    /**
     * Create an instance of {@link HeartBeat }
     * 
     */
    public HeartBeat createHeartBeat() {
        return new HeartBeat();
    }

    /**
     * Create an instance of {@link GetInfoFromBiometricState }
     * 
     */
    public GetInfoFromBiometricState createGetInfoFromBiometricState() {
        return new GetInfoFromBiometricState();
    }

    /**
     * Create an instance of {@link BeginSignatureResponse }
     * 
     */
    public BeginSignatureResponse createBeginSignatureResponse() {
        return new BeginSignatureResponse();
    }

    /**
     * Create an instance of {@link BeginSignature }
     * 
     */
    public BeginSignature createBeginSignature() {
        return new BeginSignature();
    }

    /**
     * Create an instance of {@link GetInfoResponse }
     * 
     */
    public GetInfoResponse createGetInfoResponse() {
        return new GetInfoResponse();
    }

    /**
     * Create an instance of {@link GetInfo }
     * 
     */
    public GetInfo createGetInfo() {
        return new GetInfo();
    }

    /**
     * Create an instance of {@link SyncOfflineSignature }
     * 
     */
    public SyncOfflineSignature createSyncOfflineSignature() {
        return new SyncOfflineSignature();
    }

    /**
     * Create an instance of {@link SyncOfflineSignatures }
     * 
     */
    public SyncOfflineSignatures createSyncOfflineSignatures() {
        return new SyncOfflineSignatures();
    }

    /**
     * Create an instance of {@link SyncOfflineSignatureResponse }
     * 
     */
    public SyncOfflineSignatureResponse createSyncOfflineSignatureResponse() {
        return new SyncOfflineSignatureResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiometricSignatureVerification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetInfoFromBiometricStateResult", scope = GetInfoFromBiometricStateResponse.class)
    public JAXBElement<BiometricSignatureVerification> createGetInfoFromBiometricStateResponseGetInfoFromBiometricStateResult(BiometricSignatureVerification value) {
        return new JAXBElement<BiometricSignatureVerification>(_GetInfoFromBiometricStateResponseGetInfoFromBiometricStateResult_QNAME, BiometricSignatureVerification.class, GetInfoFromBiometricStateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "biometricState", scope = Verify.class)
    public JAXBElement<byte[]> createVerifyBiometricState(byte[] value) {
        return new JAXBElement<byte[]>(_VerifyBiometricState_QNAME, byte[].class, Verify.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiometricVerificationParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "biometricParameters", scope = Verify.class)
    public JAXBElement<BiometricVerificationParameters> createVerifyBiometricParameters(BiometricVerificationParameters value) {
        return new JAXBElement<BiometricVerificationParameters>(_VerifyBiometricParameters_QNAME, BiometricVerificationParameters.class, Verify.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "document", scope = Verify.class)
    public JAXBElement<byte[]> createVerifyDocument(byte[] value) {
        return new JAXBElement<byte[]>(_VerifyDocument_QNAME, byte[].class, Verify.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "id", scope = Verify.class)
    public JAXBElement<String> createVerifyId(String value) {
        return new JAXBElement<String>(_VerifyId_QNAME, String.class, Verify.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "detachedSignature", scope = Verify.class)
    public JAXBElement<byte[]> createVerifyDetachedSignature(byte[] value) {
        return new JAXBElement<byte[]>(_VerifyDetachedSignature_QNAME, byte[].class, Verify.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "account", scope = Verify.class)
    public JAXBElement<String> createVerifyAccount(String value) {
        return new JAXBElement<String>(_VerifyAccount_QNAME, String.class, Verify.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiometricSignatureVerification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "VerifyResult", scope = VerifyResponse.class)
    public JAXBElement<BiometricSignatureVerification> createVerifyResponseVerifyResult(BiometricSignatureVerification value) {
        return new JAXBElement<BiometricSignatureVerification>(_VerifyResponseVerifyResult_QNAME, BiometricSignatureVerification.class, VerifyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EndSignatureResult", scope = EndSignatureResponse.class)
    public JAXBElement<byte[]> createEndSignatureResponseEndSignatureResult(byte[] value) {
        return new JAXBElement<byte[]>(_EndSignatureResponseEndSignatureResult_QNAME, byte[].class, EndSignatureResponse.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SyncOfflineSignaturesResult", scope = SyncOfflineSignaturesResponse.class)
    public JAXBElement<byte[]> createSyncOfflineSignaturesResponseSyncOfflineSignaturesResult(byte[] value) {
        return new JAXBElement<byte[]>(_SyncOfflineSignaturesResponseSyncOfflineSignaturesResult_QNAME, byte[].class, SyncOfflineSignaturesResponse.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "biometricState", scope = EndSignature.class)
    public JAXBElement<byte[]> createEndSignatureBiometricState(byte[] value) {
        return new JAXBElement<byte[]>(_VerifyBiometricState_QNAME, byte[].class, EndSignature.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "biometricState", scope = GetInfoFromBiometricState.class)
    public JAXBElement<byte[]> createGetInfoFromBiometricStateBiometricState(byte[] value) {
        return new JAXBElement<byte[]>(_VerifyBiometricState_QNAME, byte[].class, GetInfoFromBiometricState.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "document", scope = GetInfoFromBiometricState.class)
    public JAXBElement<byte[]> createGetInfoFromBiometricStateDocument(byte[] value) {
        return new JAXBElement<byte[]>(_VerifyDocument_QNAME, byte[].class, GetInfoFromBiometricState.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiometricSignatureBeginResponseBasic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BeginSignatureResult", scope = BeginSignatureResponse.class)
    public JAXBElement<BiometricSignatureBeginResponseBasic> createBeginSignatureResponseBeginSignatureResult(BiometricSignatureBeginResponseBasic value) {
        return new JAXBElement<BiometricSignatureBeginResponseBasic>(_BeginSignatureResponseBeginSignatureResult_QNAME, BiometricSignatureBeginResponseBasic.class, BeginSignatureResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signingDocument", scope = BeginSignature.class)
    public JAXBElement<byte[]> createBeginSignatureSigningDocument(byte[] value) {
        return new JAXBElement<byte[]>(_BeginSignatureSigningDocument_QNAME, byte[].class, BeginSignature.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiometricSignatureParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "biometricParameters", scope = BeginSignature.class)
    public JAXBElement<BiometricSignatureParameters> createBeginSignatureBiometricParameters(BiometricSignatureParameters value) {
        return new JAXBElement<BiometricSignatureParameters>(_VerifyBiometricParameters_QNAME, BiometricSignatureParameters.class, BeginSignature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "id", scope = BeginSignature.class)
    public JAXBElement<String> createBeginSignatureId(String value) {
        return new JAXBElement<String>(_VerifyId_QNAME, String.class, BeginSignature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "detachedSignature", scope = BeginSignature.class)
    public JAXBElement<byte[]> createBeginSignatureDetachedSignature(byte[] value) {
        return new JAXBElement<byte[]>(_VerifyDetachedSignature_QNAME, byte[].class, BeginSignature.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parameters", scope = BeginSignature.class)
    public JAXBElement<SignatureParameters> createBeginSignatureParameters(SignatureParameters value) {
        return new JAXBElement<SignatureParameters>(_BeginSignatureParameters_QNAME, SignatureParameters.class, BeginSignature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "account", scope = BeginSignature.class)
    public JAXBElement<String> createBeginSignatureAccount(String value) {
        return new JAXBElement<String>(_VerifyAccount_QNAME, String.class, BeginSignature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiometricSignatureVerification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetInfoResult", scope = GetInfoResponse.class)
    public JAXBElement<BiometricSignatureVerification> createGetInfoResponseGetInfoResult(BiometricSignatureVerification value) {
        return new JAXBElement<BiometricSignatureVerification>(_GetInfoResponseGetInfoResult_QNAME, BiometricSignatureVerification.class, GetInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "document", scope = GetInfo.class)
    public JAXBElement<byte[]> createGetInfoDocument(byte[] value) {
        return new JAXBElement<byte[]>(_VerifyDocument_QNAME, byte[].class, GetInfo.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signingDocument", scope = SyncOfflineSignature.class)
    public JAXBElement<byte[]> createSyncOfflineSignatureSigningDocument(byte[] value) {
        return new JAXBElement<byte[]>(_BeginSignatureSigningDocument_QNAME, byte[].class, SyncOfflineSignature.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiometricSignatureParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "biometricParameters", scope = SyncOfflineSignature.class)
    public JAXBElement<BiometricSignatureParameters> createSyncOfflineSignatureBiometricParameters(BiometricSignatureParameters value) {
        return new JAXBElement<BiometricSignatureParameters>(_VerifyBiometricParameters_QNAME, BiometricSignatureParameters.class, SyncOfflineSignature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "offlineBiometricState", scope = SyncOfflineSignature.class)
    public JAXBElement<byte[]> createSyncOfflineSignatureOfflineBiometricState(byte[] value) {
        return new JAXBElement<byte[]>(_SyncOfflineSignatureOfflineBiometricState_QNAME, byte[].class, SyncOfflineSignature.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "id", scope = SyncOfflineSignature.class)
    public JAXBElement<String> createSyncOfflineSignatureId(String value) {
        return new JAXBElement<String>(_VerifyId_QNAME, String.class, SyncOfflineSignature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "detachedSignature", scope = SyncOfflineSignature.class)
    public JAXBElement<byte[]> createSyncOfflineSignatureDetachedSignature(byte[] value) {
        return new JAXBElement<byte[]>(_VerifyDetachedSignature_QNAME, byte[].class, SyncOfflineSignature.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parameters", scope = SyncOfflineSignature.class)
    public JAXBElement<SignatureParameters> createSyncOfflineSignatureParameters(SignatureParameters value) {
        return new JAXBElement<SignatureParameters>(_BeginSignatureParameters_QNAME, SignatureParameters.class, SyncOfflineSignature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "account", scope = SyncOfflineSignature.class)
    public JAXBElement<String> createSyncOfflineSignatureAccount(String value) {
        return new JAXBElement<String>(_VerifyAccount_QNAME, String.class, SyncOfflineSignature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signingDocument", scope = SyncOfflineSignatures.class)
    public JAXBElement<byte[]> createSyncOfflineSignaturesSigningDocument(byte[] value) {
        return new JAXBElement<byte[]>(_BeginSignatureSigningDocument_QNAME, byte[].class, SyncOfflineSignatures.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOfflineBiometricSignature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "offlineSignatures", scope = SyncOfflineSignatures.class)
    public JAXBElement<ArrayOfOfflineBiometricSignature> createSyncOfflineSignaturesOfflineSignatures(ArrayOfOfflineBiometricSignature value) {
        return new JAXBElement<ArrayOfOfflineBiometricSignature>(_SyncOfflineSignaturesOfflineSignatures_QNAME, ArrayOfOfflineBiometricSignature.class, SyncOfflineSignatures.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "detachedSignature", scope = SyncOfflineSignatures.class)
    public JAXBElement<byte[]> createSyncOfflineSignaturesDetachedSignature(byte[] value) {
        return new JAXBElement<byte[]>(_VerifyDetachedSignature_QNAME, byte[].class, SyncOfflineSignatures.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SyncOfflineSignatureResult", scope = SyncOfflineSignatureResponse.class)
    public JAXBElement<byte[]> createSyncOfflineSignatureResponseSyncOfflineSignatureResult(byte[] value) {
        return new JAXBElement<byte[]>(_SyncOfflineSignatureResponseSyncOfflineSignatureResult_QNAME, byte[].class, SyncOfflineSignatureResponse.class, (value));
    }

}
