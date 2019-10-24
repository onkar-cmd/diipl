package impactXchange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import drivers.Controllers;

public class Link_ufo_movie {
	private Controllers c;
	WebDriver wd;
	Xchange_properties xp;

	public Link_ufo_movie(Controllers c) {
		this.c = c;

	}

	@Before("@testing_link_movie")
	public void setup() {
		c = new Controllers();
		c.setupController();
		wd = c.getDriver();
		xp = new Xchange_properties(wd);

	}

	@Given("^Login \\.$")
	public void login() throws Throwable
	{
		xp.login();

	}

	@Then("^Click on new movie \\.$")
	public void click_on_new_movie() throws Throwable {
		xp.movie_btn();
		xp.manage_movie_btn();
		xp.add_new_btn();
	}

	@Then("^click on icon link Ufo movie \"([^\"]*)\"\\.$")
	public void click_on_icon_link_Ufo_movie(String movie_name) throws Throwable {
		xp.movie_name_txt(movie_name);
		xp.link_ufo_movie();
		wd.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div[2]/div/div[2]/div/span[1]/input")).click();
		xp.link_ufo_btn();

	}

	@Then("^Add all details about movie\\. \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" \\.$")
	public void add_all_details_about_movie(String date_picker, String cer, String gen, String lan, String type,String prod,String len, String dir, String m, String ms) throws Throwable {


	}

}
