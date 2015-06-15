package net.mylearnings.bssauto.pages.CRM;

import java.lang.annotation.Retention;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.mylearnings.bssauto.Exceptions.NotTargetedPageException;

public class NewAccountPage extends BasePage{
	
	@FindBy(id="field_account_name")
	private WebElement accountName;
	@FindBy(xpath="//span[contains(text(),'Contact')]")
	private WebElement contactLink;
	@FindBy(xpath="//span[text()='Billing']")
	private WebElement billingLink;
	@FindBy(xpath="//span[text()='ID & Security']")
	private WebElement securityLink;
	
	@FindBy(id="field_email_id")
	private WebElement emailId;
	
	@FindBy(id="field_billing_address1")
	private WebElement billingAddress1;
	
	@FindBy(id="field_billing_city")
	private WebElement billingCity;
	
	@FindBy(id="field_contact_name")
	private WebElement contactName;
	
	@FindBy(id="field_contact_tel")
	private WebElement contactTel;
	
	@FindBy(id="field_billing_country")
	private WebElement billingCountry;
	
	@FindBy(id="field_first_name")
	private WebElement firstName;
	
	@FindBy(id="field_last_name")
	private WebElement lastName;
	
	@FindBy(id="field_system_type")
	private WebElement billingType;
	
	@FindBy(id="field_identification_group_list_0_identification_list_0_id_type")
	private WebElement idType;
	
	@FindBy(id="field_identification_group_list_0_identification_list_0_id_number")
	private WebElement idNumber;
	
	@FindBy(name=".securityQuestionsAndAnswers.0._enabled")
	private WebElement securityQuestionCheckbox;
	
	@FindBy(id="field_security_questions_and_answers_0_question")
	private WebElement securityQuestion1;
	
	@FindBy(id="field_security_questions_and_answers_0_answer")
	private WebElement securityAnswer1;
	
	@FindBy(name=".dateOfBirth")
	private WebElement dob;
	
	@FindBy(name="SaveCMD")
	private WebElement saveButton;
	
	@FindBy(name="UpdateCMD")
	private WebElement updateButton;
	
	@FindBy(id="field_credit_category")
	private WebElement creditCategory;
		
	@FindBy(id="field_discount_class")
	private WebElement discountClass;
	
	@FindBy(id="field_parent_ban")
	private WebElement parent;
	

	
	//private List<WebElement> groupType;
	
	@FindBy(id="field_spid")
	private WebElement spid;
	
	@FindBy(id="field_responsible")
	private WebElement responsible;
	
	public NewAccountPage(WebDriver driver) throws NotTargetedPageException {
		super(driver);
		
		try{
			if(!driver.findElement(By.cssSelector("table#detail-accountinformation td.table-title")).getText().trim().contains("ACCOUNT INFORMATION") )
			{	
				throw new NotTargetedPageException("Element with css selector \"table#detail-accountinformation td.table-title\" does not have text \"Account Information\"");
			}	
		}
		catch(NoSuchElementException e)
		{
			throw new NotTargetedPageException("Element with css selector \"table#detail-accountinformation td.table-title\" is not found");
		}
	}
	
	public NewAccountPage setParent(String p)
	{
		parent.sendKeys(p);
		return this;
	}
	
	public NewAccountPage setAccountName( String AccountName)
	{
		accountName.clear();
		accountName.sendKeys(AccountName);
		return this;
	}
	
