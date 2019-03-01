package com.qa.cucumberPages;

public class Constants {
	private static final String WEBPAGE ="http://www.practiceselenium.com/welcome.html";
	private static final String MENUE ="http://www.practiceselenium.com/menu.html";
	private static final String CHECKOUT = "http://www.practiceselenium.com/check-out.html";
	private static final String DRIVER_LOCATION = "C:\\Users\\Admin\\Desktop\\chromedriver.exe";
	private static final String DRIVER_TYPE ="webdriver.chrome.driver"; 

	public String getWebpage() {
		return WEBPAGE;
	}

	public String getMenue() {
		return MENUE;
	}

	public String getCheckout() {
		return CHECKOUT;
	}

	public String getDriverLocation() {
		return DRIVER_LOCATION;
	}

	public String getDriverType() {
		return DRIVER_TYPE;
	}
}
