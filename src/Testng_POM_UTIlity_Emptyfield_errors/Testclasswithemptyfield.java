package Testng_POM_UTIlity_Emptyfield_errors;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class Testclasswithemptyfield extends Base_Class{
	Logine_error_messages log;
	@BeforeClass
	public void launching() {
		launch_browser();
		log =new Logine_error_messages(driver);
	}
	@BeforeMethod
	public void loginepage()  {
		log.click();
		
	}
	@Test
	public void validationerror() throws EncryptedDocumentException, IOException {
		String expiderror = Utility_pakage_class.excel(4, 0);
		String exppasserror = Utility_pakage_class.excel(4, 1);
		String actualid = log.iderror();
		Assert.assertEquals(expiderror, actualid,"not matched");
		Reporter.log("all matched", true);
		String actpass = log.pwerror();
	Assert.assertEquals(actpass, exppasserror,"not matched password");
	Reporter.log("all pass matched", true);
		
		
	}
	

	
}

