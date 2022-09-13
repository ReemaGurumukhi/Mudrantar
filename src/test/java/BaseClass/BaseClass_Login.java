package BaseClass;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import UtiityClass.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_Login 
{
	protected WebDriver driver; 
	
	public void openApplication() throws IOException
	{
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://demoqa.com/login");
		 Reporter.log("Launching Application.",true);
		 
		 Utility.wait(driver, 1000);
		 
		 
		 
	}
}
