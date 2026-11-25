
package ManagerLogin;



import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.ValidateUserAccount;
import Screenshot.Screencapture;

public class ValidateUserAC {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();

        driver.get("http://localhost/bank/Banking-Management-System-Using-PHP-and-MySQL-main/login.php");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.linkText("Manager Login")).click();
    }

    @Test
    public void validateAC() throws IOException {

        ValidateUserAccount ValidateACC = new ValidateUserAccount(driver);

        ValidateACC.emailadd("manager@manager.com");

        ValidateACC.password("1234");

        ValidateACC.loginbutton();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        ValidateACC.View();

         // Take a screenshot of the page
        Screencapture.captureScreenshot(driver, "ValidateUserAccount");
    }
}

