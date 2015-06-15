package net.mylearnings.bssauto.helpers;

public class TestEnv {
	
	private Node BSS;
	private Node Mediation;
	private Node Invoicing;
	private Node Provisioning;
	private Node URCS;
	private Node CPS;
	private Node API;
	private Node OCG;
	private Node ESB;
	private DBConn CRMDB;
   
	private static TestEnv instance = null;
	protected TestEnv(){
		//Princess with flycdb oracle database on hoover with RKDB database
	    //testEnv.setBSS("princess", "rkadm", "rkadm", "SSH" );
	    //testEnv.setCRMDB(new DBConn("flycdb", "flycdb", "RKDB", "hoover", "Oracle"));
	    
	    //Optimus-z2 with appcrm872 SQLServer database on doris with appcrm999 database
	    setBSS("optimus-z2", "rkadm", "rkadm", "SSH" );
	    setCRMDB(new DBConn("appcrm872", "appcrm872", "appcrm999", "doris", "SQLServer"));
	}
	public static TestEnv getInstance() {
	      if(instance == null) {
	         instance = new TestEnv();
	      }
	      return instance;
	   }
	
	
	public Node getBSS() {
		return BSS;
	}
	public void setBSS(Node bSS) {
		BSS = bSS;
		setMediation(new Node(BSS));
		setInvoicing(new Node(BSS));
		setProvisioning(new Node(BSS));
		setURCS(new Node(BSS));
		setCPS(new Node(BSS));
		setAPI(new Node(BSS));
		setOCG(new Node(BSS));
		setESB(new Node(BSS));
	}
	public Node getMediation() {
		return Mediation;
	}
	public void setMediation(Node mediation) {
		Mediation = mediation;
	}
	public Node getInvoicing() {
		return Invoicing;
	}
	public void setInvoicing(Node invoicing) {
		Invoicing = invoicing;
	}
	public Node getProvisioning() {
		return Provisioning;
	}
	public void setProvisioning(Node provisioning) {
		Provisioning = provisioning;
	}
	public Node getURCS() {
		return URCS;
	}
	public void setURCS(Node uRCS) {
		URCS = uRCS;
	}
	public Node getCPS() {
		return CPS;
	}
	public void setCPS(Node cPS) {
		CPS = cPS;
	}
	public Node getAPI() {
		return API;
	}
	public void setAPI(Node aPI) {
		API = aPI;
	}
	public Node getOCG() {
		return OCG;
	}
	public void setOCG(Node oCG) {
		OCG = oCG;
	}
	public Node getESB() {
		return ESB;
	}
	public void setESB(Node eSB) {
		ESB = eSB;
	}
	public DBConn getCRMDB() {
		return CRMDB;
	}
	public void setCRMDB(DBConn cRMDB) {
		CRMDB = cRMDB;
	}
	public void setBSS(String host, String user, String pass,
			String connType) {
		BSS = new Node(host, user, pass, connType, "BSS");
		setMediation(host, user, pass, connType);
		setInvoicing(host, user, pass, connType);
		setProvisioning(host, user, pass, connType);
		setAPI(host, user, pass, connType);
		setURCS(host, user, pass, connType);
		setCPS(host, user, pass, connType);
		setOCG(host, user, pass, connType);
		setESB(host, user, pass, connType);
	}
	private void setESB(String host, String user, String pass, String connType) {
		ESB = new Node(host, user, pass, connType, "ESB");
		
	}
	private void setOCG(String host, String user, String pass, String connType) {
		OCG = new Node(host, user, pass, connType, "OCG");
		
	}
	private void setAPI(String host, String user, String pass, String connType) {
		API = new Node(host, user, pass, connType, "API");
		
	}
	private void setCPS(String host, String user, String pass, String connType) {
		CPS = new Node(host, user, pass, connType, "CPS");
		
	}
	private void setURCS(String host, String user, String pass, String connType) {
		URCS = new Node(host, user, pass, connType, "URCS");
	}
	private void setProvisioning(String host, String user, String pass,
			String connType) {
		Provisioning = new Node(host, user, pass, connType, "Provisioning");
		
	}
	private void setInvoicing(String host, String user, String pass,
			String connType) {
		Invoicing = new Node(host, user, pass, connType, "Invoicing");
		
	}
	private void setMediation(String host, String user, String pass,
			String connType) {
		Mediation = new Node(host, user, pass, connType, "Mediation");
		
	}
}
