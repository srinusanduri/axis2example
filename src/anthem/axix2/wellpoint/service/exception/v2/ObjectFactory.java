
package anthem.axix2.wellpoint.service.exception.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wellpoint.service.exception.v2 package. 
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

    private final static QName _ExceptionList_QNAME = new QName("http://wellpoint.com/service/exception/v2", "ExceptionList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wellpoint.service.exception.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExceptionType }
     * 
     */
    public ExceptionType createExceptionType() {
        return new ExceptionType();
    }

    /**
     * Create an instance of {@link ExceptionListType }
     * 
     */
    public ExceptionListType createExceptionListType() {
        return new ExceptionListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wellpoint.com/service/exception/v2", name = "ExceptionList")
    public JAXBElement<ExceptionListType> createExceptionList(ExceptionListType value) {
        return new JAXBElement<ExceptionListType>(_ExceptionList_QNAME, ExceptionListType.class, null, value);
    }

}
