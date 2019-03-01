package com.qa.shafiqTests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.demoSitePages.DemoSiteHome;
import com.qa.demoSitePages.DemoSiteLoginPage;
import com.qa.demoSitePages.DemoSiteRegisterPage;
import com.qa.shafiqTest.GithubPage;

public class ShafiqTest {
	ChromeDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://christophperrins.github.io/TestingSite/");
	}

	@After
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void methodTest() throws InterruptedException {
		GithubPage page = PageFactory.initElements(driver, GithubPage.class);
		assertEquals("Shafeeq not loaded", true, page.shafeeq(driver));
	}
	@Test
	public void logoTest() {
		GithubPage page = PageFactory.initElements(driver, GithubPage.class);
		assertEquals("logo not loaded", "img", page.logo(driver));
	}

}
