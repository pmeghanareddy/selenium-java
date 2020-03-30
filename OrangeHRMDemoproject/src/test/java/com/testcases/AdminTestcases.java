package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.AdminPage;
import com.pages.LoginPage;
import com.seleniumutil.utility;

public class AdminTestcases extends Library
{
	AdminTestcases  loginpage;
	
	@BeforeClass
	public void starting() throws IOException 
	{
		launchApplication();
	}
	
	@Test
	public void admin() throws IOException 
	{
        LoginPage lpage = new LoginPage(driver);
		
		lpage.loginToApp_username("Admin");
		lpage.loginToApp_password("admin123");
		lpage.loginToApp_Loginbtn();
		
		loginpage = new AdminTestcases (); 
		loginpage.login();
		AdminPage adminmenu = new AdminPage(driver);
		adminmenu.adminmenu();	
	}

	private void login() 
	{
		// TODO Auto-generated method stub
		
	}

	@AfterClass
	  public void quit() 
	{
		 utility util = new utility(driver);
		 util.takeSnapShot("D:/selenium/OrangeHRMDemoproject/ScreenShot/orangeadmin.png");
			//quit();
	}
}