package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import page.HomePage;
import page.Login;
import page.Signup;

public class TC002_Login extends ProjectSpecification

{
	  
	@BeforeTest
	public void setup () throws Exception
	{
		readFromPropFile();
		sheetname ="Login";
	}
		@Test (dataProvider = "getData")
	public void validlogin (String Phonenumber, String password) throws Exception

{
	HomePage obj = new HomePage(driver);
	Login obj2 = new Login(driver);
	
	obj.Login();
	obj2.Number(Phonenumber);
	obj2.Password(password);
	obj2.Login_click();
	obj2.Account_verification();
}
}


