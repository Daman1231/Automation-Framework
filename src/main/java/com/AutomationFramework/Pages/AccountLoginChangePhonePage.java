package com.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment17.AutomationFramework.Base.TestBase;

public class AccountLoginChangePhonePage extends TestBase {

	public AccountLoginChangePhonePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#input-email")
	WebElement EmailId;

	@FindBy(css = "#input-password")
	WebElement password;

	@FindBy(css = "input.btn")
	WebElement loginBtn;

	public void inputEmail(String email) {
		EmailId.sendKeys(email);
	}

	public void inputPassword(String pass) {
		password.sendKeys(pass);
	}

	public MyAccountPage clickLoginBtn(String email, String password) {
		inputEmail(email);
		inputPassword(password);
		loginBtn.click();
		return new MyAccountChangeEditAccountInfoPage();
	}

}
