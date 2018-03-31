package week0.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElementByXPath("(//input[@type = 'checkbox'])[2]").click();
		boolean element = driver.findElementByXPath("(//input[@type = 'checkbox'])[2]").isSelected();
		System.out.println(element);
	
	
	
		
		
		
		}
	}


