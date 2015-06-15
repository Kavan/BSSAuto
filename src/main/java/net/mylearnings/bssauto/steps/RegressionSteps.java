package net.mylearnings.bssauto.steps;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.mylearnings.bssauto.Beans.Account;
import net.mylearnings.bssauto.Beans.SIM;
import net.mylearnings.bssauto.Beans.Subscriber;
import net.mylearnings.bssauto.flow.BasicFlows;
import net.mylearnings.bssauto.flow.DataGatherer;
import net.mylearnings.bssauto.helpers.DBConn;
import net.mylearnings.bssauto.helpers.Helper;
import net.mylearnings.bssauto.helpers.LogCollector;
import net.mylearnings.bssauto.helpers.Node;
import net.mylearnings.bssauto.helpers.TestEnv;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

import org.junit.Assert;

public class RegressionSteps{
	private static Logger logger;
	BasicFlows flow;
	Map<String, Object> ctx ;
	LogCollector logCollector;
	
	public void setUp()  { 
	    logger=  LogManager.getLogger(RegressionSteps.class);
	 }
	
	@Before
	public void before()
	{
		setUp();
		flow=new BasicFlows("Chrome"); //IE,Chrome,FF
		ctx = new HashMap<String, Object>();
		logCollector = new LogCollector();
	}
	
	@After
	public void teardown()
	{
	     flow=null;
	     ctx=null;
	}
	
	@Given("Configurations")
	public void Configurations()
	{
		
	}
	
	@When("^Create \"(.+)\" SIM$")
	public void createSIM(String identifier){
		logger.entry(ctx, identifier);
		flow.createSIM(ctx, identifier, new SIM() );
		logger.exit();
	}
	
	@When("^Create a SIM$")
	public void createIndividualSIM(){
		logger.entry(ctx);
		flow.createSIM(ctx, "Individual", new SIM() );
		logger.exit();
	}
	
	@When("^Create \"(.+)\" \"(.+)\" Account$") 
	public void createGroupAccount( String billingType, String groupType){
		//Create prepaid/postpaid/hybrid group/pool/individual  Account
		logger.entry(ctx,  billingType, groupType);
		if(groupType.equals("Individual"))
			flow.createAccount(ctx, groupType, new Account(billingType,groupType, "", ""  ));
		else
			flow.createAccount(ctx, "Main", new Account(billingType,groupType, "", ""  ));
		logger.exit();
	}
	@When("^Create \"(.+)\" \"(.+)\" \"(.+)\" Sub Account$") 
	public void createSubAccount(String identifier,String billingType, String responsible){
		//Create first prepaid/postpaid/hybrid responsible/non-responsible Sub Account
		logger.entry(ctx,  identifier, billingType, responsible);
		if (responsible.equals("Responsible"))
			flow.createAccount(ctx, identifier,new Account(billingType,"Individual", ((Account)ctx.get("createAccount.Main.Account")).getBAN() , "Y"  ));
		else
			flow.createAccount(ctx, identifier,new Account(billingType,"Individual", ((Account)ctx.get("createAccount.Main.Account")).getBAN() , "N"  ));
		logger.exit();
	}
	@And("^Start \"(.+)\" LogCollector for \"(.+)\" seconds$")
	public void StartLogCollector(String nodeType, int delay){
		logger.entry();
		Class<?> cls;
		Node node=null;
		try {
			cls = Class.forName("net.mylearnings.bssauto.helpers.TestEnv");
		Method method = cls.getDeclaredMethod("getInstance",(Class<?>[])null);
		TestEnv testEnv = (TestEnv)method.invoke(cls,(Object[]) null);
		method = cls.getDeclaredMethod("get"+nodeType, (Class<?>[])null);
	    node = (Node)method.invoke(testEnv,(Object[]) null);
		} catch (ClassNotFoundException  | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		Helper.runCommand("cd "+node.getLogPath()+"; echo > "+node.getLogFileName(), node);
		logCollector.add(node, "collectedLogs\\", node.getLogPath(), timeStamp + "_" + TestEnv.getInstance().getBSS().getHost() + "_"+nodeType+"_"+node.getLogFileName()  , node.getLogFileName(), delay);
		logger.exit();
	}
	@When("^Create \"(.+)\" \"(.+)\" Subscriber with PP \"(.+)\" and Initial Balance/Credit Limit \"(.+)\"$")
    public void createSubscriber( String identifier, String type,String Priceplan, String Balance)
	{
		flow.createSubscriber(ctx, identifier, new Subscriber((Account)ctx.get("createAccount."+identifier+".Account"), (SIM)ctx.get("createSIM."+identifier+".SIM"), Balance, Priceplan, type ));
	}
	@And("^Collect Logs$")
	public void CollectLogs()
	{	//this can be called once only in a scenario as pool will be closed after collecting results
		logCollector.getResult();
	} 
	@And("^Gather \"(.+)\" for \"(.+)\" account$")
	public void GatherAccountData( String Activity,String identifier )
	{
		DataGatherer dg = new DataGatherer("Chrome");
		dg.getBSSData(ctx, "Account",Activity, identifier );
	}
	@And("^Gather \"(.+)\" for \"(.+)\" subscriber$")
	public void GatherSubscriberData( String Activity,String identifier )
	{
		DataGatherer dg = new DataGatherer("Chrome");
		dg.getBSSData(ctx, "Subscriber",Activity, identifier );
	}
	@And("^GatherDBData using query \"(.+)\" for \"(.+)\" Account$")
	public void GatherDBData(String query, String identifier)
	{
		DataGatherer dg = new DataGatherer("Chrome");
		if(query.equals("getTransactions"))
		{	
			if (identifier.equals("Group")||identifier.equals("Group Pooled"))
				dg.getDBData(0,0,query, new String[]{"S",((Account)ctx.get("createAccount.Main.Account")).getBAN()});
			else
				dg.getDBData(0,0,query, new String[]{"S",((Account)ctx.get("createAccount."+identifier+".Account")).getBAN()});
		}
	}
	@Then ("^Verify that \"(.+)\" subscriber is created in \"(.+)\" state$")
	public void verifySubscriberState(String identifier,String state)
	{
		if (state.equals("Activated")){  
			String stateValue= Helper.queryDBForSingleValue(TestEnv.getInstance().getCRMDB(), 0, "", "getSubscriberState", new String[]{"S",((Subscriber)ctx.get("createSubscriber."+identifier+".Subscriber" )).getMsisdn()}  );
			Assert.assertEquals(stateValue,"1");
		}	
	}
}	