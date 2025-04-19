package com.savinshetty.seleniumtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By uNameElement = By.id("input-email");
	private By pwdElement = By.xpath("//input[@id='input-password']");
	private By loginButton = By.cssSelector("input[value='Login']");
	
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

}
