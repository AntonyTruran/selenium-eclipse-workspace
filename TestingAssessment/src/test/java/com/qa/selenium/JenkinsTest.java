package com.qa.selenium;


import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.qa.constants.Constants;
import com.qa.jenkinsPages.JenkinsHome;
import com.qa.jenkinsPages.JenkinsLogin;
import com.qa.jenkinsPages.NewItem1;
import com.qa.jenkinsPages.NewItem2;

public class JenkinsTest {
	ChromeDriver driver;
	Constants constant;
	@Before
	public void setUp() {
		constant = new Constants();
		System.setProperty("webdriver.chrome.driver", constant.getDriverLocation());
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		
	}
	
	@Test
	public void loginAndNewProject() throws InterruptedException {
		driver.get(constant.getWebpage());
		JenkinsLogin login = PageFactory.initElements(driver, JenkinsLogin.class);
		login.login();
		driver.navigate().to("http://35.246.63.66:8080/view/all/newJob");
		NewItem1 itemCreation = PageFactory.initElements(driver, NewItem1.class);
		itemCreation.createItem(driver);
		NewItem2 saveItem = PageFactory.initElements(driver, NewItem2.class);
		saveItem.save(driver);
		driver.navigate().to("http://35.246.63.66:8080");
		JenkinsHome home = PageFactory.initElements(driver, JenkinsHome.class);
		assertTrue("item not added",home.checkProjects(driver));
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
