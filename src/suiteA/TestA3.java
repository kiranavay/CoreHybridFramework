package suiteA;

import java.util.Hashtable;

import org.testng.annotations.Test;

import util.Constants;
import util.TestCaseDataProvider;
import util.Utility;
import util.Xls_Reader;

public class TestA3 {

	@Test(dataProviderClass=TestCaseDataProvider.class,dataProvider="getDataForSuiteA")
	public void testA3(Hashtable<String,String> data){
		// Check the runmodes
				Xls_Reader xls = new Xls_Reader(Constants.SUITEA_XLS_PATH);
				Utility.validateTestExecution("TestA3","SUITEA",data.get(Constants.RUNMODE_COL),xls);
	}
}
