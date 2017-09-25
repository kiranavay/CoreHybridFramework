package suiteA;

import java.util.Hashtable;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import util.Constants;
import util.TestCaseDataProvider;
import util.Utility;
import util.Xls_Reader;

public class TestA2 {

	@Test(dataProviderClass=TestCaseDataProvider.class,dataProvider="getDataForSuiteA")
	public void testA2(Hashtable<String,String> data){
		// Check the runmodes
		Xls_Reader xls = new Xls_Reader(Constants.SUITEA_XLS_PATH);
		Utility.validateTestExecution("TestA2","SUITEA",data.get(Constants.RUNMODE_COL),xls);
		
		Logger log = Utility.initLogs("testA2 - "+data.get(Constants.ITERATION_COL));
		log.debug("Executing testA2");
				
	}
}
