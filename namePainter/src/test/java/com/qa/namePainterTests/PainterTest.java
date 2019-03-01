package com.qa.namePainterTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.qa.painter.PaintPage;

public class PainterTest {

	ChromeDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youidraw.com/apps/painter/?_ga=2.78530772.1568175495.1551195302-509969955.1551195302");
	}

	@After
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void paintNameTest() throws InterruptedException {
		Actions action = new Actions(driver);
		PaintPage painter = PageFactory.initElements(driver, PaintPage.class);
		painter.painter(driver, action);
		action.moveToElement(painter.canvas).click().perform();
		action.moveByOffset(-500, -250).clickAndHold().moveByOffset(200, 0).release().perform();
		action.moveToElement(painter.canvas).click().perform();
		action.moveByOffset(-400, -250).clickAndHold().moveByOffset(0, 300).release().perform();
		action.moveToElement(painter.canvas).click().perform();
		action.moveByOffset(-300, -200).clickAndHold().moveByOffset(150, 0).moveByOffset(0, 200).moveByOffset(-150, 0).moveByOffset(0, -200).release().perform();
		action.moveToElement(painter.canvas).click().perform();
		action.moveByOffset(0, 0).clickAndHold().moveByOffset(0, -200).moveByOffset(150, 200).moveByOffset(0, -200).release().perform();
		action.moveToElement(painter.canvas).click().perform();
		action.moveByOffset(250, -150).clickAndHold().moveByOffset(375, 0).moveByOffset(500, -150).moveByOffset(250, 150).release().perform();
		Thread.sleep(5000);
		}
}
