package CashierBank;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ManagerLogin.ExtentReportListener;
import PageObject.CashierLogin;
import PageObject.CreateTXN;
import Screenshot.Screencapture;

@Listeners(ExtentReportListener.class)

public class Deposit {
	WebDriver driver;
	
	@BeforeClass
	
	public void setup() {
		driver = new ChromeDriver();
		
		driver.get("http://localhost/bank/Banking-Management-System-Using-PHP-and-MySQL-main/login.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.findElement(By.linkText("Manager Login")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Cashierlogin=driver.findElement(By.xpath("//a[normalize-space()='Cashier Login']"));
		Cashierlogin.click();
		
	}
	
	@Test
	public void verify_Cashier_Login() throws InterruptedException, IOException {
		// Test steps for cashier login would go here
		
		CreateTXN deposite = new CreateTXN(driver);
		deposite.emaildd("cashier@gmail.com");
		deposite.password("123");
		deposite.login();
		Thread.sleep(5000);
		deposite.accountnumber("1794848598");
		deposite.getaccountinfo();
		deposite.checknumber("2");
		deposite.amount("3000");
		deposite.deposit();
		
		Screencapture.captureScreenshot(driver, "Deposite Money");
		
		
		
	}

}
