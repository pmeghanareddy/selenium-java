package com.pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage 
{
	Logger LOG = Logger.getLogger(LoginPage.class.getName());
	
	WebDriver driver;
	
	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By login = By.id("btnLogin");
	
	public LoginPage(WebDriver driver) throws IOException
	{
		   this.driver = driver;
		}
		public void loginToApp_username(String userid)
		{
			driver.findElement(username).sendKeys(userid);	
			LOG.info("entered Name in the username field");
		}
		public void loginToApp_password(String pass)
		{
			driver.findElement(password).sendKeys(pass);
			LOG.info("entered password in the password field");
		}
		
		//Explicit wait
		public void loginToApp_Loginbtn()
		{
			//WebDriverWait wait = new WebDriverWait(driver,20);
			//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(login)));
			
			driver.findElement(login).click();
			LOG.info("clicked login button");
		}
	}
