package tests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.BaseTest;
import utils.ScreenShots;

public class LoginTest extends BaseTest{
	


	
	@Test(priority = 2)
	public void invalidLogin() {
		
		app.click(app.menu.myAccountLink);
		app.myAccount.loginInApp("usergresit", "passgresit");
		assertTrue(app.elementIsDisplayed(app.myAccount.errorMsg));

	
	
	}
	
}
