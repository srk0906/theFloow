package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePOMPage {

	public LoginPage(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	@AndroidFindBy(id = "btn_already_registered")
	public MobileElement albtn;

	@AndroidFindBy(id = "login_email")
	public MobileElement email;

	@AndroidFindBy(id = "login_password")
	public MobileElement password;

	@AndroidFindBy(id = "btn_login")
	public MobileElement loginButton;

	@AndroidFindBy(id = "request_permissions_btn")
	public MobileElement perBtn;

	// @AndroidFindBy(id = "permission_allow_foreground_only_button")
	// public MobileElement perAllow;

	@AndroidFindBy(id = "skip_continue_btn")
	public MobileElement getStart;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]/android.widget.RelativeLayout")
	public MobileElement more;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView")
	public MobileElement about;

	@AndroidFindBy(id = "logout")
	public MobileElement logout;

	@AndroidFindBy(id = "fat_button_1")
	public MobileElement okBtn;

	public void loginSuccess() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 2);

		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"or\"));"));
		albtn.click();
		Thread.sleep(3000);
		email.sendKeys("man03@yopmail.com");
		password.sendKeys("Asdf1234");
		loginButton.click();
		Thread.sleep(3000);
		perBtn.click();
		// Alert popup
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		getStart.click();
		driver.navigate().back();
		Thread.sleep(3000);

	}

	public void logoutSuccess() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 2);

		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"or\"));"));
		albtn.click();
		Thread.sleep(3000);
		email.sendKeys("man03@yopmail.com");
		password.sendKeys("Asdf1234");
		loginButton.click();
		Thread.sleep(5000);
		perBtn.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		getStart.click();
		driver.navigate().back();
		Thread.sleep(3000);
		more.click();
		about.click();
		logout.click();
		okBtn.click();
		Thread.sleep(5000);
	}
}
