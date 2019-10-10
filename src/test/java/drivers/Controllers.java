package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Controllers {
	private WebDriver wd;

	public WebDriver getDriver() {
		return wd;
	}

	public void setDriver(WebDriver driver) {
		this.wd = driver;
	}

	public void setupController() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver latest\\chromedriver.exe");
		this.wd = new ChromeDriver();
		
		
	}

	public void teardownController() 
	{
		if (wd != null) {
			wd.quit();

		
	}
	}
}