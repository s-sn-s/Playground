package SelConnect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class launchBrowser {

	static WebDriver driver;

	public void launchMyBrowser(String browser) {
		switch (browser.trim().toLowerCase()) {
		case ("chrome"):
			System.out.println(" browser launched!");
			driver = new ChromeDriver();
			break;
		case ("safari"):
			System.out.println(" browser launched!");
			driver = new SafariDriver();
			break;
		case ("edge"):
			System.out.println(" browser launched!");
			driver = new EdgeDriver();
			break;
		default:
			throw new RuntimeException("Wrong browser passed");
		}
	}

	public static void main(String[] params) {
		launchBrowser launch = new launchBrowser();
		launch.launchMyBrowser("chrome");
		try {
		driver.get("https://savinshetty.com/rps.html");
		Thread.sleep(5000);
		System.out.println(driver.getPageSource());
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			if(driver!=null) {
				System.out.println("Browser closed!");
				driver.quit();
			}
		}
	}

}
