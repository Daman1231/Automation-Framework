package com.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment17.AutomationFramework.Base.TestBase;

public class AccountLogoutPage extends TestBase {
	public AccountLogoutPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content h1")
	WebElement accountLogOut;

	@FindBy(xpath = "//a[text()='Continue']")
	WebElement logoutContinueBtn;

	public String accountLogoutText() {
		return accountLogOut.getText();
	}

	public YourStorePage accountLogoutContinueBtn() {
		logoutContinueBtn.click();
		return new YourStorePage();
	}

}
