package POM_RegisterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
	@FindBy(id="firstname")        private WebElement firstName;
	@FindBy(id="lastname")			private WebElement lastName;
	@FindBy(id="userName")          private WebElement userName;
	@FindBy(id="password")          private WebElement password;
	@FindBy(id="register")          private WebElement register;
	
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void firstname(String FN)
	{
		firstName.sendKeys(FN);
	}
	
	public void lastname(String LN)
	{
		lastName.sendKeys(LN);
	}
	
	public void username(String UN)
	{
		userName.sendKeys(UN);
	}
	
	public void password(String PWD)
	{
		password.sendKeys(PWD);
	}
	
/*	public void captcha(WebDriver driver)
	{
		//driver.switchTo().frame(8);
		captcha.click();
	}
*/
	public void register(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(10000);
		register.click();
	}
}
