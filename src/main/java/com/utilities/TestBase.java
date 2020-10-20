package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.listeners.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {
	
	public static BrowserUtilites obrowserutil=new BrowserUtilites();
	public static CommonUtilities ocommonutil=new CommonUtilities();
	public static ExtentManager oextendmanger=new ExtentManager();
	public static SeleniumUtilities oseleniumutil=new SeleniumUtilities();
	public    WebDriver driver;
	@BeforeSuite
	 public void launchingbrowsers() throws Exception {
		//oextendmanger.ExtentReports();
		driver=obrowserutil.launchbrowser();
		driver=obrowserutil.Launch("https://www.facebook.com/");
		
   }
}
