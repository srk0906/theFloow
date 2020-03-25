package testCases;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.LoginPage;

public class LogoutTest extends BaseClass {
	@Test
	public void LogoutSuccessTest() throws InterruptedException {
		System.out.println("Logout...");

		LoginPage logoutPage = new LoginPage(driver);

		logoutPage.logoutSuccess();
	}

}
