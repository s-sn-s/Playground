package com.qa.testCycle.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {

	private WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By emailBy = By.cssSelector("input#input-email");
	private By passBy = By.xpath("//input[@name='password']");
	private By forgotPassBy = By.partialLinkText("Forgot");
	private By loginBy = By.xpath("//input[@type='submit']");
	
	public String getLoginPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String getLoginPageURL() {
		String loginUrl = driver.getCurrentUrl();
		return loginUrl;
	}
	
	public boolean isEmailInputAvailable() {
		List<WebElement> elements = driver.findElements(emailBy);
		return elements.size()==1?true:false;
	}
	
	public boolean isPasswordInputAvailable() {
		List<WebElement> elements = driver.findElements(passBy);
		return elements.size()==1?true:false;
	}
	
	public boolean isForgottenPasswordLinkAvailable() {
		List<WebElement> elements = driver.findElements(forgotPassBy);
		return elements.size()==2?true:false;
	}
	
	public boolean isLoginButtonAvailable() {
		List<WebElement> elements = driver.findElements(loginBy);
		return elements.size()==1?true:false;
	}
	
	public boolean isLoginFormAvailable() {
		if(isEmailInputAvailable() 
				&& isPasswordInputAvailable() 
				&& isForgottenPasswordLinkAvailable()
				&& isLoginButtonAvailable()) {
			return true;
		}
		return false;
	}
	
	public String doLogin() {
		if(isLoginFormAvailable()) {
			driver.findElement(emailBy).sendKeys("TestDemo123@mymail.com");
			driver.findElement(passBy).sendKeys("TestDemo123@");
			driver.findElement(loginBy).click();
//			JavascriptExecutor executor = (JavascriptExecutor)driver;
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10),Duration.ofSeconds(2));
			wait.until(ExpectedConditions.jsReturnsValue("document.readyState==='complete'"));
			
			return driver.getCurrentUrl();
		}
		throw new RuntimeException("Fix your login form!");
	}
	
}
