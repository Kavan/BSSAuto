package net.mylearnings.bssauto.pages.CRM;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.mylearnings.bssauto.Exceptions.NotTargetedPageException;

/**First page  
 * @return home page
*/
public class LoginPage extends BasePage{
	
	//@FindBy(name=".userid")  // to support 9.5
	//@FindBy(xpath="//input[@name='.userid']")
	@FindBy(xpath="user")
	private WebElement userid;
	
	//@FindBy(name=".passwd.password")
	//@FindBy(xpath="//input[@name='.passwd.password']")
	@FindBy(xpath="password")
	private WebElement password;
	
	//@FindBy(name="LoginCMD")
	//@FindBy(xpath="//input[@name='LoginCMD']")
	@FindBy(xpath="loginButton")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public LoginPage setUser( String user)
	{
		userid.clear();
		userid.sendKeys(user);
		return this;
		
	}
	public LoginPage setPassword( String pw)
	{
		password.clear();
		password.sendKeys(pw);
		return this;
	}
	public HomePage submit() throws  NotTargetedPageException
	{
		loginButton.click();
		return new HomePage(driver);
	}
	public File getLocatorFile()
	{
		return new File("PageProperties/LoginPage.properties");
	}
}
