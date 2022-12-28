package com.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountSubscribeNewsletterPage extends MyAccountPage {

	public MyAccountSubscribeNewsletterPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content ul.list-unstyled:nth-of-type(4) a")
	WebElement subscribeUnsubscribe;

	public NewsLetterSubscriptionPage subscribeUnsubscribeNewsLetter() {
		subscribeUnsubscribe.click();
		return new NewsLetterSubscriptionPage();
	}

}
