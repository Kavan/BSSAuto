package net.mylearnings.bssauto.Beans;

import net.mylearnings.bssauto.helpers.Helper;
import net.mylearnings.bssauto.helpers.TestEnv;

public class SIM {
	private String spid;
	private String type;
	private String packageId;
	public SIM(String spid, String type, String packageId)
	{
		this.spid= spid;
		this.type=type;
		this.packageId=packageId;
	}
	public SIM( String packageId)
	{
		this.spid= GenericProperties.SPID;
		this.type=GenericProperties.Type;
		this.packageId=packageId;
	}
	public SIM()
	{
		this.spid= GenericProperties.SPID;
		this.type=GenericProperties.Type;
		this.packageId= Helper.queryDBForSingleValue(TestEnv.getInstance().getCRMDB(), 0,"","getFreeSIM");//new Long((long)(Math.random()*100000)).toString();
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPackageId() {
		return packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getSpid() {
		return spid;
	}
	public void setSpid(String spid) {
		this.spid = spid;
	}
}
