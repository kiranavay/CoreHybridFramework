package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Keywords {
	Logger Application_Log;
	Properties prop;
	
	
	public Keywords(){
		// initialize properties file
		prop = new Properties();
		try {
			FileInputStream fs = new FileInputStream(Constants.PROPERTIES_PATH);
			prop.load(fs);
			System.out.println(prop.getProperty("hereLink_xpath"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void executeKeywords(String testName, Xls_Reader xls, Hashtable<String, String> data) {
		// read the xls
		// call the keyword functions 
		// report errors
		int rows = xls.getRowCount(Constants.KEYWORDS_SHEET);
		for(int rNum=2;rNum<=rows;rNum++){
			String tcid = xls.getCellData(Constants.KEYWORDS_SHEET, 0, rNum);
			if(tcid.equalsIgnoreCase(testName)){
				String keywords = xls.getCellData(Constants.KEYWORDS_SHEET, 2, rNum);
				String object = xls.getCellData(Constants.KEYWORDS_SHEET, 3, rNum);
				String dataCol = xls.getCellData(Constants.KEYWORDS_SHEET, 4, rNum);
				log(keywords+"-----"+object+"----"+dataCol);
						
			}
		}
	}
	
	public String openBrowser(String browserType){
		log("Start function openBrowser"+browserType);
		//
		
		log("Ending function openBrowser with status"+Constants.PASS);
		return Constants.PASS;
	}
	
	public String navigate(String url){
		log("Start function navigate"+url);
		
		log("Ending function navigate with status"+Constants.PASS);
		return Constants.PASS;
	}
	
	public String click(String xpathkey){
		log("Start function click"+xpathkey);
		
		log("Ending function click with status"+Constants.PASS);
		return Constants.PASS;
	}
	
	public String input(String xpathkey, String data){
		log("Start function input"+xpathkey+" , "+data);
		
		log("Ending function input with status"+Constants.PASS);
		return Constants.PASS;
	}
	

	public void setLogger(Logger log){
		Application_Log = log;
	}
	
	public void log(String message){
		Application_Log.debug(message);
	}

	
}
