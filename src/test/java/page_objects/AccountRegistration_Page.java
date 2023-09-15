package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//constructor
public class AccountRegistration_Page extends Base_Page
{
	public AccountRegistration_Page(WebDriver driver)
	{
		super(driver);
	}
	
	//WebElement
	@FindBy(xpath="//input[@id='inputFirstName']")WebElement firstname;
	@FindBy(xpath="//input[@id='inputLastName']")WebElement lastname;
	@FindBy(xpath="//input[@id='inputEmail']")WebElement email;
	@FindBy(xpath="//input[@id='inputPhone']")WebElement pn;
	@FindBy(xpath="//input[@id='inputCompanyName']")WebElement companyNam;
	@FindBy(xpath="//input[@id='inputAddress1']")WebElement streetAdd;
	@FindBy(xpath="//input[@id='inputAddress2']")WebElement streetAdd2;
	@FindBy(xpath="//input[@id='inputCity']")WebElement city;
	@FindBy(xpath="//input[@id='stateinput']")WebElement state;
	@FindBy(xpath="//input[@id='inputPostcode']")WebElement postcode;
	@FindBy(xpath="//input[@id='customfield2']")WebElement mob2;
	@FindBy(xpath="//input[@id='inputNewPassword1']")WebElement password;
	@FindBy(xpath="//input[@id='inputNewPassword2']")WebElement confirmpswrd;
	@FindBy(xpath="//li[text()='Please complete the captcha and try again.']")WebElement captcha;
	
	//Action methods
	public void setfnm(String fnm) {firstname.sendKeys(fnm);}
	public void setlnm(String lnm) {lastname.sendKeys(lnm);}
	public void setemail(String eml) {email.sendKeys(eml);}
	public void setpn(String pnn) {pn.sendKeys(pnn);}
	public void setcn() {companyNam.sendKeys("Mp Technical");}
	public void setSA() {streetAdd.sendKeys("1022 siha village");}
	public void setSA2() {streetAdd2.sendKeys("district-rewari,thanedar");}
	public void setcity() {city.sendKeys("gurgaon");}
	public void setpo(String pin) {postcode.sendKeys(pin);}
	public void setmob2(String mobb2) {mob2.sendKeys(mobb2);}
	public void setpwd(String pwd) {password.sendKeys(pwd);}
	public void setcnfrmpwd(String cnfrmpwd) {confirmpswrd.sendKeys(cnfrmpwd);}
	public String verifiedcaptcha()
	{
		return(captcha.getText());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
