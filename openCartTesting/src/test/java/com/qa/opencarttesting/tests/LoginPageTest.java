package com.qa.opencarttesting.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.opencarttesting.basetest.BaseTest;
import com.qa.opencarttesting.constants.AppConstants;

public class LoginPageTest extends BaseTest{

	@Test
	public void doLoginTest() {
		SoftAssert softAssert = new SoftAssert();

		homePage = loginPage.doLogin();

		softAssert.assertEquals(homePage.getHomePageURL(), AppConstants.HOME_PAGE_URL);
	}
}