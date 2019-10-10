package ufo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ufo_object_properties

{
	WebDriver wd;

	public Ufo_object_properties(WebDriver wd) 
	{
		PageFactory.initElements(wd, this);
	}

	@FindBy(how = How.NAME, using = "UserName")
	private WebElement user_name;

	public void usrname(String name) {

		user_name.sendKeys(name);

	}

	@FindBy(how = How.NAME, using = "Password")
	private WebElement pwd;

	public void pwd(String password) {

		pwd.sendKeys(password);

	}

	@FindBy(how = How.XPATH, using = "//*[@name='userType']")
	private WebElement user_type;

	public void user_type(String usr_type_string)

	{
		Select s = new Select(user_type);
		s.selectByVisibleText(usr_type_string);

	}

	@FindBy(how = How.ID, using = "btnSubmit")
	private WebElement login_btn;

	public void login_btn() 
	{

		login_btn.click();

	}

	@FindBy(how = How.XPATH, using = "//*[@title='Advertisement']")
	private WebElement advertisement_btn;

	public void advertisement_btn() 
	{

		advertisement_btn.click();

	}

	@FindBy(how = How.XPATH, using = "//*[@class='collapsed ng-scope']")
	private WebElement advertisement_ro_btn;

	public void advertisement_ro_btn() {

		advertisement_ro_btn.click();

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"divsub_11\"]/ul/li[1]/a")
	private WebElement iro_btn;

	public void iro_btn() {

		iro_btn.click();

	}

	@FindBy(how = How.XPATH, using = "//*[@ng-click='createIro()']")
	private WebElement create_btn;

	public void create_btn()
	{
		create_btn.click();

	}

	@FindBy(how = How.XPATH, using = "//*[@class='dropdown-toggle']")
	private WebElement profile_btn;

	public void profile_btn() 
	{

		profile_btn.click();

	}

	@FindBy(how = How.XPATH, using = "//*[@title='Log Out']")
	private WebElement log_out_btn;

	public void log_out_btn() 
	{

		log_out_btn.click();

	}

}
