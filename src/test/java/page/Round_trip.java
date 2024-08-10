package page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecification;

public class Round_trip extends ProjectSpecification 

{
	@FindBy(xpath ="//div[text()='round trip']")
	WebElement roundtrip;
	
	@FindBy (xpath ="//*[@data-testid='home-page-flight-cta']")
	WebElement Searchflights;
	
	@FindBy (xpath ="//*[@data-testid='undefined-calendar-day-17']")
	WebElement date;
	
	@FindBy (xpath ="//*[@data-testid='undefined-calendar-day-18']")
	WebElement returndate;
	

	public Round_trip (WebDriver driver)
	{
		Round_trip.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public Round_trip from() {
	WebElement originDiv = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']"));

	// Click on the div to expand options or make it active
	originDiv.click();

	// Wait for options to be visible (if applicable)
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement kochiOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid='to-testID-origin']//div[text()='Chennai']")));

	// Click on the "Kochi" option
	kochiOption.click();
	return this;
   }
   
public Round_trip destination ()
   {
	 WebElement destinationDiv = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']"));

     // Click on the div to expand options or make it active
     destinationDiv.click();

     // Wait for the "Dubai" option to be visible (adjust the wait condition as needed)
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     WebElement dubaiOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid='to-testID-destination']//div[text()='Delhi']")));

     // Click on the "Dubai" option
     dubaiOption.click();
	return this;
   } 
   
public Round_trip date() {
	
	date.click();
	returndate.click();

	return this;
}

  /* public Oneway_Trip Currency (String type)
   {
	   Select dropdown1 = new Select (Currency);
		dropdown1.selectByVisibleText(type);
		return this;	
   }*/
   
  /* public Round_trip checkbox () throws IOException
   {
	   if (types.isSelected()) {  
           types.click(); 
           screenShot("One_Way Selection");
           
       }
	return this;
	   } */
  
   public void Search ()
   {
	   click(Searchflights);
   }
   
   public Flight_Page Flight_page ()
   {
	   return new Flight_Page(driver);
   }
}


