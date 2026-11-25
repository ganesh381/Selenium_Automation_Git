package ManagerLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import PageObject.ManagerLogin;

public class ManagerLoginTC {
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
		
		
	}
	/*
	 
	@AfterClass
	
	public void tearDown()
	{
		driver.quit();
	}
	*/
	@Test
	public void Manager_Login() {
		// Test steps for cashier login would go here
		
		ManagerLogin MLogin = new ManagerLogin(driver);
		MLogin.emailadd("manager@manager.com");
		MLogin.password("1234");
		
		MLogin.loginbutton();
		
		
	}

}
