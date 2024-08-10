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
import page.Round_trip;

public class TC007_Round_Trip_Payment extends ProjectSpecification 

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
	Round_trip obj8 = new Round_trip(driver);
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
	obj8.from();
	obj8.destination();
	obj8.date();
	obj8.Search();
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




