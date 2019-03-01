package com.qa.excelTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.excelReader.Constants;

public class ExcelTests {
	Constants constant; 
	private FileInputStream file;
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private ChromeDriver driver;

	@Before
	public void setUp() throws IOException {
		constant = new Constants();
		System.setProperty("webdriver.chrome.driver", constant.getDriverLocation());
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(constant.getWebpage());
		file = new FileInputStream(constant.getFileLocation());
		workbook = new XSSFWorkbook(file);
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void readFromExcel() {
		sheet = workbook.getSheetAt(0);
		for (int rowNum = 0; rowNum < sheet.getPhysicalNumberOfRows(); rowNum++) {
			for (int colNum = 0; colNum < sheet.getRow(rowNum).getPhysicalNumberOfCells(); colNum++) {
				XSSFCell cell = sheet.getRow(rowNum).getCell(colNum);
				String userCell = cell.getStringCellValue();
				System.out.println(userCell);
			}
		}
	}

}
