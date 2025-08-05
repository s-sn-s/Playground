package com.qa.testcyle.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.testcycle.constants.AppConstants;
import com.qa.testcyle.basetest.BaseTest;

public class HomePageTest extends BaseTest{

	@BeforeClass
	public void homePageTestSetup() {
		homePage = loginPage.doLogin();
	}
	
	@Test
	public void selectProduct() {
		String expectedProductName = AppConstants.PRODUCT_NAME;
		productDetailPage = homePage.getProductDetail(expectedProductName);
		String actualProductName = productDetailPage.getProductName();
		Assert.assertEquals(expectedProductName.equals(actualProductName), true);
	}
}
