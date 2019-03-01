package com.qa.jenkinsPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.qa.constants.Constants;

public class JenkinsUser {
	Constants constant;
	@FindBy(id="username")
	private WebElement username;
	@FindBy(xpath="//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[4]/td[2]/input")
	private WebElement fullName;
	@FindBy(xpath="//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[2]/td[2]/input")
	private WebElement password;
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[3]/td[2]/input")
	private WebElement confPassword;
	@FindBy(xpath="//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[5]/td[2]/input")
	private WebElement emailAddress;
	@FindBy(id="yui-gen1-button")
	private WebElement submit;
	@FindBy(id="people")
	private WebElement usersTable;

	public String addUser(ChromeDriver driver, String newusername, String newfullName, String newpassword, String newconfPassword,
			String newemailAddress) {
		constant = new Constants();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		username.sendKeys(newusername);
		password.sendKeys(newpassword);
		confPassword.sendKeys(newconfPassword);
		fullName.sendKeys(newfullName);
		emailAddress.sendKeys(newemailAddress);
		submit.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		if (driver.getCurrentUrl() != constant.getAddUserPage()) {
			return "added";
		}
		return "failed";
	}

}
