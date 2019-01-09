
package com.allware.service.application.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AllwareService", targetNamespace = "http://ws.application.service.allware.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AllwareService {


    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLinkedList", targetNamespace = "http://ws.application.service.allware.com/", className = "com.allware.service.application.ws.GetLinkedList")
    @ResponseWrapper(localName = "getLinkedListResponse", targetNamespace = "http://ws.application.service.allware.com/", className = "com.allware.service.application.ws.GetLinkedListResponse")
    public List<Object> getLinkedList();

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "testLinkedList", targetNamespace = "http://ws.application.service.allware.com/", className = "com.allware.service.application.ws.TestLinkedList")
    @ResponseWrapper(localName = "testLinkedListResponse", targetNamespace = "http://ws.application.service.allware.com/", className = "com.allware.service.application.ws.TestLinkedListResponse")
    public void testLinkedList();

}