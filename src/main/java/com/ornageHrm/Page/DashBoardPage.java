package com.ornageHrm.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHrm.base.TestBase;

public class DashBoardPage extends TestBase {

	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#menu_directory_viewDirectory b")
	WebElement directory;

	public ViewDirectoryPage clickdirectoryPageButton() {
		directory.click();
		return new ViewDirectoryPage();
	}
}
