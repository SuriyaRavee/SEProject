package testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods {
	/*@Parameters({"browser","URL","userName","password"})
	@BeforeMethod(groups="common")
	public void loginLeafTaps(String Browser, String Url, String uName, String pwd)

	{
		startApp(Browser, Url);
		type(locateElement("username"), uName);
		type(locateElement("password"), pwd);
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link", "CRM/SFA"));
	}
	*/
	//Data Provider
	//@Parameters({"browser","URL","userName","password"})
	@BeforeMethod//(groups="common")
	public void loginLeafTaps()

	{
		startApp("chrome", "http://leaftaps.com/opentaps");
		type(locateElement("username"), "DemoSalesManager");
		type(locateElement("password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link", "CRM/SFA"));
	}
	
	
	
	@AfterMethod//(groups="common")
	public void closeApp()
	{
		closeBrowser();
	}
	
	/*@AfterMethod
	public void closeApp()
	{
		closeBrowser();
	}*/
	
}

