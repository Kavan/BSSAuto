package net.mylearnings.bssauto.flow;



import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.mylearnings.bssauto.Exceptions.NotTargetedPageException;
import net.mylearnings.bssauto.helpers.Helper;
import net.mylearnings.bssauto.helpers.TestEnv;
import net.mylearnings.bssauto.pages.CRM.CreateSIMpage;
import net.mylearnings.bssauto.pages.CRM.CreateSubscriberPage;
import net.mylearnings.bssauto.pages.CRM.HomePage;
import net.mylearnings.bssauto.pages.CRM.NewAccountPage;
import net.mylearnings.bssauto.pages.CRM.RecurringChargePage;
import net.mylearnings.bssauto.pages.CRM.SearchAccountPage;
import net.mylearnings.bssauto.pages.CRM.SearchSubscriberPage;
import net.mylearnings.bssauto.pages.CRM.CreateSubscriberPage.Rating;

public class AccountFlows extends Flows {
	
	 public AccountFlows(WebDriver driver, TestEnv te)
	 {
		 super(driver,te);
	 }
	 public void changePP( String BAN, String MSISDN, String newPP) {
		 logger.entry( newPP);
		 CreateSubscriberPage createSubPage=null;
		 SearchAccountPage searchAccountPage = null;
		 
		 try{
			 HomePage homePage =  login(driver, testEnv.getBSS());
			 searchAccountPage = homePage.ClickAccountSub();
			 PageFactory.initElements(driver, searchAccountPage);
			 searchAccountPage.setAccount(BAN);
			 
			 // had to introduce looping to make sure that BAN field is populated, 
			 // Encountered a peculiar issue , where BAN field was getting emptied, probably by javascript,
			 // so rather than waiting for some time , decided to have loop ensuring that ban field is populated
			 // issue was encountered only in firefox, probably javascripts are executed slowly on firefox
			 do{
				 searchAccountPage.setAccount(BAN);
			 }while(!searchAccountPage.getAccount().equals(BAN));
			 searchAccountPage.selectSearchType("2");
			 searchAccountPage.clickSearch();
			 createSubPage=searchAccountPage.clickSubscriberEdit(MSISDN);
			 PageFactory.initElements(driver, createSubPage);
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
		 	 rating.setPP(newPP);
			 createSubPage.update();
			 printError(createSubPage);
		 }
		 catch(NoSuchElementException e)
		 {
				 logger.error("Seems Page is not Loaded. stack trace :" + e);
				 logger.catching(e);
				 Assert.fail("NoSuchElementException");
				 logger.exit();	
	 	 }
		 catch(NotTargetedPageException e)
		 {
			     logger.error("Targeted page is not opened :" + e);
				 logger.catching(e);
				 logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+searchAccountPage.takeScreenShot("createSubPage is not opened")+"\">");
				 Assert.fail("createSub:Targeted page is not opened");
			     logger.exit();	
	 	 }
		 
