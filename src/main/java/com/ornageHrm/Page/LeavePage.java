package com.ornageHrm.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orangeHrm.base.TestBase;

public class LeavePage extends TestBase {
	
	//LoginPage loginPage;
	//DashBoardPage dashBoardPage;
	
	@FindBy(id="calFromDate")
	WebElement clickFromDate;
	
	@FindBy(id="calToDate")
	WebElement clickTodate;
	
	@FindBy(css="#ui-datepicker-div tr td:nth-of-type(6) a:nth-child(1)")
	WebElement firstDate;
	
	@FindBy(css="#ui-datepicker-div tr:nth-of-type(6) td a")
	WebElement lastDate;
	
	@FindBy(id="leaveList_chkSearchFilter_checkboxgroup_allcheck")
	WebElement checkBoxAll;
	
	@FindBy(id="btnSearch")
	WebElement searchButton;
	
	@FindBy(css="select[class='ui-datepicker-month']")
	WebElement selectWebElement;
	
	
	public LeavePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickFromDate() {
		clickFromDate.click();	
	}
	
	public void clickToDate() {
		clickTodate.click();
	}
	
	public void clickSelectFromDate() {
		firstDate.click();
	}
	
	public void clickLastDate() {
		lastDate.click();
	}
	
	public void selectCheckBox() {
		checkBoxAll.click();
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
	
	public void selectAprilMonth() {
		Select sel=new Select(selectWebElement);
		sel.selectByIndex(3);
	}
	
	public void searchUsingDate() {
		clickFromDate();
		selectAprilMonth();
		clickSelectFromDate();
		clickToDate();
		clickLastDate();
		selectCheckBox();
		clickSearchButton();
	}

}
