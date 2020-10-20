package pologin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.TestBase;

public class po_login extends TestBase {
	public po_login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")	WebElement ph_email;
	@FindBy(id="pass")	WebElement ph_password;
	@FindBy(xpath="//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']") WebElement button_login;
	@FindBy(xpath="//a[contains(text(),'Home')]") WebElement tab_home;
	
	
	
	public void logintowebsite() throws Exception {
		oseleniumutil.explicitWaitFunc(ph_email,driver);
		oseleniumutil.ufClickElement(ph_email);
		oseleniumutil.ufClearElement(ph_email);
		oseleniumutil.ufSenKeys(ph_email, "venbasundar@gmail.com");
		oseleniumutil.ufClearElement(ph_password);
		oseleniumutil.ufSenKeys(ph_password, "adrive78");
	
		oseleniumutil.explicitWaitFunc(button_login,driver);
		oseleniumutil.ufClickElement(button_login);
		
        
}
}
