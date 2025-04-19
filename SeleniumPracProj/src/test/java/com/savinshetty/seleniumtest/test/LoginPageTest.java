package com.savinshetty.seleniumtest.test;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.savinshetty.seleniumtest.base.BaseTest;

public class LoginPageTest extends BaseTest{

	@Ignore
	@Test
	public void userNameTest() {
		
	}
	
	@Ignore
	@Test
	public void passwordTest() {
		
	}
	
	@Ignore
	@Test
	public void loginButtonTest() {
		
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		String loginPageTitle = loginPage.doLogin("Test", "Test");
		Assert.assertEquals("Account Login", loginPageTitle);
	}
}
