package net.mylearnings.bssauto.helpers;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

import org.apache.commons.net.telnet.TelnetClient;
import org.junit.Assert;

import java.io.PrintStream;


public class Helper {
	
	public static int updateDB(Connection conn,String statement)
	{
		int updatedRows = 0;
		try{
			PreparedStatement stmt1 = conn.prepareStatement(statement);
		    updatedRows = stmt1.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return updatedRows;
	}
	public static String queryDBForSingleValue(DBConn conn, int pollingTime, String expected, String queryName, String[]... args)
	{
			try{
				
				PreparedStatement stmt = conn.getConn().prepareStatement(QueryManager.getQuery(queryName + conn.getType()));
				int cnt=1;
				for(String[] argument : args)
				{	
					if(argument[0].equals("I"))
						stmt.setLong(cnt,Long.parseLong(argument[1]));
					if(argument[0].equals("S"))
						stmt.setString(cnt,argument[1]);
					cnt++;
				}
				
				long end = System.currentTimeMillis() + (pollingTime*1000);   
					do { 
						ResultSet resultSet1 = stmt.executeQuery(); 
						if(resultSet1.next())
						{
								if (!expected.equals("") && (resultSet1.getString(1)).equals(expected))
								{
									return resultSet1.getString(1);
								}
								if (expected.equals(""))
									return resultSet1.getString(1);
						}
					}while (System.currentTimeMillis() < end);
			}	
			catch(Exception e){
				e.printStackTrace();
			}	
			return "";
	}
	public static ResultSet queryDBResultSet(DBConn conn, int pollingTime, int rows, String queryName, String[]... args)
	{
		    PreparedStatement stmt=null;
			try{
				stmt = conn.getConn().prepareStatement(QueryManager.getQuery(queryName + conn.getType()),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				int cnt=1;
				for(String[] argument : args)
				{	
					if(argument[0].equals("I"))
						stmt.setInt(cnt,Integer.parseInt(argument[1]));
					if(argument[0].equals("S"))
						stmt.setString(cnt,argument[1]);
					cnt++;
				}
				long end = System.currentTimeMillis() + (pollingTime*1000);   
					do { 
						ResultSet resultSet1 = stmt.executeQuery(); 
						if (getRowCount(resultSet1)>=rows)
								return resultSet1;
					}while (System.currentTimeMillis() < end);
			}	
			catch(Exception e){
				e.printStackTrace();
				Assert.fail("Error While getting Result set for Statement "+stmt);
			}	
			return null;
	}
	private static int getRowCount(ResultSet resultSet) {
	    if (resultSet == null) {
	        return 0;
	    }
	    try {
	        resultSet.last();
	        return resultSet.getRow();
	    } catch (SQLException exp) {
	        exp.printStackTrace();
	    } finally {
	        try {
	            resultSet.beforeFirst();
	        } catch (SQLException exp) {
	            exp.printStackTrace();
	        }
	    }
	    return 0;
	}
	public static String runCommand(String Command, Node node )
	{
		String output = null;
		if (node.getConnType().equals("SSH")){
			int exitStatus = 0;
			try{
			      JSch jsch=new JSch();  
			 
			      JSch.setConfig("StrictHostKeyChecking", "no"); 
			 
			      Session session=jsch.getSession(node.getUserName(), node.getHost(), 22);
			    
			      session.setPassword(node.getPassword());
			      session.setConfig("PreferredAuthentications",
		                     "publickey,keyboard-interactive,password");
			      
			      session.connect();
			 
			      String command=Command;
			 
			      Channel channel=session.openChannel("exec");
			      ((ChannelExec)channel).setCommand(command);
			 
			      channel.setInputStream(null);
			      ((ChannelExec)channel).setErrStream(System.err);
			      InputStream in=channel.getInputStream();
			      channel.connect();
			      
			      byte[] tmp=new byte[1024];
			      while(true){
			        while(in.available()>0){
			          int i=in.read(tmp, 0, 1024);
			          if(i<0)break;
			          output = new String(tmp, 0, i);
			        }
			        if(channel.isClosed()){
			          if(in.available()>0) continue; 
			          exitStatus= channel.getExitStatus();
			          //System.out.println("exit-status: "+exitStatus);
			          break;
			        }
			        try{Thread.sleep(1000);}catch(Exception ee){}
			      }
			      channel.disconnect();
			      session.disconnect();
			    }
			    catch(Exception e){
			      e.printStackTrace();
			    }
			   if (exitStatus == 0)
			   {
				   if(output != null)
					   return output.replaceAll("[\\n\\r]", "");
			   }
		}
		else if (node.getConnType().equals("TELNET"))
		{
			MyTelnetClient tc = new MyTelnetClient(node.getHost(), node.getUserName(), node.getPassword());
			tc.sendCommand("export PS1='$ '");
			output = tc.sendCommand(Command);
			tc.disconnect();
			if(output != null)
			return output.replaceAll("[\\n\\r]", "");
		}
        return "";
	}
	
	public static void main (String[] args)
	{
		String output=null;
		//output=runCommand("ls -l", new Node("hibbert", "rkadm", "rkadm", "TELNET","BSS"));
		//System.out.println(output);
		//output=runCommand("ls -l", new Node("princess", "rkadm", "rkadm","SSH", "BSS"));
		//System.out.println(output);
		output =queryDBForSingleValue((new DBConn("flycdb", "flycdb", "RKDB", "hoover", "Oracle")),0,"","getFreeSIM");
		System.out.println(output);
		output =queryDBForSingleValue((new DBConn("appcrm872", "appcrm872", "appcrm999", "doris", "SQLServer")),0,"","getFreeSIM");
		System.out.println(output);
	}
}


 class MyTelnetClient {
	 //http://twit88.com/blog/2007/12/22/java-writing-an-automated-telnet-client/
	 private TelnetClient telnet = new TelnetClient();
	 private InputStream in;
	 private PrintStream out;
	 private String prompt = "$";

	 public MyTelnetClient(String server, String user, String password) {
	 try {
		 telnet.connect(server, 23);

		 in = telnet.getInputStream();
		 out = new PrintStream(telnet.getOutputStream());

		 readUntil("login: ");
		 write(user);
		 readUntil("Password: ");
		 write(password);

		 readUntil(prompt + " " );
	 }
	catch (Exception e) {
	e.printStackTrace();
	}
}

public String readUntil(String pattern) {
try {
	char lastChar = pattern.charAt(pattern.length() - 1);
	StringBuffer sb = new StringBuffer();
	boolean found = false;
	char ch = (char) in.read();
	
	while (true) {
		sb.append(ch);
		if (ch == lastChar) {
			if (sb.toString().endsWith(pattern)) {
				return sb.toString().substring(0, sb.length()-pattern.length());
			}
		}
			ch = (char) in.read();
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return null;
}

public void write(String value) {
	try {
		out.println(value);
		out.flush();
		//System.out.println(value);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
public void sendCommandNoResponse(String command) {
	try {
		write(command);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
public String sendCommand(String command) {
	try {
		write(command);
		return readUntil(prompt + " ");
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return null;
}
public void disconnect() {
	try {
		telnet.disconnect();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
