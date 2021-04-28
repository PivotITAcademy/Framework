package com.orangeHrm.Tests;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.orangeHrm.base.TestBase;
import com.ornageHrm.Page.LoginPage;
import com.ornageHrm.Page.RecruitmentPage;

public class RecruitmentPageTest extends TestBase {
	LoginPage loginPage;
	RecruitmentPage RecruitmentPage;

	@BeforeMethod
	public void beforeTest() {
		intialisation();
		loginPage= new LoginPage();
		RecruitmentPage = new RecruitmentPage();
		//RecruitmentPage.configureLoginForm();
		loginPage.clickLoginButton();
	}

	@Test
	public void test() {
		RecruitmentPage.clickRecruitmentButton();
		//Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/recruitment/viewJobVacancy");
	}

	@AfterMethod
	public void after() {
		driver.quit();
		//@AfterMethod
		//public void afterTest(ITestResult result) {
		   // Throwable t = result.getThrowable();
		    // with the object of t you can get the stacktrace and log it into your reporter
		}
	}

