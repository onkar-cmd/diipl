package ufo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Login_funcnality {

	private WebDriver wd;
	Ufo_object_properties uop;

	public Login_funcnality(WebDriver wd) {
		this.wd = wd;

	}
    public void login_ufo(String username, String password, String usr_type) throws InterruptedException 
	{   wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		Thread.sleep(2000);
		wd.get("http://stagingiro.ufomoviez.com/");
		uop = new Ufo_object_properties(wd);
		uop.usrname(username);
		uop.pwd(password);
		Thread.sleep(2000);
		uop.user_type(usr_type);
		uop.login_btn();
	}}
