package com.qa.testcyle.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailPage {

	private WebDriver driver;
	
	public ProductDetailPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By productNameBy = By.cssSelector("div.inventory_details_name");
	
	public String getProductName() {
		System.out.println("Getting product details!");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10),Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productNameBy));
		
		String productName = driver.findElement(productNameBy).getText(); 
		System.out.println("Getting product details for ===> " + productName);
		return productName;
	}
	
}
