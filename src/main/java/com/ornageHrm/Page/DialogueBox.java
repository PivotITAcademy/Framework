package com.ornageHrm.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHrm.base.TestBase;

public class DialogueBox extends TestBase {

	@FindBy(xpath = "//div[@id='commentDialog']// textarea[@id='leaveComment']")
	WebElement commentInputBox;

	@FindBy(id = "commentSave")
	WebElement commentSaveButton;
	
	public DialogueBox() {
		waitForDocumentCompleteState(15);
		PageFactory.initElements(driver, this);
	}
	
	public void inputComment() {
		commentInputBox.click();
		commentInputBox.sendKeys("Thank You");
	}
	
	public LeavePage saveComment() {
		commentSaveButton.click();
		return new LeavePage();
	}
	
	public LeavePage submitComments() {
		inputComment();
		return saveComment();
	}

}
