
/**
 * CRMExceptionFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0;

public class CRMExceptionFault extends java.lang.Exception{

    private static final long serialVersionUID = 1433179544565L;
    
    private com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE faultMessage;

    
        public CRMExceptionFault() {
            super("CRMExceptionFault");
        }

        public CRMExceptionFault(java.lang.String s) {
           super(s);
        }

        public CRMExceptionFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public CRMExceptionFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE msg){
       faultMessage = msg;
    }
    
    public com.redknee.util.crmapi.soap.common.exception.xsd._2008._08.CRMExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    