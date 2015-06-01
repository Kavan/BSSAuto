package net.mylearnings.bssauto.helpers;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.mylearnings.bssauto.flow.Flows;

public class LogCollector {

		private static ExecutorService pool = Executors.newFixedThreadPool(100);
	    private static List<Future<String>> list = new ArrayList<Future<String>>();
	    protected static Logger logger=  LogManager.getLogger(Flows.class);
	    
	    public static void add(Node node, String srcDir, String targetDir, String srcFileName, String targetFileName, long wait )
	    {
	        list.add(pool.submit(new LogCollectorThread(System.currentTimeMillis()/1000,wait, srcDir,  targetDir,  srcFileName,  targetFileName, node ))); 		    			
	        logger.info("Addding to Pool:"+ srcDir + " " + targetDir + " " + srcFileName + " " + targetFileName );
	    }
	    
	    public static void getResult()
	    {   
	        try{
	 			for (Future<String> future : list) {
	 				String out =future.get();
	 				System.out.println(out);
		 			String[] tokens;
		 			tokens=out.split("[,\\r\\n]+", -1);
		 			if (tokens[5].equals("0")){
		 				logger.info(out);
		 				logger.info("<a class=customHTML href=..\\"+ tokens[1]  + tokens[3] +"> Log File with given Parameter: "+ out+"</a>");
		 			}
	 				else
	 					logger.error(out);
	 			}
				pool.shutdown();
	 		}
	 		catch(Exception e)
	 		{
	 			e.printStackTrace();
	 		}	  
	    } 
	    
	    public static void main(String[] args)
	    {
	    	
	    }
	}

	
	

