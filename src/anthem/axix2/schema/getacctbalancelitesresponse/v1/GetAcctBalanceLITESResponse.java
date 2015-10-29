
package anthem.axix2.schema.getacctbalancelitesresponse.v1;

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
 *         &lt;element name="DynamicData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dependentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="inquiryDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="lName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hraInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="clmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="priorBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="productAllocAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="rolloverLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="usage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="actualAllocAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="balanceAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="staticHRAAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prevBenYrsRolloverAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="rolloverRemainingAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="stateMaxContribAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="stateYtdRcvdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memMaxContribAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memYtdRcvdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="totalYtdFundedAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="hsaInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="acctNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="balanceAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="acctStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="intRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="intPaidYtd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "dynamicData"
})
@XmlRootElement(name = "GetAcctBalanceLITESResponse")
public class GetAcctBalanceLITESResponse {

    @XmlElement(name = "DynamicData")
    protected GetAcctBalanceLITESResponse.DynamicData dynamicData;

    /**
     * Gets the value of the dynamicData property.
     * 
     * @return
     *     possible object is
     *     {@link GetAcctBalanceLITESResponse.DynamicData }
     *     
     */
    public GetAcctBalanceLITESResponse.DynamicData getDynamicData() {
        return dynamicData;
    }

    /**
     * Sets the value of the dynamicData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAcctBalanceLITESResponse.DynamicData }
     *     
     */
    public void setDynamicData(GetAcctBalanceLITESResponse.DynamicData value) {
        this.dynamicData = value;
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
     *         &lt;element name="inquiryDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="lName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hraInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="clmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="priorBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="productAllocAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="rolloverLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="usage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="actualAllocAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="balanceAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="staticHRAAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prevBenYrsRolloverAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="rolloverRemainingAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="stateMaxContribAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="stateYtdRcvdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memMaxContribAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memYtdRcvdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="totalYtdFundedAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="hsaInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="acctNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="balanceAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="acctStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="intRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="intPaidYtd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "healthCardId",
        "dependentCode",
        "groupId",
        "inquiryDt",
        "fName",
        "lName",
        "hraInfo",
        "hsaInfo"
    })
    public static class DynamicData {

        protected String healthCardId;
        protected String dependentCode;
        protected String groupId;
        protected String inquiryDt;
        protected String fName;
        protected String lName;
        protected GetAcctBalanceLITESResponse.DynamicData.HraInfo hraInfo;
        protected GetAcctBalanceLITESResponse.DynamicData.HsaInfo hsaInfo;

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
         * Gets the value of the fName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFName() {
            return fName;
        }

        /**
         * Sets the value of the fName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFName(String value) {
            this.fName = value;
        }

        /**
         * Gets the value of the lName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLName() {
            return lName;
        }

        /**
         * Sets the value of the lName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLName(String value) {
            this.lName = value;
        }

        /**
         * Gets the value of the hraInfo property.
         * 
         * @return
         *     possible object is
         *     {@link GetAcctBalanceLITESResponse.DynamicData.HraInfo }
         *     
         */
        public GetAcctBalanceLITESResponse.DynamicData.HraInfo getHraInfo() {
            return hraInfo;
        }

        /**
         * Sets the value of the hraInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetAcctBalanceLITESResponse.DynamicData.HraInfo }
         *     
         */
        public void setHraInfo(GetAcctBalanceLITESResponse.DynamicData.HraInfo value) {
            this.hraInfo = value;
        }

        /**
         * Gets the value of the hsaInfo property.
         * 
         * @return
         *     possible object is
         *     {@link GetAcctBalanceLITESResponse.DynamicData.HsaInfo }
         *     
         */
        public GetAcctBalanceLITESResponse.DynamicData.HsaInfo getHsaInfo() {
            return hsaInfo;
        }

        /**
         * Sets the value of the hsaInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetAcctBalanceLITESResponse.DynamicData.HsaInfo }
         *     
         */
        public void setHsaInfo(GetAcctBalanceLITESResponse.DynamicData.HsaInfo value) {
            this.hsaInfo = value;
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
         *         &lt;element name="clmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="priorBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="productAllocAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="rolloverLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="usage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="actualAllocAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="balanceAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="staticHRAAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prevBenYrsRolloverAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="rolloverRemainingAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="stateMaxContribAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="stateYtdRcvdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memMaxContribAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memYtdRcvdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="totalYtdFundedAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "clmNumber",
            "priorBalance",
            "productAllocAmt",
            "rolloverLimit",
            "usage",
            "actualAllocAmt",
            "balanceAmt",
            "staticHRAAmt",
            "prevBenYrsRolloverAmt",
            "rolloverRemainingAmt",
            "stateMaxContribAmt",
            "stateYtdRcvdAmt",
            "memMaxContribAmt",
            "memYtdRcvdAmt",
            "totalYtdFundedAmt"
        })
        public static class HraInfo {

            protected String clmNumber;
            protected String priorBalance;
            protected String productAllocAmt;
            protected String rolloverLimit;
            protected String usage;
            protected String actualAllocAmt;
            protected String balanceAmt;
            protected String staticHRAAmt;
            protected String prevBenYrsRolloverAmt;
            protected String rolloverRemainingAmt;
            protected String stateMaxContribAmt;
            protected String stateYtdRcvdAmt;
            protected String memMaxContribAmt;
            protected String memYtdRcvdAmt;
            protected String totalYtdFundedAmt;

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
             * Gets the value of the priorBalance property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriorBalance() {
                return priorBalance;
            }

            /**
             * Sets the value of the priorBalance property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPriorBalance(String value) {
                this.priorBalance = value;
            }

            /**
             * Gets the value of the productAllocAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductAllocAmt() {
                return productAllocAmt;
            }

            /**
             * Sets the value of the productAllocAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductAllocAmt(String value) {
                this.productAllocAmt = value;
            }

            /**
             * Gets the value of the rolloverLimit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRolloverLimit() {
                return rolloverLimit;
            }

            /**
             * Sets the value of the rolloverLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRolloverLimit(String value) {
                this.rolloverLimit = value;
            }

            /**
             * Gets the value of the usage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsage() {
                return usage;
            }

            /**
             * Sets the value of the usage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsage(String value) {
                this.usage = value;
            }

            /**
             * Gets the value of the actualAllocAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActualAllocAmt() {
                return actualAllocAmt;
            }

            /**
             * Sets the value of the actualAllocAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActualAllocAmt(String value) {
                this.actualAllocAmt = value;
            }

            /**
             * Gets the value of the balanceAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBalanceAmt() {
                return balanceAmt;
            }

            /**
             * Sets the value of the balanceAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBalanceAmt(String value) {
                this.balanceAmt = value;
            }

            /**
             * Gets the value of the staticHRAAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStaticHRAAmt() {
                return staticHRAAmt;
            }

            /**
             * Sets the value of the staticHRAAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStaticHRAAmt(String value) {
                this.staticHRAAmt = value;
            }

            /**
             * Gets the value of the prevBenYrsRolloverAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrevBenYrsRolloverAmt() {
                return prevBenYrsRolloverAmt;
            }

            /**
             * Sets the value of the prevBenYrsRolloverAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrevBenYrsRolloverAmt(String value) {
                this.prevBenYrsRolloverAmt = value;
            }

            /**
             * Gets the value of the rolloverRemainingAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRolloverRemainingAmt() {
                return rolloverRemainingAmt;
            }

            /**
             * Sets the value of the rolloverRemainingAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRolloverRemainingAmt(String value) {
                this.rolloverRemainingAmt = value;
            }

            /**
             * Gets the value of the stateMaxContribAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateMaxContribAmt() {
                return stateMaxContribAmt;
            }

            /**
             * Sets the value of the stateMaxContribAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateMaxContribAmt(String value) {
                this.stateMaxContribAmt = value;
            }

            /**
             * Gets the value of the stateYtdRcvdAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateYtdRcvdAmt() {
                return stateYtdRcvdAmt;
            }

            /**
             * Sets the value of the stateYtdRcvdAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateYtdRcvdAmt(String value) {
                this.stateYtdRcvdAmt = value;
            }

            /**
             * Gets the value of the memMaxContribAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemMaxContribAmt() {
                return memMaxContribAmt;
            }

            /**
             * Sets the value of the memMaxContribAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemMaxContribAmt(String value) {
                this.memMaxContribAmt = value;
            }

            /**
             * Gets the value of the memYtdRcvdAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemYtdRcvdAmt() {
                return memYtdRcvdAmt;
            }

            /**
             * Sets the value of the memYtdRcvdAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemYtdRcvdAmt(String value) {
                this.memYtdRcvdAmt = value;
            }

            /**
             * Gets the value of the totalYtdFundedAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalYtdFundedAmt() {
                return totalYtdFundedAmt;
            }

            /**
             * Sets the value of the totalYtdFundedAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalYtdFundedAmt(String value) {
                this.totalYtdFundedAmt = value;
            }

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
         *         &lt;element name="acctNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="balanceAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="acctStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="intRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="intPaidYtd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "acctNumber",
            "balanceAmt",
            "acctStatus",
            "intRate",
            "intPaidYtd"
        })
        public static class HsaInfo {

            protected String acctNumber;
            protected String balanceAmt;
            protected String acctStatus;
            protected String intRate;
            protected String intPaidYtd;

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
             * Gets the value of the balanceAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBalanceAmt() {
                return balanceAmt;
            }

            /**
             * Sets the value of the balanceAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBalanceAmt(String value) {
                this.balanceAmt = value;
            }

            /**
             * Gets the value of the acctStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAcctStatus() {
                return acctStatus;
            }

            /**
             * Sets the value of the acctStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAcctStatus(String value) {
                this.acctStatus = value;
            }

            /**
             * Gets the value of the intRate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIntRate() {
                return intRate;
            }

            /**
             * Sets the value of the intRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIntRate(String value) {
                this.intRate = value;
            }

            /**
             * Gets the value of the intPaidYtd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIntPaidYtd() {
                return intPaidYtd;
            }

            /**
             * Sets the value of the intPaidYtd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIntPaidYtd(String value) {
                this.intPaidYtd = value;
            }

        }

    }

}
