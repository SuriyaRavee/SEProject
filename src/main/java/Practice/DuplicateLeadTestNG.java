package Practice;


import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testCases.ProjectMethods;
import wdMethods.SeMethods;
public class DuplicateLeadTestNG extends ProjectMethods{

	@Test(dataProvider="fetchdata")// this code is used to fetch data from data provider given below 
	
	//here we are giving only value in email field (line No.20)
	public void leadDuplication(String email) throws InterruptedException {		
		
		click(locateElement("link","Leads"));
		click(locateElement("link", "Find Leads"));
		click(locateElement("xpath", "//span[text()='Email']"));
		type(locateElement("xpath", "//input[@name='emailAddress']"),email);
		click(locateElement("xpath", "//button[text()= 'Find Leads']"));
		Thread.sleep(5000);
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String text1 = getText(locateElement("xpath", "//span[@id='viewLead_firstName_sp']"));
		click(locateElement("link", "Duplicate Lead"));
		verifyTitle("Duplicate Lead | opentaps CRM");
		click(locateElement("xpath", "//input[@value= 'Create Lead']"));
		String text2 = getText(locateElement("xpath", "//span[@id='viewLead_firstName_sp']"));
		if(text1.equals(text2))
		{
			System.out.println(text1 + "is Matching with "+  text2);
		}
	}
	
	//This prog will run only one time
@DataProvider(name="fetchdata")
public Object[][] getdata()
{
	Object[][] data= new Object[1][1];
	data[0][0]= "somu@xyz.com";
	return data;
}
}