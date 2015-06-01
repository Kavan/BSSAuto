package net.mylearnings.bssauto.helpers;

import java.util.concurrent.Callable;

public class LogCollectorThread implements Callable<String>{
		long startTime;
		long wait;
		String srcFileName;
		String targetFileName;
		String srcDir;
		String targetDir;
		Node node;
				
		public LogCollectorThread(long startTime, long wait,String srcDir, String targetDir,String srcFileName, String targetFileName, 
				 Node node) {
			super();
			this.startTime = startTime;
			this.wait = wait;
			this.srcFileName = srcFileName;
			this.targetFileName = targetFileName;
			this.srcDir = srcDir;
			this.targetDir = targetDir;
			this.node = node;
		}
		/***
		 * Returns a String with Parameters separated by ',' and status at the end 
		 * status values:
		 *   0 - successfully retrieved log file
		 *   1 - failure while retrieving log file
		 */
		@Override
		public String call() throws Exception {
			while((System.currentTimeMillis()/1000 - startTime)<=wait)
			{
				Thread.sleep(1000);
			}
			MyFTPClient sftp= new MyFTPClient();
			boolean result =sftp.transferFileSFTP(this.node, this.srcDir, this.targetDir, this.srcFileName, this.targetFileName, "From");
			System.out.println(this.node.getHost() + ","+ this.srcDir + ","+this.targetDir +","+ this.srcFileName +","+ this.targetFileName);
			if(result == true)
				return this.node.getHost() + ","+ this.srcDir + ","+this.targetDir +","+ this.srcFileName +","+ this.targetFileName +"," + "0" ;
			else
				return this.node.getHost() + ","+ this.srcDir + ","+this.targetDir +","+ this.srcFileName +","+ this.targetFileName +"," + "1" ;
		}
}
