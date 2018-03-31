


package testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class ServiceNowLogin extends SeMethods {
	
	@Test
	public void Createlead()throws InterruptedException{
	
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
	WebElement clickcreateNew = locateElement("xpath", "//div[text()='Create New']");
	click(clickcreateNew);
	Thread.sleep(3000);
	WebElement switchfra = locateElement("id", "gsft_main");
	switchToFrame(switchfra);
	WebElement captureId = locateElement("id", "incident.number");
	//getText(captureId);
	String capturingID = getText(captureId);
	System.out.println(capturingID);
	Thread.sleep(3000);
	//WebElement switchFrame = locateElement("xpath", "//iframe[@id='']");
	//switchToFrame(switchFrame);
	WebElement serachbutton = locateElement("xpath", "(//span[@class='icon icon-search'])[1]");		
	clickWithoutSnap(serachbutton);
	switchToWindow(1);
	WebElement search1 = locateElement("xpath", "(//input[@class='form-control'])[1]");
	search1.sendKeys("abel");
	
    typenEnter(locateElement("xpath", "(//input[@class='form-control'])[1]"), "abel");
    Thread.sleep(3000);
    WebElement selectingfirst = locateElement("link", "Abel Tuter");
	clickWithoutSnap(selectingfirst);
	Thread.sleep(3000);
	switchToWindow(0);
	
	WebElement switchFrame1 = locateElement("id", "gsft_main");
	switchToFrame(switchFrame1);
	Thread.sleep(3000);
	
	WebElement category = locateElement("id", "incident.category");
	selectDropDownUsingText(category, "Software");
	Thread.sleep(3000);
	
	WebElement subCategory = locateElement("id", "incident.subcategory");
	selectDropDownUsingText(subCategory, "Operating System");
	Thread.sleep(3000);
	
	WebElement searchBuissService = locateElement("xpath", "(//span[@class='icon icon-search'])[2]");
	clickWithoutSnap(searchBuissService);
	switchToWindow(1);
	WebElement entertext = locateElement("xpath", "(//input[@class='form-control'])[1]");
	typenEnter(entertext, "blackberry");
	
	WebElement selectfirstresult = locateElement("xpath", "(//a[@class='glide_ref_item_link'])[1]");
	clickWithoutSnap(selectfirstresult);
	Thread.sleep(3000);
	
	switchToWindow(0);
	
	WebElement switchFrame2 = locateElement("id", "gsft_main");
	switchToFrame(switchFrame2);
	
	
	WebElement description = locateElement("id", "incident.short_description");
	type(description, "Test for Automation");
	
	WebElement submit = locateElement("id", "sysverb_insert");
	click(submit);
	
	WebElement search2 = locateElement("xpath", "(//input[@class='form-control'])[1]");
	typenEnter(search2, capturingID);
	Thread.sleep(3000);
	
	WebElement ticketId = locateElement("xpath", "(//a[@class='linked formlink'])[1]");
	verifyExactText(ticketId, capturingID);
	
	
	
	
	
	
	
	

}
}