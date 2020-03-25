package testCases;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	@Test
	public void LoginSuccessTest() throws InterruptedException {
		System.out.println("Login...");

		LoginPage loginPage = new LoginPage(driver);

		loginPage.loginSuccess();
	}
}
