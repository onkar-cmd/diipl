package impactXchange;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.winium.WiniumDriver;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import desktop_drivers.Managment_controllers;
import drivers.Controllers;
import managment_console.Add_movie;
import managment_console.Login_func;

public class Individual {

	Xchange_properties xp;
	private Controllers c;
	WebDriver wd;
	WiniumDriver wd1;
	private Managment_controllers mc;
	Login_func lf;
	Add_movie am;

	public Individual(Controllers c, Managment_controllers mc) {
		this.c = c;
		this.mc = mc;

	}

	@Before("@Indivdual_reconcile")
	public void setup1() throws MalformedURLException {
		c.setupController();
		wd = c.getDriver();
		xp = new Xchange_properties(wd);
		mc.setupController();
		wd1 = mc.getDriver();
		lf = new Login_func(wd1);
		am = new Add_movie(wd1);

	}

	@Given("^A login with valid username and password\\.$")
	public void go_to_Impact_Exchange_website_and_login_with_valid_username_and_password() throws Throwable {
		xp.login();

	}

	@Then("^Click on Movie>Manage Movie and add new movie\\.$")
	public void click_on_Movie_Manage_Movie_and_add_new_movie() throws Throwable {
		Thread.sleep(5000);
		xp.movie_btn();

	}
    @Then("^Add all details about movie and click on save\\.$")
	public void add_all_details_about_movie_and_click_on_save(DataTable details) throws Throwable 
    {
		List<List<String>> data = details.raw();
		xp.add_movie(data.get(0).get(0), data.get(0).get(1), data.get(0).get(2), data.get(0).get(3), data.get(0).get(4),
		data.get(0).get(5), data.get(0).get(6), data.get(0).get(7), data.get(0).get(8), data.get(0).get(9),data.get(0).get(10));
		Thread.sleep(5000);
	}
    @Then("^Click on that movie and set status to Active and approve that movie\\.$")
	public void click_on_that_movie_and_set_status_to_Active_and_approve_that_movie() throws Throwable {
		wd.findElement(By.id("MainContentPlaceHolder_GridView1_hylnkMovie_0")).click();
		xp.movie_status();
		xp.btn_approve();
        Thread.sleep(5000);
	}
    @Then("^Add movie from MMS application\\.$")
	public void add_movie_from_MMS_application(DataTable details) throws Throwable {
		List<List<String>> data = details.raw();
		lf.login_user("admin");
		am.add_movie(data.get(0).get(0), data.get(0).get(10), data.get(0).get(7), "10");
}

	@Then("^Go to Contracts>Reconcile Local Contracts>Individual Reconcile\\.$")
	public void go_to_Contracts_Reconcile_Local_Contracts_Individual_Reconcile() throws Throwable {
		xp.login();
		Thread.sleep(3000);
		xp.contracts_btn();
		xp.reconcile_local_contracts_btn();
		xp.individul_reconcile_btn();
}

	@Then("^Select movie that movie which is not reconcile and Click on Edit icon button\\.$")
	public void select_movie_that_movie_which_is_not_reconcile_and_Click_on_Edit_icon_button() throws Throwable 
	{
		Thread.sleep(2000);
		xp.contract_id();
		Thread.sleep(2000);
		xp.contract_id();
		Thread.sleep(2000);
		wd.findElement(By.id("MainContentPlaceHolder_RadGrid1_ctl00_ctl04_EditButton")).click();
		Thread.sleep(3000);
    }

	@Then("^Select Movie and Distributer to reconcile\\.$")
	public void select_Movie_and_Distributer_to_reconcile(DataTable dt) throws Throwable {
		List<List<String>> data = dt.raw();
		Thread.sleep(3000);
        xp.select_approve_movie(data.get(0).get(0));
		Thread.sleep(3000);
		xp.select_distributer(data.get(0).get(1));
}
    @Then("^Check in Manage Contracts and Click on Upcoming Pacts\\.$")
	public void check_in_Manage_Contracts_and_Click_on_Upcoming_Pacts() throws Throwable 
    {
		xp.manage_contracts();
		xp.upcoming_pacts();
    }
    @Then("^Check and Validate that two movies is Re-concile\\.$")
    public void check_and_Validate_that_two_movies_is_Re_concile() throws Throwable 
	{
      
	}

}
