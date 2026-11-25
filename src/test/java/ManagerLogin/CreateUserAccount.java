package ManagerLogin;

import java.io.IOException;
import org.testng.annotations.Listeners;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.AddNewAccount;
import PageObject.ManagerLogin;
import Screenshot.Screencapture;

@Listeners(ExtentReportListener.class)

public class CreateUserAccount {
	
	public  WebDriver driver;
	@BeforeClass
	public void setup() {
		// login to the application
		driver=new ChromeDriver();
		driver.get("http://localhost/bank/Banking-Management-System-Using-PHP-and-MySQL-main/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Manager Login")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		}
	
	@Test
	
	public void verify_create_user_account() throws IOException {
		ManagerLogin MLogin = new ManagerLogin(driver);
		MLogin.emailadd("manager@manager.com");
		MLogin.password("1234");
		
		MLogin.loginbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		AddNewAccount addNewAc = new AddNewAccount(driver);
		addNewAc.Addnewaccount();
		addNewAc.accountName("Jos dean");
		addNewAc.gender("Male");
		addNewAc.phoneNumber("1679946489");
		addNewAc.city("New York");
		addNewAc.Profile("C:\\Users\\ganes\\OneDrive\\Desktop\\BankProject\\Profilepic.jpg");
		addNewAc.Deposit("3000");
		addNewAc.Adhar("167978278352");
		addNewAc.email("josdet26@gmail.com");
		addNewAc.password("password623");
		addNewAc.address("123 Main St, New York, NY");
		
		addNewAc.selectDate("16--032005");
		addNewAc.AccountType("Saving");
		
		addNewAc.Occasion("Birthday");
		addNewAc.Submit();
		
		Screencapture.captureScreenshot(driver, "CreateUserAccount");
		
		
		// Test steps for creating a user account would go here
	}


}
