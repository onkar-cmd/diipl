package impactXchange;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.Controllers;

public class Add_new_exhibitor_testing {
	
	Controllers c;
	WebDriver wd;
	Xchange_properties xp;
	
	public Add_new_exhibitor_testing(Controllers c) 
	{
		 this.c=c;
	}
	@Before("@exhibitor")
	public void setup() 
	{
		c.setupController();
		wd = c.getDriver();
		xp = new Xchange_properties(wd);
    }
	 
	
	@Given("^Go to Impact Exchange website and login with valid username and password\\.$")
	public void go_to_Impact_Exchange_website_and_login_with_valid_username_and_password() throws Throwable
	{
		xp.login();
	    
	}

	@When("^Go to Add edit account page and click on add new button\\.$")
	public void go_to_Add_edit_account_page_and_click_on_add_new_button() throws Throwable 
	{
		
	    
	}
	
	@Then("^Create new exhibitor and add certain details and click on next,with below available data$")
	public void create_new_exhibitor_and_add_certain_details_and_click_on_next_with_below_available_data(DataTable details) throws Throwable {
		List<List<String>> data = details.raw();
	    xp.add_exhibitor(data.get(0).get(0)
	    		, data.get(0).get(1),
	    		data.get(0).get(2), 
	    		data.get(0).get(3),
	    		data.get(0).get(4), 
	    		data.get(0).get(5),
	    		data.get(0).get(6), 
	    		data.get(0).get(7) ,
	    		data.get(0).get(8),
	    		data.get(0).get(9),  
	    		data.get(0).get(10), 
	    		data.get(0).get(11),
	    		data.get(0).get(12));
	    
	   
	}
	@Then("^Create class for new exhibitor and click on next button\\.$")
	public void create_class_for_new_exhibitor_and_click_on_next_button(DataTable details) throws Throwable 
	{
		List<List<String>> data = details.raw();
		xp.add_class(data.get(0).get(0), data.get(0).get(1));
		
	    
	   
	}

	@Then("^Create Screen for new exhibitor with ac,ufo and webcode and click on next button \\.$")
	public void create_Screen_for_new_exhibitor_with_ac_ufo_and_webcode_and_click_on_next_button(DataTable details) throws Throwable
	{
		List<List<String>> data = details.raw();
		xp.add_screen(data.get(0).get(0), data.get(0).get(1));
		
	   
	}

	@Then("^According to the screen_name and class_name  assign ticket_rate and seats and click on web-booking allowed checkbox and then click on add button\\.$")
	public void according_to_the_screen_name_and_class_name_assign_ticket_rate_and_seats_and_click_on_web_booking_allowed_checkbox_and_then_click_on_add_button(DataTable details) throws Throwable
	{
		List<List<String>> data = details.raw();
		xp.add_class_screen_details(data.get(0).get(0), data.get(0).get(1));
		Thread.sleep(5000);
		
	    
	}
	
    @Then("^Click on that exhibitor and validate if it is active\\.$")
public void click_on_that_exhibitor_and_validate_if_it_is_active() throws Throwable {
    	
    	wd.findElement(By.id("MainContentPlaceHolder_GridView1_hylnkCompanyName_0")).click();
    	xp.acc_status_chk();
    	xp.next_btn();
    	xp.class_next_btn();
    	xp.screen_next_btn();
	    
	}

	@Then("^Click on approve button\\.$")
	public void click_on_approve_button() throws Throwable 
	{
		xp.btn_approve();
		String approved = wd.findElement(By.xpath("//*[@id=\"MainContentPlaceHolder_GridView1\"]/tbody/tr[2]/td[9]")).getText();
		String status = wd.findElement(By.xpath("//*[@id=\"MainContentPlaceHolder_GridView1\"]/tbody/tr[2]/td[10]")).getText();
		
		Assert.assertTrue(approved.contains("Yes"));
		Assert.assertTrue(status.contains("Active"));
	    
	}
	
	
	
	

}