	public NewAccountPage clickContactLink()
	{
		contactLink.click();
		return this;
	}
	public NewAccountPage clickBillingLink()
	{
		billingLink.click();
		return this;
	}
	public NewAccountPage clickIDSecurityLink()
	{
		securityLink.click();
		return this;
	}
	public NewAccountPage setEmail(String email)
	{
		emailId.sendKeys(email);
		return this;
	}
	public NewAccountPage setAddress( String address)
	{
		billingAddress1.clear();
		billingAddress1.sendKeys(address);
		return this;
	}
	public NewAccountPage setCity( String city)
	{
		billingCity.clear();
		billingCity.sendKeys(city);
		return this;
	}
	public NewAccountPage setContactName( String name)
	{
		contactName.clear();
		contactName.sendKeys(name);
		return this;
	}
	public NewAccountPage setContactTel( String tel)
	{
		contactTel.clear();
		contactTel.sendKeys(tel);
		return this;
	}
	public NewAccountPage setCountry( String country)
	{
		billingCountry.clear();
		billingCountry.sendKeys(country);
		return this;
	}
	public NewAccountPage setFirstName( String firstname)
	{
		firstName.clear();
		firstName.sendKeys(firstname);
		return this;
	}
	public NewAccountPage setLastName( String lastname)
	{
		lastName.clear();
		lastName.sendKeys(lastname);
		return this;
	}
	public NewAccountPage setBillingType(String billType)
	{
		new Select(billingType).selectByValue(billType);
		return this;
	}	
	public String getBillingType()
	{
		return new Select(billingType).getFirstSelectedOption().getAttribute("value");
	}	
	public NewAccountPage setIDType()
	{
		new Select(idType).selectByVisibleText("0 - National ID");
		return this;
	}
	public NewAccountPage setID( String ID)
	{
		idNumber.clear();
		idNumber.sendKeys(ID);
		return this;
	}
	public NewAccountPage setQuestionCheckBox( )
	{
		securityQuestionCheckbox.sendKeys(Keys.SPACE);
		return this;
	}
	public NewAccountPage setQuestion( String que)
	{
		securityQuestion1.clear();
		securityQuestion1.sendKeys(que);
		return this;
	}
	public NewAccountPage setAnswer( String ans)
	{
		securityAnswer1.clear();
		securityAnswer1.sendKeys(ans);
		return this;
	}
	
	public NewAccountPage setDOB( String DOB)
	{
		dob.clear();
		dob.sendKeys(DOB);
		return this;
	}
	public NewAccountPage setGroupType(String value)
	{
		//WA - findBys and FindAll not working staleElementException
		WebElement groupType = null;
		
		if(value.equals("Group")){	
			groupType = this.driver.findElement(By.xpath("//input[@name='.groupType'][@value='1']"));
			groupType.sendKeys(Keys.SPACE);
		}
		if(value.equals("Group Pooled")){
			groupType = this.driver.findElement(By.xpath("//input[@name='.groupType'][@value='3']"));
			groupType.sendKeys(Keys.SPACE);
		}
			
		return this;
	}
	public NewAccountPage setResponsible(String resp)
	{
		if (resp.equals("y") || resp.equals("Y") )
		{	
			if(!responsible.getAttribute("checked").equals("checked"))
			responsible.sendKeys(Keys.SPACE);
		
		}
		if (resp.equals("n") || resp.equals("N") )
		{	if(responsible.getAttribute("checked").equals("checked"))
				responsible.sendKeys(Keys.SPACE);
		}	
		return this;
	}
	
	public NewAccountPage setSPID(String value)
	{
		new Select(spid).selectByValue(value);
		return this;
	}
	public NewAccountPage setCreditCategory(String category)
	{
	    new Select(creditCategory).selectByValue(category);//2 - Individual
		return this;
	}
	public NewAccountPage submit()
	{
		saveButton.click();
		return this;
	}
	public NewAccountPage update()
	{
		updateButton.click();
		return this;
	}
	public String getAccountId()
	{
		return driver.findElement(By.id("account-ban-webcontrol")).getText();
		
	}
	public SearchSubscriberPage clickBrowse() throws NotTargetedPageException
	{
		//driver.findElement(By.linkText("Browse")).click();
		WebDriverWait wait = new WebDriverWait(driver,300);
		WebElement item_to_click = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'SubMenuSubProfileEdit')]")));
		item_to_click.click();
		
		return new SearchSubscriberPage(driver);
	}

	public void close() {
		driver.close();
	}
}
	
	

