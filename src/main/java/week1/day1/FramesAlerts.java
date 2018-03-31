package week1.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
driver.switchTo().frame("iframeResult");
driver.findElementByXPath("//button[text()='Try it']").click();
Alert myAlert= driver.switchTo().alert();
String name= "Bala";

myAlert.sendKeys(name);


myAlert.accept();

String text2 = driver.findElementByXPath("//p[contains(text(),'Bala')]").getText();
System.out.println(name);
System.out.println(text2.contains(name));
	}

}
