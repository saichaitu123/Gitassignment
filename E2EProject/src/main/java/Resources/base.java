package Resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import PageObjects.Helperclass;

public class base {
public WebDriver driver;
public Properties prop;
Helperclass h1 = new Helperclass();
public WebDriver initializeDriver() throws IOException
{
	prop=new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+h1.path());
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", h1.driverpath());
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
	}
	
	else if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", h1.driverpath());
		FirefoxOptions options= new FirefoxOptions();
		options.addPreference("dom.webnotifications.enabled", false);
		driver=new FirefoxDriver(options);
		
	}
	driver.manage().window().maximize();
	return driver;
}

}
