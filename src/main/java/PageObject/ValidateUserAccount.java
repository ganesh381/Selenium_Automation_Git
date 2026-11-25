package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidateUserAccount extends PageBase {

	public ValidateUserAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@placeholder='Email Address']")
	WebElement emailadd;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/div[3]/input")
	WebElement loginbutton;
	
	@FindBy(xpath="//*[@id=\"dataTable\"]/tbody/tr[5]/td[9]/a")
	WebElement viewbutton;
	
	public void emailadd(String email)
	{
		emailadd.sendKeys(email);
	}
	
	public void password(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void loginbutton() {
		loginbutton.click();
	}
	
	public void View()
	{
		viewbutton.click();
	}

}
