package com.ornageHrm.Page;

import java.util.List;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orangeHrm.base.TestBase;

public class ViewDirectoryPage extends TestBase {

	public ViewDirectoryPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "#search_form li:nth-child(3) select")
	WebElement Location;

	@FindBy(id = "searchBtn")
	WebElement search;

	@FindBy(css = "table#resultTable ul li:nth-child(4)")
	List<WebElement> employeeList;

	public void selectCountry() {

		Select country = new Select(Location);
		country.selectByVisibleText("  Canada");
	}

	public void clickSearchButton() {

		search.click();
	}

	public boolean isEmployeeCanadian() {

		selectCountry();
		clickSearchButton();
		for (WebElement employeeData : employeeList) {

			return employeeData.getText().contains("Canadian");

		}
		return false;
	}

}
