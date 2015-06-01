package net.mylearnings.bssauto.customPageFactory;



import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import net.mylearnings.bssauto.Exceptions.PageException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;


/**
 * Custom Page Factory implementation of TAF which extends the original {@link PageFactory} of selenium.
 * 
 *<p>This class enhances the PageFactory implementation provided by Selenium by providing an enhanced feature of 
 * storing locators onto a different file and fetching it from the file based on the keyword provided at runtime.
 * 
 * @author  Varun Menon
 *
 */

public class CustomPageFactory extends PageFactory {
	
	/**
	 * Custom Page Factory method that initializes the Selenium PageFactory based element locators {@link org.openqa.selenium.support.PageFactory PageFactory}
	 * with the passed driver object.
	 * 
	 * <p><b>Note:</b> Use this method when you are not using the page object model.\n
	
	 * @param driver Driver object which should be used to initialize the Page Factory elements.
	 * @param pageClassToProxy A class which will be initialized.
	 * @param file <code>File</code> object of the file containing the key/value pair.
	 * @return An instantiated instance of the class with WebElement and List<WebElement> fields proxied
	 * @throws PageException 
	 */
	public static <T> T initElements(WebDriver driver, Class<T> pageClassToProxy,File file)  {
		try {
		if(driver == null)
				throw new PageException("Driver passed for page initialization is null. Make sure the driver is initialized");
		} catch (PageException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		T page = instantiatePage(driver, pageClassToProxy);
		initElements(driver, page, file);
		return (T) page;
	}
	

    /**
     * As
     * {@link org.openqa.selenium.support.PageFactory#initElements(org.openqa.selenium.WebDriver, Class)}
     * but will only replace the fields of an already instantiated Page Object.
     *
     * @param driver The driver that will be used to look up the elements
     * @param page The object with WebElement and List<WebElement> fields that should be proxied.
     */
    public static void initElements(WebDriver driver, Object page) {
        final WebDriver driverRef = driver;
       
		File locatorFile = getLocatorFile(page);
		if(locatorFile==null)
			initElements( new DefaultElementLocatorFactory(driverRef), page);
		else
			initElements(driver, page, locatorFile);        
    }
	
	/**
	 * Custom Page Factory method that initializes the Selenium PageFactory based element locators {@link org.openqa.selenium.support.PageFactory PageFactory}
	 * with the passed driver object.
	 * 
	 * <p><b>Note:</b> Use this method when you are not using the page object model.\n

	 * @param driver Driver object which should be used to initialize the Page Factory elements.
	 * @param pageClassToProxy A class which will be initialized.
	 * @param filePath File path of the file containing the key/value pair.
	 * @return An instantiated instance of the class with WebElement and List<WebElement> fields proxied
	 */
	public static <T> T initElements(WebDriver driver, Class<T> pageClassToProxy,String filePath) {
		File file = new File(filePath);
		T page = initElements(driver, pageClassToProxy,file);
		return (T) page;
	}
	
	/**
	 * Custom Page Factory method that initializes the Selenium PageFactory based element locators {@link org.openqa.selenium.support.PageFactory PageFactory}
	 * with the passed browser object.
	 * 
	 * <p><b>Note:</b> Only use this method when you are using the page object model.

	 * 
	 * @param driver Driver object which should be used to initialize the Page Factory elements.
	 * @param pageClassObjectToProxy A class object which have to be initialized.
	 * @param file <code>File</code> object of the file containing the key/value pair.
	 * @return An instantiated instance of the class with WebElement and List<WebElement> fields proxied
	 */
	public static <T> T initElements(WebDriver driver, T pageClassObjectToProxy,File file){
		ILocatorFile locatorFile = new LocatorFileFactory().getLocatorFile(file);
		ElementLocatorFactory locatorFactory = new KeywordBasedLocatorFactory(locatorFile, driver);
		initElements( locatorFactory, pageClassObjectToProxy);
		return (T) pageClassObjectToProxy;
		
	}
	

    /**
     * Initialize the elements of web element ,list<webElement> and eWeb element
     *
     * @param factory
     * @param page
     */
    public static void initElements(ElementLocatorFactory factory, Object page) {
        final ElementLocatorFactory factoryRef = factory;
        initElements(new DefaultFieldDecorator(factoryRef), page);
        
    }


    /**
	 * Custom Page Factory method that initializes the Selenium PageFactory based element locators {@link org.openqa.selenium.support.PageFactory PageFactory}
	 * with the passed driver object.
	 * 
	 * <p><b>Note:</b> Use this method when you are not using the page object model.\n

	 * @param driver Driver object which should be used to initialize the Page Factory elements.
	 * @param pageClassObjectToProxy A class object which have to be initialized.
	 * @param filePath File path of the file containing the key/value pair.
	 * @return An instantiated instance of the class with WebElement and List<WebElement> fields proxied
	 */
	public static <T> T initElements(WebDriver driver, T pageClassObjectToProxy,String filePath) {
		File file = new File(filePath);
		T page = initElements(driver, pageClassObjectToProxy,file);
		return (T) page;
	}
	
	
	/**
	 * Custom Page Factory method that initializes the Selenium PageFactory based element locators {@link org.openqa.selenium.support.PageFactory PageFactory}
	 * with the passed driver object.
	 * <p> This method tries to get the default locator file for a class by calling the "getLocatorFile" method if available in the said class.
	 * <p> If the said method is available it will use the file returned by the method for getting selectors.
	 * <p> If there is no method defined in the class it will initialize the said class as a Normal Page Factory class and will consider the Page Factory annotations "using" attribute value
	 * as a selector for identifying the elements. 
	 * 
	 * <p><b>Note:</b> Use this method when you are not using the page object model.\n

	 * @param driver Driver object which should be used to initialize the Page Factory elements.
	 * @param pageClassToProxy A class which will be initialized.
	 * @return An instantiated instance of the class with WebElement and List<WebElement> fields proxied
	 */
	public static <T> T initElements(WebDriver driver, Class<T> pageClassToProxy){
		T page = instantiatePage(driver, pageClassToProxy);
		File locatorFile = getLocatorFile(page);
		if(locatorFile==null)
			initElements(driver, page);
		else
			initElements(driver, page, locatorFile);
		
		return page;
	}
	
	
	private static <T> File getLocatorFile(T page){
		Class<?> classToProxy = page.getClass();
		
		File locatorFile = null;
		try {
			Method method = classToProxy.getMethod("getLocatorFile");
			if(File.class.isAssignableFrom(method.getReturnType())){
				try {
					Object obj = method.invoke(page);
					locatorFile = (File)obj;
				} catch (IllegalAccessException e) {
					try {
						throw new PageException("The 'getLocatorFile' method present in the class" + classToProxy.getName()+
								" may not be publicly accessible object.");
					} catch (PageException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (IllegalArgumentException e) {
					//Intentionally skipping it as this is already handled while getting the method.
				} catch (InvocationTargetException e) {
					//Intentionally skipping it 
				}
				
			}else{
				try {
					throw new PageException("The 'getLocatorFile' method present in the class" + classToProxy.getName()+" should return a File type object.");
				} catch (PageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (NoSuchMethodException e) {
			//Intentionally skipping it 
		} catch (SecurityException e) {
			//Intentionally skipping it 
		}
		return locatorFile;		
	}
	
	private static <T> T instantiatePage(WebDriver driver,
			Class<T> pageClassToProxy) {
		try {
			try {
				Constructor<T> constructor = pageClassToProxy
						.getConstructor(WebDriver.class);
				return constructor.newInstance(driver);
			} catch (NoSuchMethodException e) {
				return pageClassToProxy.newInstance();
			}
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
	}

}

