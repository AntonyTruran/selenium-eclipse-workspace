package com.qa.jenkinsPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.qa.constants.Constants;

public class NewItem1 {
	Constants constant;
	@FindBy(id="name")
	private WebElement itemName;
	@FindBy(xpath="//*[@id=\"j-add-item-type-standalone-projects\"]/ul/li[1]")
	private WebElement freestyle;
	@FindBy(id="ok-button")
	private WebElement submit;
	
	public void createItem(ChromeDriver driver) {
		constant = new Constants();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		itemName.sendKeys(constant.getNewProject());
		freestyle.click();
		submit.click();
	}
}
