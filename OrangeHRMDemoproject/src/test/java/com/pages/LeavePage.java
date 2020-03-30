package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavePage {

	WebDriver driver;
	Logger LOG = Logger.getLogger(LeavePage.class.getName());
	By leave = By.xpath("//*[@id='menu_leave_viewLeaveModule']");
	By reports = By.xpath("//*[@id='menu_leave_Reports']");
	By LEUR = By.xpath("//*[@id='menu_leave_viewLeaveBalanceReport']");
	
	By leavetype = By.id("leave_balance_report_type");
	By employee = By.xpath("//*[@id=\"leave_balance_report_type\"]/option[3]");
	
	public LeavePage(WebDriver driver) 
	{
		this.driver =driver;
	}
	
	//click performance
		public void leavemenu() {
			driver.findElement(leave).click();
			driver.findElement(reports).click();
			driver.findElement(LEUR).click();
			LOG.info("Leave Entitlements and Usage Report is clicked");
			
			driver.findElement(leavetype).click();
			driver.findElement(employee).click();
			LOG.info("Leave Entitlements and employee type is clicked");
			
		}
	
}