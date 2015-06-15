package net.mylearnings.bssauto.Beans;

import net.mylearnings.bssauto.helpers.Helper;
import net.mylearnings.bssauto.helpers.TestEnv;

public class Subscriber {
	private Account account;
	private SIM sim;
	private String amount; 
	private String msisdn;
	private String PP; 
	private String billingType;
	private String subscriberId;
	private String feedback;
	
	public Subscriber(Account account, SIM sim, String amount, String msisdn, String PP, String billingType)
	{
		this.account = account;
		this.sim = sim;
		this.amount = amount;
		this.msisdn = msisdn;
		this.PP = PP;
		this.billingType = billingType;
		this.subscriberId="";
		this.feedback="";		
	}
	/***
	 * Without MSISDN
	 * @param account
	 * @param sim
	 * @param amount
	 * @param PP
	 * @param billingType
	 * @param subscriberId
	 * @param feedback
	 */
	public Subscriber(Account account, SIM sim, String amount,  String PP, String billingType)
	{
		this.account = account;
		this.sim = sim;
		this.amount = amount;
		this.msisdn = Helper.queryDBForSingleValue(TestEnv.getInstance().getCRMDB(),0,"", "get"+ billingType +sim.getType()+"MSISDN", new String[]{"I", account.getSPID()}); ;
		this.PP = PP;
		this.billingType = billingType;
		this.subscriberId="";
		this.feedback="";		
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public SIM getSim() {
		return sim;
	}
	public void setSim(SIM sim) {
		this.sim = sim;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getPP() {
		return PP;
	}
	public void setPP(String pP) {
		PP = pP;
	}
	public String getBillingType() {
		return billingType;
	}
	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}

}
