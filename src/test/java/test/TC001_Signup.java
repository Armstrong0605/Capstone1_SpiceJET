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
		
		}
		
		@Test 
		
		public void Cart_Page_Validation () throws Exception

	{
		HomePage obj = new HomePage(driver);
		Signup obj1 = new Signup(driver);
		
		obj.Signup_page();
		
		obj1.firstname();
		
		
	}
	}
