package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.LoginPage;
import com.seleniumutil.utility;

public class LoginTestcases extends Library
{
	@BeforeClass
	public void startUp() throws IOException
	{
		launchApplication();
		
	}
	@Test
	public void login() throws IOException
	{
		LoginPage lpage = new LoginPage(driver);
		
		lpage.loginToApp_username("Admin");
		lpage.loginToApp_password("admin123");
		lpage.loginToApp_Loginbtn();
	}
	@AfterClass
	public void close() throws IOException
	{
		utility util = new utility(driver);
		util.takeSnapShot("D:/selenium/OrangeHRMDemoproject/ScreenShot/orangelogin.png");
		//quit();
	}
}