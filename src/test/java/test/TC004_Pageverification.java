package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import base.ProjectSpecification;
import page.HomePage;
import page.Pages;

public class TC004_Pageverification extends ProjectSpecification

{
	@BeforeTest
	public void setup () throws Exception
	{
		readFromPropFile();
	
	}
	
	@Test
	
	public void validpage () throws Exception

{
	HomePage obj = new HomePage(driver);
	Pages obj4 = new Pages(driver);
	
	//obj.clickUSA();
	//obj.Bottom_linktest();
	obj4.validatecheckin("open", "page not found");
	obj4.validateBooking("open", "page not found");
	obj4.validateflight("open", "page not found");
}
}
