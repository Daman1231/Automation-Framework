package com.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment17.AutomationFramework.Base.TestBase;

public class MyAccountPhoneNumberChangeSuccesfullPage extends TestBase {
	
	public MyAccountPhoneNumberChangeSuccesfullPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div.alert-success")
	WebElement sucessText;

	public String phoneNumberChangeSuccesText() {
		return sucessText.getText();
	}
}
