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

public class CreateSIMpage extends BasePage {

	public CreateSIMpage(WebDriver driver, String type) throws NotTargetedPageException {
		super(driver);
		
		newSIM();
		if (type.equals("GSM")){
			try{
				System.out.println(driver.findElement(By.cssSelector("table#detail-gsmpackage td.table-title")).getText());
				if(!driver.findElement(By.cssSelector("table#detail-gsmpackage td.table-title")).getText().trim().contains("GSM PACKAGE") )
				{	
					throw new NotTargetedPageException("Element with css selector \"table#detail-gsmpackage td.table-title\" does not have text \"GSM Package\"");
				}	
			}
			catch(NoSuchElementException e)
			{
				throw new NotTargetedPageException("Element with css selector \"table#detail-gsmpackage td.table-title\" is not found");
			}
		}	
		if (type.equals("CDMA")||type.equals("TDMA")){
			try{
				if(!driver.findElement(By.cssSelector("table#detail-tdmacdmapackage td.table-title")).getText().trim().contains("TDMA/CDMA PACKAGE") )
				{	
					throw new NotTargetedPageException("Element with css selector \"table#detail-tdmacdmapackage td.table-title\" does not have text \"TDMA/CDMA Package\"");
				}	
			}
			catch(NoSuchElementException e)
			{
				throw new NotTargetedPageException("Element with css selector \"table#detail-tdmacdmapackage td.table-title\" is not found");
			}
		}
		
	}
	
	@FindBy(id="field_spid")
	private WebElement spid;
	
	@FindBy(id="field_package_type")
	private WebElement packageType;

	@FindBy(id="field_technology")
	private WebElement technology;
	
	@FindBy(id="field_pack_id")
	private WebElement packageId;
	
	@FindBy(id="field_imsi") // for GSM
	private WebElement imsi;
	
	@FindBy(id="field_min") //for CDMA
	private WebElement min;
	
	@FindBy(name="SaveCMD") 
	private WebElement saveButton;
	
	public CreateSIMpage newSIM()
	{
	    WebDriverWait wait = new WebDriverWait(driver,300);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@id='button-new']//a[contains(@href,'Package')]"))).click();
	    return this;
	}
	public CreateSIMpage setSpid(String value)
	{
		new Select(spid).selectByValue(value);
		return this;
	}
	public CreateSIMpage setPackageType(String value)
	{
		new Select(packageType).selectByValue(value);
		return this;
	}
	public CreateSIMpage setTechnology(String tech)
	{
		new Select(technology).selectByVisibleText(tech);
		return this;
	}
	public CreateSIMpage setPackageID(String Id)
	{
		packageId.sendKeys(Id);
		return this;
	}
	public CreateSIMpage setIMSI(String IMSI)
	{
		imsi.sendKeys(IMSI);
		return this;
	}
	public CreateSIMpage setMIN(String IMSI)
	{
		min.sendKeys(IMSI);
		return this;
	}
	public CreateSIMpage save()
	{
		saveButton.click();
		return this;
	}
	public HomePage returnHome() throws NotTargetedPageException
	{
		return new HomePage(driver);
	}
}
