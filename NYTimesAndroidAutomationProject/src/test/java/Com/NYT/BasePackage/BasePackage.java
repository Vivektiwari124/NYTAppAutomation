package Com.NYT.BasePackage;
import java.io.File;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.NYT.Pages.Const;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class BasePackage {
	
	@BeforeTest
	public static void Appinvoke() {
		try {
			File app = new File("E:\\Software\\Selenium oxygen\\reader-google-beta-6.21.3.apk");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "244a401cd70d7ece");
			capabilities.setCapability("platformVersion", "8.0.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app-package", "com.nytimes.android");
			capabilities.setCapability("app-activity", ".WelcomeActivity");
			capabilities.setCapability("fullReset", false);
			capabilities.setCapability("noReset", true);
			capabilities.setCapability("app", app.getAbsolutePath());
			Const.driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			Thread.sleep(2000);
			System.out.println("App is invoked successfully");
			//driver.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
			//System.out.println("dsdsdssdsdsdsd");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	/*@AfterSuite
	public void QuitApp() {
		driver.quit();
	}*/

}
