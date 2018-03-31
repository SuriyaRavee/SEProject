package testCases;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;


public class ServiceNowLogin2 extends SeMethods {

	@Test
	public void ServiceNow() throws InterruptedException{
		startApp( "chrome",  "https://dev39457.service-now.com/");
		WebElement enterToFrame = locateElement("id", "gsft_main");
		switchToFrame(enterToFrame);
		
		WebElement username = locateElement("id", "user_name");
	    type(username, "admin");
	    
		WebElement password = locateElement("id", "user_password");
		type(password, "KiranBedi123$");
		
		WebElement login = locateElement("id", "sysverb_login");
		click(login);
		Thread.sleep(5000);
		
		//switchToDefaultFrame();
		WebElement searching = locateElement("id", "filter");
		type(searching, "Incident");
		Thread.sleep(3000);
		
		WebElement SelectOpenAss = locateElement("xpath", "//div[text()='Open - Unassigned']");
		click(SelectOpenAss);
		Thread.sleep(3000);
		
		WebElement entertoFrame = locateElement("gsft_main");
		switchToFrame(entertoFrame);
		
		WebElement enterText = locateElement("xpath", "//input[@class='form-control']");
		typenEnter(enterText, "INC0000054");
		
		WebElement selectFirstResult = locateElement("xpath", "//td[@class='vt']/a[1]");
		Thread.sleep(3000);
		click(selectFirstResult);
		
		WebElement SelectState = locateElement("id", "incident.state");
		click(SelectState);
		selectDropDownUsingText(SelectState, "In Progress");
		
		WebElement searchbutt = locateElement("xpath", "(//span[@class='icon icon-search'])[5]");
		clickWithoutSnap(searchbutt);
		Thread.sleep(3000);
		
		switchToWindow(1);
		
		WebElement entertext1 = locateElement("xpath", "(//input[@class='form-control'])[1]");
		typenEnter(entertext1, "Itil User");
		Thread.sleep(3000);
		
		WebElement SelectFirstId = locateElement("link", "ITIL User");
		clickWithoutSnap(SelectFirstId);
		
		switchToWindow(0);//7665
		
		WebElement switchFrame = locateElement("id", "gsft_main");
		switchToFrame(switchFrame);
		
		WebElement update = locateElement("xpath", "(//button[text()='Update'])[1]");
		click(update);
		
	    switchToDefaultFrame();
		WebElement selectOpen = locateElement("xpath", "//div[text()='Open']");
		click(selectOpen);
		
		WebElement switchFrame1 = locateElement("id", "gsft_main");
		switchToFrame(switchFrame1);
		
		WebElement entertext2 = locateElement("xpath","(//input[@class='form-control'])[1]");
		typenEnter(entertext2, "INC0000054");
		
		WebElement statetype = locateElement("xpath", "//td[text()='In Progress']");
		 getText(statetype);
		
		WebElement categorytype = locateElement("xpath", "//td[text()='Software']");
	     getText(statetype);
		
		
	}

}
