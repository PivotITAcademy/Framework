package com.orangeHrm.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHrm.base.TestBase;
import com.ornageHrm.Page.DashBoardPage;
import com.ornageHrm.Page.LoginPage;
import com.ornageHrm.Page.RecruitmentPage;

public class RecruitmentPageTest extends TestBase {
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	RecruitmentPage recruitmentPage;

	@BeforeMethod
	public void beforeMethod() {
		intialisation();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.configureForm();
		recruitmentPage = dashBoardPage.clickRecruitmentButton();
	}

	@Test
	public void test() {
		recruitmentPage.configureAddCandidate();
		Assert.assertEquals(recruitmentPage.checkResultTable().contains("Joyce"), true);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
