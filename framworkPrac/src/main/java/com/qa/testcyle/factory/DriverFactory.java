package com.qa.testcyle.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.testcyle.exception.InvalidBrowserException;

public class DriverFactory {

	WebDriver driver;
	
	public WebDriver getDriver(String browser) {
		
		System.out.println(browser.toUpperCase()+" browser is selected!");
		
		switch(browser.trim().toLowerCase()) {
		
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			throw new InvalidBrowserException(browser.toUpperCase()+" : invalid browser\n===please pass valid browser name===");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		
		return driver;
	}	
}