package managment_console;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Managment_objects {
	WebDriver wd = null;
	Screen screen = new Screen();
	
	
	
	

	public Managment_objects(WiniumDriver wd) {
		PageFactory.initElements(wd, this);
		this.wd =wd;
		
	}

	// Login Objects

	@FindBy(how = How.ID, using = "txtUserName")
	private WebElement txtbox;

	public void Login_username(String Username_login) {
		txtbox.clear();
		txtbox.sendKeys(Username_login);
	}

	@FindBy(how = How.ID, using = "lblLogin")
	private WebElement btn_login;

	public void login_click() {
		btn_login.click();

	}

	// Distributer
	// objects---------------------------------------------------------------------------------------------------------------

	public void Dis_btn() throws AWTException, FindFailed {
		screen.click("D:\\sikuli image\\distributer.png");
		
	}

	@FindBy(how = How.NAME, using = "Add")
	private WebElement add_btn;

	public void Add_click() {
		add_btn.click();

	}

	@FindBy(how = How.ID, using = "txtName")
	private WebElement dis_name_txt;

	public void add_name(String dis_name) {
		dis_name_txt.sendKeys(dis_name);

	}

	@FindBy(how = How.ID, using = "cmdSave")
	private WebElement dis_save_btn;

	public void dis_save() {
		dis_save_btn.click();
	}

	@FindBy(how = How.NAME, using = "Refresh")
	private WebElement refresh_btn;

	public void refresh_button() {
		refresh_btn.click();
	}

	// Movie
	// objects----------------------------------------------------------------------------------------------------------------------

	public void movie_btn() throws AWTException, FindFailed {
		
		
		screen.click("D:\\sikuli image\\movie.png");
		
	}

	@FindBy(how = How.NAME, using = "txtMovie")
	private WebElement txt_movie;

	public void txt_movie(String movie)
	{
		refresh_btn.sendKeys(movie);
	}

	@FindBy(how = How.ID, using = "cmbDistributor")
	private WebElement drop_movie;

	public void dropdw_movie() throws InterruptedException, AWTException, FindFailed {
		Robot r = new Robot();
		
		Actions a = new Actions(wd);
		 
		a.click(drop_movie).build().perform();
		for(int i = 0; i < 20; i++)
		{
            //scroll and wait a bit to give the impression of smooth scrolling
            r.mouseWheel(i);
            try{ Thread.sleep(50); 
            }catch(InterruptedException e)
            {}
        }
    
		
	   screen.click("D:\\sikuli image\\warner_bros.png");
		/*Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);*/
		
		

	}

	@FindBy(how = How.NAME, using = "19")
	private WebElement uptodate;

	public void uptodate() throws AWTException {
		Robot r = new Robot();
		r.mouseMove(750, 275);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		uptodate.click();

	}

	@FindBy(how = How.ID, using = "txtStarcast")
	private WebElement star_cast;

	public void star_cast(String s) throws AWTException {
		star_cast.sendKeys(s);

	}

	public void rating() throws AWTException, InterruptedException {
		Robot r = new Robot();
		r.mouseMove(666, 413);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);

	}

	public void language() throws AWTException, InterruptedException {
		Actions a = new Actions(wd);
		
		a.click(wd.findElement(By.id("cmbLanguage"))).build().perform();
		
		Robot r = new Robot();

		r.mouseMove(666, 431);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);

	}

	@FindBy(how = How.ID, using ="cmbMovieType")
	private WebElement movie_type;

	public void movie_type() throws AWTException, InterruptedException {
		
		movie_type.click();
		wd.findElement(By.name("3D")).click();
		

	}

	@FindBy(how = How.ID, using = "txtNoofshows")
	private WebElement no_of_shows;

	public void no_of_shows(String s) throws AWTException {
		no_of_shows.sendKeys(s);

	}

	@FindBy(how = How.ID, using = "txtMovielength")
	private WebElement movie_lenght;

	public void movie_lenght(String s) throws AWTException 
	{

		movie_lenght.sendKeys(s);

	}

	@FindBy(how = How.ID, using = "cmdSave")
	private WebElement movie_save_btn;

	public void movie_save() {
		movie_save_btn.click();
	}
	
	//Assign show objects-----------------------------------------------------------------------------------------------------
	
	
	
	public void assign_show_btn() throws AWTException 
	{
		Robot r = new Robot();
		r.mouseMove(75, 195);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	

}
