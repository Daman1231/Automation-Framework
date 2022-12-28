package com.Assignment17.AutomationFrameworkTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Assignment17.AutomationFramework.Base.TestBase;
import com.AutomationFramework.Pages.AccountLoginPage;
import com.AutomationFramework.Pages.MyAccountPage;
import com.AutomationFramework.Pages.YourStoreLoginPage;

public class LoginAccountTest extends TestBase {

	YourStoreLoginPage loginPage;

	@BeforeMethod
	public void setUp() {
		launchBrowser();
		loginPage = new YourStoreLoginPage();
		loginPage.clickLoginBtn();
	}

	@Test
	public void verifyUserIsAbleToLoginSuccesfully() {
		MyAccountPage accountPage = new MyAccountPage();
		AccountLoginPage accountLoginPage = loginPage.clickLoginBtn();
		accountPage = accountLoginPage.clickLoginBtn("daman@gmail.com", "Daman1231");
		Assert.assertEquals(accountPage.accountLoginSuccesfullPage(), "My Account", "Login Unsuccesfull...");
	}

	@AfterMethod
	public void tearDown() {
		quitBrowser();
	}
}
