package com.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountChangeEditAccountInfoPage extends MyAccountPage {

	public MyAccountChangeEditAccountInfoPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Edit your account information']")
	WebElement editAccountInfo;

	public MyAccountInformationPage clickEditAccountInfo() {
		editAccountInfo.click();
		return new MyAccountInformationPage();
	}
}
