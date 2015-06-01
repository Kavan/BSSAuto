package net.mylearnings.bssauto.pages.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.mylearnings.bssauto.Exceptions.NotTargetedPageException;

public class RecurringChargePage extends BasePage{

	@FindBy(id="field_scope")	
	private WebElement selectionCriteria;
	
	@FindBy(id="field_account_identifier")
	private WebElement accountIdentifier;
	
	@FindBy(id="field_charging_cycle")
	private WebElement recurringType;
	
	@FindBy(id="field_billing_date")
	private WebElement billingDate;
	
	@FindBy(name="RunCMD")
	private WebElement run;
	
	public RecurringChargePage(WebDriver driver) throws NotTargetedPageException {
		super(driver);
		
		try{
			//System.out.println(driver.findElement(By.cssSelector("table#detail-recurringrecharge td.table-title")).getText());
			if(!driver.findElement(By.cssSelector("table#detail-recurringrecharge td.table-title")).getText().trim().contains("Recurring Recharge") )
			{	
				throw new NotTargetedPageException("Element with css selector \"table#detail-recurringrecharge td.table-title\" does not have text \"Recurring Recharge\"");
			}	
		}
		catch(NoSuchElementException e)
		{
			throw new NotTargetedPageException("Element with css selector \"table#detail-recurringrecharge td.table-title\" is not found");
		}
	}
	
	public RecurringChargePage clickRun() throws NotTargetedPageException
	{
		run.click();
	    return this;
	} 
	public RecurringChargePage  setAccountIdentifier(String acc)
	{
		accountIdentifier.clear();
		accountIdentifier.sendKeys(acc);
		return this;
	}
	public String  getAccount()
	{
		return accountIdentifier.getAttribute("value");
	}
	public RecurringChargePage selectRecurringType(String index)
	{
		new Select(recurringType).selectByValue(index);
		return this;
	}
	
	public RecurringChargePage  setBillingDate(String bDate)
	{
		billingDate.clear();
		billingDate.sendKeys(bDate);
		return this;
	}
	
	
}
