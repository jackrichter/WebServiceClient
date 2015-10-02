
package com.vpp.staffmanagement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vpp.staffmanagement package. 
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

    private final static QName _AddEmployeeNoteResponse_QNAME = new QName("http://staffmanagement.vpp.com/", "addEmployeeNoteResponse");
    private final static QName _SearchBySurname_QNAME = new QName("http://staffmanagement.vpp.com/", "searchBySurname");
    private final static QName _RegisterEmployeeResponse_QNAME = new QName("http://staffmanagement.vpp.com/", "registerEmployeeResponse");
    private final static QName _AddEmployeeNote_QNAME = new QName("http://staffmanagement.vpp.com/", "addEmployeeNote");
    private final static QName _SearchBySurnameResponse_QNAME = new QName("http://staffmanagement.vpp.com/", "searchBySurnameResponse");
    private final static QName _DummyInMemoryMethod_QNAME = new QName("http://staffmanagement.vpp.com/", "dummyInMemoryMethod");
    private final static QName _SystemUnavailableException_QNAME = new QName("http://staffmanagement.vpp.com/", "SystemUnavailableException");
    private final static QName _DummyInMemoryMethodResponse_QNAME = new QName("http://staffmanagement.vpp.com/", "dummyInMemoryMethodResponse");
    private final static QName _GetAllEmployeesResponse_QNAME = new QName("http://staffmanagement.vpp.com/", "getAllEmployeesResponse");
    private final static QName _RegisterEmployee_QNAME = new QName("http://staffmanagement.vpp.com/", "registerEmployee");
    private final static QName _GetAllEmployees_QNAME = new QName("http://staffmanagement.vpp.com/", "getAllEmployees");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vpp.staffmanagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllEmployeesResponse }
     * 
     */
    public GetAllEmployeesResponse createGetAllEmployeesResponse() {
        return new GetAllEmployeesResponse();
    }

    /**
     * Create an instance of {@link GetAllEmployees }
     * 
     */
    public GetAllEmployees createGetAllEmployees() {
        return new GetAllEmployees();
    }

    /**
     * Create an instance of {@link AddEmployeeNoteResponse }
     * 
     */
    public AddEmployeeNoteResponse createAddEmployeeNoteResponse() {
        return new AddEmployeeNoteResponse();
    }

    /**
     * Create an instance of {@link DummyInMemoryMethodResponse }
     * 
     */
    public DummyInMemoryMethodResponse createDummyInMemoryMethodResponse() {
        return new DummyInMemoryMethodResponse();
    }

    /**
     * Create an instance of {@link SystemUnavailableException }
     * 
     */
    public SystemUnavailableException createSystemUnavailableException() {
        return new SystemUnavailableException();
    }

    /**
     * Create an instance of {@link SearchBySurnameResponse }
     * 
     */
    public SearchBySurnameResponse createSearchBySurnameResponse() {
        return new SearchBySurnameResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link DummyInMemoryMethod }
     * 
     */
    public DummyInMemoryMethod createDummyInMemoryMethod() {
        return new DummyInMemoryMethod();
    }

    /**
     * Create an instance of {@link SearchBySurname }
     * 
     */
    public SearchBySurname createSearchBySurname() {
        return new SearchBySurname();
    }

    /**
     * Create an instance of {@link AddEmployeeNote }
     * 
     */
    public AddEmployeeNote createAddEmployeeNote() {
        return new AddEmployeeNote();
    }

    /**
     * Create an instance of {@link RegisterEmployeeResponse }
     * 
     */
    public RegisterEmployeeResponse createRegisterEmployeeResponse() {
        return new RegisterEmployeeResponse();
    }

    /**
     * Create an instance of {@link RegisterEmployee }
     * 
     */
    public RegisterEmployee createRegisterEmployee() {
        return new RegisterEmployee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployeeNoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.vpp.com/", name = "addEmployeeNoteResponse")
    public JAXBElement<AddEmployeeNoteResponse> createAddEmployeeNoteResponse(AddEmployeeNoteResponse value) {
        return new JAXBElement<AddEmployeeNoteResponse>(_AddEmployeeNoteResponse_QNAME, AddEmployeeNoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBySurname }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.vpp.com/", name = "searchBySurname")
    public JAXBElement<SearchBySurname> createSearchBySurname(SearchBySurname value) {
        return new JAXBElement<SearchBySurname>(_SearchBySurname_QNAME, SearchBySurname.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.vpp.com/", name = "registerEmployeeResponse")
    public JAXBElement<RegisterEmployeeResponse> createRegisterEmployeeResponse(RegisterEmployeeResponse value) {
        return new JAXBElement<RegisterEmployeeResponse>(_RegisterEmployeeResponse_QNAME, RegisterEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployeeNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.vpp.com/", name = "addEmployeeNote")
    public JAXBElement<AddEmployeeNote> createAddEmployeeNote(AddEmployeeNote value) {
        return new JAXBElement<AddEmployeeNote>(_AddEmployeeNote_QNAME, AddEmployeeNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBySurnameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.vpp.com/", name = "searchBySurnameResponse")
    public JAXBElement<SearchBySurnameResponse> createSearchBySurnameResponse(SearchBySurnameResponse value) {
        return new JAXBElement<SearchBySurnameResponse>(_SearchBySurnameResponse_QNAME, SearchBySurnameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DummyInMemoryMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.vpp.com/", name = "dummyInMemoryMethod")
    public JAXBElement<DummyInMemoryMethod> createDummyInMemoryMethod(DummyInMemoryMethod value) {
        return new JAXBElement<DummyInMemoryMethod>(_DummyInMemoryMethod_QNAME, DummyInMemoryMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemUnavailableException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.vpp.com/", name = "SystemUnavailableException")
    public JAXBElement<SystemUnavailableException> createSystemUnavailableException(SystemUnavailableException value) {
        return new JAXBElement<SystemUnavailableException>(_SystemUnavailableException_QNAME, SystemUnavailableException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DummyInMemoryMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.vpp.com/", name = "dummyInMemoryMethodResponse")
    public JAXBElement<DummyInMemoryMethodResponse> createDummyInMemoryMethodResponse(DummyInMemoryMethodResponse value) {
        return new JAXBElement<DummyInMemoryMethodResponse>(_DummyInMemoryMethodResponse_QNAME, DummyInMemoryMethodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.vpp.com/", name = "getAllEmployeesResponse")
    public JAXBElement<GetAllEmployeesResponse> createGetAllEmployeesResponse(GetAllEmployeesResponse value) {
        return new JAXBElement<GetAllEmployeesResponse>(_GetAllEmployeesResponse_QNAME, GetAllEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.vpp.com/", name = "registerEmployee")
    public JAXBElement<RegisterEmployee> createRegisterEmployee(RegisterEmployee value) {
        return new JAXBElement<RegisterEmployee>(_RegisterEmployee_QNAME, RegisterEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://staffmanagement.vpp.com/", name = "getAllEmployees")
    public JAXBElement<GetAllEmployees> createGetAllEmployees(GetAllEmployees value) {
        return new JAXBElement<GetAllEmployees>(_GetAllEmployees_QNAME, GetAllEmployees.class, null, value);
    }

}
