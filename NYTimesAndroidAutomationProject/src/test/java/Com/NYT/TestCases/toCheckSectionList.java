package Com.NYT.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Com.NYT.BasePackage.BasePackage;
import Com.NYT.Pages.Const;

public class toCheckSectionList extends BasePackage {

	
	public void toInvokeSectionlistItem() throws InterruptedException {
	
		BasePackage.Appinvoke();
		Const.driver.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
		System.out.println("SectionList Invoked Successfully");
		Thread.sleep(2000);
		//driver.findElement(By.id("com.nytimes.android:id/toolbar")).click();

	}

}
