package testng_framework;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import drivers.Controllers;
import ufo.Login_funcnality;
import ufo.Ufo_object_properties;

public class Login_testng {
	Ufo_object_properties ob;
	Login_funcnality lf;
	WebDriver wd;
	Controllers c = new Controllers();

	@BeforeMethod
	public void s2()

	{
		c = new Controllers();
		c.setupController();
		wd = c.getDriver();
		ob = new Ufo_object_properties(wd);
		lf = new Login_funcnality(wd);
	}

	@Test(dataProvider = "Passing parameters", dataProviderClass = ExcelUtils.class)
	public void s1(ArrayList<String> l) throws InterruptedException {
		Thread.sleep(5000);
		lf.login_ufo(l.get(0), l.get(1), "Sales");

	}

	@AfterMethod
	public void s3() {
		ob.advertisement_btn();
	}

}
