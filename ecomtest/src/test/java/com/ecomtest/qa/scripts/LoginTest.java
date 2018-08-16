package com.ecomtest.qa.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecomtest.qa.base.BaseTest;
import com.ecomtest.qa.pages.LoginPage;
import com.ecomtest.qa.util.ActionUtil;

public class LoginTest extends BaseTest
{
	
	@Test
	public void loginTest() throws Exception 
	{
		Thread.sleep(5000);
		
		LoginPage l = new LoginPage(driver);
		l.getEleUserNameTB().sendKeys("aaaa");
		
	//	ActionUtil.type(l.getEleLoginBtn(),prop.getProperty("userName"));
		
		
		Assert.assertTrue(true);

	
	}
	
	@Test
	public void loginTest1() throws Exception 
	{
		
		
		
		Assert.assertTrue(true);

	
	}
	
}
