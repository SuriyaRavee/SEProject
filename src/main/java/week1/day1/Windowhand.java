package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class Windowhand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
driver.findElementByLinkText("Contact Us").click();
Set<String> eachitem=driver.getWindowHandles();
for(String eachwin : eachitem)
	
{
	System.out.println(eachwin);
}
List<String> list=new ArrayList<String>();
list.addAll(eachitem);
driver.switchTo().window(list.get(1));
System.out.println(driver.getTitle());
driver.switchTo().window(list.get(0));
driver.close();
	}

}
