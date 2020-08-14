package ecommerce.hybrid.POM;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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

public class CoursePOM{
	
	public static AndroidDriver <AndroidElement> driver=null;
	
	public CoursePOM(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
	}
	
	public void selectcalculuscourse() {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(textMatches(\"Calculus 1\").instance(0))"));
		driver.findElement(MobileBy.xpath("//*[@text='Calculus 1' and @class='android.widget.TextView']")).click();
		System.out.println("Selected Calculus course to read it!!!!");
	}

	public void completecourse() {
		String actual1 = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(textMatches(\"Take Course Challenge\").instance(0))")).getText();
		String expected1 = "Take Course Challenge"; 
		Assert.assertEquals(expected1, actual1);
		System.out.println("Went through the course!!!!");
	}

}