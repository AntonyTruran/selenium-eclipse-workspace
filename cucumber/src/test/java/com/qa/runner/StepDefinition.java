package com.qa.runner;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.cucumberPages.Constants;
import com.qa.cucumberPages.MenuePage;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	ChromeDriver driver;
	Constants constant;

	@Before
	public void setUp() {
		constant= new Constants();
		System.setProperty(constant.getDriverType(),constant.getDriverLocation());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("^the correct web address$")
	public void the_correct_web_address() {
		driver.get(constant.getWebpage());
		assertEquals("incorrect Webpage loaded", constant.getWebpage(), driver.getCurrentUrl());
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() {
		MenuePage menue = PageFactory.initElements(driver, MenuePage.class);
		menue.toMenue();
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() {
		assertEquals("incorrect Webpage loaded", constant.getMenue(), driver.getCurrentUrl());
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() {
		MenuePage menue = PageFactory.initElements(driver, MenuePage.class);
		menue.toCheckout();
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() {
		assertEquals("incorrect Webpage loaded", constant.getCheckout(), driver.getCurrentUrl());
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
