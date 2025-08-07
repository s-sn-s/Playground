package com.qa.opencarttesting.basetest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencarttesting.factory.DriverFactory;
import com.qa.opencarttesting.pages.HomePage;
import com.qa.opencarttesting.pages.LoginPage;

public class BaseTest {

	WebDriver driver;
	protected LoginPage loginPage;
	protected HomePage homePage; 
	
	@BeforeTest
	public void initTest() {
		DriverFactory driverFactory = new DriverFactory();
		driver = driverFactory.initDriver("chrome");
		loginPage = new LoginPage(driver);
	}
	
	@AfterTest
	public void exitTest() {
		driver.quit();
	}
	
}
