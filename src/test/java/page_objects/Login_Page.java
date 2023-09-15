package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends Base_Page
{
	public Login_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='inputEmail']")WebElement email;
	@FindBy(xpath="//input[@id='inputPassword']")WebElement password;
	@FindBy(xpath="//button[@id='login']")WebElement loginn;
	
	
	public void setemail(String eml)
	{
		email.sendKeys(eml);
	}
	public void setpassword(String pswrd)
	{
		password.sendKeys(pswrd);
	}
	public void clkloginn()
	{
		loginn.click();
	}


}
