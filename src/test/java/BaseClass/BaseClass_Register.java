package BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import UtiityClass.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_Register 
{
protected static WebDriver driver;                     
	
	public void openApplication() throws IOException
	{
		 WebDriverManager.chromedriver().setup();
		 
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-extensions");
		 driver = new ChromeDriver(opt);
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/register");
		 Reporter.log("Launching Application.",true);
		 
		 Utility.wait(driver, 1000);
	}
	
	
	
}

