package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POm_of_Home_Page {

	@FindBy(xpath = "//input[@type='search']") private WebElement searchbox;
	public POm_of_Home_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	public void search() {
		searchbox.sendKeys("Tshirts");
	
	}

}
