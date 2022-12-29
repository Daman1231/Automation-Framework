package com.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment17.AutomationFramework.Base.TestBase;

public class AccountCreatedPage extends TestBase {

	public AccountCreatedPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content h1")
	WebElement accountCreatedSuccesfull;

	public String accountCreatedSuccessFullPage() {
		return accountCreatedSuccesfull.getText();
	}

}
