
package org.tempuri;

import javax.xml.ws.WebFault;
import org.datacontract.schemas._2004._07.sealsignbssservice.SealSignDSSFaultContract;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "SealSignDSSFaultContract", targetNamespace = "http://schemas.datacontract.org/2004/07/SealSignBSSService")
public class IBiometricSignatureServiceBasicBeginSignatureSealSignDSSFaultContractFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SealSignDSSFaultContract faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public IBiometricSignatureServiceBasicBeginSignatureSealSignDSSFaultContractFaultFaultMessage(String message, SealSignDSSFaultContract faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public IBiometricSignatureServiceBasicBeginSignatureSealSignDSSFaultContractFaultFaultMessage(String message, SealSignDSSFaultContract faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.datacontract.schemas._2004._07.sealsignbssservice.SealSignDSSFaultContract
     */
    public SealSignDSSFaultContract getFaultInfo() {
        return faultInfo;
    }

}
