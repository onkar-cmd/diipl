package managment_console;

import java.net.MalformedURLException;

import org.openqa.selenium.winium.WiniumDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import desktop_drivers.Managment_controllers;

public class Test_smoke_add_distributer {

	private WiniumDriver wd;

	private Managment_controllers d;

	Add_distributer ad;

	Managment_objects ob;

	Add_movie am;

	Login_func lf;

	public Test_smoke_add_distributer(Managment_controllers d) {
		this.d = d;
	}

	@Before("@Add")
	public void setup() throws MalformedURLException 
	{
	    d.setupController();
		wd = d.getDriver();
		ad = new Add_distributer(wd);
		lf = new Login_func(wd);
		am = new Add_movie(wd);
		}

	@Given("^Distributer add \"([^\"]*)\"$")
	public void distributer_add(String dis_name) throws Throwable 
	{   
		lf.login_user("admin");
		Thread.sleep(5000);
		am.add_movie("movie123","Start Cast","150","10");
	}

	@Then("^close managment console\\.$")
	public void close_managment_console() throws Throwable {
		System.out.println("Done");
	}

}
