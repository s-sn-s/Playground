package com.qa.testcyle.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By productTitleBy = By.cssSelector("div.product_label");
	
	public String getHomePageBannerText() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10),Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productTitleBy));
		
		String productTitleText = driver.findElement(productTitleBy).getText();
		
		return productTitleText;
	}
	
}
