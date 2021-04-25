package com.ornageHrm.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.orangeHrm.base.TestBase;

public class LoginPage extends TestBase {

	WebElement usernameInput = driver.findElement(By.cssSelector("#divUsername>input"));
	WebElement passwordInput = driver.findElement(By.cssSelector("#divPassword>input"));
	WebElement loginButton = driver.findElement(By.id("btnLogin"));

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

}
