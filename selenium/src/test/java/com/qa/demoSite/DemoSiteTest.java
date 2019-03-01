package com.qa.demoSite;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.demoSitePages.DemoSiteHome;
import com.qa.demoSitePages.DemoSiteLoginPage;
import com.qa.demoSitePages.DemoSiteRegisterPage;

public class DemoSiteTest {
	ChromeDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/");
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void methodTest() throws InterruptedException {
		DemoSiteHome addUser = PageFactory.initElements(driver, DemoSiteHome.class);
		addUser.changeToNewUser();
		DemoSiteRegisterPage register = PageFactory.initElements(driver, DemoSiteRegisterPage.class);
		register.addNewUser("userOne", "userOne");
		DemoSiteLoginPage login = PageFactory.initElements(driver, DemoSiteLoginPage.class);
		assertEquals("failed to log in", "**Successful Login**", login.loginNewUser("userOne", "userOne"));
		// Thread.sleep(5000);
	}

}