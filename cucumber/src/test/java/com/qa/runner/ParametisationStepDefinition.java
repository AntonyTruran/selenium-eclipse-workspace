package com.qa.runner;

import static org.junit.Assert.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.cucumberPages.BingPage;
import com.qa.cucumberPages.Constants;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParametisationStepDefinition {
	ChromeDriver driver;
	Constants constant;
	BingPage search;
	String webpage;
	String searchTarget;

	@Before
	public void setUp() {
		constant = new Constants();
		System.setProperty(constant.getDriverType(), constant.getDriverLocation());
		driver = new ChromeDriver();
		driver.manage().window();
		search = PageFactory.initElements(driver, BingPage.class);
	}

	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) {
		webpage = arg1;
		driver.navigate().to(webpage);
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) throws InterruptedException {
		searchTarget = arg1;
		search.search(searchTarget);
	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search() {
		searchTarget = searchTarget.toLowerCase();
		System.out.println(driver.getCurrentUrl());
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
