package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

	
	public WebDriver driver;
	
	By myAddresses=By.cssSelector("a[title='Addresses']");
	By myOrders=By.cssSelector("a[title='Orders']");
	
	
	public AccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getAddress()
	{
		return driver.findElement(myAddresses);
	}
	
	public WebElement getOrders()
	{
		return driver.findElement(myOrders);
	}
	
	
}
