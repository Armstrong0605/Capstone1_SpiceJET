package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecification;

public class Add_On extends ProjectSpecification

{
	
		@FindBy(id ="at_addon_close_icon")
		WebElement close;
		
		@FindBy (xpath ="//div[@data-testid='add-ons-continue-footer-button' and not(contains(@style, 'display: none'))]")
		WebElement Addon;
		
	  public Add_On (WebDriver driver)
	  {
		  Add_On.driver = driver;
		  PageFactory.initElements(driver, this);
	  }
	  
	  public Add_On Select() throws InterruptedException 
	  {
		  Thread.sleep(Duration.ofSeconds(10));
	        Addon.click();	
	        WebElement element = driver.findElement(By.id("skipfrompopup"));

	        if (element.isDisplayed()) {
	            element.click();
	        }
		  
		  return this;
	  }
	}

