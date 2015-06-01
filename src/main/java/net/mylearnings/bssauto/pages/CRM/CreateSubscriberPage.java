package net.mylearnings.bssauto.pages.CRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.mylearnings.bssauto.Exceptions.NotTargetedPageException;

public class CreateSubscriberPage extends BasePage{
	
	public CreateSubscriberPage(WebDriver driver) throws NotTargetedPageException {
		super(driver);
		
		try{
			if(!driver.findElement(By.cssSelector("table#detail-subscriptionprofile td.table-title")).getText().trim().contains("SUBSCRIPTION PROFILE") )
			{	
				throw new NotTargetedPageException("Element with css selector \"table#detail-subscriptionprofile td.table-title\" does not have text \"Subscription Profile\"");
			}	
		}
		catch(NoSuchElementException e)
		{
			throw new NotTargetedPageException("Element with css selector \"table#detail-subscriptionprofile td.table-title\" is not found");
		}
	}

	@FindBy(id="field_technology")
	private WebElement technology;

	@FindBy(id="field_subscriber_type")
	private WebElement billingType;	
	
	@FindBy(className="button-UpdateCMD")
	private WebElement update;
	
	@FindBy(name="SaveCMD")
	private WebElement save;
	
	@FindBy(id="subscriber-id-webcontrol")
	private WebElement resultSubscriberId;
	
	@FindBy(xpath="//*[@id='subscriber-subscribertype-webcontrol']/span")
	private WebElement billingTypeLabel;
	
	public CreateSubscriberPage setTechnology(String tech)
	{
		new Select(technology).selectByVisibleText(tech);
		return this;
	}
	public CreateSubscriberPage setBillingType(String billType)
	{
		new Select(billingType).selectByValue(billType);
		return this;
	}
	public String getBillingType()
	{
		return new Select(billingType).getFirstSelectedOption().getText();
	}
	public String getBillingTypeLabel()
	{
		return billingTypeLabel.getText();
	}
	
	public CreateSubscriberPage update()
	{
		update.click();
		return this;
	}
	public CreateSubscriberPage save()
	{
		save.click();
		return this;
	}
	public String getSubscriberId()
	{
		return resultSubscriberId.getText();
	}
	public HomePage returnHome() throws NotTargetedPageException
	{
		return new HomePage(driver);
	}
	public class  BillingInfo
	{  
		
		@FindBy(xpath="//span[contains(text(),'Billing Information')]")
		private WebElement billingInfoLink;
		
		@FindBy(name=".initialBalance")
		private WebElement initialBalance;
		
		@FindBy(name=".creditLimit")
		private WebElement creditLimit;
		
		@FindBy(name=".monthlySpendLimit")
		private WebElement monthlySpendingLimit;
		
		public CreateSubscriberPage click()
		{
			billingInfoLink.click();
			return CreateSubscriberPage.this;
		}
		
		public CreateSubscriberPage setInitialBalance(String amount)
		{
			initialBalance.clear();
			initialBalance.sendKeys(amount);
			return CreateSubscriberPage.this;
		}
		public CreateSubscriberPage setCreditLimit(String amount)
		{
			creditLimit.clear();
			creditLimit.sendKeys(amount);
			return CreateSubscriberPage.this;
		}
		
		public CreateSubscriberPage setMonthlySpendingLimit(String amount)
		{
			monthlySpendingLimit.clear();
			monthlySpendingLimit.sendKeys(amount);
			return CreateSubscriberPage.this;
		}
		public String takeScreenShot(String... string) {
			return CreateSubscriberPage.super.takeScreenShot(string);
		}

	}
	 public class MobileNumber
	{
		@FindBy(id="field_fax_msisdngroup")
		private WebElement faxMsisdnGroup;
		
		@FindBy(id="field_fax_msisdn")
		private WebElement faxMsisdn;
		
		@FindBy(id="field_data_msisdngroup")
		private WebElement dataMsisdnGroup;
		
		@FindBy(id="field_data_msisdn")
		private WebElement dataMsisdn;
		
		@FindBy(id="field_msisdngroup")
		private WebElement msisdnGroup;
		
