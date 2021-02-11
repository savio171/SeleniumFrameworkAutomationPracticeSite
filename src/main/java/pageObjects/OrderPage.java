package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {

	
	public WebDriver driver;
	
	By shoppingCartBreadCrumb=By.xpath("//span[normalize-space()='Your shopping cart']");
	By proceedCheckout1=By.xpath("//div[@id='center_column']//a[@title='Proceed to checkout']");
	By addressesBreadCrumb=By.xpath("//span[@class='navigation_page']");
	By proceedCheckout2=By.cssSelector("button[name='processAddress'] span");
	By shippingBreadCrumb=By.xpath("//span[@class='navigation_page']");
	By checkbox=By.xpath("//input[@id='cgv']");
	By proceedCheckout3=By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]");
	By paymentBreadCrumb=By.xpath("//span[@class='navigation_page']");
	By paymentCheck=By.xpath("//a[@title='Pay by check.']");
	By checkPaymentBreadCrumb=By.xpath("//span[@class='navigation_page']");
	By confirmOrder=By.xpath("//span[normalize-space()='I confirm my order']");
	By orderSuccess=By.xpath("//p[@class='alert alert-success']");
	By customerAccount=By.cssSelector("a[title='View my customer account'] span");
	By signOut=By.cssSelector("a[title='Log me out']");
	
	public OrderPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getShoppingCartBreadCrumb()
	{
		return driver.findElement(shoppingCartBreadCrumb);
	}
	
	public WebElement getProceedCheckout1()
	{
		return driver.findElement(proceedCheckout1);
	}
	
	public WebElement getAddressesBreadCrumb()
	{
		return driver.findElement(addressesBreadCrumb);
	}
	
	public WebElement getProceedCheckout2()
	{
		return driver.findElement(proceedCheckout2);
	}
	
	public WebElement getShippingBreadCrumb()
	{
		return driver.findElement(shippingBreadCrumb);
	}
	
	public WebElement getCheckbox()
	{
		return driver.findElement(checkbox);
	}
	
	public WebElement getProceedCheckout3()
	{
		return driver.findElement(proceedCheckout3);
	}
	
	public WebElement getPaymentBreadCrumb()
	{
		return driver.findElement(paymentBreadCrumb);
	}
	
	public WebElement getPaymentCheck()
	{
		return driver.findElement(paymentCheck);
	}
	
	public WebElement getCheckPaymentBreadCrumb()
	{
		return driver.findElement(checkPaymentBreadCrumb);
	}
	
	public WebElement getConfirmOrder()
	{
		return driver.findElement(confirmOrder);
	}
	
	public WebElement getOrderSuccess()
	{
		return driver.findElement(orderSuccess);
	}
	
	public WebElement getCustomerAccount()
	{
		return driver.findElement(customerAccount);
	}
	
	public WebElement getSignOut()
	{
		return driver.findElement(signOut);
	}
}
