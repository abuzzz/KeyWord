package config;

public class Constants {

	//List of System Variables
	public static final String URL = "http://www.store.demoqa.com";
	public static final String Path_TestData = "D://Data Backup//Cox Workspace//keywordDriven//src//dataEngine//DataEngine.xlsx";
	public static final String Path_OR = "D://Data Backup//Cox Workspace//keywordDriven//src//config//OR.txt";
	public static final String File_TestData = "DataEngine.xlsx";

	//List of Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID =1 ;
	//This is the new column for 'Page Object'
	public static final int Col_PageObject =3 ;
	//This column is shifted from 3 to 4
	public static final int Col_ActionKeyword =4 ;
	
	public static final int Col_RunMode =2; //For new Sheet ---Test Cases

	//List of Data Engine Excel sheets
	public static final String Sheet_TestSteps = "Test Steps";
	public static final String Sheet_TestCases = "Test Cases";

	//List of Test Data
	public static final String UserName = "testuser_3";
	public static final String Password = "Test@123";

}