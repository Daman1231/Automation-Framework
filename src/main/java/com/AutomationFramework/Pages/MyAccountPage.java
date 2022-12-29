package com.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment17.AutomationFramework.Base.TestBase;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content h2:first-of-type")
	WebElement myAccountSuccessfull;

	@FindBy(css = "#content ul.list-unstyled:nth-of-type(4) a")
	WebElement subscribeUnsubscribe;

	@FindBy(xpath = "//a[text()='Edit your account information']")
	WebElement editAccountInfo;

	@FindBy(css = "div.alert-success")
	WebElement subscriptionAlertSuccess;

	@FindBy(css = "div.list-group a:last-of-type")
	WebElement logOutLink;

	public String accountLoginSuccesfullPage() {
		return myAccountSuccessfull.getText();
	}

	public NewsLetterSubscriptionPage subscribeUnsubscribeNewsLetter() {
		subscribeUnsubscribe.click();
		return new NewsLetterSubscriptionPage();
	}

	public MyAccountInformationPage clickEditAccountInfo() {
		editAccountInfo.click();
		return new MyAccountInformationPage();
	}

	public String successAlertMessage() {
		return subscriptionAlertSuccess.getText();
	}

	public AccountLogoutPage clickLogoutLink() {
		logOutLink.click();
		return new AccountLogoutPage();
	}
}
