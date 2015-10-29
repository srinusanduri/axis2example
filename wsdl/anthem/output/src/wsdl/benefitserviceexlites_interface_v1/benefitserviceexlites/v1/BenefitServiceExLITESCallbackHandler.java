/**
 * BenefitServiceExLITESCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1;


/**
 *  BenefitServiceExLITESCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class BenefitServiceExLITESCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public BenefitServiceExLITESCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public BenefitServiceExLITESCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getAcctBalanceLITES method
     * override this method for handling normal response from getAcctBalanceLITES operation
     */
    public void receiveResultgetAcctBalanceLITES(
        com.anthem.schema.getacctbalancelitesresponse.v1.GetAcctBalanceLITESResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAcctBalanceLITES operation
     */
    public void receiveErrorgetAcctBalanceLITES(java.lang.Exception e) {
    }
}
