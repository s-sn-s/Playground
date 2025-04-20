package com.savinshetty.seleniumtest.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.savinshetty.seleniumtest.base.BaseTest;

public class RegisterAccountPageTest extends BaseTest {
	
	@BeforeClass
	public void registerAccountSetup() {
		registerAccountPage = loginPage.doOpenCustomerRegistrationPage();
	}

	@Test
	public void doRegisterAccountTest() {
		registerAccountPage.doCreateNewCustomer();
	}
}
