
package com.allware.service.application.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AllwareServiceService", targetNamespace = "http://ws.application.service.allware.com/", wsdlLocation = "http://localhost:8080/allware-service/AllwareService?wsdl")
public class AllwareServiceService
    extends Service
{

    private final static URL ALLWARESERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException ALLWARESERVICESERVICE_EXCEPTION;
    private final static QName ALLWARESERVICESERVICE_QNAME = new QName("http://ws.application.service.allware.com/", "AllwareServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/allware-service/AllwareService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ALLWARESERVICESERVICE_WSDL_LOCATION = url;
        ALLWARESERVICESERVICE_EXCEPTION = e;
    }

    public AllwareServiceService() {
        super(__getWsdlLocation(), ALLWARESERVICESERVICE_QNAME);
    }

    public AllwareServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ALLWARESERVICESERVICE_QNAME, features);
    }

    public AllwareServiceService(URL wsdlLocation) {
        super(wsdlLocation, ALLWARESERVICESERVICE_QNAME);
    }

    public AllwareServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ALLWARESERVICESERVICE_QNAME, features);
    }

    public AllwareServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AllwareServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AllwareService
     */
    @WebEndpoint(name = "AllwareServicePort")
    public AllwareService getAllwareServicePort() {
        return super.getPort(new QName("http://ws.application.service.allware.com/", "AllwareServicePort"), AllwareService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AllwareService
     */
    @WebEndpoint(name = "AllwareServicePort")
    public AllwareService getAllwareServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.application.service.allware.com/", "AllwareServicePort"), AllwareService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ALLWARESERVICESERVICE_EXCEPTION!= null) {
            throw ALLWARESERVICESERVICE_EXCEPTION;
        }
        return ALLWARESERVICESERVICE_WSDL_LOCATION;
    }

}
