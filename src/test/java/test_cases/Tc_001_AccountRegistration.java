package test_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import page_objects.AccountRegistration_Page;
import page_objects.Home_Page;
import test_base.Base_Class;

public class Tc_001_AccountRegistration extends Base_Class
{

	@Test//(groups= {"Regression","Master"})
	public void testaccountregistration() throws InterruptedException
	{
		try
		{
		logger.atDebug();
		Home_Page hp=new Home_Page(driver);
		hp.clkaccount();
		hp.clkregister();
		
		AccountRegistration_Page ap=new AccountRegistration_Page(driver);
		logger.info("***test start********");
		ap.setfnm(randomalpahbet().toUpperCase());
		ap.setlnm(randomalpahbet().toUpperCase());
		ap.setemail(randomalpahbet()+"@gmail.com");
		ap.setpn(randomnumeric());
		ap.setcn();
		ap.setSA();
		ap.setSA2();
		ap.setcity();
		ap.setpo(randompin());
		ap.setmob2(randomnumeric());
		String pass=randomAlphanumeric();
		ap.setpwd(pass);
		ap.setcnfrmpwd(pass);
	/*WebElement rc = driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
	Thread.sleep(6000);
	driver.switchTo().frame(rc);
	
	driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(5000);*/
	//clk register
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	Thread.sleep(3000);
	
	String vc = ap.verifiedcaptcha();
	Assert.assertEquals(vc, "Please complete the captcha and try again.");
	logger.info("******test finish*****");}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		
		
		
		
		
	}
	
	
	
	
}
