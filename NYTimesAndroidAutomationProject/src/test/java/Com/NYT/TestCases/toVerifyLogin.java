package Com.NYT.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import Com.NYT.BasePackage.BasePackage;
import Com.NYT.Pages.Const;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;

public class toVerifyLogin extends BasePackage {

	@Test
	public void toVerifyLoginfunc() throws InterruptedException {

		try {

			//RemoteWebDriver driver = Const.driver;

			/*
			 * String username = driver.findElement(By.
			 * xpath("//android.widget.TextView[@text='Digital Subscriber']")).getText();
			 * System.out.println(username); if (username.equals("Digital Subscriber")) {
			 * System.out.println("User is already login"); }
			 */
			Const.driver.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
			Thread.sleep(2000);
			Const.driver.findElement(By.xpath("//android.widget.TextView[@text='Log In or Create Account']")).click();
			System.out.println("User is already login3");
			
			Thread.sleep(2000);
			Const.driver.findElementByXPath("//android.widget.TextView[@text='Log in with email instead »']").click();
			Thread.sleep(2000);
			Const.driver.findElement(By.xpath("//android.widget.EditText[@text='Email']"))
					.sendKeys("vivek.tiwari@nytimes.com");
			Const.driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("test@1234");
			Const.driver.findElement(By.xpath("//android.widget.Button[@text='Log In']")).click();
			System.out.println("logged in successfully ");
			
			System.out.println("gfhgfhgfhg ");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
