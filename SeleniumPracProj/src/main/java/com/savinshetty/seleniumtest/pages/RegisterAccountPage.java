package com.savinshetty.seleniumtest.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterAccountPage {

	private WebDriver driver;
	
	private By firstNameBy 				= By.id("input-firstname");
	private By secondNameBy 			= By.id("input-lastname");
	private By emailBy 					= By.id("input-email");
	private By telephoneBy 				= By.id("input-telephone");
	
	private By passwordBy 				= By.id("input-password");
	private By confirmPasswordBy 		= By.id("input-confirm");
	
//	private By newsletterSubscribeYesBy = By.xpath("//input[@name='newsletter' and @value='1']");
	private By newsletterSubscribeNoBy 	= By.xpath("//input[@name='newsletter' and @value='0']");
	
	private By privacyPolicyBy 			= By.xpath("//input[@name='agree']");
	
//	private By continueButtonBy 		= By.xpath("//input[@value='Continue']");

	public RegisterAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getRegisterAccountPageTitle() {
		return driver.getTitle();
	}

	public void doCreateNewCustomer() {

		if("Register Account".equalsIgnoreCase((getRegisterAccountPageTitle()))) 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
			wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameBy));
			
			driver.findElement(firstNameBy).sendKeys("Savin");
			driver.findElement(secondNameBy).sendKeys("Shetty");
			driver.findElement(emailBy).sendKeys("Savin.sn.shetty@gmail.com");
			driver.findElement(telephoneBy).sendKeys("9167009282");
			
			driver.findElement(passwordBy).sendKeys("DummyPass@123");
			driver.findElement(confirmPasswordBy).sendKeys("DummyPass@123");
			
			driver.findElement(newsletterSubscribeNoBy).click();
			
			driver.findElement(privacyPolicyBy).click();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			driver.findElement(continueButtonBy).click();
			
		}

	}


}
