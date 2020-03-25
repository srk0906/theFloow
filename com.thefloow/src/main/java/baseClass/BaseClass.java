package baseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static AppiumDriver<MobileElement> driver;

	@BeforeTest
	// @Parameters({ "deviceName", "udid", "platformVersion", "url" })
	public void setup() throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "vivo1916");
		caps.setCapability("udid", "192.168.1.77:5555");
		caps.setCapability("appActivity", "com.thefloow.turnkey.ui.launcher.LauncherActivity");
		caps.setCapability("appPackage", "com.thefloow.thefloowltd.floowdrive.app");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", 9);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, caps);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(5000);

	}

	@AfterTest
	public void teardown() {
		driver.quit();

	}

}
