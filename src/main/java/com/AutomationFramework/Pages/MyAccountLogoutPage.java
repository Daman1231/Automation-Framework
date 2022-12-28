package com.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment17.AutomationFramework.Base.TestBase;

public class MyAccountLogoutPage extends TestBase {

	public MyAccountLogoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "div.list-group a:last-of-type")
	WebElement logOutLink;
	
	public MyAccountLogoutPage clickLogoutLink() {
		logOutLink.click();
		return new MyAccountLogoutPage();
	}
}
