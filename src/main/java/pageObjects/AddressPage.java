package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddressPage {

	
	public WebDriver driver;
	
	By newAddress=By.cssSelector("a[title*='an address']");
	By womenTab=By.cssSelector("a[title='Women']");
	
		
	public AddressPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getAddNewAddress()
	{
		return driver.findElement(newAddress);
	}
	
	public WebElement getWomenTab()
	{
		return driver.findElement(womenTab);
	}
	
	
}
