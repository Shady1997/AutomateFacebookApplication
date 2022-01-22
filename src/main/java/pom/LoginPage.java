package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	public WebElement userName;

	@FindBy(xpath = "//input[@id='pass']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@data-testid='royal_login_button']")
	public WebElement loginButton;

}
