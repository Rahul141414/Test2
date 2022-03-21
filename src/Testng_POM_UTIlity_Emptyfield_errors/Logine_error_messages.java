package Testng_POM_UTIlity_Emptyfield_errors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logine_error_messages {
	@FindBy(xpath = "(//span[@class='su-message'])[1]") private WebElement iderror;
	@FindBy(xpath = "(//span[@class='su-message'])[2]") private WebElement passerror;
	@FindBy (xpath ="//button[@type=\"submit\"]") private WebElement loginebutton;
	@FindBy(xpath = "//p[@class='error text-center']") private WebElement error;
	
	public Logine_error_messages(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public String iderror() {
		String id = iderror.getText();
		return id;
	}
	public String pwerror() {
		String pw = passerror.getText();
		return pw;
	}
	public void click() {
		loginebutton.click();
	}
	public String error() {
		String fi = error.getText();
		return fi;
	}
	

}
