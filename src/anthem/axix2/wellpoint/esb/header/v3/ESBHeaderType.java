
package anthem.axix2.wellpoint.esb.header.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ESBHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESBHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="srvcName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="50"/>
 *               &lt;pattern value="([0-9]+[a-zA-Z_]+|[a-zA-Z_]+[0-9]+)[0-9a-zA-Z_]*|([a-zA-Z_])*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="srvcVersion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{0,1}[0-9]{1}[.][0-9]{1}[0-9]{0,1}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="operName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="4"/>
 *               &lt;maxLength value="50"/>
 *               &lt;pattern value="([0-9]+[a-zA-Z_]+|[a-zA-Z_]+[0-9]+)[0-9a-zA-Z_]*|([a-zA-Z_])*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="senderApp">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="20"/>
 *               &lt;pattern value="([0-9]+[A-Z~]+|[A-Z~]+[0-9]+)[0-9A-Z~]*|([A-Z~])*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="transId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ESBProps" type="{http://wellpoint.com/esb/header/v3}ESBPropsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ESBHeaderType", propOrder = {
    "srvcName",
    "srvcVersion",
    "operName",
    "senderApp",
    "transId",
    "esbProps"
})
public class ESBHeaderType {

    @XmlElement(required = true)
    protected String srvcName;
    @XmlElement(required = true)
    protected String srvcVersion;
    @XmlElement(required = true)
    protected String operName;
    @XmlElement(required = true)
    protected String senderApp;
    @XmlElement(required = true)
    protected String transId;
    @XmlElement(name = "ESBProps")
    protected ESBPropsType esbProps;

    /**
     * Gets the value of the srvcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrvcName() {
        return srvcName;
    }

    /**
     * Sets the value of the srvcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrvcName(String value) {
        this.srvcName = value;
    }

    /**
     * Gets the value of the srvcVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrvcVersion() {
        return srvcVersion;
    }

    /**
     * Sets the value of the srvcVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrvcVersion(String value) {
        this.srvcVersion = value;
    }

    /**
     * Gets the value of the operName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperName() {
        return operName;
    }

    /**
     * Sets the value of the operName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperName(String value) {
        this.operName = value;
    }

    /**
     * Gets the value of the senderApp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderApp() {
        return senderApp;
    }

    /**
     * Sets the value of the senderApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderApp(String value) {
        this.senderApp = value;
    }

    /**
     * Gets the value of the transId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransId(String value) {
        this.transId = value;
    }

    /**
     * Gets the value of the esbProps property.
     * 
     * @return
     *     possible object is
     *     {@link ESBPropsType }
     *     
     */
    public ESBPropsType getESBProps() {
        return esbProps;
    }

    /**
     * Sets the value of the esbProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESBPropsType }
     *     
     */
    public void setESBProps(ESBPropsType value) {
        this.esbProps = value;
    }

}
