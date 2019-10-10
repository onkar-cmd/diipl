package impactXchange;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.Controllers;

public class Special_characters_testing {

	private Controllers c;
	WebDriver wd;
	Xchange_properties xp;
	String[] invalidChars = { "!", "#", "$", "%", "*", "+", ":", ";", "<", "=", ">", "?", "@", "[", "^", "_", "`", "{",
			"|", "}", "~", "       ", "\\", "]", ",", " \" " };

	public Special_characters_testing(Controllers c) {
		this.c = c;

	}

	@Before("@smoke_testing")
	public void setup() {
		c.setupController();
		wd = c.getDriver();
		xp = new Xchange_properties(wd);

	}

	@Given("^Go to Impact Exchange website and login with valid username and password$")
	public void go_to_Impact_Exchange_website_and_login_with_valid_username_and_password() throws Throwable {
		xp.login();

	}

	@When("^Go to Add edit accoount page and click on add new button$")
	public void go_to_Add_edit_accoount_page_and_click_on_add_new_button() throws Throwable {
		xp.user_admin_btn();
		xp.manage_account_btn();
		xp.add_edit_account_btn();
		xp.add_new_btn();

	}

	@Then("^On Create company page insert invalid special characters\\.$")
	public void on_Create_company_page_insert_invalid_special_characters_and_valid_alphabets_and_numbers()
			throws Throwable {

		for (String invalid : invalidChars) {

			Thread.sleep(3000);
			xp.exhibitor_name(invalid);
			Thread.sleep(2000);

			xp.company_save_btn();

		}

	}

	@Then("^Check for edit company page insert invalid special characters\\.$")
	public void check_for_edit_company_page_insert_invalid_special_characters_and_valid_alphabets_and_numbers()
			throws Throwable {
		xp.user_admin_btn();
		xp.manage_account_btn();
		xp.add_edit_account_btn();

		xp.company_name_1();
		Thread.sleep(5000);
		for (String invalid : invalidChars) {

			Thread.sleep(3000);
			xp.exhibitor_name(invalid);
			Thread.sleep(2000);

			xp.next_btn();

		}

	}

	@Then("^On Create class insert invalid special characters\\.$")
	public void on_Create_class_insert_invalid_special_characters_and_valid_alphabets_and_numbers() throws Throwable {
		xp.user_admin_btn();
		xp.manage_account_btn();
		xp.add_edit_account_btn();

		xp.company_name_1();
		Thread.sleep(5000);
		xp.next_btn();

		for (String invalid : invalidChars) {

			Thread.sleep(3000);
			xp.class_name(invalid);
			Thread.sleep(2000);

			xp.class_next_btn();

		}

	}

	@Then("^Check for edit class insert invalid special characters\\.$")
	public void check_for_edit_class_insert_invalid_special_characters_and_valid_alphabets_and_numbers()
			throws Throwable {
		xp.user_admin_btn();
		xp.manage_account_btn();
		xp.add_edit_account_btn();

		xp.company_name_1();
		Thread.sleep(5000);
		xp.next_btn();
		xp.sofa_edit_btn();

		for (String invalid : invalidChars) {

			Thread.sleep(3000);
			xp.class_name(invalid);
			Thread.sleep(2000);

			xp.class_next_btn();

		}

	}

	@Then("^On Create screen insert invalid special characters\\.$")
	public void on_Create_screen_insert_invalid_special_characters_and_valid_alphabets_and_numbers() throws Throwable {
		xp.user_admin_btn();
		xp.manage_account_btn();
		xp.add_edit_account_btn();
		xp.company_name_1();
		Thread.sleep(5000);
		xp.next_btn();
		xp.class_next_btn();
		for (String invalid : invalidChars) {

			Thread.sleep(3000);
			xp.screen_name_txt(invalid);
			Thread.sleep(2000);

			xp.add_screen_btn();

		}

	}

	@Then("^Check for edit screen insert invalid special characters\\.$")
	public void check_for_edit_screen_insert_invalid_special_characters_and_valid_alphabets_and_numbers()
			throws Throwable {
		xp.user_admin_btn();
		xp.manage_account_btn();
		xp.add_edit_account_btn();
		xp.company_name_1();
		Thread.sleep(5000);
		xp.next_btn();
		xp.class_next_btn();
		xp.screen1_edit_btn();
		for (String invalid : invalidChars) {

			Thread.sleep(3000);
			xp.screen_name_txt(invalid);
			Thread.sleep(2000);

			xp.add_screen_btn();

		}

	}

}
