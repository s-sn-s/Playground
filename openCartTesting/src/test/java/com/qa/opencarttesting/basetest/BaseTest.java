package com.qa.opencarttesting.basetest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencarttesting.factory.DriverFactory;

public class BaseTest {

	WebDriver driver;
	
	@BeforeTest
	public void initTest() {
		DriverFactory driverFactory = new DriverFactory();
		driver = driverFactory.initDriver("chrome");
	}
	
	@AfterTest
	public void exitTest() {
		driver.quit();
	}
	
}
