package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	

	
	@FindBy(xpath = "//*[@id=\"username\"]")
	WebElement UID;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement PW;
	
	@FindBy(xpath="//*[@id=\"submit\"]")
	WebElement SubmitBtn;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPW(String pass) {
		
		PW.sendKeys(pass);
	}
	
	public void EnterUID(String username) {
		
		UID.sendKeys(username);
	}
	
	
	public void ClickSubmit() {
		
		SubmitBtn.click();
	}


	
}
