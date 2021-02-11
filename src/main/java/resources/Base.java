package resources;


import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

		public  WebDriver driver;
		
	public WebDriver initializeDriver() throws IOException
	{
		
		Properties prop= new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\savio.shaji\\eclipse-workspace\\SeleniumFramework\\src\\main\\java\\resources\\data.properties");

	prop.load(fis);
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);

	if(browserName.equals("chrome"))
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\savio.shaji\\Downloads\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
			//execute in chrome driver
		
	}
	else if (browserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\savio.shaji\\Downloads\\drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		//firefox code
	}
	else if (browserName.equals("edge"))
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\savio.shaji\\Downloads\\drivers\\msedgedriver.exe");
		driver= new EdgeDriver();
		//IE code
	}

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;


	}
	
	
	}

