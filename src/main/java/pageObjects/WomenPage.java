package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenPage {

	
	public WebDriver driver;
	
	By dressesCollapse=By.xpath("//div[@class='block_content']//li[@class='last']//span[@class='grower CLOSE']");
	By summerDresses=By.linkText("Summer Dresses");
	
		
	public WomenPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getDressesCollapse()
	{
		return driver.findElement(dressesCollapse);
	}
	
	public WebElement getSummerDresses()
	{
		return driver.findElement(summerDresses);
	}
	
	
}
