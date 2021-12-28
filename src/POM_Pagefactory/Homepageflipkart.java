package POM_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Homepageflipkart {
	@FindBy(xpath = "(//div[@class='exehdJ'])[1]") private WebElement exp;
	public Homepageflipkart(WebDriver driver) {
		PageFactory.initElements(driver,this );
		
	}
	public void actual(String z) {
		String ss = exp.getText();
		System.out.println(ss);
		if(z.equals(ss)) {
			System.out.println(ss);
	
			System.out.println("correct result");
			
		}
		
	}

}
