package UserAction;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.TransferMoney;
import Screenshot.Screencapture;

public class MoneyTransfer {
	WebDriver driver;
	
	@BeforeClass
	
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("http://localhost/bank/Banking-Management-System-Using-PHP-and-MySQL-main/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
	}
	
	@Test
	
	public void verify_money_transfer() throws InterruptedException, IOException {
		TransferMoney transfer = new TransferMoney(driver);
		transfer.emailadd("yogesh12@gmail.com");
		transfer.password("12345");
		transfer.login();
		Thread.sleep(5000);
		transfer.transfermoney();
		Thread.sleep(5000);
		transfer.accountnumber("1790704569");
		transfer.getaccountinfo();
		Thread.sleep(5000);
		transfer.amount("4000");
		transfer.transferbutton();
		
		Alert alert = driver.switchTo().alert();

		String message = alert.getText();

		System.out.println("Popup message: " + message);

		Assert.assertEquals(message, "Transfer Successfull");

		alert.accept();
		Screencapture.captureScreenshot(driver, "MoneyTransfer");

	}

}
