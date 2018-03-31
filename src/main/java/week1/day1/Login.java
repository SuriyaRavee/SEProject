package week1.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Login {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/SignUp?hl=en-GB");
		driver.findElementById("FirstName").sendKeys("Suriya");
		driver.findElementById("LastName").sendKeys("Ravi");
		driver.findElementById("GmailAddress").sendKeys("suriyaravee1993");
		driver.findElementById("Passwd").sendKeys("India123$");
		driver.findElementById("PasswdAgain").sendKeys("India123$");
		driver.findElementById("BirthDay").sendKeys("02");
		
		WebElement element = driver.findElementByXPath("(//div[@class = 'goog-menu goog-menu-vertical'])[2]");
		Select dropdown = new Select(element);
		Thread.sleep(5000);
		dropdown.selectByValue("FEMALE");
		
 
	}   
}
