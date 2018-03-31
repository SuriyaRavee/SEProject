package testCases;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import wdMethods.SeMethods;

public class MergeleadUsingJUnit extends SeMethods {
	@Test
	public void mergelead() throws InterruptedException
	{
	
	startApp("chrome", "http://leaftaps.com/opentaps");	
	WebElement username = locateElement("username");
	type(username, "DemoSalesManager");
	WebElement password = locateElement("password");
	type(password, "crmsfa");
	WebElement login = locateElement("class", "decorativeSubmit");
	click(login);
	WebElement link = locateElement("link", "CRM/SFA");
	click(link);
	WebElement leads = locateElement("link", "Leads");
	click(leads);
	WebElement mergeleads = locateElement("link", "Merge Leads");
	click(mergeleads);
	WebElement fromlead = locateElement("xpath", "(//img[@src='/images/fieldlookup.gif'])[1]");
	clickWithoutSnap(fromlead);
	switchToWindow(1);
	WebElement leadid = locateElement("xpath", "//input[@name = 'id']");
	type(leadid, "10353");
	WebElement findleads = locateElement("xpath", "(//td[@class ='x-btn-center'])[1]");
	click(findleads);
	Thread.sleep(3000);
	WebElement selectid = locateElement("link", "10353");
	clickWithoutSnap(selectid);
	switchToWindow(0);
	WebElement fromlead2 = locateElement("xpath", "(//img[@src='/images/fieldlookup.gif'])[2]");
	clickWithoutSnap(fromlead2);
	switchToWindow(1);
	WebElement leadid1 = locateElement("xpath", "//input[@name = 'id']");
	type(leadid1, "10320");
	WebElement findleads2 = locateElement("xpath", "(//td[@class ='x-btn-center'])[1]");
	click(findleads2);
	Thread.sleep(3000);
	WebElement selectid1 = locateElement("link", "10320");
	clickWithoutSnap(selectid1);
	
	switchToWindow(0);
	
	WebElement merge = locateElement("link", "Merge");
	click(merge);
	
	acceptAlert();
	
	WebElement findleads1 = locateElement("link" , "Find Leads");
	click(findleads1);
	WebElement findid = locateElement("xpath", "(//input[@class=' x-form-text x-form-field'])[24]");
	type(findid, "10353");
	WebElement findleads3 = locateElement("xpath", "(//td[@class ='x-btn-center'])[7]");
	click(findleads3);
	WebElement text = locateElement("xpath", "//div[@class = 'x-paging-info']");
	verifyExactText(text, "No records to display");
	
	
	
	
	
	}
}
