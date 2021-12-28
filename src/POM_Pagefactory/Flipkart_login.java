package POM_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_login {
	@FindBy (xpath="(//input[@type='text'])[2]") private WebElement Userid;
	@FindBy (xpath = "//input[@type='password']") private WebElement password;
	@FindBy (xpath = "(//button[@type='submit'])[2]") private WebElement loginbutton;
	
	public Flipkart_login(WebDriver driver) {
	PageFactory.initElements(driver,this);	
	}
    public void id(String mob) {
    	Userid.sendKeys(mob);
    }
    public void password (String pass) {
    	password.sendKeys(pass);
    }
    public void loginbutton() {
    	loginbutton.click();
    }
}
