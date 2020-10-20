package com.ta.Framework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.utilities.TestBase;
import pohome.po_home;
import pologin.po_login;

public class login extends TestBase{
	po_login login;
	po_home home;
	//po_logout login;
	@BeforeTest
	public void triggerDependency() {
		login = new po_login(driver);
		home = new po_home(driver);
}
	@AfterTest
	public void closebrowser() {
		obrowserutil.teardownbrowser();
	}
	@Test (priority=1)
	public void loginToWebsite() throws Exception {
		login.logintowebsite();
}
	@Test (priority=2)
	public void hometab() throws Exception {
		home.hometab();
		//ohome.addingphoto();
}
}
