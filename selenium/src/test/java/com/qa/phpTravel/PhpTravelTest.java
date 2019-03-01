package com.qa.phpTravel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravelTest {
	ChromeDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void methodTest() throws InterruptedException {
		WebElement phpSite = driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]/a/span[1]"));
		phpSite.sendKeys("London");
		phpSite = driver.findElement(By.xpath("/html/body/div[17]/ul"));
		phpSite.sendKeys("London");
		phpSite.submit();
		phpSite = driver.findElement(By.xpath(""));

		assertEquals("search failed", "London", phpSite.getText());//could be get element or attribute
	}
}
