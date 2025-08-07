package com.qa.opencarttesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	public void LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By emailBy = By.cssSelector(null);
	private By passBy = By.cssSelector(null);
	private By submitBy = By.cssSelector(null);
	
	public void doLogin() {
		
	}
	
}
