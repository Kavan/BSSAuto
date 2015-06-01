
/**
 * PaymentGatewayIntegrationServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0;

        

        /*
        *  PaymentGatewayIntegrationServiceStub java implementation
        */

        
        public class PaymentGatewayIntegrationServiceStub extends org.apache.axis2.client.Stub
        implements PaymentGatewayIntegrationService{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("PaymentGatewayIntegrationService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[10];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0", "deleteToken"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0", "applyPaymentCharge"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0", "readTokens"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0", "createSchedule"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0", "readSchedules"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0", "createToken"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0", "updateSchedule"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0", "deleteSchedule"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0", "calculatePaymentTax"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0", "updateToken"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "deleteToken"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "deleteToken"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "deleteToken"),"com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "applyPaymentCharge"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "applyPaymentCharge"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "applyPaymentCharge"),"com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "readTokens"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "readTokens"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "readTokens"),"com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "createSchedule"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "createSchedule"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "createSchedule"),"com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "readSchedules"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "readSchedules"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "readSchedules"),"com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "createToken"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "createToken"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "createToken"),"com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "updateSchedule"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "updateSchedule"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "updateSchedule"),"com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "deleteSchedule"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "deleteSchedule"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "deleteSchedule"),"com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "calculatePaymentTax"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "calculatePaymentTax"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "calculatePaymentTax"),"com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "updateToken"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "updateToken"),"com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08","CRMException"), "updateToken"),"com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public PaymentGatewayIntegrationServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public PaymentGatewayIntegrationServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public PaymentGatewayIntegrationServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://optimus-z2:8080/RedkneeSoap_v3_0/services/PaymentGatewayIntegrationService/" );
                
    }

    /**
     * Default Constructor
     */
    public PaymentGatewayIntegrationServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("http://optimus-z2:8080/RedkneeSoap_v3_0/services/PaymentGatewayIntegrationService/" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public PaymentGatewayIntegrationServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.PaymentGatewayIntegrationService#deleteToken
                     * @param deleteToken0
                    
                     * @throws com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault : 
                     */

                    

                            public  com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteTokenResponseE deleteToken(

                            com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteTokenE deleteToken0)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("urn:deleteToken");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteToken0,
                                                    optimizeContent(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "deleteToken")), new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "deleteToken"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteTokenResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteTokenResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deleteToken"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deleteToken"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deleteToken"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault){
                          throw (com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.PaymentGatewayIntegrationService#applyPaymentCharge
                     * @param applyPaymentCharge2
                    
                     * @throws com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault : 
                     */

                    

                            public  com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ApplyPaymentChargeResponseE applyPaymentCharge(

                            com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ApplyPaymentChargeE applyPaymentCharge2)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("urn:applyPaymentCharge");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    applyPaymentCharge2,
                                                    optimizeContent(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "applyPaymentCharge")), new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "applyPaymentCharge"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ApplyPaymentChargeResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ApplyPaymentChargeResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"applyPaymentCharge"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"applyPaymentCharge"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"applyPaymentCharge"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault){
                          throw (com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.PaymentGatewayIntegrationService#readTokens
                     * @param readTokens4
                    
                     * @throws com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault : 
                     */

                    

                            public  com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadTokensResponseE readTokens(

                            com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadTokensE readTokens4)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("urn:readTokens");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    readTokens4,
                                                    optimizeContent(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "readTokens")), new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "readTokens"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadTokensResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadTokensResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"readTokens"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"readTokens"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"readTokens"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault){
                          throw (com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.PaymentGatewayIntegrationService#createSchedule
                     * @param createSchedule6
                    
                     * @throws com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault : 
                     */

                    

                            public  com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateScheduleResponseE createSchedule(

                            com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateScheduleE createSchedule6)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("urn:createSchedule");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createSchedule6,
                                                    optimizeContent(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "createSchedule")), new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "createSchedule"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateScheduleResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateScheduleResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"createSchedule"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"createSchedule"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"createSchedule"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault){
                          throw (com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.PaymentGatewayIntegrationService#readSchedules
                     * @param readSchedules8
                    
                     * @throws com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault : 
                     */

                    

                            public  com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadSchedulesResponseE readSchedules(

                            com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadSchedulesE readSchedules8)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("urn:readSchedules");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    readSchedules8,
                                                    optimizeContent(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "readSchedules")), new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "readSchedules"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadSchedulesResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadSchedulesResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"readSchedules"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"readSchedules"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"readSchedules"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault){
                          throw (com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.PaymentGatewayIntegrationService#createToken
                     * @param createToken10
                    
                     * @throws com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault : 
                     */

                    

                            public  com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenResponseE createToken(

                            com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenE createToken10)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("urn:createToken");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createToken10,
                                                    optimizeContent(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "createToken")), new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "createToken"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"createToken"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"createToken"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"createToken"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault){
                          throw (com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.PaymentGatewayIntegrationService#updateSchedule
                     * @param updateSchedule12
                    
                     * @throws com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault : 
                     */

                    

                            public  com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateScheduleResponseE updateSchedule(

                            com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateScheduleE updateSchedule12)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("urn:updateSchedule");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateSchedule12,
                                                    optimizeContent(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "updateSchedule")), new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "updateSchedule"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateScheduleResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateScheduleResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateSchedule"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateSchedule"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateSchedule"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault){
                          throw (com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.PaymentGatewayIntegrationService#deleteSchedule
                     * @param deleteSchedule14
                    
                     * @throws com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault : 
                     */

                    

                            public  com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteScheduleResponseE deleteSchedule(

                            com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteScheduleE deleteSchedule14)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("urn:deleteSchedule");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteSchedule14,
                                                    optimizeContent(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "deleteSchedule")), new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "deleteSchedule"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteScheduleResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteScheduleResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deleteSchedule"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deleteSchedule"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"deleteSchedule"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault){
                          throw (com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.PaymentGatewayIntegrationService#calculatePaymentTax
                     * @param calculatePaymentTax16
                    
                     * @throws com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault : 
                     */

                    

                            public  com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CalculatePaymentTaxResponseE calculatePaymentTax(

                            com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CalculatePaymentTaxE calculatePaymentTax16)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("urn:calculatePaymentTax");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    calculatePaymentTax16,
                                                    optimizeContent(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "calculatePaymentTax")), new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "calculatePaymentTax"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CalculatePaymentTaxResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CalculatePaymentTaxResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"calculatePaymentTax"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"calculatePaymentTax"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"calculatePaymentTax"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault){
                          throw (com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.PaymentGatewayIntegrationService#updateToken
                     * @param updateToken18
                    
                     * @throws com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault : 
                     */

                    

                            public  com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateTokenResponseE updateToken(

                            com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateTokenE updateToken18)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("urn:updateToken");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateToken18,
                                                    optimizeContent(new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "updateToken")), new javax.xml.namespace.QName("http://soap.crmapi.util.redknee.com/PaymentGatewayIntegration/PaymentGatewayIntegration-v1.0",
                                                    "updateToken"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateTokenResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateTokenResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateToken"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateToken"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateToken"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault){
                          throw (com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
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
     //http://optimus-z2:8080/RedkneeSoap_v3_0/services/PaymentGatewayIntegrationService/
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteTokenE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteTokenE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteTokenResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteTokenResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ApplyPaymentChargeE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ApplyPaymentChargeE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ApplyPaymentChargeResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ApplyPaymentChargeResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadTokensE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadTokensE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadTokensResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadTokensResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateScheduleE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateScheduleE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateScheduleResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateScheduleResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadSchedulesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadSchedulesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadSchedulesResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadSchedulesResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateScheduleE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateScheduleE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateScheduleResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateScheduleResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteScheduleE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteScheduleE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteScheduleResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteScheduleResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CalculatePaymentTaxE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CalculatePaymentTaxE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CalculatePaymentTaxResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CalculatePaymentTaxResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateTokenE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateTokenE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateTokenResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateTokenResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteTokenE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteTokenE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ApplyPaymentChargeE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ApplyPaymentChargeE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadTokensE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadTokensE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateScheduleE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateScheduleE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadSchedulesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadSchedulesE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateScheduleE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateScheduleE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteScheduleE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteScheduleE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CalculatePaymentTaxE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CalculatePaymentTaxE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateTokenE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateTokenE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteTokenE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteTokenE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteTokenResponseE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteTokenResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ApplyPaymentChargeE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ApplyPaymentChargeE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ApplyPaymentChargeResponseE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ApplyPaymentChargeResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadTokensE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadTokensE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadTokensResponseE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadTokensResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateScheduleE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateScheduleE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateScheduleResponseE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateScheduleResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadSchedulesE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadSchedulesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadSchedulesResponseE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.ReadSchedulesResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenResponseE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateScheduleE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateScheduleE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateScheduleResponseE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateScheduleResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteScheduleE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteScheduleE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteScheduleResponseE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.DeleteScheduleResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CalculatePaymentTaxE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CalculatePaymentTaxE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CalculatePaymentTaxResponseE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CalculatePaymentTaxResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateTokenE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateTokenE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateTokenResponseE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.UpdateTokenResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.class.equals(type)){
                
                           return com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   