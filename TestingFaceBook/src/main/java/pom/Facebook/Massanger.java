package pom.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Massanger {
	
	@FindBy (xpath="(//div[@aria-label='Messenger'])[1]")
	 WebElement massagerButton;
	
	
	
	

	public  Massanger(WebDriver  driver) {
		PageFactory.initElements(driver ,this);
	}

	public void MassangerButton() {
		massagerButton.click();;
	} 
	
	public void MassangerButton() {
		massagerButton.click();;
	}
	
}
