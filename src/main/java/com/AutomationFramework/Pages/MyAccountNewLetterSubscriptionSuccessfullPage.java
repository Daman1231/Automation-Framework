package com.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment17.AutomationFramework.Base.TestBase;

public class MyAccountNewLetterSubscriptionSuccessfullPage extends TestBase {
	public MyAccountNewLetterSubscriptionSuccessfullPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div.alert-success")
	WebElement subscriptionAlertSuccess;

	public String successAlertMessage() {
		return subscriptionAlertSuccess.getText();
	}

}
