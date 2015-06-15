package net.mylearnings.bssauto.helpers;

public class Node {
	
	private String host; 
	private String userName; 
	private String password;
	private String connType;
	private String nodeType;
	private int port;
	private String logPath;
	private String logFileName;
	
	public Node(String H, String U, String P, String T, String N )
	{
		host=H;
		userName=U;
		password=P;
		connType=T;
		nodeType=N;
		if(nodeType.equals("BSS"))
		{	port = 9260;
			logPath="/opt/redknee/app/crm/current/log/";
			logFileName="AppCrm.log";
		}
		if(nodeType.equals("Provisioning"))
		{	port = 12000;
			logPath="/opt/redknee/app/crm/provision/current/log/";
			logFileName="AppCrmProvision.log";
		}
		if(nodeType.equals("Invoicing"))
		{	port = 11100;
		    logPath="/opt/redknee/app/crm/invoice/current/log";
		    logFileName="AppCrmInvoice.log";
		}
		if(nodeType.equals("Mediation"))
		{	port = 9340;
			logPath="/opt/redknee/app/crm/mediation/current/log";
			logFileName="AppCrmMediation.log";
		}
		if(nodeType.equals("URCS"))
		{	port = 11960;
			logPath="/opt/redknee/app/urcs/current/log";
			logFileName="AppUrcs.log";
		}
		if(nodeType.equals("CPS"))
		{	port = 11880;
			logPath="/opt/redknee/product/cps/current/log";
			logFileName="ProductCps.log";
		}
		if(nodeType.equals("OCG"))
		{	port = 9940;
			logPath="/opt/redknee/product/s2100/current/log";
			logFileName="ProductS2100.log";
		}
		if(nodeType.equals("API"))
		{	port = 11640;
			logPath="/opt/redknee/app/tcb/api/current/log";
			logFileName="AppTcbApi.log";
		}
	}
	public String getHost() {
		return host;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getConnType() {
		return connType;
	}
	public int getPort() {
		return port;
	}
	public String getLogPath() {
		return logPath;
	}
	public String getLogFileName() {
		return logFileName;
	}
	public Node(Node another)
	{
		this.host = another.host;
		this.userName = another.userName;
		this.password = another.password;
		this.connType = another.connType;
		this.port = another.port;
	}
	public String getUrl()
	{
		 return  "http://"+ this.host + ":" + this.port;
	}
}
