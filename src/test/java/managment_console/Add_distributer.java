package managment_console;

import java.awt.AWTException;

import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.FindFailed;

public class Add_distributer

{

	private WiniumDriver wd;

	Managment_objects ob;

	public Add_distributer(WiniumDriver wd) {
		this.wd = wd;

	}

	public void add_distributer(String dis_name) throws AWTException, FindFailed {
		
		ob = new Managment_objects(wd);
		ob.Dis_btn();
		ob.Add_click();
		ob.add_name(dis_name);
		ob.dis_save();
		ob.refresh_button();
	
	}

}
