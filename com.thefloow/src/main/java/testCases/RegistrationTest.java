package testCases;

import java.text.ParseException;
import org.testng.annotations.Test;
import baseClass.BaseClass;
import pages.RegistrationPage;

public class RegistrationTest extends BaseClass {

	@Test
	public void RegistrationSuccessTest() throws InterruptedException, ParseException {
		System.out.println("Application Started...");

		RegistrationPage regPage = new RegistrationPage(driver);

		regPage.registrationSuccess();
	}

}
