package StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMClasses.LoginPage;
import io.cucumber.java.en.*;

public class LoginStepDef {
	
	WebDriver driver=new ChromeDriver();
	LoginPage login= new LoginPage(driver);

	@Given("User is on Login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}

	@When("User enters Valid UID and PW")
	public void user_enters_valid_uid_and_pw() {
		login.EnterUID("student");
		login.EnterPW("Password123");
	    login.ClickSubmit();
	}

	@Then("User navigated to homepage")
	public void user_navigated_to_homepage() {

	boolean	LogoutDisplayed=driver.findElement(By.xpath("//*[@class=\"wp-block-button__link has-text-color has-background has-very-dark-gray-background-color\"]")).isDisplayed();
		
		Assert.assertTrue(LogoutDisplayed);
		driver.quit();
	}
	
	
	
}
