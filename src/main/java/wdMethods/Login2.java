package wdMethods;
import org.junit.Test;
import org.openqa.selenium.WebElement;


public class Login2 extends SeMethods{
	@Test
	public void login2() throws InterruptedException{


		Thread.sleep(2000);
		startApp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		WebElement myframe = locateElement("iframeResult");
		switchToFrame(myframe);
		WebElement alert = locateElement("xpath", "//button[text()='Try it']");
		clickWithoutSnap(alert);
		//typealert("Suriya");
		acceptAlert();
		//closeBrowser();
	}

}
