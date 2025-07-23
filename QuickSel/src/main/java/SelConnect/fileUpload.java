package SelConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		elementUtil exe = new elementUtil(driver);
		driver.get("https://practice.expandtesting.com/upload");
		
		driver.findElement(By.id("fileInput")).sendKeys("/Users/savin/git/s-sn-s/QuickSel/src/main/java/SelConnect/myUploadTestFile.txt");
		
		exe.sleepFor(5000);
		
		driver.quit();
	}

}
