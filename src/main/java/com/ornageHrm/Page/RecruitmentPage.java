package com.ornageHrm.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHrm.base.TestBase;

public class RecruitmentPage extends TestBase {
	@FindBy(id = "btnAdd")
	WebElement addButton;

	@FindBy(id = "addCandidate_firstName")
	WebElement candidateFirstNameInputBox;

	@FindBy(id = "addCandidate_middleName")
	WebElement candidateMiddleNameInputBox;

	@FindBy(id = "addCandidate_lastName")
	WebElement candidateLastNameInputBox;

	@FindBy(id = "btnSave")
	WebElement saveButton;

	@FindBy(id = "addCandidate_email")
	WebElement emailIdInputBox;
	
	@FindBy(id="resultTable")
	WebElement resultTable;

	public RecruitmentPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickAddButton() {
		addButton.click();
	}

	public void clickcandidateFirstNameInputBox() {
		candidateFirstNameInputBox.sendKeys("Joyce");
	}

	public void clickcandidateMiddleNameInputBox() {
		candidateMiddleNameInputBox.sendKeys("K");
	}

	public void clickcandidateLastNameInputBox() {
		candidateLastNameInputBox.sendKeys("A");
	}

	public void clickSaveButton() {
		saveButton.click();
	}

	public void clickEmailIdInputBox() {
		emailIdInputBox.sendKeys("jo@gmail.com");
	}
	
	public String getResultTable() {
		String result= resultTable.getText();
		System.out.println(result);
		return result;
	}

	public void configureAddCandidate() {
		clickAddButton();
		clickcandidateFirstNameInputBox();
		clickcandidateMiddleNameInputBox();
		clickcandidateLastNameInputBox();
		clickEmailIdInputBox();
		clickSaveButton();
		getResultTable();

	}
}