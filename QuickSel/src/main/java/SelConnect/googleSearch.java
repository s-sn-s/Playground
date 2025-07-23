package SelConnect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		elementUtil exe = new elementUtil(driver);

		String searchString = "Savin Shetty";

		driver.get("https://google.com");

		By searchBoxBY = By.name("q");
		By searchSuggestionBY = By.cssSelector("ul>li[data-attrid='AutocompletePrediction']");
//		By searchButtonBY = By.cssSelector("input[value*='Google']");
		
		
		try {
			WebElement searchBoxEle = driver.findElement(searchBoxBY);
//			WebElement searchButtonEle = driver.findElement(searchButtonBY);

			searchBoxEle.sendKeys(searchString);
			
			exe.sleepFor(1);
			
			List<WebElement> searchSugestionList = driver.findElements(searchSuggestionBY);

			if (searchSugestionList.size() == 0) {
//				searchButtonEle.click();
				searchBoxEle.sendKeys(Keys.ENTER);
			}

			for (WebElement e : searchSugestionList) {
				String searchText = e.getText();
				System.out.println(searchText);
//				if (searchText.trim().equalsIgnoreCase(searchString)) {
//					e.click();
//					break;
//				}
			}
		} finally {
//			exe.sleepFor(1000);
			driver.quit();
		}
	}

}
