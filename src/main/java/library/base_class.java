package library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class{
	
	public  WebDriver driver;
	public void initializeBrowser() throws IOException
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ac\\Desktop\\selenium setup\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.navigate().to(utility.credential("url"));
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}
}