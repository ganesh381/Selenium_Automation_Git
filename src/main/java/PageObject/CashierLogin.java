package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CashierLogin extends PageBase {

	public CashierLogin(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="/html/body/div[2]/div/div/form/div[1]/input")
	WebElement emailadd;
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/div[2]/input")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/div[3]/input")
	WebElement login;
	
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
	
	

}
