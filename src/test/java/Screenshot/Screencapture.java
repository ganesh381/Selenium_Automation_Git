package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class Screencapture {
	public static void captureScreenshot(WebDriver driver, String screenshotName) 
	//IO exception used for handling errors that may occur during input/output operations, such as reading from or writing to a file. In this case.
	//it is used to handle any potential issues that may arise while capturing and saving the screenshot.
		throws IOException {
		
		//Capture Screenshot
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//Define destination path for the screenshot
		File folder= new File(System.getProperty("user.dir")+"\\Screenshots");
		
		
		
		if (!folder.exists()) {
			folder.mkdirs(); // Create the folder if it doesn't exist
		}
		
		//Copy the screenshot to the destination
		File destination = new File(folder, screenshotName + ".png");
		
		Files.copy(source.toPath(),destination.toPath(),StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Screenshot saved: " + destination.getAbsolutePath());
		
	
	}

}
