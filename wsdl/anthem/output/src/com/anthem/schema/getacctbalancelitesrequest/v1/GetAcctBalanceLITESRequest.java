
package com.anthem.schema.getacctbalancelitesrequest.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="StaticData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dependentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="planCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="alphaPrefixCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="inquiryDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="acctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="acctNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="clmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="itsClmCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="funcNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="funcDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "staticData"
})
@XmlRootElement(name = "GetAcctBalanceLITESRequest")
public class GetAcctBalanceLITESRequest {

    @XmlElement(name = "StaticData")
    protected GetAcctBalanceLITESRequest.StaticData staticData;

    /**
     * Gets the value of the staticData property.
     * 
     * @return
     *     possible object is
     *     {@link GetAcctBalanceLITESRequest.StaticData }
     *     
     */
    public GetAcctBalanceLITESRequest.StaticData getStaticData() {
        return staticData;
    }

    /**
     * Sets the value of the staticData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAcctBalanceLITESRequest.StaticData }
     *     
     */
    public void setStaticData(GetAcctBalanceLITESRequest.StaticData value) {
        this.staticData = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dependentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="planCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="alphaPrefixCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="inquiryDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="acctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="acctNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="clmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="itsClmCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="funcNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="funcDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "healthCardId",
        "dependentCode",
        "groupId",
        "planCode",
        "alphaPrefixCd",
        "inquiryDt",
        "acctType",
        "acctNumber",
        "clmNumber",
        "itsClmCd",
        "source",
        "funcNum",
        "funcDesc"
    })
    public static class StaticData {

        protected String healthCardId;
        protected String dependentCode;
        protected String groupId;
        protected String planCode;
        protected String alphaPrefixCd;
        protected String inquiryDt;
        protected String acctType;
        protected String acctNumber;
        protected String clmNumber;
        protected String itsClmCd;
        protected String source;
        protected String funcNum;
        protected String funcDesc;

        /**
         * Gets the value of the healthCardId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHealthCardId() {
            return healthCardId;
        }

        /**
         * Sets the value of the healthCardId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHealthCardId(String value) {
            this.healthCardId = value;
        }

        /**
         * Gets the value of the dependentCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDependentCode() {
            return dependentCode;
        }

        /**
         * Sets the value of the dependentCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDependentCode(String value) {
            this.dependentCode = value;
        }

        /**
         * Gets the value of the groupId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupId() {
            return groupId;
        }

        /**
         * Sets the value of the groupId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupId(String value) {
            this.groupId = value;
        }

        /**
         * Gets the value of the planCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlanCode() {
            return planCode;
        }

        /**
         * Sets the value of the planCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlanCode(String value) {
            this.planCode = value;
        }

        /**
         * Gets the value of the alphaPrefixCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlphaPrefixCd() {
            return alphaPrefixCd;
        }

        /**
         * Sets the value of the alphaPrefixCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlphaPrefixCd(String value) {
            this.alphaPrefixCd = value;
        }

        /**
         * Gets the value of the inquiryDt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInquiryDt() {
            return inquiryDt;
        }

        /**
         * Sets the value of the inquiryDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInquiryDt(String value) {
            this.inquiryDt = value;
        }

        /**
         * Gets the value of the acctType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctType() {
            return acctType;
        }

        /**
         * Sets the value of the acctType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctType(String value) {
            this.acctType = value;
        }

        /**
         * Gets the value of the acctNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctNumber() {
            return acctNumber;
        }

        /**
         * Sets the value of the acctNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctNumber(String value) {
            this.acctNumber = value;
        }

        /**
         * Gets the value of the clmNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClmNumber() {
            return clmNumber;
        }

        /**
         * Sets the value of the clmNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClmNumber(String value) {
            this.clmNumber = value;
        }

        /**
         * Gets the value of the itsClmCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItsClmCd() {
            return itsClmCd;
        }

        /**
         * Sets the value of the itsClmCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItsClmCd(String value) {
            this.itsClmCd = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Gets the value of the funcNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFuncNum() {
            return funcNum;
        }

        /**
         * Sets the value of the funcNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFuncNum(String value) {
            this.funcNum = value;
        }

        /**
         * Gets the value of the funcDesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFuncDesc() {
            return funcDesc;
        }

        /**
         * Sets the value of the funcDesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFuncDesc(String value) {
            this.funcDesc = value;
        }

    }

}
