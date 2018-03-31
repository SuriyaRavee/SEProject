package Practice;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testCases.ProjectMethods;



public class DeleteLeadTestNG extends ProjectMethods {
	@Test(dataProvider="fetchname")//// HERE WE ARE FETCHING THE DATA GIVEN IN DATA PROVIDER BELOW(starts from line No.30)
	
	//here we are giving only phone number while running the code(line np.20) 
	public void toDeleteLead(int phnum)throws InterruptedException{
		
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));
		click(locateElement("xpath", "(//span[@class='x-tab-strip-text '])[2]"));
		
		//new type method has created in SeMethods by giving arguements (webElement & int)
		type(locateElement("xpath", "//input[@name='phoneNumber']"),phnum);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		WebElement selectingFirstLead = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		String LeadId = getText(selectingFirstLead);
		click(selectingFirstLead);
		click(locateElement("link", "Delete"));
		click(locateElement("link", "Find Leads"));
		type(locateElement("xpath" , "//input[@name='id']"), LeadId);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		verifyPartialText(locateElement("xpath", "//div[text()='No records to display']"), "No records to display");
	}
//this prog will run 2 time as we have given rows=2
@DataProvider(name="fetchname")
public Object[] [] getData(){
	Object[][] data = new Object[2][1];
	data[0][0] = 98; //this value is entered while executing the prog 1st time
	data[1][0] = 94;////this value is entered while executing the prog 2nd time
	return data;	
}



}