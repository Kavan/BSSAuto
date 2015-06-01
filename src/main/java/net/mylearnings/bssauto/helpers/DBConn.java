package net.mylearnings.bssauto.helpers;


import java.sql.*;

public class DBConn
{
		private String dbHost;
		private String dbUsername;
		private String dbPass;
		private String dbSID;
		private String dbType;  //Oracle or SQLServer
		private Connection conn;
		
		public DBConn(String U, String P,String S, String H, String T)
		{
				dbHost=H;
				dbUsername=U;
				dbSID=S;
				dbPass=P;
				dbType=T;
				getDBConnection();
		}
		
		public String getdbPass()
		{
			return dbPass;
		}
		public String getdbUser()
		{
			return dbUsername;
		}
		public String getSID()
		{
			return dbSID;
		}
		public String getType()
		{
			return dbType;
		}
		public Connection getConn()
		{
			return conn;
		}
		public String toString()
		{
				return (dbType +": "+dbUsername +" " +dbPass + " " + dbSID + " " + dbHost );
		}
		private void getDBConnection()
		{
			if (conn == null)
			{
				String url=null;
				if (dbType=="Oracle")
				    url="jdbc:oracle:thin:@" + dbHost + ":1521:" + dbSID;
				if (dbType=="SQLServer")
					url="jdbc:sqlserver://"+dbHost +":1433;" + "databaseName="+ dbSID +";";
				System.out.println(url);
				try{
					//DriverManager.registerDriver (new oracle.jdbc.OracleDriver());   
					conn = DriverManager.getConnection(url, dbUsername, dbPass);
				}
				catch(Exception e){
					e.printStackTrace();
				}
				System.out.println(conn.toString());
				if (conn == null)
        {
        		System.out.println("Couldn't get DB connection. Please check DB connectivity or DB parameters.");
        		System.exit(0);
        }
		  }
		}
}
		
		