		 logger.exit();
	}
	 public void runMRC( String BAN, String type, String date )
	 {
		 logger.entry( BAN, type, date);
		 HomePage homePage=null;
		 try{
			 homePage =  login(driver, testEnv.getBSS());
			 RecurringChargePage recurringPage = homePage.ClickRunRecurringCharge();
			 PageFactory.initElements(driver, recurringPage);
			 recurringPage.setAccountIdentifier(BAN);
			 recurringPage.selectRecurringType(type);//1-Monthly, 2-Weekly, 3-Daily, 5-Multiday
			 recurringPage.setBillingDate(date);
			 recurringPage.clickRun();
		 }
		 catch(NoSuchElementException e)
		 {
				 logger.error("Seems Page is not Loaded. stack trace :" + e);
				 logger.catching(e);
				 Assert.fail("NoSuchElementException");
				 logger.exit();	
	 	 }
		 catch(NotTargetedPageException e)
		 {
			     logger.error("Targeted page is not opened :" + e);
				 logger.catching(e);
				 logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+homePage.takeScreenShot("RecurringCharge is not opened")+"\">");
				 Assert.fail("createSub:Targeted page is not opened");
			     logger.exit();	
	 	 }
		 logger.exit();
	 }
	 public void makeSubscriberLevelPayment( String BAN, String MSISDN, String amount) {
		 logger.entry( BAN, MSISDN, amount);
		 CreateSubscriberPage createSubPage=null;
		 SearchAccountPage searchAccountPage = null;
		 
		 try{
			 HomePage homePage =  login(driver, testEnv.getBSS());
			 searchAccountPage = homePage.ClickAccountSub();
			 PageFactory.initElements(driver, searchAccountPage);
			 searchAccountPage.setAccount(BAN);
			 
			 // had to introduce looping to make sure that BAN field is populated, 
			 // Encountered a peculiar issue , where BAN field was getting emptied, probably by javascript,
			 // so rather than waiting for some time , decided to have loop ensuring that ban field is populated
			 // issue was encountered only in firefox, probably javascripts are executed slowly on firefox
			 do{
				 searchAccountPage.setAccount(BAN);
			 }while(!searchAccountPage.getAccount().equals(BAN));
			 searchAccountPage.selectSearchType("2");
			 searchAccountPage.clickSearch();
			 createSubPage=searchAccountPage.clickSubscriberEdit(MSISDN);
			 PageFactory.initElements(driver, createSubPage);
			 driver.findElement(By.xpath("//*[@href='/AppCrm/home?cmd=SubMenuPaymentHistory&CMD=New']")).click();
			 new Select(driver.findElement(By.name(".adjustmentTypeCategory"))).selectByValue("20000");
			 new Select(driver.findElement(By.id("field_adjustment_type"))).selectByValue("21000");
			 driver.findElement(By.name(".amount")).clear();
			 driver.findElement(By.name(".amount")).sendKeys(amount);
			 driver.findElement(By.id("field_expiry_days_ext")).clear();
			 driver.findElement(By.id("field_expiry_days_ext")).sendKeys("30");
			 driver.findElement(By.name("SaveCMD")).click();
			 printError(createSubPage);
		 }
		 catch(NoSuchElementException e)
		 {
				 logger.error("Seems Page is not Loaded. stack trace :" + e);
				 logger.catching(e);
				 Assert.fail("NoSuchElementException");
				 logger.exit();	
	 	 }
		 catch(NotTargetedPageException e)
		 {
			     logger.error("Targeted page is not opened :" + e);
				 logger.catching(e);
				 logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+searchAccountPage.takeScreenShot("createSubPage is not opened")+"\">");
				 Assert.fail("createSub:Targeted page is not opened");
			     logger.exit();	
	 	 }
		 
		 logger.exit();
	}
	 /**
		 * createSIM(HomePage homePage,String SIM,String Type, String SPID)
		 * if SIM is blank, it will generate a new SIM, else generate a SIM with given ID, still no way to use existing SIM
		 * Type can be GSM, CDMA or TDMA 
		 */
	 public void createSIM(Map<String,String> ctx,String SIM,String Type, String SPID ) 
	 {   
		logger.entry( SIM, Type, SPID);
		HomePage homePage = login(driver,testEnv.getBSS());
		CreateSIMpage createSIMpage=null;
		if(SIM.equals(""))
			 SIM = Helper.queryDBForSingleValue(testEnv.getCRMDB(), 0,"","getFreeSIM");//new Long((long)(Math.random()*100000)).toString();
		ctx.put("createSIM.SIM", SIM);
		
		try{	
		     if(Type.equals("CDMA")||Type.equals("TDMA"))
		     {
		    	 createSIMpage = homePage.ClickCreateCDMATDMASIM(Type); //Type = CDMA/TDMA
		    	 PageFactory.initElements(homePage.driver, createSIMpage);
		     }
		     if (createSIMpage==null)
		     {	 createSIMpage = homePage.ClickCreateGSMSIM();
		         PageFactory.initElements(homePage.driver, createSIMpage);
		     }	  

			 createSIMpage.setPackageID(SIM);//SIM
			 
			 if(Type.equals("CDMA")||Type.equals("TDMA"))
			 {
				 createSIMpage.setTechnology(Type);
				 createSIMpage.setMIN(SIM);
			 }
			 else 
			 {	 
				 createSIMpage.setIMSI(SIM);
			 }
			 createSIMpage.setSpid(SPID);
			 
			 createSIMpage.save();
			 logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+createSIMpage.takeScreenShot("createSIM")+"\">");
			 printError(createSIMpage);
			 
			 logger.exit();
		}
		catch(NoSuchElementException e)
		 {
				 logger.error("Seems Page is not Loaded. stack trace :" + e);
				 logger.catching(e);
				 Assert.fail("NoSuchElementException");
				 logger.exit();	
	 	 }
		 catch(NotTargetedPageException e)
		 {
			     logger.error("Targeted page is not opened :" + e);
				 logger.catching(e);
				 logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+homePage.takeScreenShot("CreateSIMPage is not opened")+"\">");
				 Assert.fail("CreateSIMPage:Targeted page is not opened");
			     logger.exit();	
	 	 }
	 }
	 
	 public void createAccount(Map<String,String> ctx, String SPID, String billingType, String creditCategory, String discountClass, String groupType, String parent, String responsible)
	 {
		 logger.entry( SPID,billingType, creditCategory,discountClass );
		 
		 HomePage homePage =  login(driver, testEnv.getBSS());
		 SearchAccountPage searchAccountPage=null;
		 NewAccountPage newAccount=null;
		 String accName = "Auto"+(long)(Math.random()*10000);
	     String firstName = "Auto"+(long)(Math.random()*10000);
		 String lastName = "Auto"+(long)(Math.random()*10000);
		 if(billingType.equals("Prepaid"))
			 billingType = "1";
		 else if(billingType.equals("Postpaid"))
			 billingType = "0";
		 else
			 billingType = "2";
		
		 try{
			 searchAccountPage = homePage.ClickAccountSub();
			 PageFactory.initElements(searchAccountPage.driver, searchAccountPage);
			 newAccount= searchAccountPage.submit();
			 PageFactory.initElements(newAccount.driver, newAccount);
			 
			 if(!groupType.equals(""))
			 	newAccount.setGroupType(groupType); //Subscriber , Group Pooled
			 if(!parent.equals(""))
				 newAccount.setParent(parent);
			 if(!responsible.equals(""))
				 newAccount.setResponsible(responsible);
			 newAccount.setSPID(SPID);
			 newAccount.setAccountName(accName);
			 newAccount.setFirstName(firstName);
			 newAccount.setLastName(lastName);
			 newAccount.setBillingType(billingType);
			 
			 if(!billingType.equals("1")) //not prepaid
				 newAccount.setCreditCategory(creditCategory);
			 newAccount.clickBillingLink();
			 newAccount.setAddress("abcd");
			 newAccount.setCity("abcd");
			 newAccount.setCountry("abcd");
			 newAccount.clickContactLink();
			 newAccount.setContactName("abcd");
			 newAccount.setContactTel(new Long((long)(Math.random()*10000000000L)).toString());
			 newAccount.clickIDSecurityLink();
			 newAccount.setIDType();
			 newAccount.setID(new Long(1000+ new Long((long)(Math.random()*1000))).toString());
			 newAccount.setDOB("24/05/1988");
			 newAccount.setQuestionCheckBox();
			 newAccount.setQuestion("abcd");
			 newAccount.setAnswer("abcde");
			 
			 newAccount.submit();
			 logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+newAccount.takeScreenShot("createAccount")+"\">");
			 printError(newAccount);
			 String BAN = newAccount.getAccountId();
			 
			 ctx.put("createAccount.BAN", BAN );
			 ctx.put("createAccount.AccountFeedBack", newAccount.getFeedBack());
			 if(!groupType.equals("Subscriber") && !groupType.equals(""))
				 ctx.put("createAccount.ParentBAN", BAN );
			

			 newAccount.clickContactLink();
			 newAccount.setEmail(BAN + "@abc.com" );
			 newAccount.update();
			// newAccount.close();
			 logger.exit();
		   }
			catch(NoSuchElementException e)
			 {
					 logger.error("Seems Page is not Loaded. stack trace :" + e);
					 logger.catching(e);
					 Assert.fail("NoSuchElementException");
					 logger.exit();	
		 	 }
			 catch(NotTargetedPageException e)
			 {
				     logger.error("Targeted page is not opened :" + e);
					 logger.catching(e);
					 logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+searchAccountPage.takeScreenShot("newAccountPage is not opened")+"\">");

					 Assert.fail("newAccount:Targeted page is not opened");
				     logger.exit();	
		 	 }
	 }

	 /**
	  * Creates subscription under prepaid, postpaid or Hybrid account
	  * 
	  * @param searchSubscriberPage
	  * @param amount
	  * @param tech
	  * @param msisdn  When Empty String, a free MSISDN will be selected from DB
	  * @param PP
	  * @param billingType When empty default billing type will be selected, for prepaid and postpaid accounts no need to pass, only useful for hybrid accounts
	  * @return
	  */
	 public void createSubscriber(Map<String,String> ctx, String spid, String account,String SIM,String amount,String tech, String msisdn,String PP, String billingType )
	 {
		 logger.entry(account, SIM, amount, tech,msisdn, PP);
		 CreateSubscriberPage createSub=null;
		 SearchAccountPage searchAccountPage = null;
		 SearchSubscriberPage searchSubscriberPage=null;
		 NewAccountPage newAccountPage = null;
		 if (msisdn.equals(""))
			 msisdn=Helper.queryDBForSingleValue(testEnv.getCRMDB(),0,"", "get"+ billingType +tech+"MSISDN", new String[]{"I", spid}); 

		 if(billingType.equals("Prepaid"))
			 billingType = "1";
		 else if(billingType.equals("Postpaid"))
			 billingType = "0";
			
		 try{
			 HomePage homePage =  login(driver, testEnv.getBSS());
			 PageFactory.initElements(driver, homePage);
			 searchAccountPage = homePage.ClickAccountSub();
			 PageFactory.initElements(driver, searchAccountPage);
			 
			 
			 // had to introduce looping to make sure that BAN field is populated, 
			 // Encountered a peculiar issue , where BAN field was getting emptied, probably by javascript,
			 // so rather than waiting for some time , decided to have loop ensuring that ban field is populated
			 // issue was encountered only in firefox, probably javascripts are executed slowly on firefox
			 do{
			 searchAccountPage.setAccount(account);
			 searchAccountPage.selectSearchType("0");
			 }while(!searchAccountPage.getAccount().equals(account));
			 
			 searchAccountPage.clickSearch();
			 
			 newAccountPage=searchAccountPage.clickAccountEdit(account);
			 PageFactory.initElements(driver, newAccountPage);
			 
			 String accountBillingType = newAccountPage.getBillingType();
			 searchSubscriberPage=newAccountPage.clickBrowse(); 
			 PageFactory.initElements(searchSubscriberPage.driver, searchSubscriberPage); 
		     createSub = searchSubscriberPage.clickNew();
		     PageFactory.initElements(createSub.driver, createSub);
		     createSub.setTechnology(tech);
		     if (!accountBillingType.equals("1"))
		    	createSub.setBillingType(billingType);
		    
		    CreateSubscriberPage.MobileNumber mobileNumber= createSub.new MobileNumber();
		 	PageFactory.initElements(createSub.driver, mobileNumber);
		    
		    mobileNumber.setSIM(SIM);
			mobileNumber.setCustomEntry(msisdn);
			ctx.put("createSubscriber.MSISDN", msisdn);
		    			
		 	CreateSubscriberPage.Rating rating= createSub.new Rating();
		 	PageFactory.initElements(createSub.driver, rating);
		 	
		 	rating.click();
		    rating.setPP(PP);  
			ctx.put("createSubscriber.PP",rating.getPP());
			
			CreateSubscriberPage.BillingInfo billingInfo= createSub.new BillingInfo();
		 	PageFactory.initElements(createSub.driver, billingInfo);
		 	
		 	billingInfo.click();
		 	if (billingType.equals("1"))
		 		billingInfo.setInitialBalance(amount);
		 	else
		 		billingInfo.setCreditLimit(amount);
			
			createSub.save();
			printError(createSub);
			ctx.put("createSubscriber.createSubFeedBack",createSub.getFeedBack());

			mobileNumber.click();
			if (!mobileNumber.getState().equals("Activated"))
			{	mobileNumber.setState("1");	
				createSub.update();
			}
			logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+createSub.takeScreenShot("createSub")+"\">");
			printError(createSub);
			ctx.put("createSubscriber.SubscriptionId", createSub.getSubscriberId());
			ctx.put("createSubscriber.activateSubFeedBack",createSub.getFeedBack());
			ctx.put("createSubscriber.MSISDN",mobileNumber.getMSISDN());
			logger.info(ctx.toString());
			logger.exit();
		 }
		 catch(NoSuchElementException e)
		 {
				 logger.error("Seems Page is not Loaded. stack trace :" + e);
				 logger.catching(e);
				 Assert.fail("NoSuchElementException");
				 logger.exit();	
	 	 }
		 catch(NotTargetedPageException e)
		 {
			     logger.error("Targeted page is not opened :" + e);
				 logger.catching(e);
				 logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+searchSubscriberPage.takeScreenShot("createSubPage is not opened")+"\">");
				 Assert.fail("createSub:Targeted page is not opened");
			     logger.exit();	
	 	 }
	 }
}
