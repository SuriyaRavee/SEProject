package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationofElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com");
        System.out.println("The title is: "+driver.getTitle());
        System.out.println("The URL is: "+driver.getCurrentUrl());
        System.out.println("The pageCode is: "+driver.getPageSource()); 
	    driver.get("http://leafground.com/pages/Edit.html");
	    System.out.println(driver.findElementByName("username").getAttribute("value"));
	    driver.get("http://leafground.com/pages/Link.html");
	    System.out.println(driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href"));
	    driver.get("http://leafground.com/pages/Button.html");
	    System.out.println(driver.findElementById("color").getCssValue("background-color"));
	    System.out.println(driver.findElementById("home").getText());
	    System.out.println(driver.findElementById("position").getLocation());
	    System.out.println(driver.findElementById("position").getLocation().getY());
	    System.out.println(driver.findElementById("position").getLocation().getX());
	    System.out.println(driver.findElementById("size").getSize());
	    System.out.println(driver.findElementById("size").getSize().getHeight());
	    System.out.println(driver.findElementById("size").getSize().getWidth());
	    System.out.println(driver.findElementById("size").getTagName());
	    System.out.println(driver.findElementById("color").isDisplayed());
	    driver.get("http://leafground.com/pages/Edit.html");
	    System.out.println(driver.findElementByName("username").isEnabled());
	    System.out.println(driver.findElementByXPath("(//input[@type='text'])[5]").isEnabled());
	    driver.get("http://leafground.com/pages/radio.html");
	    System.out.println(driver.findElementById("yes").isSelected());
	    System.out.println(driver.findElementByXPath("(//input[@class='myradio'])[4]").isSelected());
	}
	
}
