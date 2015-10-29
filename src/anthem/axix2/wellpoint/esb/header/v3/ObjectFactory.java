
package anthem.axix2.wellpoint.esb.header.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wellpoint.esb.header.v3 package. 
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

    private final static QName _ESBHeader_QNAME = new QName("http://wellpoint.com/esb/header/v3", "ESBHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wellpoint.esb.header.v3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ESBPropsType }
     * 
     */
    public ESBPropsType createESBPropsType() {
        return new ESBPropsType();
    }

    /**
     * Create an instance of {@link ESBPropsType.Property }
     * 
     */
    public ESBPropsType.Property createESBPropsTypeProperty() {
        return new ESBPropsType.Property();
    }

    /**
     * Create an instance of {@link ESBHeaderType }
     * 
     */
    public ESBHeaderType createESBHeaderType() {
        return new ESBHeaderType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ESBHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wellpoint.com/esb/header/v3", name = "ESBHeader")
    public JAXBElement<ESBHeaderType> createESBHeader(ESBHeaderType value) {
        return new JAXBElement<ESBHeaderType>(_ESBHeader_QNAME, ESBHeaderType.class, null, value);
    }

}
