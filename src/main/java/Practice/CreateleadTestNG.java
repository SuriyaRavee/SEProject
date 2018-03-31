package Practice;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testCases.ProjectMethods;


import wdMethods.SeMethods;

public class CreateleadTestNG extends ProjectMethods {
	@Test (dataProvider="fetchData")// HERE WE ARE FETCHING THE DATA GIVEN IN DATA PROVIDER BELOW(starts from line No.57 
	
	//GIVE THE PARAMETERS(for which you need to enter the datas while executing the program) INSIDE THE BRACKETS AFTER METHOD NAME
	public void leadCreation(String FName, String LName, String ComName, String industry, String ownership, String currency) throws InterruptedException {
		
		click(locateElement("link", "Create Lead"));
		//NAME must exactly same (eG: ComName spelling should be same in both below line(line 21) and arguments passed in line no.17)
		type(locateElement("createLeadForm_companyName"),ComName);
		type(locateElement("createLeadForm_firstName"),FName);
		type(locateElement("createLeadForm_lastName"),LName);
		selectDropDownUsingText(locateElement("createLeadForm_dataSourceId"),"Conference");
		type(locateElement("createLeadForm_firstNameLocal"),"Balaa");
		type(locateElement("createLeadForm_personalTitle"),"Ms");
		WebElement ProfileTittle = locateElement("createLeadForm_generalProfTitle");
		type(ProfileTittle, "Application Packaging");
		type(locateElement("createLeadForm_annualRevenue"),"100");
		selectDropDownUsingText(locateElement("createLeadForm_industryEnumId"),industry);
		selectDropDownUsingText(locateElement("createLeadForm_ownershipEnumId"), ownership);
		click(locateElement("xpath", "//img[@src='/images/fieldlookup.gif']"));
		switchToWindow(1);
		click(locateElement("xpath", "//span[text()='Name and ID']"));
		type(locateElement("xpath", "//input[@name='id']"), "democlass3");
		type(locateElement("xpath", "//input[@name='accountName']"), "Demo Party Classification Account 3");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		Thread.sleep(5000);
		clickWithoutSnap(locateElement("link", "democlass3"));
		switchToWindow(0);
		selectDropDownUsingIndex(locateElement("createLeadForm_marketingCampaignId"), 1);
		type(locateElement("createLeadForm_lastNameLocal"), "T1");
		type(locateElement("createLeadForm_birthDate"), "11/16/93");
		type(locateElement("createLeadForm_departmentName"), "Testing");
		selectDropDownUsingText(locateElement("createLeadForm_currencyUomId"), currency);
		type(locateElement("createLeadForm_numberEmployees"), "10");
		type(locateElement("createLeadForm_tickerSymbol"), "@");
		type(locateElement("createLeadForm_description"), "dggg");
		type(locateElement("createLeadForm_primaryPhoneAreaCode"), "123");
		type(locateElement("createLeadForm_primaryEmail"), "gfgfg@gmail.com");
		type(locateElement("createLeadForm_generalToName"), "Bh");
		type(locateElement("createLeadForm_generalCity"), "Chennai");
		type(locateElement("createLeadForm_generalPostalCode"), "600100");
		click(locateElement("name", "submitButton"));
	}
		//GIVING 2 SETS OF DATA 
		@DataProvider(name= "fetchData")
		public Object[][] getdata()
		{
			Object[][]	data = new Object[2][6]	;// HERE [2] SPECIFIES TO RUN THE CODE 2 TIMES, [6] SPECIFIES WE WRE GIVING DATAS IN 6 COLUMNS
			//THESE DATA GET POPULATED WHILE RUNNING THE CODE 1ST TIME
			data[0][0] = "Bala";//this is fName
			data[0][1] = "T";   // this is LName          // the values will get passed in the order, what we have given in methods(line No.17)
			data[0][2] = "ABC Pvt Ltd"; //this is ComName
			data[0][3]= "Computer Software";
			data[0][4]= "Corporation";
			data[0][5]="INR - Indian Rupee";
			//THESE DATA GET POPULATED WHILE RUNNING THE CODE 2ND TIME
			data[1][0]="Suriya";
			data[1][1] = "R";
			data[1][2] = "ABC Pvt Ltd";
			data[1][3]= "Computer Hardware";
			data[1][4]= "Public Corporation";
			data[1][5]="USD - American Dollar";
			
		return data;
		}
		
	}

