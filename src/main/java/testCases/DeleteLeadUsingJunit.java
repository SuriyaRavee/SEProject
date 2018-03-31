package testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class DeleteLeadUsingJunit extends ProjectMethods {
	@Test
	public void EditLead()throws InterruptedException{
		loginLeafTaps();
		click(locateElement("link", "Leads"));
		WebElement findlead = locateElement("link", "Find Leads");
		click(findlead);
		WebElement phoneNumber= locateElement("xpath", "(//span[@class='x-tab-strip-text '])[2]");
		click(phoneNumber);
		WebElement enterphoneNumber= locateElement("xpath", "//input[@name='phoneNumber']");
		type(enterphoneNumber, "90");

		WebElement findLeads1= locateElement("xpath", "//button[text()='Find Leads']");
		click(findLeads1);
		WebElement selectingFirstLead = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		String LeadId = getText(selectingFirstLead);
		click(selectingFirstLead);

		WebElement delete = locateElement("link", "Delete");
		click(delete);
		WebElement findlead2 = locateElement("link", "Find Leads");
		click(findlead2);
		WebElement leadInput = locateElement("xpath" , "//input[@name='id']");
		type(leadInput, LeadId);
		WebElement findLeads3= locateElement("xpath", "//button[text()='Find Leads']");
		click(findLeads3);
		WebElement errorMsg = locateElement("xpath", "//div[text()='No records to display']");
		verifyPartialText(errorMsg, "No records to display");
	}
}