package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.Utils;

public class Dress3Page {

	
	public WebDriver driver;
	
	By plusButton=By.xpath("//i[@class='icon-plus']");
	By sizeDropDown=By.xpath("//select[@id='group_1']");
	By addToCart=By.cssSelector("button[name='Submit'] span");
	By continueShopping=By.xpath("//span[@title='Continue shopping']//span[1]");
	By breadCrumbSummerDresses=By.xpath("//div[@class='breadcrumb clearfix']//a[@title='Summer Dresses'][normalize-space()='Summer Dresses']");
		
	public Dress3Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getPlusButton()
	{
		return  driver.findElement(plusButton);
	}
	
	public Select getSizeDropDown()
	{
		Select sizeDrop=new Select(driver.findElement(sizeDropDown)); 
		
		return sizeDrop;
	}
	
	public WebElement getAddCart()
	{
		return  driver.findElement(addToCart);
	}
	
	public WebElement getContinueShopping()
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(continueShopping));
		return driver.findElement(continueShopping);
	}
	
	public WebElement getBreadCrumbSummerDresses()
	{
		return  driver.findElement(breadCrumbSummerDresses);
	}
}
