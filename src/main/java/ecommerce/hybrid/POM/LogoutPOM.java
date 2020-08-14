package ecommerce.hybrid.POM;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ecommerce.hybrid.actions.Capabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class LogoutPOM{
	
	public static AndroidDriver <AndroidElement> driver=null;
	
	public LogoutPOM(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
	}

	public void gotoHome() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(20000);
		driver.findElementByAccessibilityId("Explore tab").click();
		System.out.println("Clicked on home");
	}	

	public void gotoSettings()
	{
		driver.findElement(By.className("android.widget.ImageView")).click();
	}

	
	public void logOut()
	{
		driver.findElementByAndroidUIAutomator("text(\"Sign out\")").click();
	}
}