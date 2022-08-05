package library;


	
	
	

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class utility {
	
	public static String get_test_data(int rowindex ,int cellindex) throws EncryptedDocumentException, IOException
	{

		FileInputStream file=new FileInputStream("C:\\Users\\ac\\eclipse-workspace\\selenium\\zerodha_excel_sheet\\PB_DDF.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value=sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		return value;
		
	}
    public static void captureScreenshot(WebDriver driver, int TCID) throws IOException
{
 	
 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 File dest =new File("C:\\Users\\ac\\eclipse-workspace\\selenium\\zerodha_screenshot\\img.jpg ");
 FileHandler.copy(src, dest);

	
}
    public static String credential(String key) throws IOException
    {
    	FileInputStream file=new FileInputStream("C:\\Users\\ac\\eclipse-workspace\\selenium\\src\\zerodha\\imp credential.properties");
    	Properties p=new Properties();
    	p.load(file);
    	String value=p.getProperty(key);
    	return value;
    	
    }
    
    
    
    
    
    
}




