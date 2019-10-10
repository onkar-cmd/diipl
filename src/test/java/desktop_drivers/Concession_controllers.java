package desktop_drivers;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.Before;

public class Concession_controllers {

	private static WiniumDriver wd;

	public WiniumDriver getDriver() {
		return wd;
	}

	
	public void setupController() throws MalformedURLException {
		System.out.println("setting drivers..................................");
		DesktopOptions op = new DesktopOptions();
		op.setApplicationPath(
				"D:\\ImpactHandover-08-Aug-19\\ReleaseSoftware\\LatestSoftware-08-08-19\\Concession 7.3.1.0\\Concession.exe");
		wd = new WiniumDriver(new URL("http://localhost:9999"), op);
	}

	public void teardownController() {
		if (wd != null) {
			wd.quit();

		}
	}
}
