package suiteB;

import java.util.Hashtable;

import org.testng.annotations.Test;

import util.Constants;
import util.TestCaseDataProvider;
import util.Utility;
import util.Xls_Reader;

public class TestB3 {

	@Test(dataProviderClass=TestCaseDataProvider.class,dataProvider="getDataForSuiteB")
	public void testB3(Hashtable<String,String> data){
		// Check the runmodes
		Xls_Reader xls = new Xls_Reader(Constants.SUITEB_XLS_PATH);
		Utility.validateTestExecution("TestB3","SUITEB",data.get(Constants.RUNMODE_COL),xls);
	}
}
