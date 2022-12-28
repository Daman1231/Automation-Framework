package com.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment17.AutomationFramework.Base.TestBase;

public class YourStoreLoginPage extends TestBase {
	public YourStoreLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "li.dropdown span:first-of-type")
	WebElement myAccount;

	@FindBy(xpath = "//a[text()='Login']")
	WebElement login;

	public void clickMyAccount() {
		myAccount.click();
	}

	public AccountLoginPage clickLoginBtn() {
		myAccount.click();
		login.click();
		return new AccountLoginPage();
	}

}
