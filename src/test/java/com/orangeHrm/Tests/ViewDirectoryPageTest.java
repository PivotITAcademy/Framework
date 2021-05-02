package com.orangeHrm.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHrm.base.TestBase;
import com.ornageHrm.Page.DashBoardPage;
import com.ornageHrm.Page.LoginPage;
import com.ornageHrm.Page.ViewDirectoryPage;

public class ViewDirectoryPageTest extends TestBase {
	ViewDirectoryPage directoryPage;
	DashBoardPage dashboardpage;
	LoginPage loginpage;

	@BeforeMethod
	public void before() {
		intialisation();
		loginpage = new LoginPage();
		dashboardpage = new DashBoardPage();
		loginpage.configureLoginForm();
		directoryPage = dashboardpage.clickdirectoryPageButton();

	}

	@Test
	public void directoryPage() {

		 boolean flag= directoryPage.isEmployeeCanadian();

		Assert.assertEquals(flag, true);
		}

	@AfterMethod
	public void afterTest() {
		driver.quit();
	}
}
