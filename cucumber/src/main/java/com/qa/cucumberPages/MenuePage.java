package com.qa.cucumberPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuePage {

	@FindBy(xpath="//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	private WebElement menueButton;
	@FindBy(xpath="//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[5]/a")
	private WebElement checkoutButton;
	
	public void toMenue() {
		menueButton.click();
	}
	
	public void toCheckout() {
		checkoutButton.click();
	}
}
