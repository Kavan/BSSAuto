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

public class SearchAccountPage extends BasePage{

	@FindBy(xpath="//td[@id='button-new']//a[contains(@href,'AcctSubSubMenus')]")	
	private WebElement newButton;
	
	@FindBy(id="field_search__ban")
	private WebElement account;
	
	@FindBy(name="SearchCMD")
	private WebElement search;
	
	@FindBy(id="field_search_type")
	private WebElement searchType;
	
	public SearchAccountPage(WebDriver driver) throws NotTargetedPageException {
		super(driver);
		
		try{
			if(!driver.findElement(By.cssSelector("table#detail-accountandsubscriptionsearch td.table-title")).getText().trim().contains("ACCOUNT AND SUBSCRIPTION SEARCH") )
			{	
				throw new NotTargetedPageException("Element with css selector \"table#detail-accountandsubscriptionsearch td.table-title\" does not have text \"Account and Subscription Search\"");
			}	
		}
		catch(NoSuchElementException e)
		{
			throw new NotTargetedPageException("Element with css selector \"table#detail-accountandsubscriptionsearch td.table-title\" is not found");
		}
	}
	
	public NewAccountPage submit() throws NotTargetedPageException
	{
		newButton.click();
	    return new  NewAccountPage(driver);
	} 
	public SearchAccountPage  setAccount(String acc)
	{
		account.clear();
		account.sendKeys(acc);
		return this;
	}
	public String  getAccount()
	{
		return account.getAttribute("value");
	}
	public SearchAccountPage selectSearchType(String index)
	{
		new Select(searchType).selectByValue(index);
		return this;
	}
	public SearchAccountPage  clickSearch()
	{
		search.click();
		return this;
	}
	public NewAccountPage clickAccountEdit(String acc) throws NotTargetedPageException 
	{
		driver.findElement(By.xpath("//table[@id='table-accountandsubscription']//td[contains(.,'"+acc+"')]/following-sibling::td[9]//a[text()='Edit']")).click();
		return new  NewAccountPage(driver);	
	}
	public CreateSubscriberPage clickSubscriberEdit(String msisdn) throws NotTargetedPageException 
	{
		driver.findElement(By.xpath("//table[@id='table-accountandsubscription']//td[contains(.,'"+msisdn+"')]/following-sibling::td[6]//a[text()='Edit']")).click();
		return new  CreateSubscriberPage(driver);	
	}
}
