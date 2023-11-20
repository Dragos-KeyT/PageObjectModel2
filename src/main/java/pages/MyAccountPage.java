package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumWrappers;

public class MyAccountPage extends SeleniumWrappers{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	public By userField = By.id("username");
	public By passField = By.id("password");
	public By loginButton = By.cssSelector("button[name='login']");
	
	
	public void loginInApp(String user, String pass) {
		sendKeys(userField, user);
		sendKeys(passField, pass);
		click(loginButton);
		
	}

}
