package ufo;

import java.io.IOException;
import java.util.List;

import org.languagetool.JLanguageTool;
import org.languagetool.language.BritishEnglish;
import org.languagetool.rules.RuleMatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import drivers.Controllers;

public class Contains_exaple {

	static Ufo_object_properties uop;

	static Login_funcnality lf;

	static WebDriver wd;

	public static void main(String[] args) throws InterruptedException, IOException {
		
Controllers c = new Controllers();
		
		Thread.sleep(5000);
		c.setupController();
		wd = c.getDriver();
		uop = new Ufo_object_properties(wd);
		lf = new Login_funcnality(wd);
		lf.login_ufo("dusane.infotech", "di@222" , "Sales");
		Thread.sleep(5000);
		List<WebElement> linksize = wd.findElements(By.xpath("//body//a[@href]")); 
        int linksCount = linksize.size();
        System.out.println("Total no of links Available: "+linksCount);
        String[] links = new String[linksCount];
        System.out.println("List of links Available: ");
        String[] urls = new String[links.length];
        int i=0;
        for(WebElement we : linksize) 
        {   String url = we.getAttribute("href");
        	String last_link = url.substring(url.lastIndexOf("l/")+2);
            System.out.println(last_link);
            if(last_link.contains("#"))
            	continue;            
            urls[i] = last_link; 
            i++;
         }
        for(String last_link : urls) 
        {
        	if(last_link.contains("/"))
            {
            	System.out.println(last_link);
            	wd.navigate().to("http://stagingiro.ufomoviez.com/"+last_link);
            	Thread.sleep(5000);
            	grammer_check();}
           else
            {wd.navigate().to("http://stagingiro.ufomoviez.com/Html/"+last_link);
            Thread.sleep(5000);
            grammer_check();}	
        }}
	
	public static void grammer_check() throws IOException
    {
    	JLanguageTool langTool = new JLanguageTool(new BritishEnglish());
	  		List<RuleMatch> matches = langTool.check(wd.findElement(By.xpath("//body")).getText());
	  		for (RuleMatch match : matches) {
	  		      System.out.println("Potential error at characters " +
	  		          match.getFromPos() + "-" + match.getToPos() + ": " +
	  		          match.getMessage());
	  		      System.out.println("Suggested correction(s): " +
	  		          match.getSuggestedReplacements());
	  		      
	  		
	 }
			
    
    
    }
	
}
