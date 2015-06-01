package net.mylearnings.bssauto.steps;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import net.mylearnings.bssauto.flow.AccountFlows;
import net.mylearnings.bssauto.flow.DataGatherer;
import net.mylearnings.bssauto.helpers.DBConn;
import net.mylearnings.bssauto.helpers.Helper;
import net.mylearnings.bssauto.helpers.LogCollector;
import net.mylearnings.bssauto.helpers.TestEnv;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

import org.junit.Assert;

public class RegressionSteps{
	private WebDriver driver;
	private TestEnv testEnv;
	private static Logger logger;
	AccountFlows flow;
	Map<String, String> ctx ;
	String SPID = "1";
	String Type = "GSM"; 
	String techology = Type;
	String creditCategory="0";
	String discountClass="";
	String PP;
	String initBalanceCrLimit;
	
	public void setUp()  {
	    testEnv = new TestEnv();
	    
	    //Princess with flycdb oracle database on hoover with RKDB database
	    //testEnv.setBSS("princess", "rkadm", "rkadm", "SSH" );
	    //testEnv.setCRMDB(new DBConn("flycdb", "flycdb", "RKDB", "hoover", "Oracle"));
	    
	    //Optimus-z2 with appcrm872 SQLServer database on doris with appcrm999 database
	    testEnv.setBSS("optimus-z2", "rkadm", "rkadm", "SSH" );
	    testEnv.setCRMDB(new DBConn("appcrm872", "appcrm872", "appcrm999", "doris", "SQLServer"));
		 
	    logger=  LogManager.getLogger(RegressionSteps.class);
	 }
	public void initializeDriver()
	{
		/*****InternetExplorer******/
		// File file = new File("C:\\Users\\kavan.sheth\\Desktop\\IEDriverServer_Win32_2.45.0\\IEDriverServer.exe");
		// System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		// driver = new InternetExplorerDriver(); 
		
		/*******ChromeDriver*********/
	    File file = new File("C:\\Users\\kavan.sheth\\Desktop\\chromedriver.exe");
	    System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	    driver = new ChromeDriver();
	    
	    /********FireFoxDriver*******/
		// driver = new FirefoxDriver();
		
	    /****DriverConfigurations*****/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	 
	}
	
	@Before
	public void before()
	{
		setUp();
		initializeDriver();
		flow=new AccountFlows(driver,testEnv);
		ctx = new HashMap<String, String>();
	}
	
	@After
	public void teardown()
	{
	     flow=null;
	     ctx=null;
	     driver.quit();
	}
	
	@Given("Configurations")
	public void Configurations()
	{
		
	}
	@When("Create SIM")
	public void createSIM(){
		logger.entry(ctx, Type, SPID);
		flow.createSIM(ctx, "", Type, SPID);
		logger.exit();
	}
	@When("Create Account")
	public void createAccount(){
		logger.entry(ctx, SPID, creditCategory, discountClass);
		flow.createAccount(ctx, SPID, "Prepaid", creditCategory, discountClass,"","","");
		logger.exit();
	}
	
	@And("Start LogCollector")
	public void StartLogCollector(){
		logger.entry();
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		Helper.runCommand("cd /opt/redknee/app/crm/current/log/; echo > AppCrm.log", testEnv.getBSS());
		LogCollector.add(testEnv.getBSS(), "collectedLogs\\", "/opt/redknee/app/crm/current/log/", timeStamp + "_" + testEnv.getBSS().getHost() + "_BSS_AppCrm.log"  , "AppCrm.log", 60);
		logger.exit();
	}
	@When("Create \"(.+)\" Subscriber with PP \"(.+)\" and initial Balance \"(.+)\"")
    public void createSubscriber(String type,String Priceplan, String Balance)
	{
		PP=Priceplan;
		initBalanceCrLimit=Balance;
		flow.createSubscriber(ctx, SPID,ctx.get("createAccount.BAN"),ctx.get("createSIM.SIM"),  initBalanceCrLimit, techology, "", PP, type );

	}
	@And("Collect Logs")
	public void CollectLogs()
	{
		LogCollector.getResult();
	} 
	@And("Gather \"(.+)\" level \"(.+)\"")
	public void GatherData(String Level, String Activity)
	{
		DataGatherer dg = new DataGatherer(driver,testEnv);
		dg.getBSSData(ctx, Level,Activity );
	}
	
	@And("GatherDBData using query \"(.+)\"")
	public void GatherDBData(String query)
	{
		DataGatherer dg = new DataGatherer(driver,testEnv);
		if(query.equals("getTransactions"))
			dg.getDBData(0,0,query, new String[]{"S",ctx.get("createAccount.BAN")});
	}
	@Then ("Verify that subscriber created in \"(.+)\" state")
	public void verifySubscriberState(String state)
	{
		if (state.equals("Activated")){  
			String stateValue= Helper.queryDBForSingleValue(testEnv.getCRMDB(), 0, "", "getSubscriberState", new String[]{"S",ctx.get("createSubscriber.MSISDN" )}, new String[]{"S",ctx.get("createAccount.BAN" )} );
			Assert.assertEquals(stateValue,"1");
		}	
	}
}	