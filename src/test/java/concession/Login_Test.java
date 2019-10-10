package concession;

import java.net.MalformedURLException;

import org.openqa.selenium.winium.WiniumDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import desktop_drivers.Concession_controllers;

public class Login_Test {

	private static WiniumDriver wd;

	private Concession_controllers cc;

	Objects_elements_concession ob;

	public Login_Test(Concession_controllers cc) {

		this.cc = cc;

	}

   @Before("@concession,@desktop")
	public void setup() throws MalformedURLException {
		cc.setupController();
		wd = cc.getDriver();
		ob = new Objects_elements_concession(wd);

	}

	@Given("^Open Concession Exe File and Start Application$")
	public void open_Concession_Exe_File_and_Start_Application() throws Throwable {
		
		
		Thread.sleep(5000);

	}

	@Given("^Enter your \"([^\"]*)\"$")
	public void enter_your(String Username) throws Throwable {

		ob.Login_username(Username);

	}

	@Then("^Then verify Login Credentials$")
	public void then_verify_Login_Credentials() throws Throwable {

		ob.Login_btn_button();

	}

	@After
	public void after_finish() 
	{
		System.out.println("Finish it........................................");
	}

}
