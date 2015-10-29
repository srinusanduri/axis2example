/**
 * BenefitServiceExLITESStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1;


/*
 *  BenefitServiceExLITESStub java implementation
 */
public class BenefitServiceExLITESStub extends org.apache.axis2.client.Stub {
    private static int counter = 0;

    //https://prods-dp.WELLPOINT.COM/Member/1.0/BenefitServiceExLITES
    private static final javax.xml.bind.JAXBContext wsContext;

    static {
        javax.xml.bind.JAXBContext jc;
        jc = null;

        try {
            jc = javax.xml.bind.JAXBContext.newInstance(com.anthem.schema.getacctbalancelitesrequest.v1.GetAcctBalanceLITESRequest.class,
                    com.anthem.schema.getacctbalancelitesresponse.v1.GetAcctBalanceLITESResponse.class,
                    com.wellpoint.service.exception.v2.ExceptionListType.class,
                    com.wellpoint.esb.header.v3.ESBHeaderType.class);
        } catch (javax.xml.bind.JAXBException ex) {
            System.err.println("Unable to create JAXBContext: " +
                ex.getMessage());
            ex.printStackTrace(System.err);
            Runtime.getRuntime().exit(-1);
        } finally {
            wsContext = jc;
        }
    }

    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();

    /////////////////////////////////////////////////////////////////////////
    private javax.xml.namespace.QName[] opNameArray = null;

