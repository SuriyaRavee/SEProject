package ActionsPrograms;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import testCases.ProjectMethods;
import wdMethods.SeMethods;

public class DragAndDrop extends ProjectMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stackoverflow.com/questions/11428026/select-an-option-from-the-right-click-menu-in-selenium-webdriver-java");
		
		//Right click on particular link 
		/*WebElement element = driver.findElementByLinkText("How do I call one constructor from another in Java?");
		
		Actions action = new Actions (driver);
		action.contextClick(element).perform();*/
		
		
		//Scroll the page horizontally and vertically
		WebElement element2 = driver.findElementByXPath("//input[@class='f-input js-search-field']");
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   // js.executeScript("arguments[0].setAttribute('style',background:yellow;",element2 );
	    
	    Thread.sleep(3000);
	    js.executeScript("window.scrollBy(1000,1000)");
	    
	    
	    
	    //scroll till bottom of page
	    Thread.sleep(3000);
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        driver.quit();
	   
	}

}
