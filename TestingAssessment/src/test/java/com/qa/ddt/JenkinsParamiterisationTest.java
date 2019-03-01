package com.qa.ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.qa.constants.Constants;
import com.qa.jenkinsPages.JenkinsHome;
import com.qa.jenkinsPages.JenkinsLogin;
import com.qa.jenkinsPages.JenkinsManage;
import com.qa.jenkinsPages.JenkinsUser;

@RunWith(Parameterized.class)
public class JenkinsParamiterisationTest {
	static Constants constant;
	private static FileInputStream file;
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private ChromeDriver driver;

	@Parameters
	public static Collection<Object[]> userAccounts() throws IOException {
		constant = new Constants();
		file = new FileInputStream(constant.getExcelFileLocation());
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheetAt(0);
		Object[][] excelCell = new Object[sheet.getPhysicalNumberOfRows()-1][5];
		for (int rowNum = 1; rowNum < sheet.getPhysicalNumberOfRows(); rowNum++) {
			excelCell[rowNum - 1][0] = sheet.getRow(rowNum).getCell(0).getStringCellValue();
			excelCell[rowNum - 1][1] = sheet.getRow(rowNum).getCell(1).getStringCellValue();
			excelCell[rowNum - 1][2] = sheet.getRow(rowNum).getCell(2).getStringCellValue();
			excelCell[rowNum - 1][3] = sheet.getRow(rowNum).getCell(3).getStringCellValue();
			excelCell[rowNum - 1][4] = sheet.getRow(rowNum).getCell(4).getStringCellValue();
		}
		workbook.close();
		return Arrays.asList(excelCell);
	}

	private String username;
	private String fullName;
	private String password;
	private String confPassword;
	private String emailAddress;
	private int rowNum;

	public JenkinsParamiterisationTest(String username, String fullName, String password, String confPassword,
			String emailAddress) {
		super();
		this.username = username;
		this.fullName = fullName;
		this.password = password;
		this.confPassword = confPassword;
		this.emailAddress = emailAddress;
		this.rowNum = rowNum;
	}

	@Before
	public void setUp() {
		constant = new Constants();
		System.setProperty("webdriver.chrome.driver", constant.getDriverLocation());
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);

	}

	@Test
	public void addUsers() throws IOException {
		driver.get(constant.getWebpage());
		JenkinsLogin login = PageFactory.initElements(driver, JenkinsLogin.class);
		login.login();
		driver.navigate().to("http://35.246.63.66:8080/manage");
		JenkinsManage management = PageFactory.initElements(driver, JenkinsManage.class);
		management.userPage(driver);
		JenkinsUser newUser = PageFactory.initElements(driver, JenkinsUser.class);
		String result = newUser.addUser(driver, username, fullName, password, confPassword, emailAddress);

		file = new FileInputStream(constant.getExcelFileLocation());
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheetAt(0);

		XSSFRow row = sheet.getRow(rowNum);
		XSSFCell cell;
		try {
			assertNotEquals("failed to log in", constant.getAddUserPage(), driver.getCurrentUrl());
			cell = row.getCell(5);
			if (cell == null) {
				cell = row.createCell(5);
			}
			cell.setCellValue("PASS");

		} catch (AssertionError e) {
			cell = row.getCell(5);
			if (cell == null) {
				cell = row.createCell(5);
			}
			cell.setCellValue("FAIL");
		} finally {
			FileOutputStream output = new FileOutputStream(constant.getExcelFileLocation());
			workbook.write(output);
			output.flush();
			output.close();
		}
		workbook.close();
		file.close();
	}

	@After
	public void tearDown() {
		driver.quit();
	}
	// wait for the page to reload then check the URL has changed

	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}
}
