package com.ecomtest.qa.util;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class ActionUtil  
{
	public static boolean click(WebElement element) throws Exception {
	try {
	if (element != null) {
	element.click();
	return true;
	}
	
	} catch (Exception e) {
}
	return false;
}
	
	public static boolean type(WebElement element, String keys)  {
		try {
		if (element != null) {
		element.sendKeys(keys);
		Reporter.log("Entered text "+keys+"on element"+element,true);
		return true;
		}
		
		} catch (Exception e) {
			Reporter.log("error entering  "+keys+"on element"+element,true);

	}
		return false;
	}
}