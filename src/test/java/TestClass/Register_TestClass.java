package TestClass;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import BaseClass.BaseClass_Register;
import POM_RegisterPage.RegisterPage;
import UtiityClass.Utility;

public class Register_TestClass extends BaseClass_Register
{
	RegisterPage rp;
	
  @BeforeClass
  public void launchBrowser() throws IOException 
  {
	  openApplication();
	  rp = new RegisterPage(driver);
  }
  
  @Test
  public void registerToApp() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  rp.firstname(Utility.readDataFromExcel_Register(0, 0));		Utility.wait(driver, 1000);
	  rp.lastname(Utility.readDataFromExcel_Register(1, 0));		Utility.wait(driver, 1000);
	  rp.username(Utility.readDataFromExcel_Register(2, 0));		Utility.wait(driver, 1000);
	  rp.password(Utility.readDataFromExcel_Register(3, 0));		Utility.wait(driver, 1000);
	
	  String TCID="RegisterPage";
	  Utility.captureScreenShot(driver, TCID);
	  Utility.wait(driver, 1000);
	  
	  rp.register(driver);
	  String TCID1="Successfull Login";
	  Utility.captureScreenShot(driver, TCID1);
	  Reporter.log("Successful registered",true);
  }
  
 
}
