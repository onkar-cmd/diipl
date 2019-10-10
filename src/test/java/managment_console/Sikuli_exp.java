package managment_console;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import desktop_drivers.Managment_controllers;

public class Sikuli_exp {

	public static void main(String[] args) throws  InterruptedException, MalformedURLException, AWTException, FindFailed 
	{
		Screen s = new Screen();
		WiniumDriver wd;
		Managment_controllers mc = new Managment_controllers();
		
		mc.setupController();
		wd = mc.getDriver();
		Managment_objects mo = new Managment_objects(wd);
		Login_func lf = new Login_func(wd);
		
		lf.login_user("admin");
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.mouseMove(73, 195);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		
		
		
		mo.Add_click();
		Thread.sleep(2000);
		Actions actions = new Actions(wd);
		
		WebElement c = wd.findElement(By.id("cmbMovie"));
		actions.click(c).build().perform();
		Thread.sleep(2000);
		
		s.click("D:\\sikuli image\\scoby-n.png");
		
		/*WebElement b= wd.findElement(By.name("Scooby-Doo   [25-Sep-19  To  26-Sep-19]"));
		actions.click(b).build().perform();*/
		
		
		
		
		
        

	}

}
