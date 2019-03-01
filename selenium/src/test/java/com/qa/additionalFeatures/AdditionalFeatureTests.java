package com.qa.additionalFeatures;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.shafiqTest.GithubPage;

public class AdditionalFeatureTests {
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
	public void screenshotTest() throws IOException, InterruptedException {
		GithubPage page = PageFactory.initElements(driver, GithubPage.class);
		Desktop desktop = Desktop.getDesktop();
		page.shafeeq(driver);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println(scrFile.getAbsolutePath());
		if (scrFile.exists()){desktop.open(scrFile);}
		File source = new File("H:\\work-temp\\file");
		File dest = new File("H:\\work-temp\\file2");
		//try {
	//	    FileUtils.copyDirectory(source, dest);
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}
		Thread.sleep(50000);
	}
	//navigate
	//javascript

}
