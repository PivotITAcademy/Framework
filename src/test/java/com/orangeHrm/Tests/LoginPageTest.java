package com.orangeHrm.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHrm.base.TestBase;
import com.ornageHrm.Page.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;

	@BeforeMethod
	public void beforeTest() {
		intialisation();
		loginPage= new LoginPage();
	}

	@Test
	public void signInTest() {

		loginPage.configureLoginForm();
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}

	@AfterMethod
	public void afterTest() {

		driver.quit();
	}

}
