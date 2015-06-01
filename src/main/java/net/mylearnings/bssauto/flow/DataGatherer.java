package net.mylearnings.bssauto.flow;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.mylearnings.bssauto.helpers.Helper;
import net.mylearnings.bssauto.helpers.TestEnv;
import net.mylearnings.bssauto.pages.CRM.CreateSubscriberPage;
import net.mylearnings.bssauto.pages.CRM.HomePage;
import net.mylearnings.bssauto.pages.CRM.NewAccountPage;
import net.mylearnings.bssauto.pages.CRM.SearchAccountPage;
import net.mylearnings.bssauto.pages.CRM.SearchSubscriberPage;
import net.mylearnings.bssauto.pages.CRM.CreateSubscriberPage.BillingInfo;
import net.mylearnings.bssauto.pages.CRM.CreateSubscriberPage.Rating;

public class DataGatherer extends Flows{

	public DataGatherer(WebDriver driver,TestEnv te) {
		super(driver,te);
		
	}
	
	/**
	 * getCurrentState - Retrieves current state of account or subscriber, based on 
	 * 					 Not following POM strictly as each page is having just 1 or 2 elements.
	 * @param level    - Group / Account / Subscriber
	 * @param BAN      - Group BAN if Group Level, BAN if Account Level, BAN if subscriber Level
	 * @param MSISDN   - Conditional , Required only if subscriber level
	 * @param DataType - A keyword to specify what attribute of a account of subscriber to be fetched like  transactions/Notes/Usage & Balance/Call details etc.
	 * @param te
	 */
	public void getBSSData(Map<String, String> ctx,  String level,  String dataType )
	{
		 logger.entry(level, ctx, dataType,testEnv);
		 CreateSubscriberPage createSubPage=null;
		 SearchAccountPage searchAccountPage = null;
		 NewAccountPage newAccountPage = null;
		 
		  
		 try{
			 HomePage homePage =  login(driver, testEnv.getBSS());
			 searchAccountPage = homePage.ClickAccountSub();
			 PageFactory.initElements(driver, searchAccountPage);
			 searchAccountPage.setAccount(ctx.get("createAccount.BAN"));
			 
			 // had to introduce looping to make sure that BAN field is populated, 
			 // Encountered a peculiar issue , where BAN field was getting emptied, probably by javascript,
			 // so rather than waiting for some time , decided to have loop ensuring that ban field is populated
			 // issue was encountered only in firefox, probably javascripts are executed slowly on firefox
			 do{
				 searchAccountPage.setAccount(ctx.get("createAccount.BAN"));
			 }while(!searchAccountPage.getAccount().equals(ctx.get("createAccount.BAN")));
			 
			 
			 if (level.equals("Account")){
				 searchAccountPage.selectSearchType("0");
				 searchAccountPage.clickSearch();
				 newAccountPage=searchAccountPage.clickAccountEdit(ctx.get("createAccount.BAN"));
				 PageFactory.initElements(driver, newAccountPage);
				 
				 switch(dataType)
				 {
				 	case "Transactions":
				 		driver.findElement(By.xpath("//*[@href='/AppCrm/home?cmd=SubMenuTransHistory']")).click();
				 		driver.findElement(By.id("field_search_start_date")).clear();
				 		driver.findElement(By.id("field_search_start_date")).sendKeys("12/31/2014");
				 		driver.findElement(By.name("SearchCMD")).click();
				 		logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+newAccountPage.takeScreenShot(ctx.get("createAccount.BAN")+"_AccountTransactions")+"\">");
					break;
				 	case "Notes":
				 		driver.findElement(By.xpath("//*[@href='/AppCrm/home?cmd=SubMenuAccountNotes']")).click();
				 		logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+newAccountPage.takeScreenShot(ctx.get("createAccount.BAN")+"_AccountNotes")+"\">");
				 	break;
				 	case "UsageBalance": 
				 		driver.findElement(By.xpath("//*[@href='/AppCrm/home?cmd=SubMenuAccountUsage']")).click();
				 		logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+newAccountPage.takeScreenShot(ctx.get("createAccount.BAN")+"_AccountUsage&Balance")+"\">");	
					break;
				 	default:
				 		logger.error("Data Gathering Failed!! No Data Type of type \""+ dataType + "\" available at Account Level.");
				 }
			 }	 
			 else if (level.equals("Subscriber")){
				 searchAccountPage.selectSearchType("2");
				 searchAccountPage.clickSearch();
				 createSubPage=searchAccountPage.clickSubscriberEdit(ctx.get("createSubscriber.MSISDN"));
				 PageFactory.initElements(driver, createSubPage);
				 
				 
				 switch(dataType)
				 {
				   case "MobileNumberTab": 
					    logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+createSubPage.takeScreenShot(ctx.get("createAccount.BAN") +"_"+ ctx.get("createSubscriber.MSISDN")+"_SubscriberMobileNumberTab")+"\">");
				   break;
				   case "BillingInfoTab":
					    String BillingType = createSubPage.getBillingTypeLabel();
					    CreateSubscriberPage.BillingInfo billingInfo= createSubPage.new BillingInfo();
					 	PageFactory.initElements(createSubPage.driver, billingInfo);
					 	billingInfo.click();
					 	try{
						 	if(BillingType.contains("Postpaid"))	
						 		new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(By.id("label_credit_limit")));
						 	else
						 		new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(By.id("label_initial_balance")));
						 }
					 	catch(TimeoutException t)
					    { 
					    	logger.error("Not able to get Billing Info Tab.");
					    }
					    logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+billingInfo.takeScreenShot(ctx.get("createAccount.BAN") +"_"+ ctx.get("createSubscriber.MSISDN")+"_SubscriberBillingInfoTab")+"\">");
				   break;
				   case "RatingTab":
					    
					    CreateSubscriberPage.Rating rating= createSubPage.new Rating();
					 	PageFactory.initElements(createSubPage.driver, rating);
					 	rating.click();
					 	try{
					 		new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(By.id("label_price_plan")));
					 	}
					 	catch(TimeoutException t)
					    { 
					    	logger.error("Not able to get Ratting Tab.");
					    }
					 	catch(Exception e)
					 	{
					 		e.printStackTrace();
					 	}
					 	logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+ rating.takeScreenShot(ctx.get("createAccount.BAN") +"_"+ ctx.get("createSubscriber.MSISDN")+"_SubscriberRatingTab")+"\">");
				   break;
				   case "Transactions":
				 		driver.findElement(By.xpath("//*[@href='/AppCrm/home?cmd=SubMenuSubTransHistory']")).click();
				 		driver.findElement(By.id("field_search_start_date")).clear();
				 		driver.findElement(By.id("field_search_start_date")).sendKeys("12/31/2014");
				 		driver.findElement(By.name("SearchCMD")).click();
				 		logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+createSubPage.takeScreenShot(ctx.get("createAccount.BAN") +"_"+ ctx.get("createSubscriber.MSISDN")+"_SubscriberTransactions")+"\">");
					break;
				 	case "Notes": 
				 		driver.findElement(By.xpath("//*[@href='/AppCrm/home?cmd=SubMenuSubNotes']")).click();
				 		logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+createSubPage.takeScreenShot(ctx.get("createAccount.BAN") +"_"+ ctx.get("createSubscriber.MSISDN")+"_SubscriberNotes")+"\">");
				 	break;
				 	case "UsageBalance": 
				 		driver.findElement(By.xpath("//*[@href='/AppCrm/home?cmd=SubMenuSubUsage']")).click();
				 		logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+createSubPage.takeScreenShot(ctx.get("createAccount.BAN")+"_SubscriberUsage&Balance")+"\">");	
					break;
				 	case "CallDetails": 
				 		driver.findElement(By.xpath("//*[@href='/AppCrm/home?cmd=SubMenuSubCallDetails']")).click();
				 		logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+createSubPage.takeScreenShot(ctx.get("createAccount.BAN")+"_SubscriberCallDetails")+"\">");	
					break;	
				 	default:
				 		logger.error("Data Gathering Failed!! No Data Type of type \""+ dataType + "\" available at Subscriber level.");
				 }
			 }
		 }  
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}
	public void getDBData(int pollingTime, int rows, String query, String[]... args )
	{
		ResultSet rs = Helper.queryDBResultSet(testEnv.getCRMDB(), pollingTime, rows, query, args);
		logger.info(ResultSet2HTML(rs));
	}
	private StringBuffer ResultSet2HTML(ResultSet rs)
	{
		StringBuffer sb = new StringBuffer();
		try{
			ResultSetMetaData md = rs.getMetaData();
		    int count = md.getColumnCount();
		    sb.append("<table class=\"customHTML\" border=1>");
		    sb.append("<tr>");
		    for (int i=1; i<=count; i++) {
		    	sb.append("<th>");
		    	sb.append(md.getColumnLabel(i));
		    }
		    sb.append("</tr>");
		    while (rs.next()) {
		    	sb.append("<tr>");
		      for (int i=1; i<=count; i++) {
		    	  sb.append("<td>");
		    	  sb.append(rs.getString(i));
		      }
		      sb.append("</tr>");
		    }
		    sb.append("</table>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return sb;
	}
}