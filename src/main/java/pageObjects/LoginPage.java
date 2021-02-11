package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	
	By email=By.cssSelector("#email");
	By password=By.cssSelector("#passwd");
	By submitButton=By.cssSelector("#SubmitLogin");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getButton()
	{
		return driver.findElement(submitButton);
	}
}
