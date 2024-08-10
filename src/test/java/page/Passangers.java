package page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class Passangers extends ProjectSpecification 

{
	
	@FindBy (xpath ="//*[@data-testid='traveller-info-continue-cta']")
	WebElement select;
	
	@FindBy(xpath ="//div[contains(text(),'I am flying as the primary passenger')]")
	WebElement check;
  public Passangers (WebDriver driver)
  {
	  Passangers.driver = driver;
	  PageFactory.initElements(driver, this);
  }
  
  public Passangers Select() throws InterruptedException, IOException 
  {    
	  Thread.sleep(Duration.ofSeconds(10));
	  click (check);
	  click(select);
	  screenShot("Passangers Test_Validation");
	  
	  return this;
  }
  public Add_On Add()
  {
	  return new Add_On(driver);
  }
}
