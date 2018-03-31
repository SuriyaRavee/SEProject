package testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeleteLead extends ProjectMethods {
	@Test(groups="sanity",dependsOnGroups="smoke")
	//@Test(dependsOnMethods="testCases.Createlead.CreateLead")
	//@Test(dataProvider="fetchData")
	    public void Deletelead(int phonenum )throws InterruptedException{
		click(locateElement("link", "Leads"));
		WebElement findlead = locateElement("link", "Find Leads");
		click(findlead);
		WebElement phoneNumber= locateElement("xpath", "(//span[@class='x-tab-strip-text '])[2]");
		click(phoneNumber);
		/*WebElement enterphoneNumber= locateElement("xpath", "//input[@name='phoneNumber']");
		type(enterphoneNumber, "98");*/
     
		type(locateElement("xpath", "//input[@name='phoneNumber']"), phonenum);
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
  @ DataProvider(name= "fetchdata")
public Object[][] getData()
{
	Object[][] data= new Object[2][3];
	data[0][0]= "ABC Pvt LTD";
	data[0][1]= "Bala";
	data[0][2]= "T";
	
	data[1][0]= "ABC Pvt LTD";
	data[1][1]= "Suriya";
	data[1][2]= "R";
	return data;


}

}