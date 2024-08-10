package page;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.ProjectSpecification;

public class Oneway_Trip extends ProjectSpecification 

{
	@FindBy (xpath="//div[@class='container-class']//input[@type='text']")
	WebElement from;
	
	@FindBy (xpath="//input[@type='text' and @class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']\r\n")
	WebElement to;
	
	@FindBy (xpath ="//div[@class='css-76zvg2 r-1862ga2 r-ubezar r-1g94qm0']")
	WebElement nodestination;
	
	@FindBy (xpath="//div[contains(@class, 'r-14lw9ot')]//div[contains(@class, 'r-1awozwy') and contains(@class, 'r-1wtj0ep')]")
	WebElement Passengers;
	
	@FindBy(xpath = "//div[contains(text(),'Family & Friends')]")
	WebElement types;
	
	@FindBy (xpath="//div[contains(@class, 'css-1dbjc4n') and contains(@class, 'r-1loqt21')]/div[2]\r\n")
	WebElement Currency;
	
	@FindBy (xpath ="//*[@data-testid='home-page-flight-cta']")
	WebElement Searchflights;
	
	@FindBy (xpath ="//*[@data-testid='undefined-calendar-day-16']")
	WebElement date;
	
	
	
   public Oneway_Trip(WebDriver driver)
   {
	  Oneway_Trip.driver = driver;
	  PageFactory.initElements(driver, this);
   }
   
public Oneway_Trip startingfrom()
   {
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
   
public Oneway_Trip destination ()
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
   
public Oneway_Trip date() {
	
	date.click();

	return this;
}

  /* public Oneway_Trip Currency (String type)
   {
	   Select dropdown1 = new Select (Currency);
		dropdown1.selectByVisibleText(type);
		return this;	
   }*/
   
   public Oneway_Trip checkbox () throws IOException
   {
	   if (types.isSelected()) {  
           types.click(); 
           screenShot("One_Way Selection");
           
       }
	return this;
	   }
  
   public void Search () throws IOException
   {
	   click(Searchflights);
	   screenShot("Valid One way Test_Validation");
   }
   
   public Flight_Page Flight_page ()
   {
	   return new Flight_Page(driver);
   }
}
