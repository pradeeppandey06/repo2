package com.ecomtest.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	public static String BrowserName;
	


	@BeforeSuite
	public void loadProperties()
	{
		try
		{
		prop=new Properties();
		FileInputStream fi=new FileInputStream("I:/YASH_WS/ecomtest/src/main/java/com/ecomtest/qa/config/config.properties");
		prop.load(fi);
		
		 
		}
		catch (Exception e) 
		{e.printStackTrace();
		}
	}
	
	@BeforeMethod
	public static void initialization()
	{
		BrowserName=prop.getProperty("browser");
		if(BrowserName.equals("Chrome"))
		{
			//System.setProperty("Webdriver.chrome.driver", "I:/YASH_WS/ecomtest/drivers/chromedriver.exe");
			
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();

		}
		else if(BrowserName.equals("firefox"))
		{
			System.setProperty("Webdriver.gecko.driver", "I:/YASH_WS/ecomtest/drivers/Firefoxdriver.exe");
			driver=new FirefoxDriver();

		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}
	@AfterMethod
	public static void tearDown()
	{
		
		driver.quit();
	}
	
}
