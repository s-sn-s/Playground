package pomprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testSeleSetup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--incognito");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://selectorshub.com/xpath-practice-page");
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}

}
