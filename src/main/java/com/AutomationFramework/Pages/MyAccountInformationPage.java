package com.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment17.AutomationFramework.Base.TestBase;

public class MyAccountInformationPage extends TestBase {
	public MyAccountInformationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#input-telephone")
	WebElement telephone;

	@FindBy(css = "input.btn")
	WebElement continueBtn;

	private void inputPhoneNumber(String number) {
		telephone.clear();
		telephone.sendKeys(number);
	}

	public MyAccountPage clickContinueBtn(String phoneNumber) {
		inputPhoneNumber(phoneNumber);
		continueBtn.click();
		return new MyAccountPage();
	}

}
