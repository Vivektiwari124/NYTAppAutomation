package Com.NYT.Utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import Com.NYT.BasePackage.BasePackage;
import Com.NYT.Pages.Const;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class UtilityClass extends BasePackage{
	
	public static void SeekBarTest(){
		/*MobileElement slider=driver.findElementById("com.nytimes.android:id/fontDlgSeekBar");
		int xAxisStartPoint = slider.getLocation().getX();
		int xAxisEndPoint = xAxisStartPoint + slider.getSize().getWidth();
		int yAxis = slider.getLocation().getY();
		//TouchAction act=new TouchAction(driver);
		//pressed x axis & y axis of seekbar and move seekbar till the end
		
		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(xAxisStartPoint, yAxis))
		.moveTo(PointOption.point(xAxisEndPoint-1, yAxis))
		.release().perform();*/
		
		MobileElement seekBar = Const.driver.findElement(By.id("com.nytimes.android:id/fontDlgSeekBar"));
		//Get start point of seekbar.
		int startX = seekBar.getLocation().getX();
		System.out.println(startX);
		//Get end point of seekbar.
		    int endX = seekBar.getSize().getWidth();
		    System.out.println(endX);
		    //Get vertical location of seekbar.
		    int yAxis = seekBar.getLocation().getY();
		    //Set slidebar move to position.
		    // this number is calculated based on (offset + 3/4width)
		    int moveToXDirectionAt = 1000 - startX;
		    System.out.println("Moving seek bar at " + moveToXDirectionAt+" In X direction.");
		    //Moving seekbar using TouchAction class.
		    //TouchAction act=new TouchAction(driver);
		    new TouchAction((PerformsTouchActions) Const.driver).longPress(PointOption.point(startX, yAxis)).moveTo(PointOption.point(moveToXDirectionAt,yAxis)).release().perform();
	
	
	}
	
	public static void scroll()
	// if you are using appium client less then 6.0.0 then no need to use
	// pointoption & wait method action method
	// we can directly use press method & in that we can pass perameters of x axis & y axis & move to
	// method
	{
		try {

			Dimension dim = Const.driver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			int startx = width / 2;
			int endx = width / 2;
			int starty = (int) (dim.getHeight() * 0.40);
			int endy = (int) (dim.getHeight() * 0.05);
			new TouchAction((PerformsTouchActions) Const.driver).press(PointOption.point(startx, starty))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(endx, endy))
					.release().perform();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<MobileElement> getGroupName() {
		return Const.driver.findElements(By.xpath("//android.widget.TextView[@text='OPINION']"));

	}

	public static void scrollvertical() {
		int len = getGroupName().size();
		System.out.println(len);
		while (getGroupName().size() == 0) {
			scroll();
		}

		if (getGroupName().size() > 0) {
			System.out.println("done");
			getGroupName().get(0).getText();
			//len=0;
			
		}

	}
	
	
	public static void scrollUp() {
		try {

			Dimension dim = Const.driver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			int startx = width / 2;
			int endx = width / 2;
			int starty = (int) (dim.getHeight() * 0.40);
			int endy = (int) (dim.getHeight() * 0.05);
			
			//new TouchAction((PerformsTouchActions) driver).press(PointOption.point(startx, starty))
				//	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).moveTo(PointOption.point(endx, endy))
					//.release().perform();

			new TouchAction((PerformsTouchActions) Const.driver).press(PointOption.point(startx, starty))
			.moveTo(PointOption.point(endx, endy))
			.release().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void swipe() {
		try {

			Dimension dim = Const.driver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();

			int stx=(int) (dim.getWidth() * 0.80);
			int ex=(int) (dim.getWidth() * 0.05);
			int sty=height/2;
			int ey=height/2;
			new TouchAction((PerformsTouchActions) Const.driver).press(PointOption.point(stx, sty))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(ex, ey))
					.release().perform();
			
	

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<MobileElement> getSectionName() {
		return Const.driver.findElements(By.xpath("//android.widget.TextView[@text='Sports']"));

	}
	
	public static void scrollhorizontal() {
		int len = getSectionName().size();
		System.out.println(len);
		while (getSectionName().size() == 0) {
			swipe();
		}

		if (getSectionName().size() > 0) {
			System.out.println("done");
			getSectionName().get(0).getText();
		}

	}

}
