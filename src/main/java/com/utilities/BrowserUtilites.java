package com.utilities;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.ScreenshotException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtilites {
	public static WebDriver driver;
	Logger log=Logger.getLogger(getClass().getSimpleName());
		
		public WebDriver launchbrowser() throws Exception{
			WebDriverManager.chromedriver().setup();
			return driver = new ChromeDriver();
			
}
		public static  WebDriver Launch(String url) {
			driver.get(url);
			driver.manage().window().maximize();
			return driver;
			
			
			
		}	
	public void screenshotbrowser(WebDriver driver,String ClassName)throws Exception{
		String destdir="ScreenShots";
		TakesScreenshot ts = (TakesScreenshot) driver; //screenshot setup will be done
		File source = ts.getScreenshotAs(OutputType.FILE);//Takes the screenshot and saving it to surce object
		String dest=ClassName +".png";
		//source which we saved is not physically saved. but it is there in the object
		String sPathOFScreenshot = System.getProperty("user.dir")+"/test-output/"+destdir+"/"+dest;
		File destfile = new File(sPathOFScreenshot);
		
		try {
		FileUtils.copyFile(source, destfile);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
//	public void screenshotforwebelement(WebDriver driver,WebElement eleScreenArea ,String ClassName)throws Exception{
//		String destdir="ScreenShots";
//		String dest=ClassName +".png";
//		ScreenshotException fpscreenshot=new Ashot().shootingStrategy(ShootingStrategies.viewportpasting(1000)).
//				takescreenshot(driver,eleScreenArea);
//		String sPathOFScreenshot = System.getProperty("user.dir")+"/test-output/"+destdir+"/"+dest;
//		File destfile = new File(sPathOFScreenshot);
//		
//		try {
//		FileUtils.copyFile(source, destfile);
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
	public boolean scrolltoview(WebDriver driver,WebElement ele)throws Exception{
		boolean bres_flag=false;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollintoview();", ele);
		bres_flag=true;
		return bres_flag;
	}
	public void clickusingJs(WebDriver driver,WebElement ele)throws Exception{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		
	}
	public  void scrolltoendofthepage(WebDriver driver,int n) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 //i have mententioned i count <14 coz i am clicking the arrow 16 times 
		 for (int i = 0; i < n; i++) {			 

             js.executeScript("window.scrollBy(0,1000)");            

             Thread.sleep(3000);

        }
	       }
	public  void scrolltovisibilityofelement(WebDriver driver,WebElement scrollelement) throws Exception {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", scrollelement);
				
				Thread.sleep(5000);
				scrollelement.click();
	      }

	public  void scrolltoendofthepagehorizontal(WebDriver driver,WebElement ele) throws Exception {
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 
		 //i have mententioned i count <16 coz i am clicking the arrow 16 times 
		 for (int i = 0; i < 16; i++) {
	    executor.executeScript("arguments[0].click();", ele);
	    Thread.sleep(3000);

	       }
	}
	
public void   teardownbrowser() {
		
		driver.quit();		
		
		}
}
