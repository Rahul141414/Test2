package cimet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {

	@FindBy(id = "postcode") private WebElement POostcode;
	@FindBy(xpath = "//ul[@id=\"ui-id-1\"]//span") private WebElement list;
	@FindBy(id="submit_postalcode") private WebElement comparenow;
	
	public Pom1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void postcodemethod() throws InterruptedException {
		Thread.sleep(1000);
		POostcode.sendKeys("2000, BARANGAROO, NSW");
		Thread.sleep(1000);
		list.click();
	}
	public void comparenowmethod() {
		comparenow.click();
	}

}
