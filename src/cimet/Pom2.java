package cimet;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pom2 {
	@FindBy(xpath = "(//div[@class='vc_col-sm-4 wpb_column vc_column_container radio-option-img option-box'])[1]") private WebElement electricitygas;
	@FindBy (xpath = "(//div[@class='vc_col-sm-4 wpb_column vc_column_container radio-option-img option-box'])[4]") private WebElement residential;
	@FindBy(xpath = "(//div[@class='vc_col-sm-4 wpb_column vc_column_container radio-option-img option-box'])[6]") private WebElement yesihave;
	@FindBy(xpath = "(//span[@class='rdl-label'])[6]") private WebElement yes1;
	@FindBy(xpath = "(//span[text()='Electricity'])[2]") private WebElement electricity;
	@FindBy(xpath = "(//span[@class=\"rdl-label\"])[11]") private WebElement yes;
	@FindBy(id = "moving_datepicker") private WebElement calender;
    @FindBy(xpath = "((//table[@class=\"ui-datepicker-calendar\"])[2]//a)[2]") private WebElement date;
    @FindBy(xpath = "(//button[@type='button'])[9]") private WebElement yesbutton;
    @FindBy(xpath = "//select[@class=\"lifesupportlistcls custom-select remove_all_errors form-control\"]") private WebElement dropdown;
  
    public Pom2(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    	
    }
    public void pom2method(WebDriver driver) throws InterruptedException {
    	Actions act = new Actions(driver);
    	electricitygas.click();
    	Thread.sleep(3000);
    	residential.click();
    	yesihave.click();
    	yes1.click();
    	Thread.sleep(3000);
act.moveToElement(dropdown).click().build().perform();
Thread.sleep(3000);
    	act.sendKeys(Keys.ARROW_DOWN).perform();
    	act.sendKeys(Keys.ENTER).perform();
    	electricity.click();
    	yes.click();
    	Thread.sleep(2000);
    	
    	act.moveToElement(calender).click().build().perform();
    	Thread.sleep(2000);
    	act.moveToElement(date).click().build().perform();
//    	calender.click();
//    	Thread.sleep(2000);
//    	date.click();
    	Thread.sleep(2000);
    	yesbutton.click();
    	
    }
    
	
	

}
