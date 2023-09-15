package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends Base_Page 
{
	//constructor
	public Home_Page(WebDriver driver)
	{
		super(driver);
	}
	
	//WebElement
	
	@FindBy(xpath="//a[@class=' dropdown-toggle']")WebElement Account;
	@FindBy(xpath="//a[normalize-space()= 'Register']")WebElement register;
	@FindBy(xpath="//a[normalize-space()='Login']")WebElement login;

	//Action methods
	
	public void clkaccount()
	{
		Account.click();
	}
	public void clkregister()
	{
		register.click();
	}
	public void clicklogin()
	{
		login.click();
	}
	
}
