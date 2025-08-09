package com.qa.opencarttesting.util;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencarttesting.constants.AppConstants;

public class ElementUtil {

	private WebDriver driver;
	private FluentWait<WebDriver> wait;
	private WebDriverWait webWait;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	private FluentWait<WebDriver> getFluentWait(int waitTime){
		wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(waitTime));
		return wait;
	}
	
	private FluentWait<WebDriver> getFluentWait(int waitTime,int pollingTime){
		wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(waitTime))
				.pollingEvery(Duration.ofSeconds(pollingTime));
		return wait;
	}
	
	private WebDriverWait getWebDriverWait(int waitTime) {
		webWait = new WebDriverWait(driver,Duration.ofSeconds(waitTime));
		return webWait;
	}
	
	private WebDriverWait getWebDriverWait(int waitTime, int pollingTime) {
		webWait = new WebDriverWait(driver,Duration.ofSeconds(waitTime),Duration.ofSeconds(pollingTime));
		return webWait;
	}
	
	public WebElement getElementUsingBy(By eleBy) {
		return driver.findElement(eleBy);
	}
	
	public WebElement waitAndGetElementBy(By eleBy, int waitTime) {		
		wait = getFluentWait(waitTime);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(eleBy));
		return driver.findElement(eleBy);
	}
	
	public void waitForPageLoad() {
		webWait = getWebDriverWait(AppConstants.LONG_WAIT_SECONDS, AppConstants.SHORT_WAIT_SECONDS);
		webWait.until(driver -> ((JavascriptExecutor) driver)
				.executeScript("return document.readyState")
				.equals("complete"));
	}
	
	public WebElement getElementBy(By eleBy) {
		waitForPageLoad();
		return waitAndGetElementBy(eleBy, AppConstants.DEFAULT_WAIT_SECONDS);
	}
	
	public String getCurrentURL() {
		waitForPageLoad();
		return driver.getCurrentUrl();
	}
	
	public List<String> getAllLinkTextInsideH2(String h2Text){
		By h2aTagBy = By.xpath("(//div[@id='content']/h2[text()='"+ h2Text +"']/following-sibling::ul)[1]/li/a");
		
		List<WebElement> elements = driver.findElements(h2aTagBy);
		List<String> aTagTextList = new ArrayList<String>();
		for(WebElement ele : elements) {
			aTagTextList.add(ele.getText());
		}
		return aTagTextList;
	}
	
	public List<String> getAllLinkInsideH2(String h2Text){
		By h2aTagBy = By.xpath("(//div[@id='content']/h2[text()='"+ h2Text +"']/following-sibling::ul)[1]/li/a");
		
		List<WebElement> elements = driver.findElements(h2aTagBy);
		List<String> aTagLinkList = new ArrayList<String>();
		for(WebElement ele : elements) {
			aTagLinkList.add(ele.getDomAttribute("href"));
		}
		return aTagLinkList;
	}
}
