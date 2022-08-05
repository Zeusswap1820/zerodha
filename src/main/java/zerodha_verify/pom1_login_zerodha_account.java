package zerodha_verify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1_login_zerodha_account 
{
        @FindBy(xpath="//input[@type='text']")  private WebElement id;	
        
        @FindBy(xpath="//input[@type='password']")  private WebElement psw;	
        
        @FindBy(xpath="//button[@type='submit']")  private WebElement login;	


public pom1_login_zerodha_account(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
	
}

public void zerodha_login(String login_id)
{
	
	id.sendKeys(login_id);
	
	
	
}
public void enter_psw(String password)
{
	psw.sendKeys(password);
}

public void login()
{
	login.click();

}








}