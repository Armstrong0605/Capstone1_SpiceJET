package test;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
import base.ProjectSpecification;
import page.HomePage;
import page.Signup;

public class TC001_Signup extends ProjectSpecification

{
  
	@BeforeTest
	public void setup () throws Exception
	{
		readFromPropFile();
		sheetname ="Signup";
	}
		@Test(dataProvider = "getData")
	public void valid_Signup (String Title, String Firstname,String Lastname, String country, String Date, String Mailid, String Mobile, String Password, String confirmPassword) throws Exception

{
	HomePage obj = new HomePage(driver);
	Signup obj1 = new Signup(driver);
	
	obj.Signup_page();
	obj.Create_Account();
	obj1.Title(Title);
	obj1.enterfirstname(Firstname);
	obj1.enterlasttname(Lastname);
	obj1.Country(country);
	obj1.date(Date);
	obj1.entermailid(Mailid);
	obj1.entermobilenumber(Mobile);
	obj1.enterpassword(Password);
	obj1.confirmpassword(confirmPassword);
	obj1.Terms();
	obj1.clickSignup();
	
}
}

