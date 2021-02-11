package ATC_Round2;

import org.testng.annotations.DataProvider;

public class LoginData {

	
	@DataProvider
	public static Object[][] getData()
	{
		Object[][] data = new Object[1][2];
		
		data[0][0]="seleniumTestabcd@gmail.com";
		data[0][1]="Sele@1234";
		
		return data;
	}
}
