package com.utilities;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumUtilities {
	public static WebDriver driver;
	
		public  void  waitsecond(WebElement ele,int itime,WebDriver driver) {
			 WebDriverWait wait=new WebDriverWait(driver,itime);
				wait.until(ExpectedConditions.visibilityOf(ele));
		}
		public void validation (WebElement ele) {
			Assert.assertEquals(ele.isDisplayed(), true);
		}
		 public  void selectfromdropdown(WebElement ele) throws Exception {
				
				Select selectbyindex=new Select(ele);
				selectbyindex.selectByIndex(2);
			 
		 }
		 public  void selectfromdropdown(WebElement ele,int val) throws Exception {
				
				Select selectbyindex=new Select(ele);
				selectbyindex.selectByIndex(val);
			 
		 }
		 public  void sendvaluestotext(WebElement ele) throws Exception {
				
				ele.clear();
				ele.sendKeys("stuffed toys");
			 
		 }

		public void explicitWaitFunc(WebElement ele,WebDriver driver) {
			 WebDriverWait wait=new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.visibilityOf(ele));
			
		}
		public void explicitWaitFunc(WebElement ele,int itime,WebDriver driver) {
			 WebDriverWait wait=new WebDriverWait(driver,itime);
				wait.until(ExpectedConditions.visibilityOf(ele));
			
		}

		public void ufClickElement(WebElement ele) {
			ele.click();
			
		}

		public void ufClearElement(WebElement ele) {
			ele.clear();
			
		}

		public void ufSenKeys(WebElement ele, String text) {
			ele.sendKeys(text);
			
		}
		public void loginpage(WebElement ele, String text) {
			ele.sendKeys(text);
			
		}
		public  WebElement findElement(By location,String eleName) {
			WebElement ele = null;
			try {
				ele = driver.findElement(location);
				System.out.println("pass: "+eleName+" Found on the page");
				//logger.log(LogStatus.PASS, ""+ eleName +" Found on the page");
			}
			catch(NoSuchElementException errMessage) {
				System.out.println("Fail: "+eleName+" not found on the page");
				//logger.log(LogStatus.FAIL, ""+ eleName +" not Found on the page");
			
			}
			return ele;
		}
		
		/* name of the method:   entertext
		 * BriefDescription  :   entering textvalue for textbox
		 * Arguments         :  ele-->object
		 *                      textval--->to be entered 
		 *                      eleName--->object name
		 *  createdby        :  Automation team 
		 *  created date     :09/15/2020 
		 *  LastModified Date:09/15/2020         
		 */
		public  void enterText(WebElement ele,String textval,String eleName) throws InterruptedException

		{
			if(ele.isDisplayed())
			{
				Thread.sleep(4000);
				ele.sendKeys(textval);
				System.out.println("pass: "+textval+"value is entered in "+eleName+"field");
				//logger.log(LogStatus.PASS,textval+"value is entered in "+eleName+"field");
				
			}
			else
			{
				System.out.println("fail:" +eleName+ "field does not exist please check application");
				//logger.log(LogStatus.FAIL,textval+eleName+"field does not exist please check application");
			}
		}
		
		/* name of the method:   clickobject--->Button
		 * BriefDescription  :   clicking a button
		 * Arguments         :  ele-->object
		 *                      eleName--->object name
		 *  createdby        :  Automation team 
		 *  created date     :09/15/2020 
		 *  LastModified Date:09/15/2020          
		 */
		public  void clickObj(WebElement ele,String eleName)
		{
			if(ele.isDisplayed())
			{
				ele.click();
				System.out.println("pass :" +eleName + "button is clicked");
				//logger.log(LogStatus.PASS, objName + "button is clicked");
			}
			else
			{
				System.out.println("Fail:" +eleName+"button is not displayed ,please check the application");
				//logger.log(LogStatus.FAIL, objName+ "button is not displayed ,please check the application");
			}
		}
		

	/*
	 * Name of the method: selectCheckBox
	 * Brief Description: Select the checkbox
	 * Arguments         :  ele-->webelement
	 *                      eleName--->web element name
	 *  createdby        :  Automation team 
	 *  created date     :09/15/2020 
	 *  LastModified Date:09/15/2020  
	 * */
		public  void selectCheckBox(WebElement ele, String eleName) {
			
			if(ele.isDisplayed()) {
				
				if(ele.isSelected()) {
					System.out.println("Pass: "+eleName+" is already selected");
				}else{
				ele.click();
				System.out.println("Pass: "+eleName+" is selected");
				//logger.log(LogStatus.PASS, objName + "is selected");
			    }}
				else {
				System.out.println("Fail:"+eleName+" is not present.Please chk application");	
				//logger.log(LogStatus.FAIL, objName+ " is not displayed ,please check the application");
			}	
		}
		
		/*
		 * Name of the method: selectDropdown
		 * Brief Description: Select the Dropdown list
		 * Arguments: ele --> web element, eleName--> name of the webelement
		 * Created by: Automation team
		 * Creation Date: 09/15/2020 
		 * Last Modified: 09/15/2020 
		 * */
		public  void selectDropdown(WebElement ele, String eleName) {
			
			if(ele.isDisplayed()) {
					
					if(ele.isSelected()) {
						System.out.println("Pass: "+eleName+" is already selected");
					}else{
					ele.click();
					System.out.println("Pass: "+eleName+" is selected");
					//logger.log(LogStatus.PASS, objName + "is selected");
				    }}
					else {
					System.out.println("Fail:"+eleName+" is not present.Please chk application");	
					//logger.log(LogStatus.FAIL, objName+ " is not present, please check the application");
						
				}	
				
			}
		
		/*
		 * Name of the method: validateErrormsg
		 * Brief Description: to validate the error msg 
		 * Arguments: actualmsg --> name of the object, errormsg--> name of the object
		 * Created by: Automation team
		 * Creation Date:09/15/2020 
		 * Last Modified:09/15/2020 
		 * */
		
		public  void validateErrormsg(String actualmsg, String errormsg) {
			
			if(actualmsg.equals(errormsg))
			{
				System.out.println("TestCase is passed");
				//logger.log(LogStatus.PASS,  "TestCase is passed" );
			}else
		    {
			System.out.println("TestCase is failed");
			//logger.log(LogStatus.FAIL,  "TestCase is failed" );
		    }
		}

	/* name of the method:   iFrame
	 * BriefDescription  :   iframe using webelement 
	 * Arguments         :  driver--->driver 
	 *                      ele--->webelement
	 *  createdby        :  Automation team 
	 *  created date     :09/15/2020 
	 *  LastModified Date:09/15/2020         
	 */
	public  void switchFrame( WebDriver driver,WebElement ele) {
		 
	    if(ele.isDisplayed()) {
	     driver.switchTo().frame(ele);
	     System.out.println("Pass: we can switch to the "+ele+ " frame");
	    //logger.log(LogStatus.PASS,  "Switch to frame" );
	     
	    }else {
	     System.out.println("fail: we can't switch to the "+ele+ " frame");
	    // logger.log(LogStatus.FAIL,  "Cannot Switch to frame" );
	    }
	}

	/* name of the method:   switchFrameid
	 * BriefDescription  :   iframe using webelement 
	 * Arguments         :  driver--->driver 
	 *                      iframeid--->iframe id
	 *  createdby        :  Automation team 
	 *  created date     :09/15/2020 
	 *  LastModified Date:09/15/2020         
	 */

	public void switchFrameid( WebDriver driver,String iframeid) {
		 
	     driver.switchTo().frame(iframeid);
	     System.out.println("Pass: we can switch to the "+iframeid+ " frame");
	    // logger.log(LogStatus.PASS,  "we can switch to the frame" );
	     
	    }

	/* name of the method:   switchdefaultFrame
	 * BriefDescription  :   iframe for switching back to default frame 
	 * Arguments         :  driver--->driver 
	 *  createdby        :  Automation team 
	 *  created date     :09/15/2020 
	 *  LastModified Date:09/15/2020        
	 */ 
	public  void switchdefaultFrame( WebDriver driver)
	{
	driver.switchTo().defaultContent();
	System.out.println("Pass: we can switch to the "+ driver + " back to frame");
	//logger.log(LogStatus.PASS,  "we can switch back to the frame" );
	}

	/* name of the method:   mouseOver
	 * BriefDescription  :   mouseOver  
	 * Arguments         :  ele,index 
	 *  createdby        :  Automation team 
	 *  created date     :09/15/2020 
	 *  LastModified Date:09/15/2020           
	 */ 

	public  void mouseOver(WebDriver driver,WebElement ele) {
		if(ele.isDisplayed()) {
	   Actions action=new Actions(driver);
	   action.moveToElement(ele).build().perform();
		System.out.println("Pass: "+ele+" is present");
		//logger.log(LogStatus.PASS,  "ele is present" );
		}
	 else {
			System.out.println("Fail:"+ele+" is not present.Please chk application");
			//logger.log(LogStatus.FAIL,  "ele is not present.Please chk application" );
		}
	}

	/* name of the method:   selectbyText
	 * BriefDescription  :   selected by clicking the dropdown 
	 * Arguments         :  ele,eleName 
	 *  createdby        :  Automation team 
	 *  created date     :09/15/2020 
	 *  LastModified Date:09/15/2020         
	 */ 
	public  void SelectbyText(WebElement ele, String VisibleText){
		   if(ele.isDisplayed())
		   {
			   Select selObj=new Select(ele);
	           selObj.selectByVisibleText(VisibleText);
		           System.out.println("Pass: "+VisibleText+ " is Selected by VisibleText" );
		         //  logger.log(LogStatus.PASS, " is Selected by VisibleText" );
		           
		   } 
		   else
		   {
		    System.out.println("Fail: "+VisibleText+ " is not available");
		 //   logger.log(LogStatus.FAIL, " is not Selected by VisibleText" );
		    
		   }
		   
		   
	}

	/* name of the method:   SelectByValue
	 * BriefDescription  :   selectedByValue by clicking the dropdown 
	 * Arguments         :  ele,index 
	 *  createdby        :  Automation team 
	 *  created date     :09/15/2020  
	 *  LastModified Date:09/15/2020         
	 */ 
	public  void SelectByValue(WebElement ele, String val) {
		  //if(obj.isSelected()) {
		if(ele.isDisplayed()) {
		   Select selObj=new Select(ele);
		    
		   selObj.selectByValue(val);
		  System.out.println("pass:"+val + " is selected from drop down ");
		 // logger.log(LogStatus.PASS, " is selected from drop down " );
		 
		  }else {
		   System.out.println("Fail:"+val+"is not selected");
		 //  logger.log(LogStatus.FAIL, " is not selected from drop down " );
		  }
		 }	  


	/* name of the method:   SelectByindex
	 * BriefDescription  :   selected by clicking the dropdown 
	 * Arguments         :  ele,index 
	 *  createdby        :  Automation team 
	 *  created date     :09/15/2020 
	 *  LastModified Date:09/15/2020          
	 */ 
	public  void selectByIndex(WebElement ele, int index) {
		  if(ele.isDisplayed()) {
		   Select selObj=new Select(ele);
		  selObj.selectByIndex(index);
		  
		  System.out.println("pass:"+index + " is selected from drop down ");
		//  logger.log(LogStatus.PASS, " is selected from drop down " );
		  }else {
		   System.out.println("Fail:"+index+"is not selected");
		//   logger.log(LogStatus.FAIL, " is not selected from drop down " );
		  }
		 }

	public  void selectByVisibleText(WebElement ele, String Name) {
		if(ele.isDisplayed()) {
			 Select drop = new Select(ele);
			 drop.selectByVisibleText(Name);
		 System.out.println("Pass: dropdown is selected");
		 }else {
		 System.out.println("Fail: dropdown is not available check your application");
		 }
		 }



	/*
	 * Name of the method: Radiobutton
	 * Brief Description: To click on the radio button 
	 * Arguments: ele --> web element, eleName--> name of the webelement
	 * Created by: Automation team
	 * Creation Date: 09/15/2020 
	 * Last Modified: 09/15/2020 
	 * */
	public  void Radiobutton(WebElement ele, String eleName) {
		
		if(ele.isDisplayed() ){
			ele.click();
			System.out.println("Pass: "+eleName+" is clicked");
		}else {
			System.out.println("Fail:"+eleName+" is not displayed .Please check your application");			
		}
	}

	/* name of the method:   switchtoAlert
	 * BriefDescription  :   Switch to alert
	 * Arguments         :  driver
	 *  createdby        :  Automation team 
	 *  created date     :09/15/2020 
	 *  LastModified Date:09/15/2020         
	 */ 
	public  void switchtoAlert(WebDriver driver) {
		 driver.switchTo().alert().accept();
		 System.out.println("Pass: alert is present and accept");
	}

		

	}


