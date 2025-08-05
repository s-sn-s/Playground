package com.qa.testcyle.basetest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.testcyle.factory.DriverFactory;
import com.qa.testcyle.pages.HomePage;
import com.qa.testcyle.pages.LoginPage;
import com.qa.testcyle.pages.ProductDetailPage;

public class BaseTest {

	WebDriver driver;
	DriverFactory driverfactory;
	Properties prop;
	
	protected LoginPage loginPage;
	protected HomePage homePage;
	protected ProductDetailPage productDetailPage;
	
	@BeforeTest
	public void initTest() {
		driverfactory = new DriverFactory();
		prop = driverfactory.intiProperties();
		driver = driverfactory.getDriver(prop);
		loginPage = new LoginPage(driver);
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.quit();
	}
}