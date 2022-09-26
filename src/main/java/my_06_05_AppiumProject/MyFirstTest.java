package my_06_05_AppiumProject;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MyFirstTest {

	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName","Android");
		desiredCapabilities.setCapability("platformVersion","9.0");
		//desiredCapabilities.setCapability("udid","RF8MB14TV7X");
		//desiredCapabilities.setCapability("platformVersion","10.0");
        //desiredCapabilities.setCapability("deviceName", "Pixel 2");
		desiredCapabilities.setCapability("automationName", "UiAutomator2");
		//desiredCapabilities.setCapability("appPackage", "com.google.android.apps.nexuslauncher");
		//desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
		//desiredCapabilities.setCapability("appActivity", ".ApiDemos");//com.google.
		desiredCapabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		desiredCapabilities.setCapability("appActivity", ".Calculator");


		//desiredCapabilities.setCapability("appActivity", ".NexusLauncherActivity");//com.google.
		//android.apps.nexuslauncher
		//desiredCapabilities.setCapability("avd", "Pixel_2");
        desiredCapabilities.setCapability("app","/Users/meghamapalagama/Downloads/ApiDemos-debug.apk");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		@SuppressWarnings("rawtypes")
		AppiumDriver driver = new AndroidDriver(url, desiredCapabilities);
		@SuppressWarnings("unused")
		String sessionId = driver.getSessionId().toString();
		
		MobileElement seven = (MobileElement) driver.findElementById("bt_07");
		MobileElement four = (MobileElement) driver.findElementById("bt_04");
		MobileElement add = (MobileElement) driver.findElementById("bt_add");
		//MobileElement equal = (MobileElement) driver.findElementById("bt_equal");
		//MobileElement result = (MobileElement) driver.findElementById("txtCalc_RealTimeResult");
		
		WebElement equal = driver.findElementById("bt_equal");
		
		By result = By.id("txtCalc_RealTimeResult");
		
		
		seven.click();
		add.click();
		four.click();
		equal.click();
		
		
		String actualResult = driver.findElement(result).getText();
		System.out.println("actual result is " + actualResult);





	}

}
