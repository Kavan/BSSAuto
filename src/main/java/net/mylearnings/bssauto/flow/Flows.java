package net.mylearnings.bssauto.flow;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;


import net.mylearnings.bssauto.Exceptions.NotTargetedPageException;
import net.mylearnings.bssauto.customPageFactory.CustomPageFactory;
import net.mylearnings.bssauto.helpers.Driver;
import net.mylearnings.bssauto.helpers.Node;
import net.mylearnings.bssauto.pages.CRM.BasePage;
import net.mylearnings.bssauto.pages.CRM.HomePage;
import net.mylearnings.bssauto.pages.CRM.LoginPage;

public class Flows {
	 
	 protected static Logger logger=  LogManager.getLogger(Flows.class);
	 protected WebDriver driver ;
	 
	 public Flows(String driverType)
	 {
		 driver = Driver.getInstance(driverType);
	 }
	 
	 protected void ifUnexpectedErrorFailElseGetFeedback(BasePage page, String[] Expected)
	 {   
		 //due to insufficient funds. Service not provisioned or suspended
		 //Skipped due to suspension
		 //This Entity state is stale and is modified externally. Please refresh entity and retry.
		 logger.entry(page);
		 String errors=page.getErrorsIfPresent();
		 List<String> errorsTable=  page.getErrorsTableIfPresent();
		 if(errors != null  || errorsTable.size() >0)
		 {	 
			 if (errors != null)
				 logger.error(errors);
			 for(String s : errorsTable)
				 logger.error(s);
			 logger.error("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+page.takeScreenShot("createSubPage is not opened")+"\">");

			 Assert.fail(errors);
		 }
		 logger.exit();
	 }
	 protected void printError(BasePage page)
	 {
		 logger.entry(page);
		 String errors=page.getErrorsIfPresent();
		 List<String> errorsTable=  page.getErrorsTableIfPresent();
		 if(errors != null  || errorsTable.size() >0)
		 {	 
			 if (errors != null)
				 logger.error(errors);
			 for(String s : errorsTable)
				 logger.error(s);
			 //page.takeScreenShot();
			 logger.error("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+page.takeScreenShot("createSubPage is not opened")+"\">");

			 //Assert.fail(errors);
		 }
		 logger.exit();
	 }
	 protected HomePage login(WebDriver driver,Node node)
	 {
		 logger.entry( driver, node.getUserName(), node.getPassword());
		 
		 driver.get(node.getUrl());
		 LoginPage loginPage=null;
		 try{
			 WebElement loggedIn=null;
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			List<WebElement> ele = driver.findElements(By.id("logged-in-userid"));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if (ele.size()> 0)
			{ loggedIn = ele.get(0);
				if(loggedIn.getText().trim().contains(node.getUserName()))
				{	
					logger.info("Already Logged-in.");
					return logger.exit(new HomePage(driver));
				}
				else
				{
					logger.info("Not already logged in. need to login.");
					 loginPage = new LoginPage(driver);
					 CustomPageFactory.initElements(driver, loginPage);
					 loginPage.setUser(node.getUserName());
					 loginPage.setPassword(node.getPassword());
					 return logger.exit(loginPage.submit());
				}
			}	
			else
			{
				logger.info("Not already logged in. need to login.");
				 loginPage = new LoginPage(driver);
				 PageFactory.initElements(driver, loginPage);
				 loginPage.setUser(node.getUserName());
				 loginPage.setPassword(node.getPassword());
				 return logger.exit(loginPage.submit());
			}
		 }	
		 catch(NoSuchElementException e)
		 {
				 logger.error("Seems Page is not Loaded. stack trace :" + e);
				 logger.catching(e);
				 Assert.fail("NoSuchElementException");
				 return logger.exit(null);	
	 	 }
		 catch(NotTargetedPageException e)
		 {
			     logger.error("Targeted page is not opened :" + e);
				 logger.catching(e);
				 logger.info("<img class=\"customHTML\" src=\"..\\capturedScreens\\"+loginPage.takeScreenShot("Login Failed")+"\">");
				 Assert.fail("Login Failed");
			     return logger.exit(null);	
	 	 }
	 }
}
