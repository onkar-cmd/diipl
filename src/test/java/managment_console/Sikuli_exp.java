package managment_console;

import java.awt.AWTException;

import java.net.MalformedURLException;


import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;


public class Sikuli_exp {

	public static void main(String[] args) throws  InterruptedException, MalformedURLException, AWTException, FindFailed 
	{
		Screen s = new Screen();
		s.findText("drivers").click();
		
		
	}

}
