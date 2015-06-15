package net.mylearnings.bssauto.helpers;

public  class QueryManager {
	
	//To select only numeric values , as field is VARCHAR. upper(packid)= lower(packid)
	public static String getFreeSIMOracle="select max(packid)+1 from simcard where upper(packid)= lower(packid)";
	
	//SQL server string compare is case Insensitive, to make column case sensitive added COLLATE Latin1_General_CS_AS explicitly after column name
	public static String getFreeSIMSQLServer="select cast(max(packid) AS bigint) + 1  from simcard where packId in (select packid from simcard where upper(packId COLLATE Latin1_General_CS_AS) = lower(packid COLLATE Latin1_General_CS_AS)) ;";
	
	public static String getPrepaidGSMMSISDNOracle ="select max(msisdn) from msisdn where subscribertype in( 2,1) and state = 0 and technology= 0 and spid = ?";
	public static String getPrepaidTDMAMSISDNOracle ="select max(msisdn) from msisdn where subscribertype in( 2,1) and state = 0 and technology= 1 and spid = ?";
	public static String getPrepaidCDMAMSISDNOracle ="select max(msisdn) from msisdn where subscribertype in( 2,1) and state = 0 and technology= 2 and spid = ?";
	public static String getPrepaidGSMMSISDNSQLServer ="select max(msisdn) from msisdn where subscribertype in( 2,1) and state = 0 and technology= 0 and spid = ?;";
	public static String getPrepaidTDMAMSISDNSQLServer ="select max(msisdn) from msisdn where subscribertype in( 2,1) and state = 0 and technology= 1 and spid = ?;";
	public static String getPrepaidCDMAMSISDNSQLServer ="select max(msisdn) from msisdn where subscribertype in( 2,1) and state = 0 and technology= 2 and spid = ?;";
	public static String getPostpaidGSMMSISDNOracle ="select max(msisdn) from msisdn where subscribertype in( 2,0) and state = 0 and technology= 0 and spid = ?";
	public static String getPostpaidTDMAMSISDNOracle ="select max(msisdn) from msisdn where subscribertype in( 2,0) and state = 0 and technology= 1 and spid = ?";
	public static String getPostpaidCDMAMSISDNOracle ="select max(msisdn) from msisdn where subscribertype in( 2,0) and state = 0 and technology= 2 and spid = ?";
	public static String getPostpaidGSMMSISDNSQLServer ="select max(msisdn) from msisdn where subscribertype in( 2,0) and state = 0 and technology= 0 and spid = ?;";
	public static String getPostpaidTDMAMSISDNSQLServer ="select max(msisdn) from msisdn where subscribertype in( 2,0) and state = 0 and technology= 1 and spid = ?;";
	public static String getPostpaidCDMAMSISDNSQLServer ="select max(msisdn) from msisdn where subscribertype in( 2,0) and state = 0 and technology= 2 and spid = ?;";
	
	public static String getTransactionsOracle="select * from transaction where ban = ?";
	public static String getTransactionsSQLServer="select * from xtransaction where ban = ?;";
	
	public static String getSubscriberServicesOracle="select * from subscriberservices where subscriberid = ?";
	public static String getSubscriberServicesSQLServer="select * from subscriberservices where subscriberid = ?;";
	
	public static String getSuspendedEntityOracle="select * from suspendedEntity where subscriberid = ?";
	public static String getSuspendedEntitySQLServer="select * from suspendedEntity where subscriberid = ?;";
	
	public static String getSubscriberStateOracle="select state from subscriber where msisdn = ?";
	public static String getSubscriberStateSQLServer="select state from subscriber where msisdn = ?;";
	public static String getQuery(String queryName) {
		QueryManager qm = new QueryManager();
		String query=null;
		try {
			query=(String)qm.getClass().getField(queryName).get(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return query;
	}
	public static void main (String[] args)
	{
		System.out.println(QueryManager.getQuery("getFreeSIMOracle"));
	}
}