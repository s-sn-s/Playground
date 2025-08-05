package com.qa.testcyle.pages;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.qa.testcycle.util.ElementUtil;

public class LoginPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	private By loginName = By.xpath("//input[@data-test='username']");
	private By loginPass = By.xpath("//input[@data-test='password']");
	private By loginNameCreds = By.xpath("//div[@id='login_credentials']");
	private By loginPassCreds = By.xpath("//div[@class='login_password']");
	private By loginBtn = By.cssSelector("input.btn_action");
//	private By productTitleBy = By.cssSelector("div.product_label");
	
	public HomePage doLogin() {
		
		String[] userCredDivContent = driver.findElement(loginNameCreds).getText().split(":");
		String[] userPassDivContent = driver.findElement(loginPassCreds).getText().split(":");
		
		String[] userName = userCredDivContent[1].split("\n");
		String password = userPassDivContent[1].trim();
		
		driver.findElement(loginName).sendKeys(userName[1]);
		driver.findElement(with(loginPass).below(loginName)).sendKeys(password);
		driver.findElement(with(loginBtn).below(loginPass)).click();
		
		System.out.println(userName[1] + " : Logging in");
		
		return new HomePage(driver);
		/*
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class)
				.withMessage("Login page has exception!");
//		wait.until(ExpectedConditions.jsReturnsValue("return jQuery.active==0"));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productTitleBy));
		System.out.println(userName[1] + " : Logged in");
		return driver.getCurrentUrl().contains("inventory")?true:false;
		*/
	}	
}