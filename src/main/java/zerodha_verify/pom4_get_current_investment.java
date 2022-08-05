package zerodha_verify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom4_get_current_investment {
	
	
	@FindBy (xpath="//div[@class='secondary-stats six columns m7']//span[2]")private WebElement current_invest;

	
	
  public pom4_get_current_investment (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void current_investment()
	{
		String value = current_invest.getText();
		
		System.out.println(value);
	}
}
