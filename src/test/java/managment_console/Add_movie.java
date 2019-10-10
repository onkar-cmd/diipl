package managment_console;

import java.awt.AWTException;

import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.FindFailed;

public class Add_movie {

	private WiniumDriver wd;

	Managment_objects mo;

	public Add_movie(WiniumDriver wd) {
		this.wd = wd;

	}

	public void add_movie(String movie,String sc,String movie_len,String no_shows) throws AWTException, InterruptedException, FindFailed 
	{
		Thread.sleep(5000);
		mo = new Managment_objects(wd);
		mo.movie_btn();
		mo.Add_click();
		mo.txt_movie(movie);
		mo.dropdw_movie();
		mo.star_cast(sc);
		mo.rating();
		mo.language();
		mo.movie_type();
		mo.movie_lenght(movie_len);
		mo.no_of_shows(no_shows);
		mo.movie_save();
}

}
