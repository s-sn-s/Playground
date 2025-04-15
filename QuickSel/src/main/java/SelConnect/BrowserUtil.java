package SelConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtil {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://savinshetty.com");
		String mySite = d.getTitle();
		System.out.println("My site title " + mySite);
		System.out.println(d.findElement(By.tagName("h1")).getText());
		
		d.navigate().to("https://google.com");
		String myGoogleTitle = d.getTitle();
		
//		if(myGoogleTitle.equals(d.getTitle())) {
//			new RuntimeException("not redirected");
//		}
//		d.navigate().forward();
//		d.navigate().forward();
//		d.navigate().refresh();
		d.get("https://www.irctc.co.in/nget/train-search");
//		d.wait(5000);
//		d.switchTo().alert().dismiss();
		
		
//		By promo = By.xpath("//a[conatins(text(),'PROMOTIONS')]");
		
		By promo = By.cssSelector("li.menu-list:last-child");
		
		///html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[11]/a
		
		WebElement moreLink = d.findElement(promo);
		
		boolean enabled = moreLink.isEnabled();
		boolean displayed = moreLink.isDisplayed();
		
		System.out.println(enabled);
		System.out.println(displayed);
		moreLink.click();
		Actions act = new Actions(d);
		
		if (enabled && displayed) {
			act.moveToElement(moreLink).build();
			
		}
		
		Thread.sleep(10000);
		
		d.quit();
	
	}
}