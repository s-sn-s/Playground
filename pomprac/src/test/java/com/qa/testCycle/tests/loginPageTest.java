package com.qa.testCycle.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testCycle.baseTest.BaseTest;

public class loginPageTest extends BaseTest{

	@Test
	public void loginPageTitleCheck() {
		Assert.assertEquals(loginpg.getLoginPageTitle(),"Account Login");
	}
	
}
