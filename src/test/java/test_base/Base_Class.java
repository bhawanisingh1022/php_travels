package test_base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class 
{
	public ResourceBundle rb;
	public Logger logger;
	public WebDriver driver;
	@BeforeClass//(groups= {"Regression","Master"})
	@Parameters("browser")
	public void setup(String br)
	{
		
		rb=ResourceBundle.getBundle("config");//load config.properties
		logger=LogManager.getLogger(this.getClass());//for logger
		//ChromeOptions options=new ChromeOptions();remove header automation tag in app.
		//options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		if(br.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();}
		
		if(br.equals("edge"))
		{WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();}
		driver.manage().deleteAllCookies();
		
		driver.get(rb.getString("appURL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
	}
	@AfterClass//(groups= {"Master","Regression","Sanity"})
	public void teardown()
	{
		driver.quit();
	}
	
	public String randomalpahbet()
	{
		String genratedalphabet = RandomStringUtils.randomAlphabetic(5);
		return genratedalphabet;
	}
	
	public String randomnumeric()
	{
		String genratednumber = RandomStringUtils.randomNumeric(10);
		return genratednumber;
	}
	
	public String randomAlphanumeric()
	{
		String al = RandomStringUtils.randomAlphabetic(4);
		String nm = RandomStringUtils.randomNumeric(3);
		return (al+"@"+nm);
	}
	
	
	public String randompin()
	{
		String genratedpin = RandomStringUtils.randomNumeric(6);
		return genratedpin;
	}
	
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
	
	
	}
	
	

}
