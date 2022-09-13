package POM_LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(id="userName")        private WebElement username;
	@FindBy(id="password")        private WebElement password;
	@FindBy(id="login")	          private WebElement login;
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void username(String UN)
	{
		username.sendKeys(UN);
	}
	
	public void password(String PWD)
	{
		password.sendKeys(PWD);
	}
	
	public void clickOnLogin()
	{
		login.click();
	}
	
	
}
