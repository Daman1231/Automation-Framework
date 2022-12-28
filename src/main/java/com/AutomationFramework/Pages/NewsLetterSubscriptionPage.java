package com.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment17.AutomationFramework.Base.TestBase;

public class NewsLetterSubscriptionPage extends TestBase {
	public NewsLetterSubscriptionPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "label.radio-inline:first-of-type input")
	WebElement yesRadioButton;

	@FindBy(css = "input.btn")
	WebElement clickContinue;

	public void newsletterSubscription() {
		yesRadioButton.click();
	}

	public MyAccountNewLetterSubscriptionSuccessfullPage clickContinueBtn() {
		newsletterSubscription();
		clickContinue.click();
		return new MyAccountNewLetterSubscriptionSuccessfullPage();
	}
}
