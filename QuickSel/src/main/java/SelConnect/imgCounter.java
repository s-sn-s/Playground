package SelConnect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imgCounter {

	static WebDriver driver;
	
	public static void main(String[] param) {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		elementUtil exe = new elementUtil(driver);
		
		By imgBy = By.tagName("img");
		By formTextField = By.xpath("//div[@id='account-register']//input"); 
		By linksBy = By.tagName("a");
		
		List<WebElement> imagesList = driver.findElements(imgBy);
		
		List<WebElement> inputList = driver.findElements(formTextField);
		
		List<WebElement> linkList = driver.findElements(linksBy);
		
		int linksCount = linkList.size();
		
		int linksDisplayedCount = exe.numberOfElementsDisplayedFromList(linkList);
		
		int imagesCount = imagesList.size();
		
		int inputCount = inputList.size();
		
		int inputDisplayedCount = exe.numberOfElementsDisplayedFromList(inputList);
		
		System.out.println("Total number of images in the site is " + imagesCount);
		System.out.println("Number of input displayed in the site is " + inputDisplayedCount);
		System.out.println("Total number of input hidden " + ( inputCount - inputDisplayedCount));
		
		System.out.println("Number of links displayed in the site is " + linksDisplayedCount);
		System.out.println("Total number of links hidden " + ( linksCount - linksDisplayedCount));
		
		driver.quit();
		
	}
	
	
	
}
