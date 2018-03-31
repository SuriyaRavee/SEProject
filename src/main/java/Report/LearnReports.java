package Report;

import java.io.Externalizable;
import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReports {

@Test
	public void learnReport() throws IOException {
	
		//creates Blank HTML file with basic details
		ExtentHtmlReporter html= new ExtentHtmlReporter(new File("./reports/result.html"));
		
		// used for maintaining history of reports
		html.setAppendExisting(true);
		
		//Allows to add contents to the report, this will execute one
		ExtentReports extent= new ExtentReports();
		
		// Attaches details to the HTML report
		extent.attachReporter(html);
		
		// Adds Test case details(name of the test case)
		ExtentTest test = extent.createTest("TC001_Createlead", "create a new lead");
		
		// to add author name
		test.assignAuthor("Balasuriya");
		
		// to add group name
		test.assignCategory("Practice test");
		
		//enter the test step details
		//one way of appending screenshot to the test step. Media entity builder will place the screenshot below the test step(description).
		//this way will give you the description and snap one by one
		test.pass("DemoSalesManager is enterred successfully", 
				MediaEntityBuilder.createScreenCaptureFromPath("./../Screenshots/snap1.jpeg").build());
		
		// another way of adding screenshot to the test step. in this method the screenshot would be placed at the end. 
		//this way will give description and snap separately
		test.pass("crmsfa is enterred successfully");
		test.addScreenCaptureFromPath("./../Screenshots/snap1.jpeg");
		
		test.pass("clickLogin is enterred successfully", 
				MediaEntityBuilder.createScreenCaptureFromPath("./../Screenshots/snap1.jpeg").build());
		extent.setAnalysisStrategy(AnalysisStrategy.TEST);
		
		//flush execute all the above code and clear the memory used
		extent.flush();
	}

}
