package testCases;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Erail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS");
		driver.findElementById("txtStationFrom").sendKeys(Keys.ENTER, Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC");
		driver.findElementById("txtStationTo").sendKeys(Keys.ENTER, Keys.TAB);
		
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> tRow = table.findElements(By.tagName("tr"));
		System.out.println(tRow.size());
		List<WebElement> tCol = tRow.get(0).findElements(By.tagName("td"));
		System.out.println(tCol.size());
		System.out.println(tCol.get(1).getText());
		List<WebElement> tCol1 = tRow.get(1).findElements(By.tagName("td"));
		System.out.println(tCol1.get(1).getText());
		List<WebElement> tCol2 = tRow.get(2).findElements(By.tagName("td"));
		System.out.println(tCol2.get(1).getText());
		List<WebElement> tCol3 = tRow.get(3).findElements(By.tagName("td"));
		System.out.println(tCol1.get(1).getText());
		List<WebElement> tCol4 = tRow.get(4).findElements(By.tagName("td"));
		System.out.println(tCol4.get(1).getText());
		List<WebElement> tCol5 = tRow.get(5).findElements(By.tagName("td"));
		System.out.println(tCol5.get(1).getText());
		List<WebElement> tCol6 = tRow.get(6).findElements(By.tagName("td"));
		System.out.println(tCol6.get(1).getText());
		List<WebElement> tCol7 = tRow.get(7).findElements(By.tagName("td"));
		System.out.println(tCol7.get(1).getText());
		List<WebElement> tCol8 = tRow.get(8).findElements(By.tagName("td"));
		System.out.println(tCol8.get(1).getText());
		List<WebElement> tCol9 = tRow.get(9).findElements(By.tagName("td"));
		System.out.println(tCol9.get(1).getText());
		
	}

}
