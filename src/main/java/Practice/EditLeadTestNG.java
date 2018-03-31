package Practice;


import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testCases.ProjectMethods;



public class EditLeadTestNG extends ProjectMethods {
	@Test(dataProvider = "fetchdata")// this code is used to fetch data from data provider given below 
	
	// here we are giving values in name(line No.20) and ComName(line No.25)
	public void toEditLead(String name, String ComName)throws InterruptedException{

		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));		
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), name);
		click(locateElement("xpath", "(//td[@class='x-btn-center'])[7]"));
		click(locateElement("link", "Suriya"));
		verifyTitle("View Lead |opentaps CRM");
		click(locateElement("link", "Edit"));
		type(locateElement("updateLeadForm_companyName"), ComName);
		click(locateElement("xpath", "(//input[@class='smallSubmit'])[1]"));
		verifyPartialText(locateElement("xpath", "//span[text()='Bala22 Pvt Ltd (10759)']"), "Bala22 Pvt Ltd");
	}

	
	//here we are running program only one time
@DataProvider(name="fetchdata")

public Object[][] getData(){
	Object[][] data = new Object[1][2]	; //[1] indicates the prog run 1 time, [2] indicates we are passing 2 values(name&ComName)
	data [0][0] = "Suriya";
	data[0][1] = "Bala22 Pvt Ltd";
	
	return data;
}

}

