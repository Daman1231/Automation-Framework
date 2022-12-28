package com.Assignment17.AutomationFrameworkTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Assignment17.AutomationFramework.Base.TestBase;
import com.AutomationFramework.Pages.AccountLoginPage;
import com.AutomationFramework.Pages.MyAccountNewLetterSubscriptionSuccessfullPage;
import com.AutomationFramework.Pages.MyAccountPage;
import com.AutomationFramework.Pages.MyAccountSubscribeNewsletterPage;
import com.AutomationFramework.Pages.NewsLetterSubscriptionPage;
import com.AutomationFramework.Pages.YourStoreLoginPage;

public class SubscribeUnsubscribeTest extends TestBase {

	YourStoreLoginPage loginPage;

	@BeforeMethod
	public void setUp() {
		launchBrowser();
		loginPage = new YourStoreLoginPage();
		loginPage.clickLoginBtn();
	}

	@Test
	public void verifyUserIsAbleToSubscribeUnsubscribeNewsLetter() {
		MyAccountPage accountPage = new MyAccountPage();
		AccountLoginPage accountLoginPage = loginPage.clickLoginBtn();
		accountPage = accountLoginPage.clickLoginBtn("daman@gmail.com", "Daman1231");
		Assert.assertEquals(accountPage.accountLoginSuccesfullPage(), "My Account", "Login Unsuccesfull...");
		MyAccountSubscribeNewsletterPage accountSubscribeNewsletterPage = new MyAccountSubscribeNewsletterPage();
		accountSubscribeNewsletterPage.subscribeUnsubscribeNewsLetter();
		NewsLetterSubscriptionPage letterSubscription = new NewsLetterSubscriptionPage();
		letterSubscription.clickContinueBtn();
		MyAccountNewLetterSubscriptionSuccessfullPage letterSubscriptionSuccessfullPage = new MyAccountNewLetterSubscriptionSuccessfullPage();
		String alertSuccess = letterSubscriptionSuccessfullPage.successAlertMessage();
		Assert.assertEquals(alertSuccess, "Success: Your newsletter subscription has been successfully updated!",
				"NewsLetter Subscription Unsuccesfull...");

	}

	@AfterMethod
	public void tearDown() {
		quitBrowser();
	}

}
