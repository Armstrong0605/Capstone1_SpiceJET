package page;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class Pages extends ProjectSpecification 

{

@FindBy (xpath ="//div[@data-testid='check-in-horizontal-nav-tabs']")
WebElement Checkin;

@FindBy (xpath= "//div[@data-testid='flight status-horizontal-nav-tabs']")
WebElement flightstatus;

@FindBy (xpath="//div[@data-testid='manage booking-horizontal-nav-tabs']")
WebElement ManageBookings;


 public Pages( WebDriver driver)
 {
	 Pages. driver = driver;
	 PageFactory.initElements(driver, this);
	
 }
 
 public  Pages validatecheckin(String type, String message) throws Exception {
    
	 if (type.equalsIgnoreCase("open")) {
        
         Checkin.click();
     }
     
	 return this;
 }

  
    
    public  Pages validateflight(String type, String message) throws Exception {
        
   	 if (type.equalsIgnoreCase("open")) {
           
            flightstatus.click();
        }
        
   	 return this;
    }

   
       public  Pages validateBooking(String type, String message) throws Exception {
           
     if (type.equalsIgnoreCase("open")) {
    	           
    	 ManageBookings.click();
   	    
            }
    	        
    return this;
    	    }
  
       public HomePage returnhome()
    	   {
    		  return new HomePage(driver);
    	   }
}
