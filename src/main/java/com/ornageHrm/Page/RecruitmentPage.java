package com.ornageHrm.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

	@FindBy(css = "input[type='text'][id='addCandidate_contactNo']")
	WebElement contactNoInputBox;
	
	@FindBy(css ="select[name='addCandidate[vacancy]'][id='addCandidate_vacancy']")
	WebElement JobVacancyDropDown;

	

	@FindBy(css = "input[type='file'][id='addCandidate_resume']")
	WebElement resumeUpload;

	@FindBy(css = "input[type='text'][id='addCandidate_keyWords']")
	WebElement keywordsInputBox;

	@FindBy(xpath  = "//textarea[@name='addCandidate[comment]']")
	WebElement commentsInputBox;

	@FindBy(id = "resultTable")
	WebElement resultTable; 

	public RecruitmentPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickAddButton() {
		addButton.click();
	}

	public void clickCandidateFirstNameInputBox() {
		candidateFirstNameInputBox.sendKeys("Joyce");
	}

	public void clickCandidateMiddleNameInputBox() {
		candidateMiddleNameInputBox.sendKeys("K");
	}

	public void clickCandidateLastNameInputBox() {
		candidateLastNameInputBox.sendKeys("A");
	}

	public void clickEmailIdInputBox() {
		emailIdInputBox.sendKeys("jo@gmail.com");
	}

	public void clickContactNoInputBox() {
		contactNoInputBox.sendKeys("9496532110");
	}

	public void selectJobVacancy() {
		Select select = new Select(JobVacancyDropDown);
		select.selectByVisibleText("Senior QA Lead");
	}

	public void clickResumeUpload() {
		resumeUpload.sendKeys("C:\\Users\\Administrator\\Documents\\New TestPageUploadAutomationPractice.docx");
	}

	public void clickKeywordsInputBox() {
		keywordsInputBox.sendKeys("Senior QA");
	}

	public void clickCommentsInputBox() {
		commentsInputBox.sendKeys("Thank You");
	}

	public void clickSaveButton() {
		saveButton.click();
	}

	public String getResultTable() {
		String result = resultTable.getText();
		System.out.println(result);
		return result;
	}

	public void configureAddCandidate() {
		clickAddButton();
		clickCandidateFirstNameInputBox();
		clickCandidateMiddleNameInputBox();
		clickCandidateLastNameInputBox();
		clickEmailIdInputBox();
		clickContactNoInputBox();
		selectJobVacancy();
		clickResumeUpload();
		clickKeywordsInputBox();
		clickCommentsInputBox();
		clickSaveButton();
		//getResultTable();

	}
}