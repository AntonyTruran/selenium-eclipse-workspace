package com.qa.cucumberPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BingPage {
	@FindBy(id = "sb_form_q")
	private WebElement searchBox;
	@FindBy(id="sb_form_go")
	private WebElement searchSubmit;
	@FindBy(xpath="//*[@id=\"b_results\"]/li[1]")
	private WebElement result;
	
	public void search(String arg1) throws InterruptedException {
		searchBox.sendKeys(arg1);
		Thread.sleep(500);
		searchSubmit.click();	
	}
	public String result() {
		return result.getText();
	}
}
