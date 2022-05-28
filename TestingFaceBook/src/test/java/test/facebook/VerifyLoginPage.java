package test.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Facebook.LoginPage;

public class VerifyLoginPage {

	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Pruthviraj_data\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver ();
		 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS)	; 
		 driver.get("https://www.facebook.com/");
		 
		 LoginPage loginpage =new LoginPage(driver);
		 loginpage.SendUserName();
		 loginpage.SendPasswordName();
		 loginpage.ClickLoginButton();
		 
		 
		 
		 
		 
}
}