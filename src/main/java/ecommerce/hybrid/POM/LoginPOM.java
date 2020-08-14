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

public class LoginPOM{
	
	public static AndroidDriver <AndroidElement> driver=null;
		
	public LoginPOM(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
	}
	
	public void dismiss1() {

		driver.findElement(MobileBy.className("android.widget.Button")).click();
			}

	public void signin() {
		
		driver.findElementByAndroidUIAutomator("text(\"Sign in\")").click();
	}
	
	public void signinwithgoogle() {
			
			driver.findElementByAndroidUIAutomator("text(\"Continue with Google\")").click();
		}
	public void clickonemail() {
		
		driver.findElementByAndroidUIAutomator("text(\"Deepashree Maakam\")").click();
	}

	public void getStarted() {
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(textMatches(\"Edit\").instance(0))")); 
	       driver.findElement(MobileBy.xpath("//*[@text='Edit' and @class='android.widget.TextView']")).click();
	}

	public void adultlearner() {
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Adult learner\"))").click();

	}

	public void selectcalculus() {
	
		   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
	}
	
	public void done() {
	driver.findElement(By.className("android.widget.Button")).click();
	}
	
	public void selectlang() {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(textMatches(\"Select language\").instance(0))")).click();
//		driver.findElement(MobileBy.xpath("//*[@text='Select language' and @class='android.widget.TextView']")).click();       	
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Select language\"))").click();
	}
	
	public void englang() {
		driver.findElementByAndroidUIAutomator("text(\"English\")").click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RadioButton")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().className(\"android.widget.ImageButton\")")).click();
	}

	public void closegrade()
	{
		driver.findElement(By.className("android.widget.ImageView")).click();
	}
}