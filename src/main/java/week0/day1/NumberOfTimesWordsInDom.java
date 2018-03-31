package week0.day1;


import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfTimesWordsInDom {

	public static void main(String[] args) throws InterruptedException {
		int count=0;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		driver.findElementById("lst-ib").sendKeys("cricket");
		driver.findElementById("lst-ib").sendKeys(Keys.ENTER);
List<WebElement> cr = driver.findElementsByXPath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]");
System.out.println(cr.size());
	
		/*System.out.println("The pageCode is: "+driver.getPageSource());
		String[] splitvalue= driver.getPageSource().spli*///t("");
	
		List<String> s= new LinkedList<>();
	//	s.add(splitvalue);
		
		/*for(int i=0; i<=driver.getPageSource().length(); i++) {
			if(driver.getPageSource().contains("Cricket"));
			{
			count++;
		}
		*/
		
	}
		
		//System.out.println("The number of times"+count);
		
	}




