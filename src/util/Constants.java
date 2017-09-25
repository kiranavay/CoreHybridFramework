package util;

public class Constants {

	//PATHS
	public static final String SUITEA_XLS_PATH = System.getProperty("user.dir")+"\\executioninfo\\input-data\\SuiteA.xlsx";
	public static final String SUITEB_XLS_PATH = System.getProperty("user.dir")+"\\executioninfo\\input-data\\SuiteB.xlsx";
	public static final String TESTSUITE_XLS_PATH = System.getProperty("user.dir")+"\\executioninfo\\input-data\\TestSuite.xlsx";
	public static final String PROPERTIES_PATH = System.getProperty("user.dir")+"//src//resources//project.properties";
	
	//SHEET NAMES
	public static final String TESTSUITE_SHEET = "TestSuite";
	public static final String TESTDATA_SHEET = "TestData";
	public static final String TESTCASES_SHEET = "TestCases";
	
	// COLUMN NAMES
	public static final String SUITENAME_COL = "SuiteName";
	public static final String RUNMODE_COL = "Runmode";
	public static final String TESTCASENAME_COL = "TestCaseName";
	
	//RUNMODES
	public static final String RUNMODE_YES = "Y";
	public static final String RUNMODE_NO = "N";
	public static final Object ITERATION_COL = "Iteration";
	public static final String PASS = "PASS";
	public static final String KEYWORDS_SHEET = "Keywords";
	
	
	

}
