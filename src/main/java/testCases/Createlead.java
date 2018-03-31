package testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

import wdMethods.SeMethods;

public class Createlead extends ProjectMethods {
	@Test(groups="smoke", dataProvider="fetchData")
	//@Test(dataProvider="fetchData")
	//@Test(invocationCount=2)
	//@Test
	public void CreateLead(String cName, String Fname, String Lname)throws InterruptedException{		
		WebElement lead = locateElement("link", "Leads");
		Thread.sleep(2000);
		click(lead);
		WebElement creatlead = locateElement("link","Create Lea1d");
		click(creatlead);
		type(locateElement("createLeadForm_companyName"), cName);
		type(locateElement("createLeadForm_firstName"),Fname);
		WebElement drpdown = locateElement("createLeadForm_dataSourceId");
		Thread.sleep(2000);
	
		selectDropDownUsingText(drpdown, "Employee");
		WebElement localname = locateElement("createLeadForm_firstNameLocal");
		type(localname , "Suriya.R");
		WebElement salu = locateElement("createLeadForm_personalTitle");
		type(salu, "Welcome All");
		WebElement title = locateElement("createLeadForm_generalProfTitle");
		type(title, "About Company");
		WebElement revenue = locateElement("createLeadForm_annualRevenue");
		type(revenue, "8900000000");
		WebElement drpdownInd = locateElement("createLeadForm_industryEnumId");
		selectDropDownUsingText(drpdownInd, "Computer Software");
		WebElement drpdownown = locateElement("createLeadForm_ownershipEnumId");
		selectDropDownUsingText(drpdownown,"Sole Proprietorship");
		WebElement siccode = locateElement("createLeadForm_sicCode");
		type(siccode, "SURIYA021993");
		WebElement desc = locateElement("createLeadForm_description");
		type(desc, "Our company always give attention to the employee welfare");
		//WebElement lastname = locateElement("createLeadForm_lastName");
		//type(lastname , Lname);
		WebElement markexp = locateElement("createLeadForm_marketingCampaignId");
		selectDropDownUsingText(markexp, "Pay Per Click Advertising");
		WebElement window = locateElement("xpath", "//img[@src='/images/fieldlookup.gif']");
		click(window);
		switchToWindow(1);
		WebElement windowid = locateElement("xpath", "//input[@name = 'id']");
		type(windowid, "100");
		WebElement windowacc = locateElement("xpath", "//input[@name = 'accountName']");
		type(windowacc, "Credit Limited Account");
		WebElement findacc = locateElement("xpath", "(//button[@class='x-btn-text'])[1]");
		click(findacc);
		Thread.sleep(3000);
		WebElement selectaccid = locateElement("xpath" , "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
		clickWithoutSnap(selectaccid);
		switchToWindow(0);
		WebElement lastnamelocal = locateElement("createLeadForm_lastNameLocal");
		type(lastnamelocal, "Ravee");
		WebElement date = locateElement("createLeadForm_birthDate-button");
		click(date);
		Thread.sleep(3000);
		WebElement monthpick = locateElement("xpath", "(//div[@unselectable='on'])[4]");
		click(monthpick);
		Thread.sleep(3000);
		WebElement datepick = locateElement("xpath", "(//td[@class='day'])[18]");
		click(datepick);
		WebElement deptname = locateElement("createLeadForm_departmentName");
		type(deptname, "Engineer");
		WebElement currency = locateElement("createLeadForm_currencyUomId");
		selectDropDownUsingText(currency, "INR - Indian Rupee");
		WebElement countrycode = locateElement("createLeadForm_primaryPhoneCountryCode");
		type(countrycode, "0");
		WebElement areacode = locateElement("createLeadForm_primaryPhoneAreaCode");
		type(areacode, "044");
		WebElement extension = locateElement("createLeadForm_primaryPhoneExtension");
		type(extension, "42639418");
		WebElement mailid = locateElement("createLeadForm_primaryEmail");
		type(mailid, "suriyaravee2593@gmail.com");
		WebElement phonenum = locateElement("createLeadForm_primaryPhoneNumber");
		type(phonenum, "9094956400");
		WebElement person = locateElement("createLeadForm_primaryPhoneAskForName");
		type(person, "SuriyaRavi");
		WebElement weburl = locateElement("createLeadForm_primaryWebUrl");
		type(weburl, "www.google.com");
		WebElement toname = locateElement("createLeadForm_generalToName");
		type(toname, "Suriya");
		WebElement address1 = locateElement("createLeadForm_generalAddress1");
		type(address1, "10/9, 4th st, Dasarathapuram");
		WebElement city = locateElement("createLeadForm_generalCity");
		type(city, "Chennai");
		WebElement pin = locateElement("createLeadForm_generalPostalCode");
		type(pin, "600093");
		Thread.sleep(3000);
		WebElement state = locateElement("createLeadForm_generalStateProvinceGeoId");
		selectDropDownUsingText(state, "Indiana");
		Thread.sleep(3000);
		WebElement country = locateElement("createLeadForm_generalCountryGeoId");
		selectDropDownUsingText(country, "India");
		Thread.sleep(3000);
		WebElement createlead = locateElement("xpath", "//input[@class = 'smallSubmit']");
		click(createlead);
	}
	
	@DataProvider(name="fetchData")
	public static Object[][] getData() 
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