    /**
     *Constructor that takes in a configContext
     */
    public BenefitServiceExLITESStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public BenefitServiceExLITESStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
                _service);

        _service.applyPolicy();

        _serviceClient.getOptions()
                      .setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
    }

    /**
     * Default Constructor
     */
    public BenefitServiceExLITESStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "https://prods-dp.WELLPOINT.COM/Member/1.0/BenefitServiceExLITES");
    }

    /**
     * Default Constructor
     */
    public BenefitServiceExLITESStub() throws org.apache.axis2.AxisFault {
        this("https://prods-dp.WELLPOINT.COM/Member/1.0/BenefitServiceExLITES");
    }

    /**
     * Constructor taking the target endpoint
     */
    public BenefitServiceExLITESStub(java.lang.String targetEndpoint)
        throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }

        counter = counter + 1;

        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) +
        "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {
        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService(
                "BenefitServiceExLITES" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[1];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://anthem.com/service/BenefitServiceExLITES-Interface/v1",
                "getAcctBalanceLITES"));
        _service.addOperation(__operation);

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"MyWebServicePortBindingPolicy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:AsymmetricBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:InitiatorToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:WssX509V3Token10/></wsp:Policy></sp:X509Token></wsp:Policy></sp:InitiatorToken><sp:RecipientToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:WssX509V3Token10/></wsp:Policy></sp:X509Token></wsp:Policy></sp:RecipientToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDesRsa15/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/><sp:OnlySignEntireHeadersAndBody/></wsp:Policy></sp:AsymmetricBinding><sp:SignedParts xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n               <sp:Body/>\n            </sp:SignedParts><ramp:RampartConfig xmlns:ramp=\"http://ws.apache.org/rampart/policy\">\n			    <ramp:userCertAlias>clh_prod</ramp:userCertAlias>\n			    <ramp:passwordCallbackClass>com.castlight.ws.healthfund.anthem.ws.callbacks.PrivateKeyPasswordCallbackHandler</ramp:passwordCallbackClass>\n			\n			    <ramp:signatureCrypto>\n			       <ramp:crypto provider=\"org.apache.ws.security.components.crypto.Merlin\">\n			          <ramp:property name=\"org.apache.ws.security.crypto.merlin.keystore.type\">JKS</ramp:property>\n			          <ramp:property name=\"org.apache.ws.security.crypto.merlin.file\">/home/ssanduri/Projects/Ventana/servicelaunchpad/security/keystores/cacerts</ramp:property>\n			          <ramp:property name=\"org.apache.ws.security.crypto.merlin.keystore.password\">changeit</ramp:property>\n			       </ramp:crypto>\n			    </ramp:signatureCrypto>\n			</ramp:RampartConfig></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE)
         .getPolicySubject()
         .attachPolicy(getPolicy(
                "<wsp:Policy wsu:Id=\"MyWebServicePortBindingPolicy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><sp:AsymmetricBinding xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:InitiatorToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:WssX509V3Token10/></wsp:Policy></sp:X509Token></wsp:Policy></sp:InitiatorToken><sp:RecipientToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:WssX509V3Token10/></wsp:Policy></sp:X509Token></wsp:Policy></sp:RecipientToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TripleDesRsa15/></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict/></wsp:Policy></sp:Layout><sp:IncludeTimestamp/><sp:OnlySignEntireHeadersAndBody/></wsp:Policy></sp:AsymmetricBinding><sp:SignedParts xmlns:sp=\"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702\">\n               <sp:Body/>\n            </sp:SignedParts><ramp:RampartConfig xmlns:ramp=\"http://ws.apache.org/rampart/policy\">\n			    <ramp:userCertAlias>clh_prod</ramp:userCertAlias>\n			    <ramp:passwordCallbackClass>com.castlight.ws.healthfund.anthem.ws.callbacks.PrivateKeyPasswordCallbackHandler</ramp:passwordCallbackClass>\n			\n			    <ramp:signatureCrypto>\n			       <ramp:crypto provider=\"org.apache.ws.security.components.crypto.Merlin\">\n			          <ramp:property name=\"org.apache.ws.security.crypto.merlin.keystore.type\">JKS</ramp:property>\n			          <ramp:property name=\"org.apache.ws.security.crypto.merlin.file\">/home/ssanduri/Projects/Ventana/servicelaunchpad/security/keystores/cacerts</ramp:property>\n			          <ramp:property name=\"org.apache.ws.security.crypto.merlin.keystore.password\">changeit</ramp:property>\n			       </ramp:crypto>\n			    </ramp:signatureCrypto>\n			</ramp:RampartConfig></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

        _operations[0] = __operation;
    }

    //populates the faults
    private void populateFaults() {
        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://wellpoint.com/service/exception/v2", "ExceptionList"),
                "GetAcctBalanceLITES"),
            "wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1.GetAcctBalanceLITESFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://wellpoint.com/service/exception/v2", "ExceptionList"),
                "GetAcctBalanceLITES"),
            "wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1.GetAcctBalanceLITESFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "http://wellpoint.com/service/exception/v2", "ExceptionList"),
                "GetAcctBalanceLITES"),
            "com.wellpoint.service.exception.v2.ExceptionListType");
    }

    /**
     * Auto generated method signature
     *
     * @see wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1.BenefitServiceExLITES#getAcctBalanceLITES
     * @param getAcctBalanceLITESRequest0
     * @param eSBHeader1
     * @throws wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1.GetAcctBalanceLITESFault :
     */
    public com.anthem.schema.getacctbalancelitesresponse.v1.GetAcctBalanceLITESResponse getAcctBalanceLITES(
        com.anthem.schema.getacctbalancelitesrequest.v1.GetAcctBalanceLITESRequest getAcctBalanceLITESRequest0,
        com.wellpoint.esb.header.v3.ESBHeaderType eSBHeader1)
        throws java.rmi.RemoteException,
            wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1.GetAcctBalanceLITESFault {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions().setAction("GetAcctBalanceLITES");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getAcctBalanceLITESRequest0,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://anthem.com/service/BenefitServiceExLITES-Interface/v1",
                            "getAcctBalanceLITES")),
                    new javax.xml.namespace.QName(
                        "http://anthem.com/service/BenefitServiceExLITES-Interface/v1",
                        "getAcctBalanceLITES"));

            env.build();

            // add the children only if the parameter is not null
            if (eSBHeader1 != null) {
                org.apache.axiom.om.OMElement omElementeSBHeader1 = toOM(eSBHeader1,
                        optimizeContent(
                            new javax.xml.namespace.QName(
                                "http://anthem.com/service/BenefitServiceExLITES-Interface/v1",
                                "getAcctBalanceLITES")));
                addHeader(omElementeSBHeader1, env);
            }

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    com.anthem.schema.getacctbalancelitesresponse.v1.GetAcctBalanceLITESResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (com.anthem.schema.getacctbalancelitesresponse.v1.GetAcctBalanceLITESResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetAcctBalanceLITES"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetAcctBalanceLITES"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetAcctBalanceLITES"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1.GetAcctBalanceLITESFault) {
                            throw (wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1.GetAcctBalanceLITESFault) ex;
                        }

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1.BenefitServiceExLITES#startgetAcctBalanceLITES
     * @param getAcctBalanceLITESRequest0
     * @param eSBHeader1
     */
    public void startgetAcctBalanceLITES(
        com.anthem.schema.getacctbalancelitesrequest.v1.GetAcctBalanceLITESRequest getAcctBalanceLITESRequest0,
        com.wellpoint.esb.header.v3.ESBHeaderType eSBHeader1,
        final wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1.BenefitServiceExLITESCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
        _operationClient.getOptions().setAction("GetAcctBalanceLITES");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                getAcctBalanceLITESRequest0,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "http://anthem.com/service/BenefitServiceExLITES-Interface/v1",
                        "getAcctBalanceLITES")),
                new javax.xml.namespace.QName(
                    "http://anthem.com/service/BenefitServiceExLITES-Interface/v1",
                    "getAcctBalanceLITES"));

        // add the soap_headers only if they are not null
        if (eSBHeader1 != null) {
            org.apache.axiom.om.OMElement omElementeSBHeader1 = toOM(eSBHeader1,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://anthem.com/service/BenefitServiceExLITES-Interface/v1",
                            "getAcctBalanceLITES")));
            addHeader(omElementeSBHeader1, env);
        }

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                com.anthem.schema.getacctbalancelitesresponse.v1.GetAcctBalanceLITESResponse.class,
                                getEnvelopeNamespaces(resultEnv));
                        callback.receiveResultgetAcctBalanceLITES((com.anthem.schema.getacctbalancelitesresponse.v1.GetAcctBalanceLITESResponse) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorgetAcctBalanceLITES(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "GetAcctBalanceLITES"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "GetAcctBalanceLITES"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "GetAcctBalanceLITES"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass, null);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    if (ex instanceof wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1.GetAcctBalanceLITESFault) {
                                        callback.receiveErrorgetAcctBalanceLITES((wsdl.benefitserviceexlites_interface_v1.benefitserviceexlites.v1.GetAcctBalanceLITESFault) ex);

                                        return;
                                    }

                                    callback.receiveErrorgetAcctBalanceLITES(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetAcctBalanceLITES(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetAcctBalanceLITES(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetAcctBalanceLITES(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetAcctBalanceLITES(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetAcctBalanceLITES(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetAcctBalanceLITES(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetAcctBalanceLITES(f);
                                }
                            } else {
                                callback.receiveErrorgetAcctBalanceLITES(f);
                            }
                        } else {
                            callback.receiveErrorgetAcctBalanceLITES(f);
                        }
                    } else {
                        callback.receiveErrorgetAcctBalanceLITES(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorgetAcctBalanceLITES(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[0].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     *  A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(
        org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();

        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }

        return returnMap;
    }

    ////////////////////////////////////////////////////////////////////////
    private static org.apache.neethi.Policy getPolicy(
        java.lang.String policyString) {
        return org.apache.neethi.PolicyEngine.getPolicy(org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                new java.io.StringReader(policyString)).getDocument()
                                                                                               .getXMLStreamReader(false));
    }

    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        if (opNameArray == null) {
            return false;
        }

        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }

        return false;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.anthem.schema.getacctbalancelitesrequest.v1.GetAcctBalanceLITESRequest param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.anthem.schema.getacctbalancelitesrequest.v1.GetAcctBalanceLITESRequest.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.anthem.schema.getacctbalancelitesrequest.v1.GetAcctBalanceLITESRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.anthem.schema.getacctbalancelitesrequest.v1.GetAcctBalanceLITESRequest.class,
                    param, marshaller,
                    "http://anthem.com/schema/GetAcctBalanceLITESRequest/v1",
                    "GetAcctBalanceLITESRequest");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://anthem.com/schema/GetAcctBalanceLITESRequest/v1",
                    null);

            return factory.createOMElement(source,
                "GetAcctBalanceLITESRequest", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.anthem.schema.getacctbalancelitesrequest.v1.GetAcctBalanceLITESRequest param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.anthem.schema.getacctbalancelitesresponse.v1.GetAcctBalanceLITESResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.anthem.schema.getacctbalancelitesresponse.v1.GetAcctBalanceLITESResponse.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.anthem.schema.getacctbalancelitesresponse.v1.GetAcctBalanceLITESResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.anthem.schema.getacctbalancelitesresponse.v1.GetAcctBalanceLITESResponse.class,
                    param, marshaller,
                    "http://anthem.com/schema/GetAcctBalanceLITESResponse/v1",
                    "GetAcctBalanceLITESResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://anthem.com/schema/GetAcctBalanceLITESResponse/v1",
                    null);

            return factory.createOMElement(source,
                "GetAcctBalanceLITESResponse", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.anthem.schema.getacctbalancelitesresponse.v1.GetAcctBalanceLITESResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.wellpoint.service.exception.v2.ExceptionListType param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.wellpoint.service.exception.v2.ExceptionListType.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.wellpoint.service.exception.v2.ExceptionListType param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.wellpoint.service.exception.v2.ExceptionListType.class,
                    param, marshaller,
                    "http://wellpoint.com/service/exception/v2", "ExceptionList");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://wellpoint.com/service/exception/v2",
                    null);

            return factory.createOMElement(source, "ExceptionList", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.wellpoint.service.exception.v2.ExceptionListType param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.wellpoint.esb.header.v3.ESBHeaderType param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.wellpoint.esb.header.v3.ESBHeaderType.class,
                    param, marshaller, methodQName.getNamespaceURI(),
                    methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(),
                    null);

            return factory.createOMElement(source, methodQName.getLocalPart(),
                namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.wellpoint.esb.header.v3.ESBHeaderType param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(com.wellpoint.esb.header.v3.ESBHeaderType.class,
                    param, marshaller, "http://wellpoint.com/esb/header/v3",
                    "ESBHeader");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://wellpoint.com/esb/header/v3",
                    null);

            return factory.createOMElement(source, "ESBHeader", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.wellpoint.esb.header.v3.ESBHeaderType param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));

        return envelope;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type, java.util.Map extraNamespaces)
        throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();

            return unmarshaller.unmarshal(param.getXMLStreamReaderWithoutCaching(),
                type).getValue();
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    class JaxbRIDataSource implements org.apache.axiom.om.OMDataSource {
        /**
         * Bound object for output.
         */
        private final Object outObject;

        /**
         * Bound class for output.
         */
        private final Class outClazz;

        /**
         * Marshaller.
         */
        private final javax.xml.bind.Marshaller marshaller;

        /**
         * Namespace
         */
        private String nsuri;

        /**
         * Local name
         */
        private String name;

        /**
         * Constructor from object and marshaller.
         *
         * @param obj
         * @param marshaller
         */
        public JaxbRIDataSource(Class clazz, Object obj,
            javax.xml.bind.Marshaller marshaller, String nsuri, String name) {
            this.outClazz = clazz;
            this.outObject = obj;
            this.marshaller = marshaller;
            this.nsuri = nsuri;
            this.name = name;
        }

        public void serialize(java.io.OutputStream output,
            org.apache.axiom.om.OMOutputFormat format)
            throws javax.xml.stream.XMLStreamException {
            try {
                marshaller.marshal(new javax.xml.bind.JAXBElement(
                        new javax.xml.namespace.QName(nsuri, name),
                        outObject.getClass(), outObject), output);
            } catch (javax.xml.bind.JAXBException e) {
                throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling",
                    e);
            }
        }

        public void serialize(java.io.Writer writer,
            org.apache.axiom.om.OMOutputFormat format)
            throws javax.xml.stream.XMLStreamException {
            try {
                marshaller.marshal(new javax.xml.bind.JAXBElement(
                        new javax.xml.namespace.QName(nsuri, name),
                        outObject.getClass(), outObject), writer);
            } catch (javax.xml.bind.JAXBException e) {
                throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling",
                    e);
            }
        }

        public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            try {
                marshaller.marshal(new javax.xml.bind.JAXBElement(
                        new javax.xml.namespace.QName(nsuri, name),
                        outObject.getClass(), outObject), xmlWriter);
            } catch (javax.xml.bind.JAXBException e) {
                throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling",
                    e);
            }
        }

        public javax.xml.stream.XMLStreamReader getReader()
            throws javax.xml.stream.XMLStreamException {
            try {
                javax.xml.bind.JAXBContext context = wsContext;
                org.apache.axiom.om.impl.builder.SAXOMBuilder builder = new org.apache.axiom.om.impl.builder.SAXOMBuilder();
                javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                marshaller.marshal(new javax.xml.bind.JAXBElement(
                        new javax.xml.namespace.QName(nsuri, name),
                        outObject.getClass(), outObject), builder);

                return builder.getRootElement().getXMLStreamReader();
            } catch (javax.xml.bind.JAXBException e) {
                throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling",
                    e);
            }
        }
    }
}
