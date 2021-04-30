package com.ornageHrm.Page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import com.orangeHrm.base.TestBase;

public class RecruitmentPage extends TestBase {

	WebElement usernameInput = driver.findElement(By.cssSelector("#divUsername>input"));
	WebElement passwordInput = driver.findElement(By.cssSelector("#divPassword>input"));
	WebElement loginButton = driver.findElement(By.id("btnLogin"));
	WebElement recruitmentButton = driver.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
	WebElement addButton = driver.findElement(By.cssSelector("input[id='btnAdd'][name='btnAdd']"));
	WebElement candidatefirstNameInputBox = driver.findElement(By.id("addCandidate_firstName"));
	WebElement candidateMiddleNameInputBox = driver.findElement(By.id("addCandidate_middleName"));
	WebElement candidateLastNameInputBox = driver.findElement(By.id("addCandidate_lastName"));
	WebElement candidateEmailInputBox = driver.findElement(By.cssSelector("input[type='text'][id='addCandidate_email']"));
	WebElement candidateContactNoInputBox = driver.findElement(By.cssSelector("input[type='text'][id='addCandidate_contactNo']"));
	WebElement jobVacancySelectDropdownBox = driver.findElement(By.cssSelector("select[class='vacancyDrp'][id='addCandidate_vacancy']"));
	Select select = new Select(driver.findElement(By.cssSelector("select[class='vacancyDrp'][id='addCandidate_vacancy']")));
	WebElement resumeChooseButton = driver.findElement(By.cssSelector("input[type='file'][id='addCandidate_resume']"));
	WebElement keyWordsInputBox = driver.findElement(By.cssSelector("input[type='text'][id='addCandidate_keyWords']"));
	WebElement commentsInputBox = driver.findElement(By.cssSelector("textarea[class='formInputText'][id='addCandidate_comment']"));
	WebElement dateOfApplication = driver.findElement(By.cssSelector("input[id='addCandidate_appliedDate']"));
	String dateValue="2021-04-03";
	WebElement consentToKeepDataCheckBox = driver.findElement(By.cssSelector("input[type='checkbox'][id='addCandidate_consentToKeepData'"));
	WebElement saveButton = driver.findElement(By.id("btnSave"));
	WebElement candidatesButton=driver.findElement(By.id("menu_recruitment_viewCandidates"));
	WebElement candidateNameButton=driver.findElement(By.cssSelector("input[id='candidateSearch_candidateName']"));
	WebElement searchButton=driver.findElement(By.cssSelector("input[id='btnSrch']"));
	
	public void enterUserName() {
		usernameInput.sendKeys("Admin");
	}

	public void enterPassword() {
		passwordInput.sendKeys("admin123");
	}

	public void clickLoginButton() {
		loginButton.click();
	}

	public void configureLoginForm() {
		enterUserName();
		enterPassword();
		clickLoginButton();
	}

	public void clickRecruitmentButton() {
				recruitmentButton.click();
	}

	public void clickAddButon() {
		addButton.click();
	}

	public void clickCandidateFirstNameInputBox() {
		candidatefirstNameInputBox.sendKeys("Joyce");
	}

	public void clickCandidateMiddleNameInputBox() {
		candidateMiddleNameInputBox.sendKeys("K");
	}

	public void clickCandidateLastNameInputBox() {
		candidateLastNameInputBox.sendKeys("Aliyas");
	}

	public void clickCandidateEmailNameInputBox() {
		candidateEmailInputBox.sendKeys("joycetesting0@gmail.com");
	}

	public void clickcandidateContactNoInputBox() {
		candidateContactNoInputBox.sendKeys("9497363508");
	}

	public void clickJobVacancyDropdownBox() {
		jobVacancySelectDropdownBox.click();
		select.selectByValue("6");
	}

	public void clickResumeChooseButton() {
		resumeChooseButton.sendKeys("C:\\Users\\Administrator\\Documents\\New TestPageUploadAutomationPractice.docx");
	}

	private void clickKeyWordsInputBox() {
		keyWordsInputBox.sendKeys("Resume for QA LEAD");
	}

	private void clickCommentsInputBox() {
		commentsInputBox.sendKeys(" Please see the resume");
	}
	
	
	public  void selectDate(WebDriver driver, WebElement dateOfApplication, String dateValue) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" + dateValue + "');", dateOfApplication);
	}
				
	public void clickConsentToKeepDataCheckBox() {
		consentToKeepDataCheckBox.click();
	}
	public void clickSaveButton() {
		saveButton.click();
	}
	public void clickCandidatesButton() {
		candidatesButton.click();
	}
	public void clickCandidateNameButton() {
		candidateNameButton.sendKeys("Joyce K Aliyas");
		select.selectByVisibleText("Joyce K Aliyas");
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
	public void allMethods() {
		configureLoginForm();
		clickRecruitmentButton();
		clickAddButon();
		clickCandidateFirstNameInputBox();
		clickCandidateMiddleNameInputBox();
		clickCandidateLastNameInputBox();
		clickCandidateEmailNameInputBox();
		clickcandidateContactNoInputBox();
		clickJobVacancyDropdownBox();
		clickResumeChooseButton();
		clickKeyWordsInputBox();
		clickCommentsInputBox();
		selectDate( driver,  dateOfApplication,  dateValue);
		clickConsentToKeepDataCheckBox();
		clickSaveButton();
		clickCandidatesButton();
		clickCandidateNameButton();
		clickSearchButton();
		
	}
}
