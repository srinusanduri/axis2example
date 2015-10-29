package anthem.axix2.client;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.neethi.Policy;
import org.apache.neethi.PolicyEngine;
//import org.apache.rampart.RampartMessageData;

import javax.xml.namespace.QName;


public class Client {

    public static void main(String[] args) throws Exception {
       
        /*if(args.length != 2) {
            System.out.println("Usage: $java Client endpoint_address client_repo_path");
        }*/
     
        ConfigurationContext ctx = ConfigurationContextFactory.createConfigurationContextFromFileSystem("C:\\Documents and Settings\\mrinal\\workspace\\ClientCode2\\client_repositories", "C:\\Documents and Settings\\mrinal\\workspace\\ClientCode2\\PolicyConf\\axis2.xml");
       
        ServiceClient client = new ServiceClient(ctx, null);
        Options options = new Options();
        //options.setAction("urn:echo");
        options.setSoapVersionURI("http://www.w3.org/2003/05/soap-envelope");
        //options.setTo(new EndpointReference("http://localhost:1234/axis2/services/SimpleService2"));
        options.setTo(new EndpointReference("http://192.168.1.73:7410/tcws/services/HolidayServices"));
       
        options.setManageSession(true);
        client.setOptions(options);
       // options.setProperty(RampartMessageData.KEY_RAMPART_POLICY,  loadPolicy("C:\\Documents and Settings\\mrinal\\workspace\\ClientCode2\\PolicyConf\\policy.xml"));
        OMElement response = client.sendReceive(getPayload("Hello world"));
       
        System.out.println(response.getFirstElement().getText());
       
    }
   
  
    private static Policy loadPolicy(String xmlPath) throws Exception 
    {
        StAXOMBuilder builder = new StAXOMBuilder(xmlPath);
        return PolicyEngine.getPolicy(builder.getDocumentElement());
    }
   
    private static OMElement getPayload(String value) 
    {
        OMFactory factory = OMAbstractFactory.getOMFactory();
        OMNamespace ns = factory.createOMNamespace("http://service.holiday.com","ns1");
        OMElement elem = factory.createOMElement("getRegionList", ns);
       // OMElement childElem = factory.createOMElement("value", null);
        //childElem.setText(value);
        //elem.addChild(childElem);
       
        return elem;
    }
}