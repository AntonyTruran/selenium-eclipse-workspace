package com.qa.jenkinsPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JenkinsHome {
	
	@FindBy(id="projectstatus")
	private WebElement projects;
	@FindBy(xpath="//*[@id=\"tasks\"]/div[4]/a[2]")
	private WebElement manageJenkins;
	
	public boolean checkProjects(ChromeDriver driver) {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		WebElement dynamicWait=(new WebDriverWait(driver,50)).until(ExpectedConditions.presenceOfElementLocated(By.id("projectstatus")));
		return projects.isDisplayed();
	}
	public void manage() {
		manageJenkins.click();
	}
}
