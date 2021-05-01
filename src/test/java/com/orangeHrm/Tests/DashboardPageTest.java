package com.orangeHrm.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHrm.base.TestBase;
import com.ornageHrm.Page.DashBoardPage;
import com.ornageHrm.Page.LoginPage;

public class DashboardPageTest extends TestBase {
	
	DashBoardPage dashBoardPage;
	LoginPage loginPage;
	
	@BeforeMethod
	public void beforeMethod() {
		intialisation();
		loginPage=new LoginPage();
		loginPage.enterUserName();
		loginPage.enterPassword();
		dashBoardPage=loginPage.clickLoginButton();	
	}
	
	@Test
	public void verifyPageUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
	
	
	@AfterMethod
	public void quit() {	
		driver.quit();
	}

}
