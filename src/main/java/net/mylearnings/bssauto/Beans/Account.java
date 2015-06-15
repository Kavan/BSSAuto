package net.mylearnings.bssauto.Beans;

public class Account {
	
	private String SPID; 
	private String billingType; 
	private String creditCategory; 
	private String discountClass; 
	private String groupType; 
	private String parent; 
	private String responsible;
	private String BAN;
	private String Feedback;
	
	public Account(String SPID, String billingType, String creditCategory, String discountClass, String groupType, String parent, String responsible  )
	{
		this.SPID = SPID;
		this.billingType = billingType;
		this.creditCategory = creditCategory;
		this.discountClass= discountClass;
		this.groupType = groupType;
		this.parent = parent;
		this.responsible = responsible;
		this.BAN="";
		this.Feedback="";
	}
	public Account( String billingType , String groupType, String parent, String responsible  )
	{
		this.SPID = GenericProperties.SPID;
		this.creditCategory = GenericProperties.creditCategory;
		this.discountClass= GenericProperties.discountClass;
		this.billingType = billingType;
		this.groupType = groupType;
		this.parent = parent;
		this.responsible = responsible;
		this.BAN="";
		this.Feedback="";
	}
	
	public String getSPID() {
		return SPID;
	}
	public void setSPID(String sPID) {
		SPID = sPID;
	}
	public String getBillingType() {
		return billingType;
	}
	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}
	public String getCreditCategory() {
		return creditCategory;
	}
	public void setCreditCategory(String creditCategory) {
		this.creditCategory = creditCategory;
	}
	public String getDiscountClass() {
		return discountClass;
	}
	public void setDiscountClass(String discountClass) {
		this.discountClass = discountClass;
	}
	public String getGroupType() {
		return groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public String getResponsible() {
		return responsible;
	}
	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}
	public String getBAN() {
		return BAN;
	}
	public void setBAN(String bAN) {
		BAN = bAN;
	}
	public String getFeedback() {
		return Feedback;
	}
	public void setFeedback(String feedback) {
		Feedback = feedback;
	}
}
