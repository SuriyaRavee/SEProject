package fileUpload;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Upload Leads").click();
		WebElement upload = driver.findElementById("uploadedFile");
		//upload.click();
		/*upload.sendKeys("C:\\Users\\HP\\Desktop\\Sample codes\\Sample codes .txt");
		driver.findElementByXPath("//input[@value='Upload and Import']").click();
		//WebElement upload = driver.findElementByXPath("(//input[@type='file'])[2]");
*/		
		
		
		driver.setFileDetector(new LocalFileDetector());
	    upload.sendKeys("/Users/HP/Downloads");

		/*LocalFileDetector detector = new LocalFileDetector();
		File localFile = detector.getLocalFile("C:\\Users\\HP\\Desktop\\Sample codes\\Sample codes .txt");
		((RemoteWebElement)upload).setFileDetector(detector);
		upload.sendKeys(localFile.getAbsolutePath());*/

	}

}
