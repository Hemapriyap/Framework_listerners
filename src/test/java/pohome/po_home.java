package pohome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.TestBase;

public class po_home extends TestBase{

	public po_home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Home')]") WebElement tab_home;
	@FindBy(xpath="//textarea[@class='_3en1 _480e navigationFocus']") WebElement txt_status;
	@FindBy(xpath="//div[@class='_1mf _1mj']") WebElement txt_writestatus;
	@FindBy(xpath="//span[contains(text(),'Post')]") WebElement btn_post;
	@FindBy(xpath="//div[@class='_3jk']") WebElement addphoto;
	
	public void hometab() throws Exception {
		Thread.sleep(2000);
		oseleniumutil.explicitWaitFunc(tab_home,driver);
		oseleniumutil.ufClickElement(tab_home);
		
		oseleniumutil.explicitWaitFunc(txt_status,driver);
		
		oseleniumutil.ufClickElement(txt_status);
		oseleniumutil.explicitWaitFunc(txt_writestatus,driver);
		oseleniumutil.ufClickElement(txt_writestatus);
		//obrowserutil.ufClearElement(txt_writestatus);
		oseleniumutil.ufSenKeys(txt_writestatus, "race");
		oseleniumutil.ufClickElement(btn_post);
		oseleniumutil.explicitWaitFunc(addphoto,driver);
		oseleniumutil.ufClickElement(addphoto);
		oseleniumutil.ufSenKeys(addphoto, "C:\\Users\\arkuv\\Downloads\\image1.jpg");
		
	}
	

}
