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
		
//		String myGoogleTitle = d.getTitle();
//		if(myGoogleTitle.equals(d.getTitle())) {
//			new RuntimeException("not redirected");
//		}
//		d.navigate().forward();
//		d.navigate().forward();
//		d.navigate().refresh();
		
		d.get("https://www.irctc.co.in/nget/train-search");
//		
//		d.wait(5000);
//		d.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		By promo = By.xpath("//a[contains(text(),'PROMOTIONS')]");
		
		By more = By.cssSelector("li.menu-list:last-child");
		
		/*
		//html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[11]/a
		*/
		
		WebElement moreLink = d.findElement(promo);
		WebElement promoLink = d.findElement(more);
		
		boolean enabledM = moreLink.isEnabled();
		boolean displayedM = moreLink.isDisplayed();
		boolean enabledP = moreLink.isEnabled();
		boolean displayedP = moreLink.isDisplayed();
		
		Actions act = new Actions(d);
		
		if (enabledP && displayedP) {
			System.out.println("Promo link is enabled : "+enabledP);
			System.out.println("Promo link is displayed : "+displayedP);
			act.moveToElement(promoLink).build().perform();			
		}
		if (enabledM && displayedM) {
			System.out.println("More link is enabled : "+enabledM);
			System.out.println("More link is displayed : "+displayedM);
			moreLink.click();
		}
		
		Thread.sleep(10000);
		
		d.quit();
	
	}
}