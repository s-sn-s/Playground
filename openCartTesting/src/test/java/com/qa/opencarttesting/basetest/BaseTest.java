package com.qa.opencarttesting.basetest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

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

	@Parameters({"browser"})
	@BeforeTest
	public void initTest(@Optional String browser) {
		DriverFactory driverFactory = new DriverFactory();
		prop = driverFactory.getProp();
		if(browser!=null) {
			prop.setProperty("browser", browser);
		}
		driver = driverFactory.initDriver(prop);
		loginPage = new LoginPage(driver);
	}

	@AfterMethod
	public void takeScreenshot(ITestResult result) {
		if (!result.isSuccess()) {
			ChainTestListener.embed(DriverFactory.getScreenshotFile(), "image/png");
		}
	}

	@AfterTest
	public void exitTest() {
		driver.quit();
	}

}
