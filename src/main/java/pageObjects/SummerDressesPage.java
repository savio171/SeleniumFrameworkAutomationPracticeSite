package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SummerDressesPage {

	
	public WebDriver driver;
	
	By listView=By.xpath("//li[@id='list']");
	By firstDress=By.xpath("//li[1]//div[1]//div[1]//div[2]//h5[1]//a[1]");
	By secondDress=By.xpath("//li[2]//div[1]//div[1]//div[2]//h5[1]//a[1]");
	By thirdDress=By.xpath("//a[normalize-space()='Printed Chiffon Dress']");
		
	public SummerDressesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getListView()
	{
		return driver.findElement(listView);
	}
	
	public WebElement getFirstDress()
	{
		return driver.findElement(firstDress);
	}
	
	public WebElement getSecondDress()
	{
		return driver.findElement(secondDress);
	}
	
	public WebElement getThirdDress()
	{
		return driver.findElement(thirdDress);
	}
}
