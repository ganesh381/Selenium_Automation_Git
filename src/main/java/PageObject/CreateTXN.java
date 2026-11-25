package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateTXN extends PageBase
{

	public CreateTXN(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="/html/body/div[2]/div/div/form/div[1]/input")
	WebElement emailadd;
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/div[2]/input")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/div[3]/input")
	WebElement login;
	
	@FindBy(xpath="//input[@placeholder='Enter Your Account number']")
	WebElement accountnumber;
	
	@FindBy(xpath="//button[normalize-space()='Get Account Info']")
	WebElement getaccountinfo;
	
	@FindBy(xpath="//*[@id=\"nav-tab-card\"]/div/div[2]/form[2]/input[3]")
	WebElement checknumber;
	
	@FindBy(xpath="//*[@id=\"nav-tab-card\"]/div/div[2]/form[2]/input[4]")
	WebElement amount;
	
	@FindBy(xpath = "//button[normalize-space()='Deposit']")
	WebElement deposit;
	
	public void emaildd(String email)
	{
		emailadd.sendKeys(email);
	}
	
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void login()
	{
		login.click();
	}
	
	public void accountnumber(String accountnum) {
		accountnumber.sendKeys(accountnum);
	}
	
	public void getaccountinfo() {
		getaccountinfo.click();
	}

	public void checknumber(String checknum) {
		checknumber.sendKeys(checknum);
	}
	
	public void amount(String amt) {
		amount.sendKeys(amt);
	}
	
	public void deposit() {
		deposit.click();
	}
	

}
