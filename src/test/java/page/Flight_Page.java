package page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class Flight_Page extends ProjectSpecification 

{
    
    @FindBy (xpath ="//*[@data-testid='continue-search-page-cta']")
	 WebElement continuebutton;
     
      public  Flight_Page (WebDriver driver) 
    
    {
    	Flight_Page.driver = driver;
    	PageFactory.initElements(driver, this);
    }
      
      public Flight_Page Conitinue () throws InterruptedException
      {
    	  Thread.sleep(Duration.ofSeconds(10));
    	  click(continuebutton);
    	  return this;
      }
}
