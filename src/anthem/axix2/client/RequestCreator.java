package anthem.axix2.client;

import anthem.axis.schema.getacctbalancelitesrequest.v1.GetAcctBalanceLITESRequest;
import anthem.axix2.wellpoint.esb.header.v3.ESBHeaderType;

public class RequestCreator {
	
	
	/*
	 * 
	 * Mandatory inputs:

 		Healthcard Id	e.g, "170M62332"	 
 		Dependent Code	e.g, "00"	
 		Group Id 		e.g, "00142899"	
 		Inquiry Date	e.g, "2011-12-15"	
 		Source System	e.g, ??	
 		
 		Healthcard Id: This is the HC id that Anthem sends to Castlight as part of standard eligibility feed
 		
		Source System: Anthem has Rolls Royce Castlight eligible membership on two different source systems. The information on eligibility file will appropriately map the source system at the member level.
					   Another example is Board of Regents where multiple group numbers represent the employer.
	 */
	public static GetAcctBalanceLITESRequest createRequest() 
	{
		/*
		String healthcardID = "12345";
		String dependentCode = "01";
		String groupID = "C99201M002";
		String inquiryDate = "2015-02-01";
		String source = "WGS1";
		*/
		
		/*
		String healthcardID = "202A07046";
		String dependentCode = "01";
		String groupID = "174092MBAG";
		String inquiryDate = "2015-08-01";
		String source = "WGSW";
		*/
		
		String healthcardID = "AN5962517";
		String dependentCode = "01";
		String groupID = "003324250";
		String inquiryDate = "2015-09-22";
		String source = "NSC1";

		
		GetAcctBalanceLITESRequest.StaticData staticData = new GetAcctBalanceLITESRequest.StaticData();
		staticData.setHealthCardId(healthcardID);
		staticData.setDependentCode(dependentCode);
		staticData.setGroupId(groupID);
		staticData.setInquiryDt(inquiryDate);
		staticData.setSource(source);
		
		GetAcctBalanceLITESRequest request = new GetAcctBalanceLITESRequest();
		request.setStaticData(staticData);
		
		return request;
	}

	public static ESBHeaderType createESBHeader() 
	{
		ESBHeaderType esbHeader = new ESBHeaderType();
		
		esbHeader.setSrvcName("Member");
		esbHeader.setSrvcVersion("1.0");
		esbHeader.setOperName("BenefitServiceExLITES");
		esbHeader.setSenderApp("CASTLIGHT");
		//esbHeader.setTransId("?");
		
		/*
		ESBPropsType.Property esbProperty1 = new ESBPropsType.Property();
		esbProperty1.setName("Prop-1");
		esbProperty1.setValue("Value-1");
		
		ESBPropsType.Property esbProperty2 = new ESBPropsType.Property();
		esbProperty2.setName("Prop-2");
		esbProperty2.setValue("Value-2");
		
		List<ESBPropsType.Property> esbPropList = new ArrayList<ESBPropsType.Property>();
		esbPropList.add(esbProperty1);
		esbPropList.add(esbProperty2);
		
		ESBPropsType esbPropsType = new ESBPropsType();
		esbPropsType.setProperty(esbPropList);
		
		esbHeader.setESBProps(esbPropsType);
		*/
		
		return esbHeader;
	}

}
