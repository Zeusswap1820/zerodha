package zerodha_verify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2_2A_authentication {
	
	@FindBy(xpath="//input[@type='password']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	
	
	
	public pom2_2A_authentication(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void factor_authentication(String factor)
	{
		
		pin.sendKeys(factor);
	}
	public void submit()
	{
		submit.click();

	}
}
