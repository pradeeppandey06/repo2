package com.ecomtest.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecomtest.qa.base.BasePage;

public class LoginPage extends BasePage
{
	
@FindBy(xpath="//input[@name='username']")
private WebElement userNameTB;
public WebElement getEleUserNameTB()
{
	return userNameTB;
}

@FindBy(name="password")
private WebElement PasswordTB;
public WebElement getElePasswordTB()
{
	return PasswordTB;
}

@FindBy(xpath="//input[@type='submit']")
private WebElement loginBTN;

public WebElement getEleLoginBtn()
{
	return loginBTN;
}


public LoginPage(WebDriver driver) 
{
	super(driver);

}


}
