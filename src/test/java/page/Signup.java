package page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList;

import page.Signup;
import base.ProjectSpecification;

public class Signup extends ProjectSpecification 

{
   @FindBy(id ="first_name")
   WebElement firstname;
   
   @FindBy(id="last_name")
   WebElement lastname;
   
   @FindBy(xpath = "//input[@placeholder='+91 01234 56789']")
   WebElement mobilenumber;
   
   @FindBy (xpath ="//input[@id='email_id']")
   WebElement mailid;
   
   @FindBy (id ="new-password")
   WebElement password;
   
   @FindBy (id ="c-password")
   WebElement Confirmpassword;
   
   @FindBy (xpath="//div[@class='col-sm-4 mt-2 px-sm-4']//select[contains(@class,'form-control form-select')]")
  WebElement title;
   
   @FindBy (xpath ="//select[@class='form-control form-select']")
   WebElement Country;
   
   @FindBy (id="dobDate")
   WebElement date;
   
   @FindBy (id="defaultCheck1")
   WebElement Terms_Condition;
   
   @FindBy (xpath ="//button[@type='button']")
   WebElement signin;
   
	
	public Signup(WebDriver driver)
   {
	 Signup.driver = driver;
	
	 PageFactory.initElements(driver, this);
   }
	
	public Signup enterfirstname (String Firstname)
	{
	   sendkeys(firstname, Firstname);
	   return this;
	}
	
	public Signup enterlasttname (String Lastname)
	{
	   sendkeys(lastname, Lastname);
	   return this;
	}
	
	public Signup entermobilenumber(String Mobile)
	{
		sendkeys (mobilenumber, Mobile);
		return this;
	}
	
	public Signup entermailid (String Mailid)
	{
		
		sendkeys (mailid,Mailid );
		
		return this;
	}
	
	public Signup enterpassword (String Password)
	{
		sendkeys (password,Password);
		return this;
	}
	
	public Signup confirmpassword (String confirmPassword)
	{
	    sendkeys(Confirmpassword,confirmPassword);
	    return this;
	}
	
	public Signup Title(String Title)
	{
	       Select dropdown = new Select (title);
	       dropdown.selectByVisibleText(Title);
		   return this;
	}
	
	public Signup Country (String country)
	{
		Select dropdown1 = new Select (Country);
		dropdown1.selectByVisibleText(country);
		return this;	
	}
	
	public Signup date (String Date)
	{
		sendkeys (date,Date);
		return this;
	}
	
	public void Terms () throws IOException  
	{
		
		if (Terms_Condition.isSelected()) {  
            Terms_Condition.click(); 
            screenShot("Signup_Validation");
        }
		
	}
	
	public void clickSignup() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click(signin);
	}
	public HomePage Homepage()
	{
		return new HomePage(driver);
	}
}
