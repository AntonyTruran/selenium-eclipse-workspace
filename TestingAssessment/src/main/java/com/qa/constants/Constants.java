package com.qa.constants;

public class Constants {
	private static final String EXCEL_FILE_LOCATION = "C:\\Users\\Admin\\eclipse-workspace\\selenium-eclipse-workspace\\TestingAssessment\\AssessmentFriday.xlsx";
	private static final String FEATURE_FILE_LOCATION = "C:\\Users\\Admin\\eclipse-workspace\\selenium-eclipse-workspace\\TestingAssessment\\FeatureFileUpdateUser.feature";
	private static final String DRIVER_LOCATION = "C:\\Users\\Admin\\Desktop\\chromedriver.exe\\";
	private static final String WEBPAGE = "http://35.246.63.66:8080/";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "admin";
	private static final String NEW_PROJECT = "AutomatedItem";
	private static final String ADD_USER_PAGE = "http://35.246.63.66:8080/securityRealm/addUser";
	
	public String getExcelFileLocation() {
		return EXCEL_FILE_LOCATION;
	}
	public String getFeatureFileLocation() {
		return FEATURE_FILE_LOCATION;
	}
	public String getDriverLocation() {
		return DRIVER_LOCATION;
	}
	public String getWebpage() {
		return WEBPAGE;
	}
	public String getUsername() {
		return USERNAME;
	}
	public String getPassword() {
		return PASSWORD;
	}
	public String getNewProject() {
		return NEW_PROJECT;
	}
	public String getAddUserPage() {
		return ADD_USER_PAGE;
	}
	
}
