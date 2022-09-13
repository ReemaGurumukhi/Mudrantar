package UtiityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import net.bytebuddy.utility.RandomString;


public class Utility 
{
	public static String readDataFromExcel_Register(int rowNum,int cellNum) throws EncryptedDocumentException, IOException            //--everyone can use
	{
		//File myFile = new File("C:\\Users\\Reema\\eclipse-workspace\\demoqa\\Excel.xlsx");
		FileInputStream myFile = new FileInputStream("C:\\Users\\Reema\\eclipse-workspace\\demoqa\\Excel.xlsx");
		Reporter.log("Reading Data from Excel",true);
		String	value = WorkbookFactory.create(myFile).getSheet("Register").getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
		
		
		
	}
	
	public static String readDataFromExcel_Login(int rowNum,int cellNum) throws EncryptedDocumentException, IOException            //--everyone can use
	{
		FileInputStream myFile = new FileInputStream("C:\\Users\\Reema\\eclipse-workspace\\demoqa\\Excel.xlsx");
		Reporter.log("Reading Data from Excel",true);
		String value = WorkbookFactory.create(myFile).getSheet("Login").getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
	}
	
	
	
	public static void captureScreenShot(WebDriver driver, String TCID) throws IOException
	{
		TakesScreenshot js = (TakesScreenshot)driver;
		File src = js.getScreenshotAs(OutputType.FILE);
		String rand = RandomString.make(4);
		File dest = new File("C:\\Users\\Reema\\eclipse-workspace\\demoqa\\src\\ScreenShot\\snap" +TCID+rand+ ".jpg");
		FileHandler.copy(src, dest);
		Reporter.log("Taken Screenshot",true);
	}
	
	public static int wait(WebDriver driver , int sec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(sec));
		return  sec;
	}
}
