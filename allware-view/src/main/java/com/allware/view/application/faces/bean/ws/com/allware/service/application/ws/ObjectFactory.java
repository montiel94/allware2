
package com.allware.service.application.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.allware.service.application.ws package. 
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

    private final static QName _GetLinkedListResponse_QNAME = new QName("http://ws.application.service.allware.com/", "getLinkedListResponse");
    private final static QName _TestLinkedListResponse_QNAME = new QName("http://ws.application.service.allware.com/", "testLinkedListResponse");
    private final static QName _GetLinkedList_QNAME = new QName("http://ws.application.service.allware.com/", "getLinkedList");
    private final static QName _TestLinkedList_QNAME = new QName("http://ws.application.service.allware.com/", "testLinkedList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.allware.service.application.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestLinkedList }
     * 
     */
    public TestLinkedList createTestLinkedList() {
        return new TestLinkedList();
    }

    /**
     * Create an instance of {@link GetLinkedList }
     * 
     */
    public GetLinkedList createGetLinkedList() {
        return new GetLinkedList();
    }

    /**
     * Create an instance of {@link TestLinkedListResponse }
     * 
     */
    public TestLinkedListResponse createTestLinkedListResponse() {
        return new TestLinkedListResponse();
    }

    /**
     * Create an instance of {@link GetLinkedListResponse }
     * 
     */
    public GetLinkedListResponse createGetLinkedListResponse() {
        return new GetLinkedListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLinkedListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.application.service.allware.com/", name = "getLinkedListResponse")
    public JAXBElement<GetLinkedListResponse> createGetLinkedListResponse(GetLinkedListResponse value) {
        return new JAXBElement<GetLinkedListResponse>(_GetLinkedListResponse_QNAME, GetLinkedListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestLinkedListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.application.service.allware.com/", name = "testLinkedListResponse")
    public JAXBElement<TestLinkedListResponse> createTestLinkedListResponse(TestLinkedListResponse value) {
        return new JAXBElement<TestLinkedListResponse>(_TestLinkedListResponse_QNAME, TestLinkedListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLinkedList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.application.service.allware.com/", name = "getLinkedList")
    public JAXBElement<GetLinkedList> createGetLinkedList(GetLinkedList value) {
        return new JAXBElement<GetLinkedList>(_GetLinkedList_QNAME, GetLinkedList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestLinkedList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.application.service.allware.com/", name = "testLinkedList")
    public JAXBElement<TestLinkedList> createTestLinkedList(TestLinkedList value) {
        return new JAXBElement<TestLinkedList>(_TestLinkedList_QNAME, TestLinkedList.class, null, value);
    }

}
