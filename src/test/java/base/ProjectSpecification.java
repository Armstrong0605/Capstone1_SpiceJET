package base;

import org.testng.annotations.AfterMethod;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Util.Utility;

public class ProjectSpecification extends Utility{

	@BeforeMethod
	public void launchingBrowser() throws Exception {
		
		browserLaunch(prop.getProperty("url"),prop.getProperty("browser"));
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
		browserClose();
	}
		
	@DataProvider(name = "getData")
		
		public String[][] getData() throws Exception 
	{
		String[][] data = readExcel(sheetname);
		
		return data ;
	}
}
