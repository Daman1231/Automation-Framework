package com.Assignment17.AutomationFrameworkTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Assignment17.AutomationFramework.Base.TestBase;
import com.AutomationFramework.Pages.AccountCreatedPage;
import com.AutomationFramework.Pages.RegisterAccountPage;
import com.AutomationFramework.Pages.YourStoreSignUpPage;

public class RegisterAccountTest extends TestBase {

	YourStoreSignUpPage page;

	@BeforeMethod
	public void setup() {
		launchBrowser();

		page = new YourStoreSignUpPage();
		page.clickRegister();
	}

	@Test
	public void verifyUserIsAbleToRegisterIntoWebsite() {
		
		RegisterAccountPage registerAccountPage = new RegisterAccountPage();
		AccountCreatedPage accountCreated = registerAccountPage.signUpAccount("Daman", "Singh", "daman@gmail.com",
				"6474020546", "Daman1231", "Daman1231");
		Assert.assertEquals(accountCreated.accountCreatedSuccessFullPage(), "Your Account Has Been Created!",
				"Account not Created...");

	}

	@AfterMethod
	public void tearDown() {
		quitBrowser();
	}

}
