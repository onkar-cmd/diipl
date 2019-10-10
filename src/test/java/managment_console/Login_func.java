package managment_console;

import org.openqa.selenium.winium.WiniumDriver;

import desktop_drivers.Managment_controllers;

public class Login_func {

	private static WiniumDriver wd;

	Managment_objects ob;

	public Login_func(WiniumDriver wd) {
		this.wd = wd;
	}

	public void login_user(String usrname) 
	{

		ob = new Managment_objects(wd);
		ob.Login_username(usrname);
		ob.login_click();
	}

}
