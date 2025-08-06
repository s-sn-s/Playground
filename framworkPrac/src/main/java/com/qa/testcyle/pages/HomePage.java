package com.qa.testcyle.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By productTitleBy = By.cssSelector("div.product_label");
	private By productImgBy = By.cssSelector("img.inventory_item_img");
	
	public String getHomePageBannerText() {
		System.out.println("Landed on Home page!");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10),Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productTitleBy));
		
		String productTitleText = driver.findElement(productTitleBy).getText();
		
		return productTitleText;
	}
	
	public ProductDetailPage getProductDetail(String productName) {
		
		By productNameBy = By.xpath("//div[text()='"+productName+"']");
		
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class)
				.withMessage(productNameBy + " : element not found!");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productNameBy));
		
		driver.findElement(productNameBy).click();
		
		return new ProductDetailPage(driver);
	}
	
	public int getproductCount() {
		System.out.println("Counting products displayed!");
		try {
		Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		int productCount = driver.findElements(productImgBy).size();
		return productCount;
	}
}
