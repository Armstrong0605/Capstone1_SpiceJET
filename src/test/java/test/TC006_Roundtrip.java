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
import page.Round_trip;

public class TC006_Roundtrip extends ProjectSpecification
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
		Round_trip obj8 = new Round_trip(driver);
		Flight_Page obj4 = new Flight_Page (driver);
	    Login obj2 = new Login(driver);
	    Passangers obj5 = new Passangers(driver);
	    Add_On obj6 = new Add_On (driver);
		
		obj.Login();
		obj2.Number(Phonenumber);
		obj2.Password(password);
		obj2.Login_click();
		obj2.Account_verification();
		obj8.from();
		obj8.destination();
		obj8.date();
		obj8.Search();
		obj4.Conitinue();
		obj5.Select();
		obj5.Add();
		obj6.Select();
	}
	}

