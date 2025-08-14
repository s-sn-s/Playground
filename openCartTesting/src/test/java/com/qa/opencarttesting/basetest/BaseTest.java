package com.qa.opencarttesting.basetest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.qa.opencarttesting.factory.DriverFactory;
import com.qa.opencarttesting.pages.HomePage;
import com.qa.opencarttesting.pages.LoginPage;

@Listeners(ChainTestListener.class)
public class BaseTest {

	WebDriver driver;
	Properties prop;
	protected LoginPage loginPage;
	protected HomePage homePage;

	@BeforeTest
	public void initTest() {
		DriverFactory driverFactory = new DriverFactory();
		prop = driverFactory.getProp();
		driver = driverFactory.initDriver(prop);
		loginPage = new LoginPage(driver);
	}

	@AfterTest
	public void exitTest() {
		driver.quit();
	}

}
