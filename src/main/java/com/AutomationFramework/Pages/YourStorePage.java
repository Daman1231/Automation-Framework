package com.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment17.AutomationFramework.Base.TestBase;

public class YourStorePage extends TestBase {
	public YourStorePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "li.dropdown span:first-of-type")
	WebElement myAccount;

	@FindBy(xpath = "//a[text()='Login']")
	WebElement login;

	@FindBy(xpath = "//a[text()='Register']")
	WebElement register;

	public void clickMyAccount() {
		myAccount.click();

	}

	private void clickLogin() {
		login.click();
	}

	private void clickRegister() {
		register.click();
	}

	public AccountLoginPage clickLoginBtn() {
		clickMyAccount();
		clickLogin();
		return new AccountLoginPage();
	}

	public RegisterAccountPage clickRegisterBtn() {
		clickMyAccount();
		clickRegister();
		return new RegisterAccountPage();
	}

}
