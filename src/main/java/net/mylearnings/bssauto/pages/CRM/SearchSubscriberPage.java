package net.mylearnings.bssauto.pages.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.mylearnings.bssauto.Exceptions.NotTargetedPageException;

public class SearchSubscriberPage extends BasePage{

	@FindBy(xpath="//td[@id='button-new']//a[contains(@href,'SubMenuSubProfileEdit')]")
	private WebElement newButton;
	
	public SearchSubscriberPage(WebDriver driver) throws NotTargetedPageException {
		super(driver);
		
		try{
			if(!driver.findElement(By.cssSelector("table#detail-subscriptionsearch td.table-title")).getText().trim().contains("SUBSCRIPTION SEARCH") )
			{	
				throw new NotTargetedPageException("Element with css selector \"table#detail-subscriptionsearch td.table-title\" does not have text \"Subscription Search\"");
			}	
		}
		catch(NoSuchElementException e)
		{
			throw new NotTargetedPageException("Element with css selector \"table#detail-subscriptionsearch td.table-title\" is not found");
		}
	}
	
	public CreateSubscriberPage clickNew() throws NotTargetedPageException
	{
		newButton.click();
		return new CreateSubscriberPage(driver);
	}
}
