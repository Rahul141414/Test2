package Page_factory_module_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkartloginpage {
	@FindBy(xpath = "(//input[@type='text'])[2]") private WebElement EnterUsername;
	@FindBy(xpath = "//input[@type='password']") private WebElement EnterPassword;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']") private WebElement loginbutton;
	
	public flipkartloginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void username(String mobile) {
		EnterUsername.sendKeys(mobile);
	}
	public void password(String password) {
		EnterPassword.sendKeys(password);
	}
	void button() {
		loginbutton.click();
	}
	

}
