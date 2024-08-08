package page;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class HomePage extends ProjectSpecification{

	@FindBy (xpath ="//div[contains(text(),'Signup')]")
	WebElement Signup;
	
	public HomePage(WebDriver driver) 
	{
		HomePage.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void Signup_page ()
	{
		click (Signup);
		 String originalWindow = driver.getWindowHandle();
		 
	        Set<String> allWindows = driver.getWindowHandles();
	        
	        while (allWindows.size() == 1) 
	        {
	            allWindows = driver.getWindowHandles();
	        }

	        
	        String newWindowHandle = null;
	        for (String windowHandle : allWindows) 
	        {
	            if (!windowHandle.equals(originalWindow))
	            {
	                newWindowHandle = windowHandle;
	               
	                break;
	            }
	        }

	       
	        driver.switchTo().window(newWindowHandle);

	}
	
	public Signup Create_Account()
	{
		return new Signup(driver);
	}
      
	

}
