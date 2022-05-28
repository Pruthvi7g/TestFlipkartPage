package pom.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy  (xpath="//input[@type='text']")
    private WebElement userName;
	
	@FindBy  (xpath="//input[@type='password']")
    private WebElement password;
	 
	@FindBy  (xpath="//button[text()='Log In']")
    private WebElement loginButton;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SendUserName() {
		userName.sendKeys("7972139306");
	}
	
	public void SendPasswordName() {
		password.sendKeys("Prajput@123");
	}
	
	public void ClickLoginButton() {
		loginButton.click();
	}
}
