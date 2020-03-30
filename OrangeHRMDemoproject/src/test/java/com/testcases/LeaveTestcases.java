package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.LeavePage;
import com.pages.LoginPage;
import com.seleniumutil.utility;

public class LeaveTestcases extends Library
{
	LeaveTestcases  loginpage;
	
	@BeforeClass
	public void starting() throws IOException 
	{
		launchApplication();
	}
	
	@Test
	public void leave() throws IOException 
	{
        LoginPage lpage = new LoginPage(driver);
		
		lpage.loginToApp_username("Admin");
		lpage.loginToApp_password("admin123");
		lpage.loginToApp_Loginbtn();
		
		loginpage = new LeaveTestcases (); 
		loginpage.login();
		LeavePage leavemenu = new LeavePage(driver);
		leavemenu.leavemenu();
	}

	private void login() {
		// TODO Auto-generated method stub
		
	}

	@AfterClass
	  public void quit() 
	{
		 utility util = new utility(driver);
		 util.takeSnapShot("D://selenium//OrangeHRMDemoproject//ScreenShot//orangeleave.png");
			//quit();
	}
}
