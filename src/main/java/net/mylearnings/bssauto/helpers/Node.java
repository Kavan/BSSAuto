package net.mylearnings.bssauto.helpers;

public class Node {
	
	private String host; 
	private String userName; 
	private String password;
	private String connType;
	private String nodeType;
	private int port;
	
	public Node(String H, String U, String P, String T, String N )
	{
		host=H;
		userName=U;
		password=P;
		connType=T;
		nodeType=N;
		if(nodeType.equals("BSS"))
			port = 9260;
		if(nodeType.equals("Provisioning"))
			port = 12000;
		if(nodeType.equals("Invoicing"))
			port = 11100;
		if(nodeType.equals("Mediation"))
			port = 9340;
		if(nodeType.equals("URCS"))
			port = 11960;
		if(nodeType.equals("CPS"))
			port = 11880;
		if(nodeType.equals("OCG"))
			port = 9940;
		if(nodeType.equals("API"))
			port = 11640;
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
