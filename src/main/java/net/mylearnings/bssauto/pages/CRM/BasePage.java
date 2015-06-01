package net.mylearnings.bssauto.pages.CRM;

import java.io.File;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class BasePage {

public WebDriver driver;	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;		
	}
	public  boolean isTextPresent( String text)
	{
		return driver.getPageSource().contains(text);
	}
	public String getFeedBack()
	{
		return driver.findElement(By.className("feedback-message")).getText();
	}
	
	public List<String> getErrorsTableIfPresent()
	{
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		List<WebElement> error = driver.findElements(By.xpath("//table[@id='table-errors']//tbody//tr"));
		List<WebElement> errorElements=null;
		List<String> errors=new ArrayList<String>();
		
		if (error.size()> 0){
			for(WebElement e: error)
			{
				errorElements= e.findElements(By.xpath("td"));
				String errorText = null; 
				
				for(WebElement e1: errorElements)
				{
					if (errorText == null)
						errorText =  e1.getText();
					else
						errorText = errorText + "#" +e1.getText();
				}
				errors.add(errorText);
			}
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return errors;
	}
	public String getErrorsIfPresent()
	{
		String errorText = null;
	
		//List<WebElement> error = driver.findElements(By.xpath("//span[@class='error']"));
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		List<WebElement> error = driver.findElements(By.cssSelector("span.error"));
		if(error.size()>0)
			errorText=error.get(0).getText();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return errorText;
	}
	 public void waitUntilPageRefresh()
	 {
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    	       .withTimeout(360, TimeUnit.SECONDS)
	    	       .pollingEvery(5, TimeUnit.SECONDS)
	    	       .ignoring(WebDriverException.class);
    	
    	 try {
    		 ExpectedCondition<Boolean> expectation = new  ExpectedCondition<Boolean>() { 
			 public Boolean apply(WebDriver driver) { 
				 System.out.println(((JavascriptExecutor)driver).executeScript("return document.readyState"));
				 return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete"); 
				 } }; 
				 wait.until(expectation);
		 }
		 catch(Exception e)
		 {
			e.printStackTrace();
		 }
	 }
	 public String takeScreenShot(String... args)
	 {
		 String fileName=null;
		 java.util.Date date= new java.util.Date();
		 for(String s : args)
		 {
			 if (fileName == null)
				 fileName = s;
			 else
				 fileName = fileName + s;
		 }
		 String fName=null;
		 try {
			 File screenshot = 
			 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 fName = "Screen_" + fileName +"_"+(new Timestamp(date.getTime())).toString().replaceAll("[ :.-]", "_")+".png";
			 File image = new File("capturedScreens\\"+ fName);
			 FileUtils.copyFile(screenshot,image);
			 } catch (Exception e) {
				 e.printStackTrace();
				 System.exit(0);
			 }
		     return fName;
	 }
	 public  void waitForScriptExecution() {
		    executeJs("var sc = document.createElement('script'); sc.innerHTML = 'window.allDone = true;'; document.body.appendChild(sc);");
		    int maxWait = 6000;
		    int waitTimeSoFar = 0;
		    int waitIntervalMs = 500;
		    do {
		        if (executeJs("return window.allDone").equals("true")) {
		            break;
		        }
		        waitFor(waitIntervalMs, TimeUnit.MILLISECONDS);
		        waitTimeSoFar = waitTimeSoFar + waitIntervalMs;
		    } while (waitTimeSoFar < maxWait);
		    if (waitTimeSoFar >= maxWait) {
		        // TODO handle timeout
		    }
		}

		public  String executeJs(String script) {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    Object result = js.executeScript(script);
		    return result != null ? result.toString() : null;
		}

		public  void waitFor(long count, TimeUnit timeUnit) {
		    try {
		        Thread.sleep(timeUnit.toMillis(count));
		    } catch (InterruptedException e) {
		        throw new RuntimeException(e);
		    }
		}
	 }
