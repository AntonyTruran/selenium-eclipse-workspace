package com.qa.jenkinsPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class NewItem2 {
	@FindBy(id="yui-gen38-button")
	private WebElement saveItem;
	
	public void save(ChromeDriver driver) {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		saveItem.click();
	}
}
