package khan.nativeapp.testcases;

import org.testng.annotations.Test;

import ecommerce.hybrid.POM.LoginPOM;
import ecommerce.hybrid.POM.LogoutPOM;
import ecommerce.hybrid.POM.CoursePOM;
import ecommerce.hybrid.POM.LogoutPOM;
import ecommerce.hybrid.actions.Capabilities;
import ecommerce.hybrid.utils.CaptureScreenshot;
import ecommerce.hybrid.utils.Ecommerce_Utils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class KhanAppTest extends Capabilities{
	
	public static AndroidDriver <AndroidElement> driver=null;
	public static LoginPOM loginPom=null;
	public static CoursePOM CoursePom=null;
	public static LogoutPOM logoutPom=null;
	public static Ecommerce_Utils eUtils=null;
	public static CaptureScreenshot captureScreenshot=null;
	
	@BeforeTest
	public void beforeTest() throws MalformedURLException {		
		System.out.println("*****************  In BeforeTest *************");
		driver=Capabilities.capability();		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		captureScreenshot=new CaptureScreenshot(driver);
		eUtils=new Ecommerce_Utils(driver);
		loginPom=new LoginPOM(driver);
		CoursePom=new CoursePOM(driver);
		logoutPom=new LogoutPOM(driver);
	}
	
  @Test(priority = 0)
  public void TC01() {	  
	  try {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(15000);
		loginPom.dismiss1();
		loginPom.signin();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginPom.signinwithgoogle();
		loginPom.clickonemail();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginPom.selectlang();
		loginPom.englang();
		System.out.println("Logged-in and Selected English as Language!!");
	} catch (Exception e) {
		e.printStackTrace();
		captureScreenshot.screenshot();
		}
	}
  

  @Test(priority = 1)
  public void TC02() throws InterruptedException {
	  try {
		  System.out.println("Selecting a course to read on");
	 	  loginPom.getStarted();
//			loginPom.adultlearner();
	 	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			loginPom.selectcalculus();
			loginPom.done();
			System.out.println("Selected Calculus course!!!");
			loginPom.adultlearner();
			loginPom.done();
			loginPom.closegrade();
	  } catch (Exception e) {
	e.printStackTrace();
	captureScreenshot.screenshot();
	}
  }
  
  @Test(priority = 2)
  public void TC03() throws InterruptedException {
	  try {
		  Thread.sleep(8000);
		  CoursePom.selectcalculuscourse();
		  CoursePom.completecourse();
		  	  } catch (Exception e) {
	e.printStackTrace();
	captureScreenshot.screenshot();
	}
  }
  
  @AfterTest
  public void afterTest() throws InterruptedException {
  
		System.out.println("*****************  In AfterTest *************");
		logoutPom.gotoHome();
		logoutPom.gotoSettings();
		logoutPom.logOut();
		System.out.println("Logged out of the application!!!!!!!!!");
		driver.quit();
  }

}
