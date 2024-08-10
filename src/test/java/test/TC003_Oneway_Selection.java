package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import page.Add_On;
import page.Flight_Page;
import page.HomePage;
import page.Login;
import page.Oneway_Trip;
import page.Passangers;

public class TC003_Oneway_Selection extends ProjectSpecification 

{
	@BeforeTest
	public void setup () throws Exception
	{
		readFromPropFile();
		sheetname ="Login";
	}
		@Test (dataProvider = "getData")
	public void validSelection (String Phonenumber, String password) throws Exception

{
	HomePage obj = new HomePage(driver);
	Oneway_Trip obj3 = new Oneway_Trip(driver);
	Flight_Page obj4 = new Flight_Page (driver);
    Login obj2 = new Login(driver);
    Passangers obj5 = new Passangers(driver);
    Add_On obj6 = new Add_On (driver);
	
	obj.Login();
	obj2.Number(Phonenumber);
	obj2.Password(password);
	obj2.Login_click();
	obj2.Account_verification();
	obj3.startingfrom();
	obj3.destination();
	obj3.date();
	
	obj3.Search();
	obj4.Conitinue();
	obj5.Select();
	obj5.Add();
	obj6.Select();
}
}

