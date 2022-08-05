package zerodha_verify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class pom3_verify_profile_name {
	
	@FindBy (xpath="//span[@class='user-id']")private WebElement profile;
	@FindBy (xpath="//h4[@class='username']")private WebElement name;

	
        public	pom3_verify_profile_name(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
		
	}
	
	   public void vrify_profile()
	   {
		   
		   profile.click();
		   
	   }
	   public String verify()
	   {
		 
		   String actual=name.getText();
		   
		   return actual;
//		   
//		   if(expected.equals(actual))
//		   {
//			   System.out.println("name is verified");
//		   }
//		   else
//		   {
//			   System.out.println("not verified");
//		   }
		   
		   
	   }
	

}
