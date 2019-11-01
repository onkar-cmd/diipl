package impactXchange;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.WiniumDriver;
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
	Movie_parameters mp = new Movie_parameters();
	List<Movie> m;
	String movie_id;
	WebDriverWait wait;

	public Individual(Controllers c, Managment_controllers mc) {
		this.c = c;
		this.mc = mc;

	}

	@Before("@Indivdual_reconcile")
	public void setup1() throws IOException {
		c.setupController();
		wd = c.getDriver();
		xp = new Xchange_properties(wd);
		mc.setupController();
		wd1 = mc.getDriver();
		lf = new Login_func(wd1);
		am = new Add_movie(wd1);
		m = mp.getdata();
		wd.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		wd.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		

	}

	@Given("^A login with valid username and password\\.$")
	public void go_to_Impact_Exchange_website_and_login_with_valid_username_and_password() throws Throwable {
		xp.login();
	}

	@Then("^Click on Movie>Manage Movie and add new movie from excel sheet\\.$")
	public void click_on_Movie_Manage_Movie_and_add_new_movie_from_excel_sheet() throws Throwable {
		
	Thread.sleep(5000);
		xp.movie_btn();

	}

	@Then("^Add all details about movie and click on save\\.$")
	public void add_all_details_about_movie_and_click_on_save() throws Throwable {
		try {
			for (int i = 0; i < 1; i++) {
				xp.add_movie(m.get(i).movie_name, m.get(i).Date, m.get(i).rating, m.get(i).generic, m.get(i).language,
						m.get(i).type, m.get(i).production, m.get(i).movie_length, m.get(i).director,
						m.get(i).music_director, m.get(i).movie_stars);
				/*Thread.sleep(2000);*/
				xp.movie_name_txt(m.get(i).movie_name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("^Click on that movie and set status to Active and approve that movie\\.$")
	public void click_on_that_movie_and_set_status_to_Active_and_approve_that_movie() throws Throwable {

		xp.search_movie_btn();
		/*Thread.sleep(2000);*/
		xp.first_movie();
		movie_id = xp.movie_id.getAttribute("value");
		xp.movie_status();
		xp.btn_approve();
		/*Thread.sleep(5000);*/
	}

	@Then("^Add movie from MMS application\\.$")
	public void add_movie_from_MMS_application() throws Throwable {
		Thread.sleep(5000);
		lf.login_user("admin");
		for (int i = 0; i < 1; i++) {
			/*Thread.sleep(5000);*/
			
			am.add_movie(m.get(i).movie_name, m.get(i).movie_stars, m.get(i).movie_length, "10");

		}

	}

	@Then("^Go to Contracts>Reconcile Local Contracts>Individual Reconcile\\.$")
	public void go_to_Contracts_Reconcile_Local_Contracts_Individual_Reconcile() throws Throwable {
		/*Thread.sleep(2000);*/
		
		xp.contracts_btn();
		xp.reconcile_local_contracts_btn();
		xp.individul_reconcile_btn();
	}

	@Then("^Select movie that movie which is not reconcile and Click on Edit icon button\\.$")
	public void select_movie_that_movie_which_is_not_reconcile_and_Click_on_Edit_icon_button() throws Throwable {
		/*Thread.sleep(2000);*/
		xp.contract_id();
		/*Thread.sleep(2000);*/
		xp.contract_id();
		/*Thread.sleep(2000);*/
		wd.findElement(By.id("MainContentPlaceHolder_RadGrid1_ctl00_ctl04_EditButton")).click();
		/*Thread.sleep(3000);*/
	}

	@Then("^Select Movie and Distributer to reconcile\\.$")
	public void select_Movie_and_Distributer_to_reconcile() throws Throwable {
		for (int i = 0; i < 1; i++) {
			/*Thread.sleep(3000);*/
			xp.select_approve_movie(movie_id); // Movie ID
			/*Thread.sleep(5000);*/
			xp.select_distributer("032100510039");// Warner bros Distributer
			xp.reconcile_save_btn();
		}
	}

	@Then("^Check in Manage Contracts and Click on Upcoming Pacts and Validate  that movie is Re-concile\\.$")
	public void check_in_Manage_Contracts_and_Click_on_Upcoming_Pacts_and_Validate_that_movie_is_Re_concile()
			throws Throwable {
		xp.manage_contracts();
		xp.upcoming_pacts();
	}

}
