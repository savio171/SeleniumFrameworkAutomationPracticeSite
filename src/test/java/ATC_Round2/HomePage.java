package ATC_Round2;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.AddressPage;
import pageObjects.Dress1Page;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.NewAddressPage;
import pageObjects.OrderPage;
import pageObjects.SummerDressesPage;
import pageObjects.WomenPage;
import resources.Base;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class HomePage extends Base{

	
	@Test(dataProvider = "getData",dataProviderClass=LoginData.class)
	
	public void basePageNavigation(String email, String password) throws IOException
	{
		driver=initializeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		LandingPage l=new LandingPage(driver);
		System.out.println(l.driver.getTitle());
		Assert.assertEquals(l.driver.getTitle(), "My Store");
		l.getLogin().click();
		
		LoginPage lp=new LoginPage(driver);
		System.out.println(lp.driver.getTitle());
		Assert.assertEquals(lp.driver.getTitle(), "Login - My Store"); 
		lp.getEmail().sendKeys(email);
		lp.getPassword().sendKeys(password);
		lp.getButton().click();
		
		AccountPage ap= new AccountPage(driver);
		System.out.println(ap.driver.getTitle());
		Assert.assertEquals(ap.driver.getTitle(), "My account - My Store");
		ap.getAddress().click();
		
		AddressPage ad=new AddressPage(driver);
		System.out.println(ad.driver.getTitle());
		Assert.assertEquals(ad.driver.getTitle(), "Addresses - My Store");
		ad.getAddNewAddress().click();
		
		NewAddressPage np= new NewAddressPage(driver);
		System.out.println(np.driver.getTitle());
		Assert.assertEquals(np.driver.getTitle(), "Address - My Store");
		
		np.getFirstName().clear();
		np.getFirstName().sendKeys("Selenium");
		np.getLastName().clear();
		np.getLastName().sendKeys("Tester");
		np.getCompany().sendKeys("Company A");
		np.getAddressLine1().sendKeys("Flat, Building A");
		np.getAddressLine2().sendKeys("Street, last");
		np.getCity().sendKeys("City B");
		np.getState().selectByVisibleText("California");
		np.getZipCode().sendKeys("12345");
		np.getCountry().selectByValue("21");;
		np.getHomePhone().sendKeys("0987654343");
		np.getMobilePhone().sendKeys("1234567878");
		np.getAdditionalInfo().sendKeys("Selenium Framework");
		np.getAddressTitle().clear();
		np.getAddressTitle().sendKeys("Test43431");
		np.getSaveButton().click();
		
		System.out.println(ad.driver.getTitle());
		Assert.assertEquals(ad.driver.getTitle(), "Addresses - My Store");
		ad.getWomenTab().click();
		
		WomenPage wp= new WomenPage(driver);
		System.out.println(wp.driver.getTitle());
		Assert.assertEquals(wp.driver.getTitle(), "Women - My Store");
		wp.getDressesCollapse().click();
		wp.getSummerDresses().click();
		
		SummerDressesPage sd=new SummerDressesPage(driver);
		System.out.println(sd.driver.getTitle());
		Assert.assertEquals(sd.driver.getTitle(), "Summer Dresses - My Store");
		sd.getListView().click();
		sd.getFirstDress().click();
		
		Dress1Page dp1=new Dress1Page(driver);
		System.out.println(dp1.driver.getTitle());
		Assert.assertEquals(dp1.driver.getTitle(), "Printed Summer Dress - My Store");
		
		int i=1;
		while (i<5)
		{
			dp1.getPlusButton().click();
			i++;
		}
		
		dp1.getSizeDropDown().selectByVisibleText("L");
		dp1.getAddCart().click();
		dp1.getContinueShopping().click();
		dp1.getBreadCrumbSummerDresses().click();
		
		sd.getSecondDress().click();
		
		int j=1;
		while (j<5)
		{
			dp1.getPlusButton().click();
			j++;
		}
		
		dp1.getSizeDropDown().selectByVisibleText("L");
		dp1.getAddCart().click();
		dp1.getContinueShopping().click();
		dp1.getBreadCrumbSummerDresses().click();
		
		sd.getThirdDress().click();
		
		int k=1;
		while (k<5)
		{
			dp1.getPlusButton().click();
			k++;
		}
		
		dp1.getSizeDropDown().selectByVisibleText("L");
		dp1.getAddCart().click();
		dp1.getCheckout().click();
		
		OrderPage op=new OrderPage(driver);
		System.out.println(op.getShoppingCartBreadCrumb().getText());
		Assert.assertEquals(op.getShoppingCartBreadCrumb().getText(), "Your shopping cart");
		op.getProceedCheckout1().click();
		
		System.out.println(op.getAddressesBreadCrumb().getText());
		Assert.assertEquals(op.getAddressesBreadCrumb().getText(), "Addresses");
		op.getProceedCheckout2().click();
		
		System.out.println(op.getShippingBreadCrumb().getText());
		Assert.assertEquals(op.getShippingBreadCrumb().getText(), "Shipping");
		op.getCheckbox().click();
		op.getProceedCheckout3().click();
		
		System.out.println(op.getPaymentBreadCrumb().getText());
		Assert.assertEquals(op.getPaymentBreadCrumb().getText(), "Your payment method");
		op.getPaymentCheck().click();
		
		System.out.println(op.getCheckPaymentBreadCrumb().getText());
		Assert.assertEquals(op.getCheckPaymentBreadCrumb().getText(), "Check payment");
		op.getConfirmOrder().click();
		
		System.out.println(op.getOrderSuccess().getText());
		Assert.assertEquals(op.getOrderSuccess().getText(), "Your order on My Store is complete.");
		
		op.getCustomerAccount().click();
		
		ap.getOrders().click();
		
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(driver);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\orderhistory.jpg";
		ImageIO.write(screenshot.getImage(), "jpg", new File(destinationFile));
		
		op.getSignOut().click();
		driver.quit();
	}
	
	
}
