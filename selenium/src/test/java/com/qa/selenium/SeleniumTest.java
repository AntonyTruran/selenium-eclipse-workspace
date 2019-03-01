package com.qa.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

public class SeleniumTest {
	ChromeDriver driver;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void methodTest() {
		driver.manage().window().maximize();
		driver.get("https://github.com/AntonyTruran/EncounterGeneratorProject/");
	}
}
//*[@id="mv-tiles"]/div[1]/a