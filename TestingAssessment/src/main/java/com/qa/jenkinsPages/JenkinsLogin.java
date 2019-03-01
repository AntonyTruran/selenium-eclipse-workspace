package com.qa.jenkinsPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.constants.Constants;

public class JenkinsLogin {
	Constants constant;
	@FindBy(id="j_username")
	private WebElement username;
	
	@FindBy(xpath="/html/body/div/div/form/div[2]/input")
	private WebElement password;
	
	@FindBy(xpath="/html/body/div/div/form/div[3]/input")
	private WebElement submit;
	
	public void login() {
		constant = new Constants();
		username.sendKeys(constant.getUsername());
		password.sendKeys(constant.getPassword());
		submit.click();
	}
}
