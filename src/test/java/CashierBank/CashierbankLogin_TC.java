package CashierBank;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

import PageObject.CashierLogin;
import Screenshot.Screencapture;


public class CashierbankLogin_TC {
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		// login to the application
		driver = new ChromeDriver();
		driver.get("http://localhost/bank/Banking-Management-System-Using-PHP-and-MySQL-main/login.php");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Manager Login")).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Cashierlogin=driver.findElement(By.xpath("//a[normalize-space()='Cashier Login']"));
		Cashierlogin.click();
	}
	
	@AfterClass
	
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void verify_Cashier_Login() throws IOException {
		// Test steps for cashier login would go here
		//IO exception is used for handling the exception that may occur while taking a screenshot
		CashierLogin cashierLogin = new CashierLogin(driver);
		cashierLogin.emaildd("cashier@gmail.com");
		cashierLogin.password("123");
		cashierLogin.login();
		//take screenshot of the cashier dashboard
		Screencapture.captureScreenshot(driver, "CashierDashboard");
		
	}
	
	
	
	

}
