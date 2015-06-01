package net.mylearnings.bssauto.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.SocketException;

import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPCmd;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.ftp.FTPSClient;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class MyFTPClient {
	
	public int transferFile(Node node,String srcDir,String targetDir,String fileName, String direction)
	{
		 FTPSClient f = new FTPSClient();
		 f.setControlKeepAliveTimeout(300); // set timeout to 5 minutes
		 f.setDataTimeout(300);
		 f.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
	     
		
		 int reply=0;
		 int state = 5;  //5 - initial, 4-connect success , 3 - login success
 		 try {
			f.connect(node.getHost());
			reply = f.getReplyCode();
			if(FTPReply.isPositiveCompletion(reply))
			{
				state = 4;
				f.login(node.getUserName(), node.getPassword());
				reply = f.getReplyCode();
				if (FTPReply.isPositiveCompletion(reply))
				{	
						state= 2;
						f.changeWorkingDirectory(targetDir);
						reply = f.getReplyCode();
						if (FTPReply.isPositiveCompletion(reply))
						{
							state= 1;
							
							if(direction.equals("From"))
							{
								OutputStream output;
			                    output = new FileOutputStream(srcDir + "\\" + fileName);
			                    f.setFileType(FTP.BINARY_FILE_TYPE);
			                    f.enterRemotePassiveMode();
			                    f.retrieveFile(fileName, output);
			                    output.close();
							}	
							if(direction.equals("To"))
							{
								InputStream input;
			                    input = new FileInputStream(srcDir + "\\" + fileName);
			                    f.storeFile(fileName, input);
			                    input.close();
							}
							reply = f.getReplyCode();
							if (FTPReply.isPositiveCompletion(reply))
								state=0;
							else
							{	
								System.out.println("Unble to send file "+ fileName+", got reply " + reply + " from client.");
								return state;
							}
						}
						else
						{
							System.out.println("Unble to change target dir to"+ targetDir +", got reply " + reply + " from client.");
							return state;
						}
				}
				else
				{
					System.out.println("Unble to login to Host using username " + node.getUserName() + " and Passowrd " +node.getPassword() + ", got reply " + reply + " from client.");
					return state;
				}
			}
			else
			{
				System.out.println("Unble to connect to Host, got reply " + reply + " from client.");
				return state;
			}
			f.logout();
		 } catch (SocketException e) {
				e.printStackTrace();
		 } catch (IOException e) {
			e.printStackTrace();
		 } finally {
	        if(f.isConnected()) {
		        try {
		          f.disconnect();
		        } catch(IOException ioe) {
		          ioe.printStackTrace();
		        }
	        }
	     }
 		return state;
	}
	public boolean transferFileSFTP(Node node,String srcDir,String targetDir,String srcFileName,String targetFileName, String direction)
	{
		JSch jsch = new JSch();
        Session session = null;
        try {
            session = jsch.getSession(node.getUserName(), node.getHost(), 22);
            session.setConfig("StrictHostKeyChecking", "no");
            session.setConfig("PreferredAuthentications", 
                    "publickey,keyboard-interactive,password");
            session.setPassword(node.getPassword());
            session.connect();

            Channel channel = session.openChannel("sftp");
            channel.connect();
            ChannelSftp sftpChannel = (ChannelSftp) channel;
            System.out.println("src:" + srcDir+srcFileName );
            System.out.println("target:" + targetDir+targetFileName );
            sftpChannel.get(targetDir+targetFileName, srcDir+srcFileName);
            sftpChannel.exit();
            session.disconnect();
            return true;
        } catch (JSchException e) {
            e.printStackTrace(); 
        } catch (SftpException e) {
            e.printStackTrace();
        }
        return false;
	}
	public static void main(String[] args)
	{
		
		        
		    
	}
}
