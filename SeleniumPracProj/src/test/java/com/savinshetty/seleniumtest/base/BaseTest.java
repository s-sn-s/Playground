package com.savinshetty.seleniumtest.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.savinshetty.seleniumtest.factory.DriverFactory;
import com.savinshetty.seleniumtest.pages.LoginPage;
import com.savinshetty.seleniumtest.pages.RegisterAccountPage;

public class BaseTest {

	protected WebDriver driver;
	protected LoginPage loginPage;
	protected RegisterAccountPage registerAccountPage;
	
	@BeforeTest
	public void setup() {
		DriverFactory df = new DriverFactory();
		driver = df.initDriver("chrome");
		System.out.println("Opening the browser");
		loginPage = new LoginPage(driver);
	}
	
	@AfterTest
	public void tesrDown() {
		System.out.println("Closing the browser");
		driver.quit();
	}
}
