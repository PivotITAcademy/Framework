package com.ornageHrm.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHrm.base.TestBase;

public class DashBoardPage extends TestBase {
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement recruitmentButton;
	
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement leaveButton;
	
	public DashBoardPage() {
		waitForDocumentCompleteState(15);
		PageFactory.initElements(driver, this);
		
	}
	
	public RecruitmentPage clickRecruitmentButton() {
		recruitmentButton.click();
		return new RecruitmentPage();
	}
	
	public LeavePage clickLeavePage() {
		leaveButton.click();
		return new LeavePage();
	}
	

}
