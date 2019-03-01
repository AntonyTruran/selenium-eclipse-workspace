package com.qa.jenkinsPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class JenkinsManage {
	@FindBy(xpath = "//*[@id=\"main-panel\"]/div[16]/a")
	private WebElement manageUsers;
	@FindBy(xpath="//*[@id=\"tasks\"]/div[3]/a[2]")
	private WebElement newUser;
	
	public void userPage(ChromeDriver driver) {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		manageUsers.click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		newUser.click();
	}
}
