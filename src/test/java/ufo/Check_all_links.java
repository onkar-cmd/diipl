package ufo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import drivers.Controllers;

public class Check_all_links {

	Login_funcnality lf;
	private Controllers c;
	WebDriver wd;

	public Check_all_links(Controllers c) {
		this.c = c;

	}

	@Before("@Check_links")
	public void setup() throws InterruptedException {
		Thread.sleep(5000);
		c.setupController();
		wd = c.getDriver();
		lf = new Login_funcnality(wd);
	}

	@Given("^Login with sales valid credendial$")
	public void login_with_sales_valid_credendial() throws Throwable {
		lf.login_ufo("dusane.infotech", "di@222", "Sales");

	}

	@Given("^Get all links from home page$")
	public void get_all_links_from_home_page() throws Throwable {
		java.util.List<WebElement> ele = wd.findElements(By.xpath("//body//div//li//a"));

		
		System.out.println("Size..............." + ele.size());

		for (int i = 0; i < ele.size(); i++) {
			
			
			
			
			
			try 
			{
				
				
				
				
				
				
				
			RestAssured.baseURI = ele.get(i).getAttribute("href");
			RequestSpecification httpRequest = RestAssured.given();
			Response r = httpRequest.get(ele.get(i).getAttribute("href"));
			System.out.println("Links................." + i +"."+ ele.get(i).getAttribute("href")+"...Status code..."+r.getStatusCode());
			
            
            
            
            String url = ele.get(i).getAttribute("href");
            wd.findElement(By.linkText(url)).click();
            
			
			
			
			
			}
			catch (Exception e) 
			{
				e.printStackTrace();
				continue;
			}
			
			

		}

	}

	@Then("^print all links on console\\.$")
	public void print_all_links_on_console() throws Throwable {

	}

}
