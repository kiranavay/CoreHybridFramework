package suiteA;

import java.util.Hashtable;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Constants;
import util.Keywords;
import util.TestCaseDataProvider;
import util.Utility;
import util.Xls_Reader;

public class TestA1 {

	@Test(dataProviderClass=TestCaseDataProvider.class,dataProvider="getDataForSuiteA")
	public void testA1(Hashtable<String,String> data){
		Logger log = Utility.initLogs("testA1 - "+data.get(Constants.ITERATION_COL));
		log.debug("Executing testA1");
		// Check the runmodes
		Xls_Reader xls = new Xls_Reader(Constants.SUITEA_XLS_PATH);
		Utility.validateTestExecution("TestA1","SUITEA",data.get(Constants.RUNMODE_COL),xls);
		Keywords app = new Keywords();
		app.setLogger(log);
		app.executeKeywords("testA1",xls,data);
		log.debug("Ending testA1");
	}
	
	/*@DataProvider
	public Object[][] getData(){
		String testCase="TestA1";
		Xls_Reader xls = new Xls_Reader(Constants.SUITEA_XLS_PATH);
		return Utility.getData(testCase, xls);
	}*/
}
