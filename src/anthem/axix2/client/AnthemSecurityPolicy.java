package anthem.axix2.client;

//import junit.framework.TestCase;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.neethi.Assertion;
import org.apache.neethi.Policy;
import org.apache.neethi.PolicyEngine;

import java.util.Iterator;
import java.util.List;


public class AnthemSecurityPolicy {
	
//	public void testSymmBinding() {
//        try {
//            Policy p = this.getPolicy(System.getProperty("basedir", ".") +
//                    "/test-resources/policy-mtom-security.xml");
//            List assertions = (List)p.getAlternatives().next();
//
//            boolean isMTOMAssertionFound = false;
//
//            for (Iterator iter = assertions.iterator(); iter.hasNext();) {
//                Assertion assertion = (Assertion)iter.next();
//                if (assertion instanceof MTOM10Assertion) {
//                    isMTOMAssertionFound = true;
//                    MTOM10Assertion mtomModel = (MTOM10Assertion)assertion;
//                    assertEquals("MIME Serialization assertion not processed", false,
//                                 mtomModel.isOptional());
//                }
//
//            }
//            //The Asymm binding mean is not built in the policy processing :-(
//            assertTrue("MTOM10 Assertion not found.", isMTOMAssertionFound);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            fail(e.getMessage());
//        }
//    }
	
	
	private Policy getPolicy(String filePath) throws Exception 
	{
        StAXOMBuilder builder = new StAXOMBuilder(filePath);
        OMElement elem = builder.getDocumentElement();
        return PolicyEngine.getPolicy(elem);
    }

}
