package learnCollections;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ERail {
	 List <String> trainList1=new ArrayList<String>();
	 @Test
	public void webTable() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		Thread.sleep(2000);
		//driver.navigate().refresh();
		driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(5000);
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		/*WebDriverWait wait= new WebDriverWait(driver, 200L);
		wait.until(ExpectedConditions.);*/
		List<WebElement> tRow = table.findElements(By.tagName("tr"));
		int rowSize = tRow.size();
		for (int i = 0; i <= rowSize-1; i++) {

			List<WebElement> tData = tRow.get(i).findElements(By.tagName("td"));

			int columnSize= tData.size();
			System.out.println(columnSize);

			String  text = tData.get(1).getText();
			System.out.println(text);
			
			trainList1.add(text);
			System.out.println(trainList1.get(i));
		
		}
		//Collections.sort(trainList1);



	}

}