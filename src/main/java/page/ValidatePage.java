package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidatePage {
	WebDriver driver;
	 
	
	public ValidatePage(WebDriver driver)
	{
	    this.driver=driver;	
	}
	//list of web elements
    @FindBy(how = How.XPATH,using="//input[@name='allbox']")
    WebElement toggleAllElement;
  //  @FindBy(how = How.XPATH,using="//input[@name='todo[5]']") 
    @FindBy(how=How.,using)
    WebElement singleCheckboxElement;
    @FindBy(how = How.XPATH,using="//input[@type='checkbox']") 
    WebElement allCheckboxElement;
 	@FindBy(how = How.XPATH,using="/html/body/div/div/div/form/div[3]/button")
 	WebElement signinButton;
}
