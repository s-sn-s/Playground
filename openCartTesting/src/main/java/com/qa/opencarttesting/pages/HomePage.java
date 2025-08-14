package com.qa.opencarttesting.pages;

import org.openqa.selenium.WebDriver;

import com.qa.opencarttesting.util.ElementUtil;

public class HomePage {

	private WebDriver driver;
	private ElementUtil util;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		util = new ElementUtil(driver);
	}

	public String getHomePageURL() {
		return util.getCurrentURL();
	}

	public boolean verifyNumberSubheadsUnderHeading(String HeadingStr, int numberOfSubheads) {
		int actualNumberOfSubheads = util.getAllLinkTextInsideH2(HeadingStr).size();
		System.out.println("Comparing actual :" + actualNumberOfSubheads + "\n with expected :" + numberOfSubheads);
		return actualNumberOfSubheads==numberOfSubheads?true:false;
	}

}
