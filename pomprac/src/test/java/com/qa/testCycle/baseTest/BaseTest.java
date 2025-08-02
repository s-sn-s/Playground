package com.qa.testCycle.baseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.testCycle.factory.driverFactory;
import com.qa.testCycle.pages.loginPage;

public class BaseTest {

	WebDriver driver;
	driverFactory df;
	protected loginPage loginpg;
	
	@BeforeTest
	public void testSetup() {
		df = new driverFactory();
		driver = df.initDriver("chrome");
		loginpg = new loginPage(driver);
	}
	
	@AfterTest
	public void testTeardown() {
		driver.quit();
	}
	
	
}
