package com.ornageHrm.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangeHrm.base.TestBase;

public class DialogueBox extends TestBase {

	@FindBy(css = "form#frmCommentSave>textarea#leaveComment")
	WebElement commentInputBox;

	@FindBy(id = "commentSave")
	WebElement commentSaveButton;
	
	public DialogueBox() {
		waitForDocumentCompleteState(15);
		PageFactory.initElements(driver, this);
	}
	
	public void inputComment() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(commentInputBox));
		commentInputBox.click();
		commentInputBox.sendKeys("Please accept");
		
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
