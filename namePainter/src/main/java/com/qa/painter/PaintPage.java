package com.qa.painter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PaintPage {

	@FindBy(id = "brush")
	private WebElement brush;

	@FindBy(id = "btnBrush")
	private WebElement paintStyle;

	@FindBy(xpath = "//*[@id=\"moreBrush\"]/li[10]/div")
	private WebElement selectedStyle;

	@FindBy(id = "catch")
	public WebElement canvas;

	public void painter(ChromeDriver driver, Actions action) {
		brush.click();
		paintStyle.click();
		selectedStyle.click();
	}
}