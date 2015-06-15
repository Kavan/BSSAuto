package net.mylearnings.bssauto.helpers;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	private static WebDriver instance = null;
	public static final long IMPLICIT_WAIT=30;
	public static WebDriver getInstance(String type) {
	      if(instance == null) {
	         instance = initializeDriver(type);
	      }
	      return instance;
	   }
	
	private static WebDriver initializeDriver(String driverType){
		WebDriver driver=null; 
		if(driverType.equals("IE") ){ 
			 File file = new File("drivers\\IEDriverServer.exe");
			 System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			 driver = new InternetExplorerDriver(); 
		 }	
		 if(driverType.equals("Chrome")){ 
			 File file = new File("drivers\\chromedriver.exe");
			 System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			 driver = new ChromeDriver();
		 }   
		 if(driverType.equals("FF"))
			 driver = new FirefoxDriver();
			
		 /****DriverConfigurations*****/
	     driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);	
		 return driver;
	 }
}
