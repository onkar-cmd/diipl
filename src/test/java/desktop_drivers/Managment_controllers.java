package desktop_drivers;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Managment_controllers {
	
	
	
	private static WiniumDriver wd;

	public  WiniumDriver getDriver() 
	{
		return wd;
	}

	public void setupController() throws MalformedURLException 
	{
	
		DesktopOptions op = new DesktopOptions();
		op.setApplicationPath("D:\\Impact all relase software\\LatestSoftware-08-08-19\\Management Console-4.3.0.0\\ManagementConsole.exe");
		op.setDebugConnectToRunningApp(false);
		op.setLaunchDelay(2);
		wd = new WiniumDriver(new URL("http://localhost:9999"), op);
	}
	
	public void teardownController() 
	{
		if (wd != null) {
			wd.quit();

		}}
}
