package impactXchange;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.WiniumDriver;
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
	Movie_parameters mp = new Movie_parameters();
	Add_movie am;
	List<Movie> m;
	String movie_id;
	Actions a;

	public Group_reconcilation(Controllers c, Managment_controllers mc) {
		this.c = c;
		this.mc = mc;
	}

	@Before("@Group_reconcile")
	public void setup1() throws IOException {
		c.setupController();
		wd = c.getDriver();
		xp = new Xchange_properties(wd);
		mc.setupController();
		wd1 = mc.getDriver();
		lf = new Login_func(wd1);
		am = new Add_movie(wd1);
		m = mp.getdata();
		a = new Actions(wd);
	}

	@Then("^Click on Movie>Manage Movie and add two new movie\\.$")
	public void click_on_Movie_Manage_Movie_and_add_two_new_movie() throws Throwable {
		xp.login();
		Thread.sleep(5000);
		 xp.movie_btn(); 
	}

	@Then("^Add all details about movies and click on save\\.$")
	public void add_all_details_about_movies_and_click_on_save() throws Throwable {

		
		  try {
		  
		 
		  for (int i = 0; i < 1; i++) { xp.add_movie(m.get(i).movie_name,
		  m.get(i).Date, m.get(i).rating, m.get(i).generic, m.get(i).language,
		  m.get(i).type, m.get(i).production, m.get(i).movie_length, m.get(i).director,
		  m.get(i).music_director, m.get(i).movie_stars); Thread.sleep(2000);
		 
		  
		 }
		 
		 } catch (Exception e) { e.printStackTrace(); }
		 

	}

	@Then("^Click on that two movies and set status to Active and approve that movie\\.$")
	public void click_on_that_two_movies_and_set_status_to_Active_and_approve_that_movie() throws Throwable {
		
		  try { for (int i = 0; i < 1; i++) {
		 
		  xp.movie_name_txt(m.get(i).movie_name); 
		  xp.search_movie_btn();
		  Thread.sleep(2000); xp.first_movie(); 
		  movie_id =  xp.movie_id.getAttribute("value"); xp.movie_status(); xp.btn_approve();
		  Thread.sleep(5000); } } catch (Exception e) { e.printStackTrace(); 
		 }
		 

	}
	@Then("^Assign Territory Allocation\\.$")
	public void assign_Territory_Allocation() throws Throwable {
		
		xp.territory_allocation(movie_id);
	}
	
	

	@Then("^Add two movies from MMS application\\.$")
	public void add_two_movies_from_MMS_application() throws Throwable {
		
		 Thread.sleep(5000); lf.login_user("admin"); 
		 Thread.sleep(7000);
		 try{ 
			 for (int i = 0; i < 2; i++) 
			 { 
				 Thread.sleep(5000); 
				 am.add_movie(m.get(i).movie_name,
		  m.get(i).movie_stars, m.get(i).movie_length, "10");
		  wd1.findElement(By.name("OK")).click(); } } 
		 catch (Exception e) {
		  e.printStackTrace(); }
		 

	}

	@Then("^Contracts>Reconcile Local Contracts>Group Reconcile\\.$")
	public void go_to_Contracts_Reconcile_Local_Contracts_Group_Reconcile() throws Throwable {
		
		  xp.contracts_btn(); 
		  xp.reconcile_local_contracts_btn(); 
		  xp.group_reconcile();
		 

	}

	@Then("^Go Upcoming Contracts> Enter movie in exhibitor filter textbox > click on select all checkbox\\.$")
	public void go_Upcoming_Contracts_Enter_movie_in_exhibitor_filter_textbox_click_on_select_all_checkbox()
			throws Throwable {
		
		  try { xp.upcoming_contracts(); 
		  Thread.sleep(1000);
		  xp.filter_movie_name_txt(m.get(0).movie_name); 
		  Thread.sleep(1000);
		  
		  xp.selectall(); 
		  Thread.sleep(1000); 
		  xp.select_movie_group_reconcile(movie_id);
		   } 
		  catch (Exception e) 
		  { // TODO: handle
		  }
		 

	}

	@Then("^Click on Reconcile button \\(reconcile two movies\\)\\.$")
	public void click_on_Reconcile_button_reconcile_two_movies() throws Throwable {
		try {
			wd.findElement(By.xpath("//div//input[@value=\"Reconcile\"]")).click();
		  Thread.sleep(1000); 
		  wd.switchTo().alert().accept();
		  Thread.sleep(1000);
		 wd.switchTo().alert().accept();
			
		}catch (Exception e) {
			// TODO: handle exception
		}

		

		

	}

	@Then("^Check in Manage Contracts and Click on Upcoming Pacts then Validate that two movies is Re-concile\\.$")
	public void check_in_Manage_Contracts_and_Click_on_Upcoming_Pacts_then_Validate_that_two_movies_is_Re_concile()
			throws Throwable {
		
		  Thread.sleep(3000);
		  xp.manage_contracts(); 
		  xp.upcoming_pacts();
		 
	}

}
