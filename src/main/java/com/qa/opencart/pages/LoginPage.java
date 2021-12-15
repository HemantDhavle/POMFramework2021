package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
	}
	private By email= By.xpath("//input[@name ='email']");
	
	public void doLogin(String un)
	{
		driver.findElement(email).sendKeys(un);
	}

}
