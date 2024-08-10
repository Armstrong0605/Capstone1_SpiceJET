package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class Payment_info extends ProjectSpecification 

{
	
@FindBy (id = "card_number")
WebElement number;

@FindBy (id = "name_on_card")
WebElement name;

@FindBy (id = "card_exp_month")
WebElement month;

@FindBy (id = "card_exp_year")
WebElement year;

@FindBy (id = "security_code")
WebElement cvv;

@FindBy (xpath ="//div[@data-testid='common-proceed-to-pay']")
WebElement payment;

public Payment_info(WebDriver driver)
  {
	Payment_info.driver = driver;
	PageFactory.initElements(driver, this);
  }

public Payment_info cardnumber (String CardNumber)
{
	sendkeys (number,CardNumber);
	return this;
}

public Payment_info cardname (String Cardname)
{
	sendkeys (name, Cardname);
	return this;
}

public Payment_info month (String Month)
{
	sendkeys (month,Month);
	return this;
}

public Payment_info year (String Year)
{
	sendkeys (year,Year);
	return this;
}

public Payment_info CVV (String Cvv)
{
	sendkeys (cvv,Cvv);
	return this;
}

public Payment_info Proceed()
{
	click(payment);
	return this;
}

}
