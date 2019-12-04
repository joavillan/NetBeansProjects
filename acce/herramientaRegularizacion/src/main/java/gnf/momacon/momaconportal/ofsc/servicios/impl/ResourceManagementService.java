
package gnf.momacon.momaconportal.ofsc.servicios.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import gnf.momacon.momaconportal.ofsc.servicios.ResourceManagementPort;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ResourceManagementService", targetNamespace = "urn:toatech:ResourceManagement:1.0")
public class ResourceManagementService
    extends Service
{

    private static final URL RESOURCEMANAGEMENTSERVICE_WSDL_LOCATION;
    private static final Logger LOGGER = Logger.getLogger(ResourceManagementService.class.getName());

    static {
        URL url = null;
        String urlOfscRM = null;
        try {
        	urlOfscRM = "http://wmbpro.intranet.gasnatural.com:14191/momaeu_ws/ofsc_rmng?wsdl";
            URL baseUrl = ResourceManagementService.class.getResource(".");
            url = new URL(baseUrl, urlOfscRM);
        } catch (MalformedURLException e) {
            LOGGER.warning("Failed to create URL for the wsdl Location: '"+urlOfscRM+"', retrying as a local file");
            LOGGER.warning(e.getMessage());
        }
        RESOURCEMANAGEMENTSERVICE_WSDL_LOCATION = url;
    }

    public ResourceManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ResourceManagementService() {
        super(RESOURCEMANAGEMENTSERVICE_WSDL_LOCATION, new QName("urn:toatech:ResourceManagement:1.0", "ResourceManagementService"));
    }

    /**
     * 
     * @return
     *     returns ResourceManagementPort
     */
//    @WebEndpoint(name = "ResourceManagementPort")
//    public ResourceManagementPort getResourceManagementPort() {
//        return super.getPort(new QName("urn:toatech:ResourceManagement:1.0", "ResourceManagementPort"), ResourceManagementPort.class);
//    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ResourceManagementPort
     */
    @WebEndpoint(name = "ResourceManagementPort")
    public ResourceManagementPort getResourceManagementPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:toatech:ResourceManagement:1.0", "ResourceManagementPort"), ResourceManagementPort.class, features);
    }
    
    /**
     * 
     * @return
     *     returns ResourceManagementPort
     */
    @WebEndpoint(name = "ResourceManagementPort")
    public ResourceManagementPort getResourceManagementPort() {
    	LOGGER.info("Llamamos al getPort con la url: "+RESOURCEMANAGEMENTSERVICE_WSDL_LOCATION);
    	BindingProvider bp = (BindingProvider) super.getPort(new QName("urn:toatech:ResourceManagement:1.0", "ResourceManagementPort"), ResourceManagementPort.class);
    	bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://wmbpro.intranet.gasnatural.com:14191/momaeu_ws/ofsc_rmng?gas");
    	
        return (ResourceManagementPort) bp;
    }

}
