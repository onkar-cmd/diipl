package impactXchange;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.winium.WiniumDriver;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import desktop_drivers.Managment_controllers;
import drivers.Controllers;
import managment_console.Add_movie;
import managment_console.Login_func;

public class Group_reconcilation {

	Xchange_properties xp;
	private Controllers c;
	WebDriver wd;
	WiniumDriver wd1;
	private Managment_controllers mc;
	Login_func lf;
	Add_movie am;

	public Group_reconcilation(Controllers c, Managment_controllers mc) {
		this.c = c;
		this.mc = mc;
	}

	@Before("@Group_reconcile")
	public void setup1() throws MalformedURLException {
		c.setupController();
		wd = c.getDriver();
		xp = new Xchange_properties(wd);
		mc.setupController();
		wd1 = mc.getDriver();
		lf = new Login_func(wd1);
		am = new Add_movie(wd1);
	}

	@Then("^Click on Movie>Manage Movie and add two new movie\\.$")
	public void click_on_Movie_Manage_Movie_and_add_two_new_movie() throws Throwable {
		xp.login();
		Thread.sleep(5000);
		xp.movie_btn();
	}

	@Then("^Add all details about movies and click on save\\.$")
	public void add_all_details_about_movies_and_click_on_save(DataTable details) throws Throwable {
		for (int i = 0; i <= 1; i++) {
			List<List<String>> data = details.raw();
			xp.add_movie(data.get(i).get(0), data.get(i).get(1), data.get(i).get(2), data.get(i).get(3),
					data.get(i).get(4), data.get(i).get(5), data.get(i).get(6), data.get(i).get(7), data.get(i).get(8),
					data.get(i).get(9), data.get(i).get(10));
			Thread.sleep(5000);
		}
	}

	@Then("^Click on that two movies and set status to Active and approve that movie\\.$")
	public void click_on_that_two_movies_and_set_status_to_Active_and_approve_that_movie() throws Throwable 
	{
		System.out.println("Testing Git hub");
		System.out.println("Testing Git hub ix-02");
		System.out.println("Testing Git hub ix-03");
		System.out.println("Testing Git hub ix-0");

	}

	@Then("^Add two movies from MMS application\\.$")
	public void add_two_movies_from_MMS_application(DataTable details) throws Throwable {
		List<List<String>> data = details.raw();
		lf.login_user("admin");
		for (int i = 0; i <= 1; i++) {
			am.add_movie(data.get(i).get(0), data.get(i).get(10), data.get(i).get(7), "10");
			wd1.findElement(By.name("OK")).click();
		}
	}

	@Then("^Contracts>Reconcile Local Contracts>Group Reconcile\\.$")
	public void go_to_Contracts_Reconcile_Local_Contracts_Group_Reconcile() throws Throwable {
		xp.contracts_btn();
		xp.reconcile_local_contracts_btn();
		xp.group_reconcile();

	}

	@Then("^Go Upcoming Contracts> Select that movie which is to be reconcile\\.$")
	public void go_Upcoming_Contracts_Select_that_movie_which_is_to_be_reconcile() throws Throwable {

	}

	@Then("^Click on two Checkbox's for specific movies which is created by exhibitor\\.$")
	public void click_on_two_Checkbox_s_for_specific_movies_which_is_created_by_exhibitor(DataTable arg1)
			throws Throwable 
	{

	}

	@Then("^Click on Reconcile button\\.$")
	public void click_on_Reconcile_button() throws Throwable
	{

	}

	@Then("^Check and Validate  that two movies is Re-concile\\.$")
	public void check_and_Validate_that_two_movies_is_Re_concile() throws Throwable 
	{

	}

}
