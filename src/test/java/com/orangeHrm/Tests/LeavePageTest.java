package com.orangeHrm.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHrm.base.TestBase;
import com.ornageHrm.Page.DashBoardPage;
import com.ornageHrm.Page.DialogueBox;
import com.ornageHrm.Page.LeavePage;
import com.ornageHrm.Page.LoginPage;

public class LeavePageTest extends TestBase {

	LeavePage leavePage;
	DashBoardPage dashBoardPage;
	LoginPage loginPage;

	@BeforeMethod
	public void beforeMethod() {
		intialisation();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.configureForm();
		leavePage = dashBoardPage.clickLeavePage();
	}

	@Test
	public void search() {
		leavePage.searchUsingDate();
		Assert.assertEquals(leavePage.isBoxVisible(), true);
	}

	@Test
	public void commentSubmissionFirstImage() {
		leavePage.searchUsingDate();
		leavePage.navigateToDialogueBox();
		DialogueBox dialogueBox = new DialogueBox();
		dialogueBox.submitComments();
		Assert.assertEquals(leavePage.displayComment(), "Thank You");
	}

	@Test
	public void selectAction() {
		leavePage.searchUsingDate();
		leavePage.selectAction();
		Assert.assertEquals(leavePage.displayAction(), true);
	}

	@AfterMethod
	public void quitDriver() {
		driver.quit();
	}

}