		@FindBy(id="field_msisdn")
		private WebElement msisdn;
		
		@FindBy(id=".state")
		private WebElement state;
		
		@FindBy(id="field_package_id")
		private WebElement packageId;
		
		@FindBy(xpath="//input[@name='.msisdnEntryType'][@value='1']")
		private WebElement customEntry;
		
		@FindBy(xpath="//span[contains(text(),'Mobile Number')]")
		private WebElement mobileNumberLink; 
		
		public CreateSubscriberPage click()
		{
			mobileNumberLink.click();
			return CreateSubscriberPage.this;
		}
		
		public CreateSubscriberPage setFaxMobileGroup(String ValueText)
		{
			new Select(faxMsisdnGroup).selectByVisibleText(ValueText);
			return CreateSubscriberPage.this;
		}
		public CreateSubscriberPage setFaxMobile()
		{
			new Select(faxMsisdn).selectByIndex(3);
			return CreateSubscriberPage.this;
		}
		public CreateSubscriberPage setDataMobileGroup(String ValueText)
		{
			new Select(dataMsisdnGroup).selectByVisibleText(ValueText);
			return CreateSubscriberPage.this;
		}
		public CreateSubscriberPage setDataMobile()
		{
			new Select(dataMsisdn).selectByIndex(4);
			return CreateSubscriberPage.this;
		}
		public CreateSubscriberPage setMobileGroup(String ValueText)
		{
			new Select(msisdnGroup).selectByVisibleText(ValueText);
			return CreateSubscriberPage.this;
		}
		public CreateSubscriberPage setCustomEntry(String ValueText)
		{
			customEntry.sendKeys(Keys.SPACE);
			msisdn.clear();
			msisdn.sendKeys(ValueText);
			return CreateSubscriberPage.this;
		}
		public String getMSISDN()
		{
			return new Select(msisdn).getFirstSelectedOption().getText();	
		}
		public CreateSubscriberPage setState(String st)
		{
			new Select(state).selectByValue(st);
			return CreateSubscriberPage.this;
		}
		public String getState()
		{
			return new Select(state).getFirstSelectedOption().getText();
		}
		public CreateSubscriberPage setSIM( String SIM)
		{
			packageId.sendKeys(SIM);
			packageId.sendKeys(Keys.TAB);
			return CreateSubscriberPage.this;
		}
		public boolean hasMSISDNPresent()
		{
			WebElement ele = driver.findElement(By.id("subscriber-msisdn-webcontrol"));
			return !ele.getText().contains("no selections available");
		}
		public String takeScreenShot(String... string) {
			// TODO Auto-generated method stub
			return CreateSubscriberPage.super.takeScreenShot(string);
		}

	}
	 public class Rating
	{
		@FindBy(id="field_price_plan")
		private WebElement pricePlan;
		
		@FindBy(xpath="//span[contains(text(),'Rating')]")
		private WebElement ratingLink;
		
		public CreateSubscriberPage click()
		{
			ratingLink.click();
			return CreateSubscriberPage.this;
		}
		
		public CreateSubscriberPage setPP(String PP)
		{
			new Select(pricePlan).selectByValue(PP);
			return CreateSubscriberPage.this;
		}
		public String getPP()
		{
			return new Select(pricePlan).getFirstSelectedOption().getText();	
		}
		public CreateSubscriberPage setPPServices(List<Integer> services)
		{
		   String xpath=null;
		   String temp= null;
		   for (Integer i : services)
		   {   
			   if (temp != null)
				   temp = temp + ",";
			   temp=temp + "input[value='"+ i.toString() +"']";
		   }
		   xpath="table#table-services  tr > "+ temp +" + td > input[checked='']";
		   List<WebElement> serviceElements = driver.findElements(By.xpath(xpath)); 
		   for (WebElement e: serviceElements)
			   e.sendKeys(Keys.ENTER);
		   return CreateSubscriberPage.this;
		}

		public String takeScreenShot(String... string) {
			// TODO Auto-generated method stub
			return CreateSubscriberPage.super.takeScreenShot(string);
		}

	}
	
}
