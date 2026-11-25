
package ManagerLogin;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.JsonFormatter;

public class ExtentReportManager {

    private static ExtentReports extent;
    

    public static ExtentReports getInstance() throws IOException {
    	

        if (extent == null) { //extent ==null stating that if the extent is null then create a new instance of the extent report

        	String path = System.getProperty("user.dir")
        	        + "/Reports/ExtentReport.html";

        	String jsonPath = System.getProperty("user.dir")
        	        + "/Reports/ExtentReport.json";

        	extent = new ExtentReports();

        	// Load previous test results
        	if (new java.io.File(jsonPath).exists()) {
        	    extent.createDomainFromJsonArchive(jsonPath);
        	}

        	// Save results for next execution
        	JsonFormatter json = new JsonFormatter(jsonPath);

        	ExtentSparkReporter reporter =
        	        new ExtentSparkReporter(path);

        	extent.attachReporter(json, reporter);
        }

        return extent;
    }

	

	
}
