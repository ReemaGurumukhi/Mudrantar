package TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.BaseClass_Login;
import POM_LoginPage.LoginPage;
import UtiityClass.Utility;

public class Login_TestClass extends BaseClass_Login
{
	LoginPage lp;
	
@BeforeClass
 public void launchBrowser() throws IOException 
	  {
		  openApplication();
		  lp = new LoginPage(driver);
	  }


  @Test
  public void LoginToApplication() throws EncryptedDocumentException, IOException 
  {
	  lp.username(Utility.readDataFromExcel_Login(0,0));
	  lp.password(Utility.readDataFromExcel_Login(1, 0));
	  lp.clickOnLogin();
	  Utility.wait(driver, 8000);
	  String TCID="Login Successfull";
	  Utility.captureScreenShot(driver, TCID);
	  Reporter.log("Login Successfull",true);
  }
}
