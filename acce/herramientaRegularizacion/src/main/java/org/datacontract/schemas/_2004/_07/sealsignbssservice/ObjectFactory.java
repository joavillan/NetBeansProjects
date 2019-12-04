
package org.datacontract.schemas._2004._07.sealsignbssservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.sealsignbsstypes.BiometricSignatureParameters;
import org.datacontract.schemas._2004._07.sealsigndsstypes.SignatureParameters;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.sealsignbssservice package. 
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

    private final static QName _OfflineBiometricSignature_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignBSSService", "OfflineBiometricSignature");
    private final static QName _ArrayOfOfflineBiometricSignature_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignBSSService", "ArrayOfOfflineBiometricSignature");
    private final static QName _BiometricSignatureBeginResponseBasic_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignBSSService", "BiometricSignatureBeginResponseBasic");
    private final static QName _SealSignDSSFaultContract_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignBSSService", "SealSignDSSFaultContract");
    private final static QName _SealSignDSSFaultContractMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignBSSService", "message");
    private final static QName _SealSignDSSFaultContractStackTrace_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignBSSService", "stackTrace");
    private final static QName _OfflineBiometricSignatureBiometricParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignBSSService", "biometricParameters");
    private final static QName _OfflineBiometricSignatureId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignBSSService", "id");
    private final static QName _OfflineBiometricSignatureOfflineBiometricState_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignBSSService", "offlineBiometricState");
    private final static QName _OfflineBiometricSignatureAccount_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignBSSService", "account");
    private final static QName _OfflineBiometricSignatureParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignBSSService", "parameters");
    private final static QName _BiometricSignatureBeginResponseBasicBiometricState_QNAME = new QName("http://schemas.datacontract.org/2004/07/SealSignBSSService", "biometricState");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.sealsignbssservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SealSignDSSFaultContract }
     * 
     */
    public SealSignDSSFaultContract createSealSignDSSFaultContract() {
        return new SealSignDSSFaultContract();
    }

    /**
     * Create an instance of {@link OfflineBiometricSignature }
     * 
     */
    public OfflineBiometricSignature createOfflineBiometricSignature() {
        return new OfflineBiometricSignature();
    }

    /**
     * Create an instance of {@link ArrayOfOfflineBiometricSignature }
     * 
     */
    public ArrayOfOfflineBiometricSignature createArrayOfOfflineBiometricSignature() {
        return new ArrayOfOfflineBiometricSignature();
    }

    /**
     * Create an instance of {@link BiometricSignatureBeginResponseBasic }
     * 
     */
    public BiometricSignatureBeginResponseBasic createBiometricSignatureBeginResponseBasic() {
        return new BiometricSignatureBeginResponseBasic();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfflineBiometricSignature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSService", name = "OfflineBiometricSignature")
    public JAXBElement<OfflineBiometricSignature> createOfflineBiometricSignature(OfflineBiometricSignature value) {
        return new JAXBElement<OfflineBiometricSignature>(_OfflineBiometricSignature_QNAME, OfflineBiometricSignature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOfflineBiometricSignature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSService", name = "ArrayOfOfflineBiometricSignature")
    public JAXBElement<ArrayOfOfflineBiometricSignature> createArrayOfOfflineBiometricSignature(ArrayOfOfflineBiometricSignature value) {
        return new JAXBElement<ArrayOfOfflineBiometricSignature>(_ArrayOfOfflineBiometricSignature_QNAME, ArrayOfOfflineBiometricSignature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiometricSignatureBeginResponseBasic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSService", name = "BiometricSignatureBeginResponseBasic")
    public JAXBElement<BiometricSignatureBeginResponseBasic> createBiometricSignatureBeginResponseBasic(BiometricSignatureBeginResponseBasic value) {
        return new JAXBElement<BiometricSignatureBeginResponseBasic>(_BiometricSignatureBeginResponseBasic_QNAME, BiometricSignatureBeginResponseBasic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SealSignDSSFaultContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSService", name = "SealSignDSSFaultContract")
    public JAXBElement<SealSignDSSFaultContract> createSealSignDSSFaultContract(SealSignDSSFaultContract value) {
        return new JAXBElement<SealSignDSSFaultContract>(_SealSignDSSFaultContract_QNAME, SealSignDSSFaultContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSService", name = "message", scope = SealSignDSSFaultContract.class)
    public JAXBElement<String> createSealSignDSSFaultContractMessage(String value) {
        return new JAXBElement<String>(_SealSignDSSFaultContractMessage_QNAME, String.class, SealSignDSSFaultContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSService", name = "stackTrace", scope = SealSignDSSFaultContract.class)
    public JAXBElement<String> createSealSignDSSFaultContractStackTrace(String value) {
        return new JAXBElement<String>(_SealSignDSSFaultContractStackTrace_QNAME, String.class, SealSignDSSFaultContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiometricSignatureParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSService", name = "biometricParameters", scope = OfflineBiometricSignature.class)
    public JAXBElement<BiometricSignatureParameters> createOfflineBiometricSignatureBiometricParameters(BiometricSignatureParameters value) {
        return new JAXBElement<BiometricSignatureParameters>(_OfflineBiometricSignatureBiometricParameters_QNAME, BiometricSignatureParameters.class, OfflineBiometricSignature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSService", name = "id", scope = OfflineBiometricSignature.class)
    public JAXBElement<String> createOfflineBiometricSignatureId(String value) {
        return new JAXBElement<String>(_OfflineBiometricSignatureId_QNAME, String.class, OfflineBiometricSignature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSService", name = "offlineBiometricState", scope = OfflineBiometricSignature.class)
    public JAXBElement<byte[]> createOfflineBiometricSignatureOfflineBiometricState(byte[] value) {
        return new JAXBElement<byte[]>(_OfflineBiometricSignatureOfflineBiometricState_QNAME, byte[].class, OfflineBiometricSignature.class, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSService", name = "account", scope = OfflineBiometricSignature.class)
    public JAXBElement<String> createOfflineBiometricSignatureAccount(String value) {
        return new JAXBElement<String>(_OfflineBiometricSignatureAccount_QNAME, String.class, OfflineBiometricSignature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSService", name = "parameters", scope = OfflineBiometricSignature.class)
    public JAXBElement<SignatureParameters> createOfflineBiometricSignatureParameters(SignatureParameters value) {
        return new JAXBElement<SignatureParameters>(_OfflineBiometricSignatureParameters_QNAME, SignatureParameters.class, OfflineBiometricSignature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SealSignBSSService", name = "biometricState", scope = BiometricSignatureBeginResponseBasic.class)
    public JAXBElement<byte[]> createBiometricSignatureBeginResponseBasicBiometricState(byte[] value) {
        return new JAXBElement<byte[]>(_BiometricSignatureBeginResponseBasicBiometricState_QNAME, byte[].class, BiometricSignatureBeginResponseBasic.class, (value));
    }

}
