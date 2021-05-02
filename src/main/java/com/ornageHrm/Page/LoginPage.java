package com.ornageHrm.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHrm.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(css = "#divUsername>input")
	WebElement usernameInput;
	
	@FindBy(css = "#divPassword>input")
	WebElement passwordInput;
	
	@FindBy(id="btnLogin")
	WebElement loginButton;
	
	public LoginPage() {
		waitForDocumentCompleteState(15);
		PageFactory.initElements(driver, this);
	}
	

	public void enterUserName() {
		usernameInput.sendKeys(prop.getProperty("username"));

	}

	public void enterPassword() {
		passwordInput.sendKeys(prop.getProperty("password"));
	}

	public DashBoardPage clickLoginButton() {
		loginButton.click();
		return new DashBoardPage();
	}
	
	public DashBoardPage configureForm() {
		enterUserName();
		enterPassword();
		return clickLoginButton();
		
	}

}
