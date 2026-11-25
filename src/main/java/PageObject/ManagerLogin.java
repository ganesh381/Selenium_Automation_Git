package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ManagerLogin extends PageBase{

	public ManagerLogin(WebDriver driver) {
	    super(driver);
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Email Address']")
	WebElement manageremail;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement managerpassword;
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/div[3]/input")
	WebElement loginbutton;
	
	public void emailadd(String email)
	{
		manageremail.sendKeys(email);
	}
	
	public void password(String pwd) {
		managerpassword.sendKeys(pwd);
	}
	
	public void loginbutton() {
		loginbutton.click();
	}
}
