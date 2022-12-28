package com.Assignment17.AutomationFrameworkTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Assignment17.AutomationFramework.Base.TestBase;
import com.AutomationFramework.Pages.AccountLoginPage;
import com.AutomationFramework.Pages.MyAccountChangeEditAccountInfoPage;
import com.AutomationFramework.Pages.MyAccountInformationPage;
import com.AutomationFramework.Pages.MyAccountPage;
import com.AutomationFramework.Pages.MyAccountPhoneNumberChangeSuccesfullPage;
import com.AutomationFramework.Pages.YourStoreLoginPage;

public class ChangePhoneNumberTest extends TestBase {

	YourStoreLoginPage loginPage;

	@BeforeMethod
	public void setUp() {
		launchBrowser();
		loginPage = new YourStoreLoginPage();
		loginPage.clickLoginBtn();
	}

	@Test
	public void verifyUserIsAbleToChangePhoneNumber() {
		MyAccountPage accountPage = new MyAccountPage();
		AccountLoginPage accountLoginPage = loginPage.clickLoginBtn();
		accountPage = accountLoginPage.clickLoginBtn("daman@gmail.com", "Daman1231");
		Assert.assertEquals(accountPage.accountLoginSuccesfullPage(), "My Account", "Login Unsuccesfull...");
		MyAccountChangeEditAccountInfoPage accountChangeEditAccountInfoPage = new MyAccountChangeEditAccountInfoPage();
		accountChangeEditAccountInfoPage.clickEditAccountInfo();
		MyAccountInformationPage accountInformationPage = new MyAccountInformationPage();
		accountInformationPage.clickContinueBtn("6474020544");
		MyAccountPhoneNumberChangeSuccesfullPage accountPhoneNumberChangeSuccesfullPage = new MyAccountPhoneNumberChangeSuccesfullPage();
		String changePhoneNumberSuccesfull = accountPhoneNumberChangeSuccesfullPage.phoneNumberChangeSuccesText();
		Assert.assertEquals(changePhoneNumberSuccesfull, "Success: Your account has been successfully updated.",
				"Phone Number Change Unsuccesfull...");

	}

	@AfterMethod
	public void tearDown() {
		quitBrowser();
	}
}
