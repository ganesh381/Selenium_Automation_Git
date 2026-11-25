package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferMoney extends PageBase{

	public TransferMoney(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/div[1]/input")
	WebElement emailadd;
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/div[2]/input")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/div[3]/input")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[1]/a[4]")
	WebElement transfermoney;
	
	@FindBy(xpath="//*[@id=\"nav-tab-card\"]/form/div/div/input")
	WebElement accountnumber;
	
	@FindBy(xpath="//*[@id=\"nav-tab-card\"]/form/div/div/div/button")
	WebElement getaccountinfo;
	
	@FindBy(xpath="//input[@name='amount']")
	WebElement amount;
	
	@FindBy(xpath="//button[normalize-space()='Transfer']")
	WebElement transferbutton;
	
	
	public void emailadd(String Email)
	{
		emailadd.sendKeys(Email);
	}

	public void password(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void login() {
		login.click();
	}
	
	public void transfermoney() {
		transfermoney.click();
	}
	
	public void accountnumber(String accountnum) {
		accountnumber.sendKeys(accountnum);
	}
	
	public void getaccountinfo() {
		getaccountinfo.click();
	}
	
	public void amount(String amt) {
		amount.sendKeys(amt);
	}
	
	public void transferbutton() {
		transferbutton.click();
	}
	
	

}
