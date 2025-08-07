package com.qa.opencarttesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencarttesting.constants.AppConstants;
import com.qa.opencarttesting.util.ElementUtil;

public class LoginPage {

	private WebDriver driver;
	private ElementUtil util;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		util = new ElementUtil(driver);
	}
	
	private By emailBy = By.cssSelector("input#input-email");
	private By passBy = By.cssSelector("input[placeholder='Password']");
	private By submitBy = By.cssSelector("input[type='submit']");
	
	public HomePage doLogin() {
		String mail = "TestDemo123@mymail.com";
		String pass = "TestDemo123@";
		
		util.waitAndGetElementBy(emailBy, AppConstants.DEFAULT_WAIT_SECONDS).sendKeys(mail);
		util.getElementUsingBy(passBy).sendKeys(pass);
		driver.findElement(submitBy).click();
		
		return new HomePage(driver);
	}
	
}
