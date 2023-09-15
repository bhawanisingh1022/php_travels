package test_cases;

import org.testng.annotations.Test;

import page_objects.Home_Page;
import page_objects.Login_Page;
import test_base.Base_Class;

public class Tc_002_testLogin extends Base_Class
{
	@Test
	public void test_login() throws InterruptedException
	{
		Home_Page hm=new Home_Page(driver);
		hm.clkaccount();
		hm.clicklogin();
		
		Login_Page lp=new Login_Page(driver);
		lp.setemail(rb.getString("email"));
		lp.setpassword(rb.getString("password"));
		Thread.sleep(3000);
		
		lp.clkloginn();
	}
	

}
