package testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class EditLeadUsingJunit extends ProjectMethods {
	@Test
	public void EditLead()throws InterruptedException{
	
		WebElement lead = locateElement("link", "Leads");
		click(lead);
		WebElement findlead = locateElement("link", "Find Leads");
		click(findlead);		
		WebElement firstNameFindLeads = locateElement("xpath", "(//input[@name='firstName'])[3]");
		type(firstNameFindLeads, "Suriya");
		WebElement findlead1 = locateElement("xpath", "(//td[@class='x-btn-center'])[7]");
	    click(findlead1);
	    WebElement selectId1 = locateElement("link", "Suriya");
		click(selectId1);
		verifyTitle("View Lead |opentaps CRM");
		WebElement editButton = locateElement("link", "Edit");
		click(editButton);
		WebElement editCompanyName = locateElement("updateLeadForm_companyName");
		type(editCompanyName, "Bala1 Pvt Ltd");
		WebElement updateButton = locateElement("xpath", "(//input[@class='smallSubmit'])[1]");
		click(updateButton);
		WebElement verifyCompanyName = locateElement("xpath", "//span[text()='Bala1 Pvt Ltd (10759)']");
		verifyPartialText(verifyCompanyName, "Bala1 Pvt Ltd");
		closeBrowser();
}
}