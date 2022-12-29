package com.Assignment17.AutomationFrameworkTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Assignment17.AutomationFramework.Base.TestBase;
import com.AutomationFramework.Pages.AccountLoginPage;
import com.AutomationFramework.Pages.MyAccountInformationPage;
import com.AutomationFramework.Pages.MyAccountPage;
import com.AutomationFramework.Pages.NewsLetterSubscriptionPage;
import com.AutomationFramework.Pages.YourStorePage;

public class MyAccountTest extends TestBase {

	YourStorePage yourStoreloginPage;
	AccountLoginPage accountLoginPage;
	MyAccountPage myAccountPage;

	@BeforeMethod
	public void setUp() {
		launchBrowser();
		yourStoreloginPage = new YourStorePage();
		accountLoginPage = yourStoreloginPage.clickLoginBtn();
		myAccountPage = accountLoginPage.clickLoginBtn("daman@gmail.com", "Daman1231");
	}

	@Test
	public void verifyUserIsAbleToLoginWithValidUsernamePassword() {
		Assert.assertEquals(myAccountPage.accountLoginSuccesfullPage(), "My Account", "Login Unsuccesfull...");
	}

	@Test
	public void verifyUserIsAbleToChangePhoneNumberOnceLoggedIn() {
		MyAccountInformationPage myAccountInfo = myAccountPage.clickEditAccountInfo();
		myAccountPage = myAccountInfo.clickContinueBtn("6474020547");
		Assert.assertEquals(myAccountPage.successAlertMessage(), "Success: Your account has been successfully updated.",
				"Phone Number change unsuccesfull...");
	}

	@Test
	public void verifyUserIsAbleToSubscribeUnsubscribeToNewsLetter() {
		NewsLetterSubscriptionPage newsletterSubscription = myAccountPage.subscribeUnsubscribeNewsLetter();
		myAccountPage = newsletterSubscription.clickContinueBtn();
		String alertSuccess = myAccountPage.successAlertMessage();
		Assert.assertEquals(alertSuccess, "Success: Your newsletter subscription has been successfully updated!",
				"NewsLetter Subscription Unsuccesfull...");
	}

	@AfterMethod
	public void tearDown() {
		quitBrowser();
	}
}
