package com.savinshetty.seleniumtest.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private WebDriver driver;
	
	private By uNameElement = By.id("input-email");
	private By pwdElement = By.xpath("//input[@id='input-password']");
	private By loginButton = By.cssSelector("input[value='Login']");
	private By continueButton = By.xpath("//a[text()='Continue']");
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String doLogin(String uName, String pwd) throws InterruptedException {
		driver.findElement(uNameElement).sendKeys(uName);
		driver.findElement(pwdElement).sendKeys(pwd);
		driver.findElement(loginButton).click();
		Thread.sleep(5000);
		return driver.getTitle();
	}
	
	public RegisterAccountPage doOpenCustomerRegistrationPage() {
		driver.findElement(continueButton).click();
		return new RegisterAccountPage(driver);
	}

}
