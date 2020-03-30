package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {

	WebDriver driver;
	Logger LOG = Logger.getLogger(AdminPage.class.getName());
	
	By admin = By.id("menu_admin_viewAdminModule");
	By usermanagement = By.id("menu_admin_UserManagement");
	By user = By.id("menu_admin_viewSystemUsers");
	
	By username = By.id("searchSystemUser_userName");
	By roleicon = By.id("searchSystemUser_userType");
	By role = By.xpath("//*[@id=\"searchSystemUser_userType\"]/option[2]");
	By Empname = By.id("searchSystemUser_employeeName_empName");
	By statusicon = By.id("searchSystemUser_status");
	By status = By.xpath("//*[@id=\"searchSystemUser_status\"]/option[2]");
	By searchbtn = By.id("searchBtn");
	
	public AdminPage(WebDriver driver) 
	{
		this.driver =driver;
	}
	
	    //click performance
		public void adminmenu() 
		{
			driver.findElement(admin).click();
			driver.findElement(usermanagement).click();
			driver.findElement(user).click();
			LOG.info("Admin user page is clicked");
			
			driver.findElement(username).sendKeys("Meghana Reddy");
			driver.findElement(roleicon).click();
			driver.findElement(role).click();
			driver.findElement(Empname).sendKeys("Meghana");
			driver.findElement(statusicon).click();
			driver.findElement(status).click();
			driver.findElement(searchbtn).click();
			LOG.info("Admin user detailes entered in fields");
			
		}
	
}
