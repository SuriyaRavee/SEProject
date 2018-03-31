package Practice;


import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import wdMethods.SeMethods;

public class MergeleadsTestNG extends testCases.ProjectMethods{

	@Test(dataProvider="fetchname")
	public void mergelead(String Fname, String SecName) throws InterruptedException
	{	
	WebElement leads = locateElement("link", "Leads");
	click(leads);
	WebElement mergeleads = locateElement("link", "Merge Leads");
	click(mergeleads);
	WebElement fromlead = locateElement("xpath", "(//img[@src='/images/fieldlookup.gif'])[1]");
	clickWithoutSnap(fromlead);
	switchToWindow(1);
	WebElement leadid = locateElement("xpath", "//input[@name='firstName']");
	type(leadid, Fname);
	WebElement findleads = locateElement("xpath", "(//td[@class ='x-btn-center'])[1]");
	click(findleads);
	Thread.sleep(3000);
	WebElement selectid = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
	String idValue = getText(selectid);
	clickWithoutSnap(selectid);
	switchToWindow(0);
	WebElement fromlead2 = locateElement("xpath", "(//img[@src='/images/fieldlookup.gif'])[2]");
	clickWithoutSnap(fromlead2);
	switchToWindow(1);
	WebElement leadid1 = locateElement("xpath", "//input[@name='firstName']");
	type(leadid1, SecName);
	WebElement findleads2 = locateElement("xpath", "(//td[@class ='x-btn-center'])[1]");
	click(findleads2);
	Thread.sleep(3000);
	WebElement selectid1 = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
	getText(selectid1);
	clickWithoutSnap(selectid1);
	switchToWindow(0);
	WebElement merge = locateElement("link", "Merge");
	clickWithoutSnap(merge);
	acceptAlert();
	WebElement findleads1 = locateElement("link" , "Find Leads");
	click(findleads1);
	WebElement findid = locateElement("xpath", "(//input[@class=' x-form-text x-form-field'])[24]");
	type(findid, idValue);
	WebElement findleads3 = locateElement("xpath", "(//td[@class ='x-btn-center'])[7]");
	click(findleads3);
	WebElement text = locateElement("xpath", "//div[@class = 'x-paging-info']");
	verifyExactText(text, "No records to display");
	
		}

@DataProvider(name = "fetchname")
public Object[][] getData(){
Object [][] data = new Object[1][2];
data [0][0] = "Suriya";
data[0][1] = "Bala";
return data;
		
}
}








