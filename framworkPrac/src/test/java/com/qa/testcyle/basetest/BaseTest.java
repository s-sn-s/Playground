package com.qa.testcyle.basetest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.testcyle.factory.DriverFactory;
import com.qa.testcyle.pages.HomePage;
import com.qa.testcyle.pages.LoginPage;

public class BaseTest {

	WebDriver driver;
	DriverFactory driverfactory;
	protected LoginPage loginPage;
	protected HomePage homePage;
	
	@BeforeTest
	public void initTest() {
		driverfactory = new DriverFactory();
		driver = driverfactory.getDriver("chrome");
		loginPage = new LoginPage(driver);
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.quit();
	}
}