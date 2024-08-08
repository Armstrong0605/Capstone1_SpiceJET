package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class Signup extends ProjectSpecification 

{
   @FindBy(id ="first_name")
   WebElement firstname;
   
   
	
	public Signup(WebDriver driver)
   {
	 Signup.driver = driver;
	
	 PageFactory.initElements(driver, this);
   }
	
	public void firstname() 
	
	{
	  sendkeys(firstname,"Jenner");
	}
	
	
}
