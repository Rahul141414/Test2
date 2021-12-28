package POM_Pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class listofwebelement {
	@FindBy(name = "q") private WebElement search;
	@FindBy(xpath = "(//ul[@jsname='bw4e9b'])[1]//li") private List<WebElement> list;
	public listofwebelement(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void search() {
		search.sendKeys("Honda");
	}
	public void selectlist() {
		for(WebElement w:list) {
			String s = w.getText();
			System.out.println(s);
		}
	}

}
