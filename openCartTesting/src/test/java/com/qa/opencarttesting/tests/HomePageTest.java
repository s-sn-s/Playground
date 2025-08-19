package com.qa.opencarttesting.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.opencarttesting.basetest.BaseTest;

public class HomePageTest extends BaseTest{

	@BeforeClass
	public void setupHomePageTest() {
		homePage = loginPage.doLogin();
	}

	@DataProvider
	public Object[][] subHeadCountArgs(){
		return new Object[][]{
			{"My Account",4},
			{"My Orders",6},
			{"My Affiliate Account",1},
			{"Newsletter",1},
			{"xxx",1}
		};
	}

	@Test(dataProvider = "subHeadCountArgs")
	public void verifyNumberOfSubheading(String headStr, int noOfSubheading) {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(homePage.verifyNumberSubheadsUnderHeading(headStr, noOfSubheading));
		softAssert.assertAll();
	}
	
	@Test
	public void verifyURL() {
		String homePageUrl = homePage.getHomePageURL();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(homePageUrl, "https://naveenautomationlabs.com/opencart/index.php?route=account/account");
	}
}