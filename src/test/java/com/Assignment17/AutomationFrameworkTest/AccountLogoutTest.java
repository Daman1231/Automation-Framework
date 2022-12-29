package com.Assignment17.AutomationFrameworkTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Assignment17.AutomationFramework.Base.TestBase;
import com.AutomationFramework.Pages.AccountLoginPage;
import com.AutomationFramework.Pages.AccountLogoutPage;
import com.AutomationFramework.Pages.MyAccountPage;
import com.AutomationFramework.Pages.YourStorePage;

public class AccountLogoutTest extends TestBase {



	YourStorePage loginPage;
	AccountLoginPage accountLogin;
	MyAccountPage myAccount;

	@BeforeMethod
	public void setUp() {
		launchBrowser();
		loginPage = new YourStorePage();
		accountLogin = loginPage.clickLoginBtn();
		myAccount = accountLogin.clickLoginBtn("daman@gmail.com", "Daman1231");
	}
	

	@Test
	public void verifyUserIsAbleToLogoutSuccesfully() {
		
		AccountLogoutPage logoutPage =myAccount.clickLogoutLink();
		String accountLogOutText = logoutPage.accountLogoutText();
		Assert.assertEquals(accountLogOutText, "Account Logout", "Account Logout Unsuccesfull");
		logoutPage.accountLogoutContinueBtn();
	}

	@AfterMethod
	public void tearDown() {
		quitBrowser();
	}
}
