/**
 * GetAcctBalanceLITESFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1;

public class GetAcctBalanceLITESFault extends java.lang.Exception {
    private static final long serialVersionUID = 1444908486025L;
    private com.wellpoint.service.exception.v2.ExceptionListType faultMessage;

    public GetAcctBalanceLITESFault() {
        super("GetAcctBalanceLITESFault");
    }

    public GetAcctBalanceLITESFault(java.lang.String s) {
        super(s);
    }

    public GetAcctBalanceLITESFault(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public GetAcctBalanceLITESFault(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        com.wellpoint.service.exception.v2.ExceptionListType msg) {
        faultMessage = msg;
    }

    public com.wellpoint.service.exception.v2.ExceptionListType getFaultMessage() {
        return faultMessage;
    }
}
