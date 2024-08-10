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
import page.Payment_info;

public class TC005_Oneway_payment extends ProjectSpecification

{
	
		@BeforeTest
		public void setup () throws Exception
		{
			readFromPropFile();
			
			sheetname="Payment";
		}
			@Test (dataProvider = "getData")
		public void validSelection (String CardNumber, String Cardname, String Month, String Year, String Cvv ) throws Exception

	{
		HomePage obj = new HomePage(driver);
		Oneway_Trip obj3 = new Oneway_Trip(driver);
		Flight_Page obj4 = new Flight_Page (driver);
	    Login obj2 = new Login(driver);
	    Passangers obj5 = new Passangers(driver);
	    Add_On obj6 = new Add_On (driver);
	    Payment_info obj7 = new Payment_info(driver);
		
		obj.Login();
		obj2.Number("8754645405");
		obj2.Password("Jenner123@");
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
		obj7.cardnumber(CardNumber);
		obj7.cardname(Cardname);
		obj7.month(Month);
		obj7.year(Year);
		obj7.CVV(Cvv);
		obj7.Proceed();
	}
	}


