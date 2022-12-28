package com.Assignment17.AutomationFrameworkTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Assignment17.AutomationFramework.Base.TestBase;
import com.AutomationFramework.Pages.AccountLoginPage;
import com.AutomationFramework.Pages.AccountLogoutPage;
import com.AutomationFramework.Pages.MyAccountLogoutPage;
import com.AutomationFramework.Pages.MyAccountPage;
import com.AutomationFramework.Pages.YourStoreLoginPage;

public class AccountLogoutTest extends TestBase {

	YourStoreLoginPage loginPage;

	@BeforeMethod
	public void setUp() {
		launchBrowser();
		loginPage = new YourStoreLoginPage();
		loginPage.clickLoginBtn();
	}

	@Test
	public void verifyUserIsAbleToLogoutSuccesfully() {
		MyAccountPage accountPage = new MyAccountPage();
		AccountLoginPage accountLoginPage = loginPage.clickLoginBtn();
		accountPage = accountLoginPage.clickLoginBtn("daman@gmail.com", "Daman1231");
		Assert.assertEquals(accountPage.accountLoginSuccesfullPage(), "My Account", "Login Unsuccesfull...");
		MyAccountLogoutPage accountLogoutPage = new MyAccountLogoutPage();
		accountLogoutPage.clickLogoutLink();
		AccountLogoutPage logoutPage = new AccountLogoutPage();
		String accountLogOutText = logoutPage.accountLogoutText();
		Assert.assertEquals(accountLogOutText, "Account Logout", "Account Logout Unsuccesfull");
		logoutPage.accountLogoutContinueBtn();
	}

	@AfterMethod
	public void tearDown() {
		quitBrowser();
	}
}
