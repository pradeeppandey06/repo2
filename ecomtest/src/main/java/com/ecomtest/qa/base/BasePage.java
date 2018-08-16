package com.ecomtest.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	
	
	public BasePage(WebDriver driver)
	{
PageFactory.initElements(driver, this);		
		
	}
}
