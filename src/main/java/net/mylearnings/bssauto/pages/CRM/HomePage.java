package net.mylearnings.bssauto.pages.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.mylearnings.bssauto.Exceptions.NotTargetedPageException;

//Only to navigate between pages, can be considered as menu bar 
public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) throws NotTargetedPageException {
		super(driver);
		
		try{
			//Or operator in xapth to support 9.5
			if(driver.findElement(By.xpath("//*[@id='logged-in-userid']|//*[@id='loggedin']")).getText().trim().equals("") )
			{	
				throw new NotTargetedPageException("Element with id logged-in-userid is empty");
			}	
		}
		catch(NoSuchElementException e)
		{
			throw new NotTargetedPageException("Element with id logged-in-userid is not found");
		}
	}
	public SearchAccountPage ClickAccountSub() throws NotTargetedPageException
	{     
		//driver.findElement(By.xpath("//a[contains(@href,'AcctSubSubMenus')]")).click();
		//driver.findElement(By.cssSelector("a[href*='AcctSubSubMenus']"));
		//WebDriverWait wait = new WebDriverWait(driver, 300);
        Actions builder = new Actions(driver);    
        builder.moveToElement(driver.findElement(By.xpath("//a[contains(@href,'AcctSubSubMenus')]")))
        		.click()
        		.moveByOffset(100, 500)
        		.build()
        		.perform();
		return new SearchAccountPage(driver);
	}
	public RecurringChargePage ClickRunRecurringCharge() throws NotTargetedPageException
	{
		WebDriverWait wait = new WebDriverWait(driver, 300);
        Actions builder = new Actions(driver);    
        builder.moveToElement(driver.findElement(By.xpath("//a[contains(@href,'appCRMAccountMgmtMenu')]"))).build().perform();

        WebElement item_to_click = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'appCrmRecurringRecharge')]")));
            
        builder.moveToElement(item_to_click).build().perform();
               
        while(!item_to_click.isEnabled())
        {
        	try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
        item_to_click.click();
		
		return new RecurringChargePage(driver);
	}
	public CreateSIMpage ClickCreateGSMSIM() throws NotTargetedPageException
	{
		WebDriverWait wait = new WebDriverWait(driver, 300);
        Actions builder = new Actions(driver);    
        builder.moveToElement(driver.findElement(By.xpath("//a[contains(@href,'appCRMMsisdnMgmtMenu')]"))).build().perform();

        WebElement item_to_click = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'CardManagement')]")));
            
        builder.moveToElement(item_to_click).build().perform();
        
        item_to_click = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'CRMPackageMenu')]")));
        
        while(!item_to_click.isEnabled())
        {
        	try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
        item_to_click.click();
		
		return new CreateSIMpage(driver,"GSM");
	}
	public CreateSIMpage ClickCreateCDMATDMASIM(String Type) throws NotTargetedPageException
	{
		WebDriverWait wait = new WebDriverWait(driver, 300);
        Actions builder = new Actions(driver);    
        builder.moveToElement(driver.findElement(By.xpath("//a[contains(@href,'appCRMMsisdnMgmtMenu')]"))).build().perform();

        WebElement item_to_click = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'CardManagement')]")));
            
        builder.moveToElement(item_to_click).build().perform();
        
        item_to_click = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'AppCrmTDMACDMAPackage')]")));
        
        while(!item_to_click.isEnabled())
        {
        	try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
        item_to_click.click();

		return new CreateSIMpage(driver, Type);
	}
	
	public CreateSubscriberPage clickSubscriberLink() throws NotTargetedPageException {
		driver.findElement(By.xpath("//a[contains(@href,'AcctSubSubMenus')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'SubMenuSubProfileEdit&key=')]")).click();
		return new CreateSubscriberPage(driver);
	}
}
