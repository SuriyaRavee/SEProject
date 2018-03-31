package week0.day1;

import javax.swing.JOptionPane;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctclogin {

	public static void main(String[] args) throws InterruptedException {
		//Initialize Browser
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        //Launch Browser
    ChromeDriver driver = new ChromeDriver();
        // Maximize Window
    driver.manage().window().maximize();
       // Open URL
    driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
    driver.findElementById("userRegistrationForm:userName").sendKeys("SuriyaRavee0293");
    driver.findElementById("userRegistrationForm:password").sendKeys("India123$");
    driver.findElementById("userRegistrationForm:confpasword").sendKeys("India123$");
    WebElement element = driver.findElementById("userRegistrationForm:securityQ");
    Select dropdown = new Select(element);
    dropdown.selectByValue("1");
    driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Maharishi");
    driver.findElementById("userRegistrationForm:firstName").sendKeys("Suriya");
    driver.findElementById("userRegistrationForm:lastName").sendKeys("Ravi");
    Thread.sleep(2000);
    WebElement element1 = driver.findElementById("userRegistrationForm:gender:1");
    element1.click();
    Thread.sleep(2000);
    WebElement element2 = driver.findElementByXPath("(//input[@name='userRegistrationForm:maritalStatus'])[2]");
    element2.click();
    
    WebElement element3 = driver.findElementById("userRegistrationForm:dobDay");
    Select dropdownbod1 = new Select(element3);
    dropdownbod1.selectByIndex(1);
  
    WebElement element4 = driver.findElementById("userRegistrationForm:dobMonth");
    Select dropdownbod2 = new Select(element4);
    Thread.sleep(2000);
    dropdownbod2.selectByIndex(5);
    Thread.sleep(2000);
    WebElement element5 = driver.findElementById("userRegistrationForm:dateOfBirth");
    Select dropdownbod3 = new Select(element5);
    Thread.sleep(2000);
    dropdownbod3.selectByVisibleText("1993");
    
    WebElement element6 = driver.findElementById("userRegistrationForm:occupation");
    Select dropdownocc = new Select(element6);
    Thread.sleep(2000);
    dropdownocc.selectByIndex(3);
    
    WebElement element7 = driver.findElementById("userRegistrationForm:countries");
    Select dropdownctry = new Select(element7);
    Thread.sleep(2000);
    dropdownctry.selectByVisibleText("India");
    
    driver.findElementById("userRegistrationForm:email").sendKeys("suriyaravee250293@gmail.com");
    driver.findElementById("userRegistrationForm:mobile").sendKeys("9094956400");
    
    WebElement element8 = driver.findElementById("userRegistrationForm:nationalityId");
    Select dropdownnationality = new Select(element8);
    dropdownnationality.selectByVisibleText("India");
    
    driver.findElementById("userRegistrationForm:address").sendKeys("10/9,Dasarathapuram 4th st");
    driver.findElementById("userRegistrationForm:street").sendKeys("Saligramam");
    driver.findElementById("userRegistrationForm:area").sendKeys("Chennai");
    driver.findElementById("userRegistrationForm:pincode").sendKeys("600093");
    driver.findElementById("userRegistrationForm:statesName").click();
    Thread.sleep(5000);
    WebElement element9 = driver.findElementById("userRegistrationForm:cityName");
    Select dropdowncity = new Select(element9);
    Thread.sleep(2000);
    dropdowncity.selectByIndex(1);
    Thread.sleep(8000);
    WebElement element10 = driver.findElementById("userRegistrationForm:postofficeName");
    Select dropdownpostoff = new Select(element10);
   Thread.sleep(2000);
   dropdownpostoff.selectByVisibleText("Saligramam S.O");  
    
    driver.findElementById("userRegistrationForm:landline").sendKeys("9841503749");
    
    WebElement element11 = driver.findElementByXPath("(//input[@name='userRegistrationForm:resAndOff'])[1]");
    element11.click();
    
    driver.findElementById("nlpAnswer").sendKeys("JE5Z");
    driver.findElementByLinkText("Submit Registration Form>>>").click();
    
    

	}

}
