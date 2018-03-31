package week0.day1;

import java.awt.Dimension;
import java.awt.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	private static final int Size = 0;

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		WebElement element = driver.findElementById("userRegistrationForm:countries");
		Select dropdown = new Select(element);
		System.out.println("Print all options");
        java.util.List<WebElement> options = dropdown.getOptions();
        int size = options.size();
        for(int i=0; i<size; i++) {
        	String optionName = options.get(i).getText();
        	System.out.println(optionName);
        	
        }
		
		
		
	    }
	    
		

	}


