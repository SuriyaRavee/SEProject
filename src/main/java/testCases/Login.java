package testCases;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import wdMethods.SeMethods;

public class Login extends SeMethods{

	@Test
	public void login() throws InterruptedException {		
		startApp("chrome", "http://leaftaps.com/opentaps");
		
		
		
		WebElement userName = locateElement("username");
		type(userName, "DemoSalesManager");
		WebElement password = locateElement("password");
		type(password, "crmsfa");
		
		
		
		WebElement submit = locateElement("class", "decorativeSubmit");
		click(submit);
		
		
		
		
		
		WebElement crmsfalink = locateElement("link","CRM/SFA");
		click(crmsfalink);
	WebElement leadLink = locateElement("link","Leads");
	click(leadLink);
	WebElement createlead = locateElement("link", "Create Lead");
	click(createlead);
	Thread.sleep(5000);
	WebElement companyName = locateElement("createLeadForm_companyName");
	type(companyName, "ABC ltd");
	WebElement firstname = locateElement("createLeadForm_firstName");
	type(firstname, "Bala");
	WebElement lastName = locateElement("createLeadForm_lastName");
	type(lastName, "T");
	WebElement finalsubmit = locateElement("class", "smallSubmit");
	click(finalsubmit);

	
	
	

	}
	

}
