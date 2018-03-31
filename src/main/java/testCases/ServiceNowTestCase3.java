package testCases;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class ServiceNowTestCase3 extends SeMethods {

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
	
	
	WebElement searching = locateElement("id", "filter");
	type(searching, "Incident");
	Thread.sleep(3000);
	
	WebElement openbutt = locateElement("xpath", "//div[text()='Open']");
	click(openbutt);
	
	WebElement entertoFrame = locateElement("gsft_main");
	switchToFrame(entertoFrame);
	
	WebElement entertext1 = locateElement("xpath", "(//input[@class='form-control'])[1]");
	typenEnter(entertext1, "INC0010091");
	Thread.sleep(3000);
	
	
	WebElement selectfirstId = locateElement("link", "INC0010091");
	Thread.sleep(3000);	
	click(selectfirstId);
	Thread.sleep(2000);
	
	WebElement state = locateElement("id", "incident.state");
	click(state);
	selectDropDownUsingText(state, "Resolved");
	
	WebElement update = locateElement("xpath", "//button[text()='Update']");
	click(update);
	
	WebElement resolutionInfo = locateElement("xpath", "//span[text()='Resolution Information']");
	click(resolutionInfo);
	
	WebElement code = locateElement("id", "incident.close_code");
	click(code);
	selectDropDownUsingText(code, "Solved (Work Around)");
	
	WebElement notes = locateElement("id", "incident.close_notes");
	type(notes, "Test case is completed patially");
	
	WebElement update1 = locateElement("xpath", "//button[text()='Update']");
	click(update1);
	
	switchToDefaultFrame();
	
	WebElement openbutt2 = locateElement("xpath", "//div[text()='Open']");
	click(openbutt2);
	
	WebElement entertoFrame1 = locateElement("gsft_main");
	switchToFrame(entertoFrame1);
	
	
	WebElement entertext2 = locateElement("xpath", "(//input[@class='form-control'])[1]");
	typenEnter(entertext2, "INC0010091");
	Thread.sleep(3000);
	
	WebElement checkstate = locateElement("xpath", "//tr[@class='list_row list_odd']/td[8]");
	Thread.sleep(3000);
	getText(checkstate);
	//System.out.println(getText(checkstate));
	
	}


	
		
	}
