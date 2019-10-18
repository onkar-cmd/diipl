package testng_framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import drivers.Controllers;
import ufo.Login_funcnality;
import ufo.Ufo_object_properties;

public class Login_testng 
{
	Ufo_object_properties ob;
	Login_funcnality lf;
	WebDriver wd;
	Controllers c = new Controllers();
	
	
	@BeforeMethod
	public void s2()
	
	{  c = new Controllers();
		c.setupController();
		wd = c.getDriver();
		ob = new Ufo_object_properties(wd);
		lf = new Login_funcnality(wd);
	}
	
	@Test
	public void s1() throws InterruptedException
	{
		Thread.sleep(5000);
		lf.login_ufo("dusane.infotech", "Di@222", "Sales");
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
	public void s3()
	{
		ob.advertisement_btn();
	}
}
