/**
 * BenefitServiceExLITESTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package anthem.axix2.client;

import anthem.axis.schema.getacctbalancelitesrequest.v1.GetAcctBalanceLITESRequest;
import anthem.axix2.schema.getacctbalancelitesresponse.v1.GetAcctBalanceLITESResponse;
import anthem.axix2.wellpoint.esb.header.v3.ESBHeaderType;
import anthem.axix2.wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1.BenefitServiceExLITESCallbackHandler;
import anthem.axix2.wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1.BenefitServiceExLITESStub;


/*
 *  BenefitServiceExLITESTest Junit test case
 */
public class BenefitServiceExLITESClient 
{
	static{
		
        System.setProperty("javax.net.ssl.trustStore", AnthemWSConfigs.KEYSTORE_PATH);
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        
        System.setProperty("javax.net.ssl.keyStore", AnthemWSConfigs.KEYSTORE_PATH);
        System.setProperty("javax.net.ssl.keyStorePassword", "changeit");
        System.setProperty("javax.net.ssl.keyAlias", "clh_prod");
        
        
        // prints
        
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
        System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
        System.setProperty("org.apache.commons.logging.simplelog.log.httpclient.wire", "debug");
        System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.commons.httpclient", "debug");
        
        	
	}
	
	
	/*
		 <signatureCrypto>
			<crypto provider="org.apache.ws.security.components.crypto.Merlin">
				<property name="org.apache.ws.security.crypto.merlin.keystore.type">JKS</property>
				<property name="org.apache.ws.security.crypto.merlin.file">client.jks</property>
				<property name="org.apache.ws.security.crypto.merlin.keystore.password">apache</property>
			</crypto>
		<signatureCrypto>
	 */
	
	public static void main(String[] args) throws Exception {
		BenefitServiceExLITESClient client = new BenefitServiceExLITESClient();
		client.testgetAcctBalanceLITES();
		//client.testStartgetAcctBalanceLITES();
	}
	
    /**
     * Auto generated test method
     */
    public void testgetAcctBalanceLITES() throws java.lang.Exception 
    {
        BenefitServiceExLITESStub stub =  new BenefitServiceExLITESStub();

        GetAcctBalanceLITESRequest request = RequestCreator.createRequest();
        ESBHeaderType esbHeader = RequestCreator.createESBHeader();
        
        System.out.println(stub.getAcctBalanceLITES(request, esbHeader));
    }

    /**
     * Auto generated test method
     */
    public void testStartgetAcctBalanceLITES() throws java.lang.Exception 
    {
        BenefitServiceExLITESStub stub = new BenefitServiceExLITESStub();
        
        GetAcctBalanceLITESRequest request = RequestCreator.createRequest();
        ESBHeaderType esbHeader = RequestCreator.createESBHeader();
        
        stub.startgetAcctBalanceLITES(request, esbHeader, new tempCallbackN1000C());
    }

    //Create an object and provide it as the test object
    public Object getTestObject(java.lang.Class type)
        throws java.lang.Exception {
        return type.newInstance();
    }

    private class tempCallbackN1000C extends BenefitServiceExLITESCallbackHandler {
        public tempCallbackN1000C() {
            super(null);
        }

        public void receiveResultgetAcctBalanceLITES(
            GetAcctBalanceLITESResponse result) {
        }

        public void receiveErrorgetAcctBalanceLITES(java.lang.Exception e) {
        	System.out.println("FAILED......");
        }
    }
}
