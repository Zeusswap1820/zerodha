package test_verify;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.base_class;
import library.utility;
import zerodha_verify.pom1_login_zerodha_account;
import zerodha_verify.pom2_2A_authentication;
import zerodha_verify.pom3_verify_profile_name;
import zerodha_verify.pom4_get_current_investment;

public class testNG_test_class extends base_class{
	
	pom1_login_zerodha_account zo1;
	pom2_2A_authentication zo2;
	pom3_verify_profile_name zo3;
	pom4_get_current_investment zo4;
	int TCID;
	@BeforeClass
	public void openbrowser() throws IOException, InterruptedException
	{
		initializeBrowser();
		Thread.sleep(3000);
		
		zo1=new pom1_login_zerodha_account(driver);
		
		 zo2=new pom2_2A_authentication(driver);
		
		 zo3=new pom3_verify_profile_name(driver);
		
		 zo4=new pom4_get_current_investment(driver);	
	}
	@BeforeMethod
	public void login_App() throws IOException, InterruptedException
	{
		
	    Thread.sleep(3000);
		zo1.zerodha_login(utility.credential("userid"));
		zo1.enter_psw(utility.credential("psw"));
		zo1.login();
		
		Thread.sleep(5000);
		zo2.factor_authentication(utility.credential("pin"));
		zo2.submit();
		
	}
	@Test
	public void verify() throws EncryptedDocumentException, IOException
	{
		
		zo3.vrify_profile();
		
		String actual=zo3.verify();
		String expected=utility.get_test_data(0, 3);
		
		Assert.assertEquals(actual, expected,"failes both are not equal");
	}
	
	@AfterMethod
	public void logout(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
		utility.captureScreenshot(driver,TCID);
			
		}
		
		
		
	}
	
	
	
	

}
