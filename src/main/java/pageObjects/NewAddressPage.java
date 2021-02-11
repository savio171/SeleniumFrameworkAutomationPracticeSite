package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewAddressPage {

	
	public WebDriver driver;
	
	By firstName=By.cssSelector("#firstname");
	By lastName=By.cssSelector("#lastname");
	By company=By.cssSelector("#company");
	By addressLine1=By.cssSelector("#address1");
	By addressLine2=By.cssSelector("#address2");
	By city=By.cssSelector("#city");
	By stateDropDown= By.cssSelector("#id_state");
	By zipCode=By.cssSelector("#postcode");
	By countryDropDown=By.cssSelector("#id_country");
	By homePhone=By.cssSelector("#phone");
	By mobilePhone=By.cssSelector("#phone_mobile");
	By addInfo=By.cssSelector("#other");
	By addTitle=By.cssSelector("#alias");
	By saveButton=By.cssSelector("button[id='submitAddress']");
		
	public NewAddressPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getFirstName()
	{
		return driver.findElement(firstName);
	}
	
	public WebElement getLastName()
	{
		return driver.findElement(lastName);
	}
	
	public WebElement getCompany()
	{
		return driver.findElement(company);
	}
	
	public WebElement getAddressLine1()
	{
		return driver.findElement(addressLine1);
	}
	
	public WebElement getAddressLine2()
	{
		return driver.findElement(addressLine2);
	}
	
	public WebElement getCity()
	{
		return driver.findElement(city);
	}
	
	
	public Select getState()
	{
		Select sDropDown= new Select ( driver.findElement(stateDropDown));
	
		return (sDropDown);
	}
	
	public WebElement getZipCode()
	{
		return driver.findElement(zipCode);
	}
	
	public Select getCountry()
	{
		Select cDropDown= new Select (driver.findElement(countryDropDown));
		
		return cDropDown;
	}
	
	public WebElement getHomePhone()
	{
		return driver.findElement(homePhone);
	}
	
	public WebElement getMobilePhone()
	{
		return driver.findElement(mobilePhone);
	}
	
	public WebElement getAdditionalInfo()
	{
		return driver.findElement(addInfo);
	}
	
	public WebElement getAddressTitle()
	{
		return driver.findElement(addTitle);
	}
	
	public WebElement getSaveButton()
	{
		return driver.findElement(saveButton);
	}
}
