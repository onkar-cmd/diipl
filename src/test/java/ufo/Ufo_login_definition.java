package ufo;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.Controllers;

public class Ufo_login_definition

{
	private static WebDriver wd;
	private Controllers c;

	Ufo_object_properties uop;

	Login_funcnality lf;

	public Ufo_login_definition(Controllers c)
	{
		this.c = c;

	}

	@Before("@ufo_login")
	public void setup() throws InterruptedException 
	{
		Thread.sleep(5000);
		c.setupController();
		wd = c.getDriver();
		uop = new Ufo_object_properties(wd);
		lf = new Login_funcnality(wd);

	}

	@Given("^Enter Username \"([^\"]*)\" and Password  \"([^\"]*)\"  and select user_type  \"([^\"]*)\"$")
	public void enter_Username_and_Password_and_select_user_type(String username, String password, String usr_type)
			throws Throwable

	{
		
		lf.login_ufo(username, password, usr_type);
		Thread.sleep(5000);

	}

	@When("^Go to  sdf Advertisement > Advertisement Ro> IRO$")
	public void go_to_sdf_Advertisement_Advertisement_Ro_IRO() throws Throwable 
	{   
		uop.advertisement_btn();
		Thread.sleep(5000);
		uop.advertisement_ro_btn();
		Thread.sleep(5000);
		uop.iro_btn();
    }

	@Then("^Click on create button$")
	public void click_on_create_button() throws Throwable 
	{
		Thread.sleep(5000);
		uop.create_btn();

	}

	@Then("^Log out from UFO\\.$")
	public void log_out_from_UFO() throws Throwable 
	{
		Thread.sleep(5000);
		uop.profile_btn();
		Thread.sleep(5000);
		uop.log_out_btn();

	}

}
