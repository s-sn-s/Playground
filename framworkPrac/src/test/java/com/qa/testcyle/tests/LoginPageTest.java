package com.qa.testcyle.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testcyle.basetest.BaseTest;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void loginTest() {
		homePage = loginPage.doLogin();
		Assert.assertEquals(homePage.getHomePageBannerText(), "Products","Login failed!");
	}	
}