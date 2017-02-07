package executionEngine;


import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import config.Constants;

import config.ActionKeywords;
import utility.ExcelUtils;

public class DriverScript {
		public static Properties OR;
        public static ActionKeywords actionKeywords;
        public static String sActionKeyword;
        public static String sPageObject;
        public static Method method[];
        
        
        public DriverScript() throws NoSuchMethodException, SecurityException{
    		actionKeywords = new ActionKeywords();
    		actionKeywords.getClass().getMethods();
    		}
        
    public static void main(String[] args) throws Exception {
    	
    	String Path_DataEngine=Constants.Path_TestData;
    	ExcelUtils.setExcelFile(Path_DataEngine,Constants.Sheet_TestSteps);
    	
    	String Path_OR=Constants.Path_OR;
    	FileInputStream fs = new FileInputStream(Path_OR);
    	OR = new Properties(System.getProperties());
    	OR.load(fs);
    	
    	for (int iRow = 1;iRow <= 9;iRow++){
		    
    		sActionKeyword = ExcelUtils.getCellData(iRow,Constants.Col_ActionKeyword);
    		sPageObject = ExcelUtils.getCellData(iRow,Constants.Col_PageObject);
            execute_Actions();
    		}
           }
public static void execute_Actions() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
	for(int i=0;i<method.length;i++){
		if(method[i].getName().equals(sActionKeyword)){
			method[i].invoke(actionKeywords,sPageObject);
			break;
		}
			
	}
}


}