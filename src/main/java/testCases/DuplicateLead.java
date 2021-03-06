package testCases;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class DuplicateLead  extends ProjectMethods{

	@Test(groups="regression",dependsOnGroups="sanity")	
	//@Test(enabled=false)
	public void Createlead()throws InterruptedException{
		WebElement lead = locateElement("link", "Leads");
		click(lead);
		WebElement findlead = locateElement("link", "Find Leads");
		click(findlead);
		WebElement email = locateElement("xpath","(//a[@class='x-tab-right'])[3]");
		click(email);
		WebElement enteremail = locateElement("xpath","(//input[@class=' x-form-text x-form-field'])[28]");
		type(enteremail, "sruthy79@gmail.com");
		WebElement findlead1 = locateElement("xpath", "(//td[@class='x-btn-center'])[7]");
		click(findlead1);
		WebElement capture = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]");
		getText(capture);
		WebElement clickfirstlead = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]");
		click(clickfirstlead);
		WebElement duplicate = locateElement("link", "Duplicate Lead");
		click(duplicate);
		verifyTitle("Duplicate Lead | opentaps CRM");
		WebElement createlead = locateElement("xpath", "//input[@class='smallSubmit']");
		click(createlead);
		WebElement capturefirstname = locateElement("viewLead_firstName_sp");
		getText(capturefirstname);
		if(capture.equals(capturefirstname))
		{
			System.out.println(capture+"matches"+capturefirstname);
		}
	}
}