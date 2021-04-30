package com.orangeHrm.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.orangeHrm.base.TestBase;
import com.ornageHrm.Page.LoginPage;
import com.ornageHrm.Page.RecruitmentPage;

public class RecruitmentPageTest extends TestBase {
	//LoginPage loginPage;
	RecruitmentPage RecruitmentPage;

	@BeforeMethod(alwaysRun = true)
	public void beforeTest() {
		intialisation();
	//	Alert alert = driver.switchTo().alert();
	//	alert.accept();
		RecruitmentPage = new RecruitmentPage();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}

	@Test(alwaysRun = true)
	public void test() {
		RecruitmentPage.enterUserName();
		RecruitmentPage.enterPassword();
		RecruitmentPage.clickLoginButton();
		RecruitmentPage.clickRecruitmentButton();
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/recruitment/viewJobVacancy");
	}

	@AfterMethod(alwaysRun = true)
	public void after() {
		//driver.quit();
		
		}
	}

