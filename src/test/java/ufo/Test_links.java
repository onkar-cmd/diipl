package ufo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import drivers.Controllers;

public class Test_links {

	 static WebDriver wd;
	public static void main(String[] args) {
		
		Controllers c = new Controllers();
		c.setupController();
		wd =c.getDriver();
		
		wd.get("http://thedemosite.co.uk/getyourowndbonline.php");
		

		java.util.List<WebElement> ele = wd.findElements(By.xpath("//body//a"));
		System.out.println("Size..............." + ele.size());

		// TODO Auto-generated method stubjava.util.List<WebElement> ele = wd.findElements(By.xpath("//body//li//a"));
		System.out.println("Size..............." + ele.size());

		for (int i = 0; i < ele.size(); i++) {
			System.out.println("Links................." + i +"."+ ele.get(i).getAttribute("href"));
			
			try 
			{

			RestAssured.baseURI = ele.get(i).getAttribute("href");
			RequestSpecification httpRequest = RestAssured.given();
			Response r = httpRequest.get(ele.get(i).getAttribute("href"));
			System.out.println(r.getStatusCode());
			
			}
			catch (Exception e) 
			{
				e.printStackTrace();
				continue;
			}

		}

	}

}
