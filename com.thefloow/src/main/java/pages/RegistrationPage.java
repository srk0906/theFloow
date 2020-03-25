package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import java.text.SimpleDateFormat;

public class RegistrationPage extends BasePOMPage {

	@AndroidFindBy(id = "register_email_address")
	public MobileElement email;

	@AndroidFindBy(id = "register_password")
	public MobileElement password;

	@AndroidFindBy(id = "register_confirm_password")
	public MobileElement repeatPassword;

	@AndroidFindBy(id = "register_forename")
	public MobileElement foreName;

	@AndroidFindBy(id = "register_surname")
	public MobileElement surName;

	@AndroidFindBy(id = "register_dob")
	public MobileElement dob;

	@AndroidFindBy(id = "register_postcode")
	public MobileElement zipCode;

	@AndroidFindBy(id = "chk_agree")
	public MobileElement agree;

	@AndroidFindBy(id = "btn_register")
	public MobileElement registerBtn;

	@AndroidFindBy(id = "welcome_next_button")
	public MobileElement next1;

	@AndroidFindBy(id = "btn_next")
	public MobileElement next2;

	@AndroidFindBy(id = "request_permissions_btn")
	public MobileElement grant;

	@AndroidFindBy(id = "skip_continue_btn")
	public MobileElement start;

	@AndroidFindBy(id = "settings_btn")
	public MobileElement settings;

	public RegistrationPage(AppiumDriver<MobileElement> driver) {
		super(driver);

	}

	public void registrationSuccess() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 2);
		Faker faker = new Faker();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String date = formatter.format(faker.date().birthday());
		email.sendKeys(firstName + "@yopmail.com");
		password.sendKeys("Asdf1234");
		repeatPassword.sendKeys("Asdf1234");
		foreName.sendKeys(firstName);
		surName.sendKeys(lastName);
		dob.sendKeys(date);
		zipCode.sendKeys("cv31pe");
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"or\"));"));
		agree.click();
		registerBtn.click();
		Thread.sleep(10000);
		next1.click();
		next2.click();
		grant.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		start.click();
		driver.navigate().back();

	}

}