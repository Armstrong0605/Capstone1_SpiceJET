package page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecification;

public class Login extends ProjectSpecification {

@FindBy (xpath = "//input[@data-testid='user-mobileno-input-box']")
WebElement number;

@FindBy (xpath = "//input[@type='password']")
WebElement Password;

@FindBy (xpath = "//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
WebElement Loginclick;

@FindBy (xpath ="//div[normalize-space()='Hi Jenner']")
WebElement Accountverification;

   public Login (WebDriver driver)
   {
	   Login.driver = driver;
	   PageFactory.initElements(driver, this);
   }
 
   public Login Number(String Phonenumber)
   {
	   sendkeys (number, Phonenumber);
	   return this;
   }
   
   public Login Password(String password)
   {
	   sendkeys(Password, password);
	   return this;
   }
   
   public Login Login_click()
   {
	   click(Loginclick);
	   return this;
   }
   
   public Login Account_verification() throws IOException
   {
	   String element = Accountverification.getText();
	   String expected= "Hi Jenner";
	   Assert.assertEquals(element, expected,"Verification Failed");
	   screenShot("Login Validation");
	   return this;
   }
 
   public HomePage Home_page()
   {
	   return new HomePage(driver);
	   
   }
}
