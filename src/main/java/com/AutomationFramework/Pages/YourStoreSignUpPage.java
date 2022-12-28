package com.AutomationFramework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment17.AutomationFramework.Base.TestBase;

public class YourStoreSignUpPage extends TestBase {
	public YourStoreSignUpPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "li.dropdown span:first-of-type")
	WebElement myAccount;

	@FindBy(xpath = "//a[text()='Register']")
	WebElement register;

	private void clickMyAccount() {
		myAccount.click();
	}

	public RegisterAccountPage clickRegister() {
		clickMyAccount();
		register.click();
		return new RegisterAccountPage();
	}

}
