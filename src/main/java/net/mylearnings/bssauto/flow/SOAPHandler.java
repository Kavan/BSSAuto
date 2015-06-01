package net.mylearnings.bssauto.flow;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.soap.impl.dom.SOAPHeaderBlockImpl;
import org.apache.axiom.soap.impl.dom.soap11.SOAP11Factory;
import org.apache.axiom.soap.impl.dom.soap11.SOAP11HeaderBlockImpl;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.AddressingConstants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


public class SOAPHandler {
	
	 protected static Logger logger=  LogManager.getLogger(Flows.class);
	 private Transformer transformer = null;
	 private DocumentBuilderFactory docBuilderFactory = null;
	 private DocumentBuilder docBuilder = null;
	 
	 /***
	  * Default Constructor used to initialize xml transformer property
	  */
	 public SOAPHandler()
	 {
		 		try {  
			 	transformer = TransformerFactory.newInstance().newTransformer();
	            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "5");
	            docBuilderFactory = DocumentBuilderFactory.newInstance();
				docBuilder = docBuilderFactory.newDocumentBuilder();
				} catch ( TransformerConfigurationException
						| TransformerFactoryConfigurationError |ParserConfigurationException e) {
					logger.error(e.getMessage());
				}
	 }
	 
	/****
	 * createAddressingHeader Adds Addressing Elements in Header if Wsa-Addressing is must
	 * Will generate header something like following:
	 * 
	 * <soapenv:Header xmlns:wsa="http://www.w3.org/2005/08/addressing">
		<wsse:Security xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd">
			...
		</wsse:Security>
		<wsa:To>http://princess:11648/RedkneeSoap_v3_0/services/PaymentGatewayIntegrationService?wsdl</wsa:To>
		<wsa:ReplyTo>
			<wsa:Address>http://www.w3.org/2005/08/addressing/anonymous</wsa:Address>
		</wsa:ReplyTo>
		<wsa:MessageID>urn:uuid:833b925e-4864-4025-8c0a-a9d8af06aee6</wsa:MessageID>
		<wsa:Action>urn:createToken</wsa:Action>
	   </soapenv:Header>
	 * 
	 * 
	 * @param _getServiceClient - ServiceClient from stub using stub._getServiceClient method
	 * @param endPoint - Needed to set wsa:To tag using sendTo Method
	 * @param action - Action to be provided for wsa:Action tag
	 * @throws AxisFault
	 */
	protected void createAddressingHeader(ServiceClient _getServiceClient, String endPoint, String action) throws AxisFault {
		//ADDRESSING  - Needed if wsa is mandatory
        ConfigurationContext myConfigContext = ConfigurationContextFactory
        		   .createConfigurationContextFromFileSystem("C:/Users/kavan.sheth/Downloads/axis2-1.6.2-bin/axis2-1.6.2/repository","C:/Users/kavan.sheth/Downloads/axis2-1.6.2-bin/axis2-1.6.2/conf/axis2.xml");

        Options options = new Options();
        EndpointReference targetEPR = new EndpointReference(endPoint);

        options.setTo(targetEPR);
        options.setProperty(AddressingConstants.WS_ADDRESSING_VERSION,
        		AddressingConstants.Final.WSA_NAMESPACE);
        //No idea of this is needed or not.
        options.setProperty(AddressingConstants.INCLUDE_OPTIONAL_HEADERS,Boolean.TRUE);
        options.activate(myConfigContext);
        options.setAction(action);

        _getServiceClient.setOptions(options);
        _getServiceClient.engageModule("addressing");
	}
	/***
	 * createSecurityHeader will create Security header something like following, it is similar to DOM,
	 * Need to create each Element , Attribute separately 
	 * 
	 * <wsse:Security xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd">
			<wsu:Timestamp>
				<wsu:Created>2015-04-19T22:48:04.423Z</wsu:Created>
				<wsu:Expires>2015-04-19T22:49:04.426Z</wsu:Expires>
			</wsu:Timestamp>
			<wsse:UsernameToken wsu:Id="UsernameToken-4">
				<wsse:Username>rkadm</wsse:Username>
				<wsse:Password Type="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText">rkadm</wsse:Password>
				<wsse:Nonce EncodingType="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary">NjBmMjEzNzctZDVkMy00N2Y0LWE3ZDYtOWVkMzZmMDY5ZjNi</wsse:Nonce>
				<wsu:Created>2015-04-19T22:48:04.423Z</wsu:Created>
			</wsse:UsernameToken>
		</wsse:Security>
	 * @param cl - a ServiceClient provided from stub using stub._getServiceClient() method
	 * @param userName - username for security header
	 * @param password - password for security header
	 */
	protected void createSecurityHeader(ServiceClient cl,String userName, String password) {
				
				//SECURITY
				
				ServiceClient client =cl ;
		        SOAP11Factory factory = new SOAP11Factory();
		        
		        //Create wsse NameSpace
		        OMNamespace SecurityElementNamespace = factory.createOMNamespace("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "wsse");
		        //Create wsu NameSpace
		        OMNamespace SecurityElementNamespace2 = factory.createOMNamespace("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "wsu");
		        
		        //Create UsernameToken Element
		        OMElement usernameTokenEl = factory.createOMElement("UsernameToken", SecurityElementNamespace);
		        //add Id Attribute to UsernameToken El
		        usernameTokenEl.addAttribute("Id","UsernameToken-4" , SecurityElementNamespace2)		;
		        
		        //Create Username Sub Element for UsernameToken
		        OMElement usernameEl = factory.createOMElement("Username", SecurityElementNamespace);
		        usernameEl.setText(userName);
		        //Adding Username Sub Element to UsernameToken
		        usernameTokenEl.addChild(usernameEl);

		        //Create Password Sub Element for UsernameToken
		        OMElement passwordEl = factory.createOMElement("Password", SecurityElementNamespace);
		        passwordEl.setText(password);
		        OMAttribute passwordTypeAt = factory.createOMAttribute("Type",null , "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
		        passwordEl.addAttribute(passwordTypeAt);
		        //Adding Password Sub Element to UsernameToken
		        usernameTokenEl.addChild(passwordEl);
		        
		        //Calculation for nonce and created elements
		        String created = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(new Date());
		        String nonce = getNonce();
		        String nonceToSend = new String ( Base64.encodeBase64( nonce.getBytes()));
		        
		        //Create Nonce Sub Element for UsernameToken
		        OMElement nonceEl = factory.createOMElement("Nonce", SecurityElementNamespace);
		        nonceEl.setText(nonceToSend);
		        OMAttribute nonceEncodingAt = factory.createOMAttribute("EncodingType",null , "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
		        nonceEl.addAttribute(nonceEncodingAt);
		        //Adding Nonce Sub Element to UsernameToken
		        usernameTokenEl.addChild(nonceEl);
		        
		        //Create Created Element for UsernameToken
		        OMElement created2El = factory.createOMElement("Created", SecurityElementNamespace2);
		        created2El.setText(created);
		        //Adding Created Sub Element to UsernameToken
		        usernameTokenEl.addChild(created2El);
		       
		        
		        //Create Timestamp Token
		        OMElement teimestampEl = factory.createOMElement("Timestamp", SecurityElementNamespace2);
		        
		        //Create Created Element
		        OMElement createdEl = factory.createOMElement("Created", SecurityElementNamespace2);
		        createdEl.setText(created); 
		        //Adding Created Sub Element to Timestamp Token
		        teimestampEl.addChild(createdEl);
		      
		        //Create Expires Element by adding 60 milliseconds to current time(instead of created :P, not Idealist)
		        OMElement expiresEl = factory.createOMElement("Expires", SecurityElementNamespace2);
		        expiresEl.setText(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(new Date(System.currentTimeMillis()+60000)));
		        //Adding Expired Sub Element to Timestamp Token
		        teimestampEl.addChild(expiresEl);
		        
		        //Creating Security Block
		        SOAPHeaderBlockImpl block = new SOAP11HeaderBlockImpl("Security", SecurityElementNamespace, factory);
		      //  new SOAP11HeaderBlockImpl(block, nonceToSend, SecurityElementNamespace2, null, null, false)
		         block.addNamespaceDeclaration("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "wsu");
		        //Adding timestamp Token
		        block.addChild(teimestampEl);
		        //Adding Username Token
		        block.addChild(usernameTokenEl);
		        //Adding header block to client
		        client.addHeader(block);		
	}
	/***
	 * getXMLprettyPrinted. to format xml 
	 * source is taken from 
	 * http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
	 * @param xml - xml to be formatted in String format
	 * @return formatted xml 
	 * 		if any exception, xml parameter will be returned as it is 
	 */
	public String getXMLprettyPrinted(String xml) {

        if (transformer == null || docBuilder == null || xml ==null)
            return xml;

        InputSource ipXML = new InputSource(new StringReader(xml));
        Document doc;

        try {
            doc = docBuilder.parse(ipXML);
            StringWriter stringWriter = new StringWriter();
            StreamResult streamResult = new StreamResult(stringWriter);
            DOMSource domSource = new DOMSource(doc);
            transformer.transform(domSource, streamResult);
            return stringWriter.toString();
        } catch (SAXException | IOException | TransformerException e) {
        	logger.error(e.getMessage());
            return xml;
        }
    }
	
	protected String getNonce()
    {
        String phrase = java.util.UUID.randomUUID().toString();
        return phrase;
    }


}
