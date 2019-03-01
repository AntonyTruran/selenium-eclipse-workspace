package com.qa.shafiqTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GithubPage {
	
	@FindBy(tagName="h1")
	private WebElement shafeeqQuote;
	@FindBy(tagName="img")
	private WebElement logo;
	
	
	public String logo(ChromeDriver driver) {
		WebElement dynamicWait=(new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.tagName("img")));
		return logo.getTagName();
	}
	public boolean shafeeq(ChromeDriver driver) {
		WebElement dynamicWait=(new WebDriverWait(driver,50)).until(ExpectedConditions.presenceOfElementLocated(By.tagName("h2")));
		return shafeeqQuote.isDisplayed();
	}

}
