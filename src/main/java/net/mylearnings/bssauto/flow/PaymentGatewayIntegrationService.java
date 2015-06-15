package net.mylearnings.bssauto.flow;

import java.io.ByteArrayOutputStream;
import java.rmi.RemoteException;

import javax.xml.stream.XMLStreamException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.context.ServiceContext;
import org.apache.axis2.description.MessageContextListener;
import org.apache.axis2.description.WSDL2Constants;

import com.redknee.util.crmapi.soap.common.xsd._2011._05.CRMRequestHeader;
import com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.CRMExceptionFault;
import com.redknee.util.crmapi.soap.paymentgatewayintegration.paymentgatewayintegration_v1_0.PaymentGatewayIntegrationServiceStub;
import com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd._2012._03.CreateTokenRequest;
import com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateToken;
import com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenE;
import com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenResponse;
import com.redknee.util.crmapi.soap.paymentgatewayintegration.xsd.paymentgatewayintegration_v1_0.CreateTokenResponseE;

public class PaymentGatewayIntegrationService extends SOAPHandler{

	PaymentGatewayIntegrationServiceStub stub;
	String latestSoapResponse=null;
	String latestSoapRequest=null;
	
	public PaymentGatewayIntegrationService(String endPoint)  {
		super();
		try {
			this.stub = new PaymentGatewayIntegrationServiceStub(endPoint);
		} catch (AxisFault e1) {
			logger.catching(e1);
		};
		
		//Add listener to capture a raw SOAP response and store it into LatestSoapResponse to print it later
		stub._getServiceClient().getAxisService().addMessageContextListener(
        		new MessageContextListener() {
	        		public void attachEnvelopeEvent(MessageContext mc) {
		        		try
		        		{  
		        			ByteArrayOutputStream baos = new ByteArrayOutputStream();
		        			mc.getEnvelope().cloneOMElement().serialize(baos); 
		        			latestSoapResponse=baos.toString();
		        		}
		        		catch (XMLStreamException e) {
		        		}
	        		}
					@Override
					public void attachServiceContextEvent(ServiceContext sc,
							MessageContext mc) {	
					}
        		});
	}
	/****
	 * sendCreateToken - send createTokenRequest to create token in CreditCardToken table for a given BAN
	 * @param userName
	 * @param password
	 * @param AccountId
	 * @return tokenId or null
	 * @throws AxisFault
	 */
	public String sendCreateToken( String userName, String password, String AccountId)  {
		
		if(stub==null)
			return null;
		
		createSecurityHeader(stub._getServiceClient(),userName, password);//passing serviceClient
		
		//As Addressing is not mandatory commented this method
		//createAddressingHeader(stub._getServiceClient(), endPoint, "urn:createToken");
		        
		//Generating Request Body
		CreateTokenE cte = new CreateTokenE();
		CreateToken ct= new CreateToken();
		CRMRequestHeader header = new CRMRequestHeader();
		header.setUsername(userName);
		header.setPassword(password);
		ct.setHeader(header);
		CreateTokenRequest ctr = new CreateTokenRequest();
		ctr.setAccountID(AccountId);
	    ctr.setTokenValue(new Long((long)(Math.random()*10000000000l)).toString());
	    ctr.setMaskedCardNumber("378282*****0005");
	    ctr.setExpiryDate("201712");
	    ct.setRequest(ctr);
	    cte.setCreateToken(ct);
	    
	    String tokenId = null;
	    try {
	    	CreateTokenResponseE resp=null;
	    	try{
	    		//Sending Request and getting response
	    	    resp= stub.createToken(cte);	
	    	    latestSoapRequest=stub._getServiceClient().getLastOperationContext().getMessageContext(WSDL2Constants.MESSAGE_LABEL_OUT).getEnvelope().toString();
	    	    //Parsing soap response
	    	    CreateTokenResponse resp3=resp.getCreateTokenResponse();
				StringBuffer sbf = new StringBuffer();
				if(resp3.get_return().getStatusCode()!=0){
					sbf.append("\nStatusCode:"+resp3.get_return().getStatusCode());
					sbf.append("\nStatusMessage:"+resp3.get_return().getStatusMessage());
				}
				else
				{
					sbf.append("\nStatusCode:"+resp3.get_return().getStatusCode());
					sbf.append("\nStatusMessage:"+resp3.get_return().getStatusMessage());
					sbf.append("\nAccountId:" + resp3.get_return().getToken().getAccountID() );
					sbf.append("\nExpiryDate:"+resp3.get_return().getToken().getExpiryDate());
					sbf.append("\nMaskedCardNumber:"+ resp3.get_return().getToken().getMaskedCardNumber());
					sbf.append("\nTokenId:"+resp3.get_return().getToken().getTokenID());
					tokenId=new Long(resp3.get_return().getToken().getTokenID()).toString();
				}
				logger.info(sbf.toString());
	    	}
			catch(AxisFault e)
			{
				latestSoapRequest=stub._getServiceClient().getLastOperationContext().getMessageContext(WSDL2Constants.MESSAGE_LABEL_OUT).getEnvelope().toString();	
			}	
		} catch (RemoteException|CRMExceptionFault e) {
			try {
				latestSoapRequest=stub._getServiceClient().getLastOperationContext().getMessageContext(WSDL2Constants.MESSAGE_LABEL_OUT).getEnvelope().toString();
			} catch (AxisFault e1) {
				logger.catching(e1);
			}
			logger.catching(e);
		}
	    if (latestSoapRequest!=null) { logger.info(getXMLprettyPrinted(latestSoapRequest)); }
	    if (latestSoapRequest!=null) {logger.info(getXMLprettyPrinted(latestSoapResponse));}
	    return tokenId;
	}
	public static void main(String[] args)
	{
			PaymentGatewayIntegrationService req = new PaymentGatewayIntegrationService("http://princess:11648/RedkneeSoap_v3_0/services/PaymentGatewayIntegrationService?wsdl");
			String tokenId=req.sendCreateToken("rkadm", "rkadm", "194000154");
	}
}
