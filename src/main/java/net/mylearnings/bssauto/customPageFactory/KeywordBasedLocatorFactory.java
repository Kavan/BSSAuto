package net.mylearnings.bssauto.customPageFactory;

import java.lang.reflect.Field;


import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;


/**
 * Factory to identify the respective Element locator based on whether the {@link Browser} object was set or not.
 * @author  Varun Menon
 *
 */
public class KeywordBasedLocatorFactory implements ElementLocatorFactory{
	
	private final SearchContext searchContext;
	private final ILocatorFile locatorFile;


	public KeywordBasedLocatorFactory(ILocatorFile locatorFile,SearchContext searchContext) {
		this.locatorFile = locatorFile;
	    this.searchContext = searchContext;
	}

	
	@Override
	public ElementLocator createLocator(Field field) {
		ElementLocator elementLocator = null;
		elementLocator = new DriverBasedElementLocator(locatorFile, searchContext, field);
		
		return elementLocator;
	}

}
