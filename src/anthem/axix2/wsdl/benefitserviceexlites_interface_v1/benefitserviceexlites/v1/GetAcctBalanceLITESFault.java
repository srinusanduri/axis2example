/**
 * GetAcctBalanceLITESFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package anthem.axix2.wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1;

import anthem.axix2.wellpoint.service.exception.v2.ExceptionListType;

public class GetAcctBalanceLITESFault extends java.lang.Exception {
    private static final long serialVersionUID = 1444908486025L;
    private ExceptionListType faultMessage;

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
        ExceptionListType msg) {
        faultMessage = msg;
    }

    public ExceptionListType getFaultMessage() {
        return faultMessage;
    }
}
