package com.qa.excelReader;

public class Constants {

	private static final String FILE_LOCATION = "C:\\Users\\Admin\\Downloads\\DemoSiteDDT.xlsx";
	private static final String DRIVER_LOCATION = "C:\\Users\\Admin\\Desktop\\chromedriver.exe\\";
	private static final String WEBPAGE = "http://thedemosite.co.uk/";
	private static final String EXPECTED_LOGIN_RESULT = "**Successful Login**";
	
	public String getFileLocation() {
		return FILE_LOCATION;
	}
	public String getDriverLocation() {
		return DRIVER_LOCATION;
	}
	public String getWebpage() {
		return WEBPAGE;
	}
	public String getExpectedLoginResult() {
		return EXPECTED_LOGIN_RESULT;
	}
}
