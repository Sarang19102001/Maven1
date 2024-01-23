package execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser 
{
public WebDriver a;

	@Parameters("Browser")
	@Test
	public void MyntraTest(String Browser) {
		if(Browser.equalsIgnoreCase("Chrome")) {
			a=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Edge")){
			a=new EdgeDriver();
			
		}
		else {
			 a=new FirefoxDriver();
			System.out.println("Default Browser");
		}a.get("https://www.nykaa.com/");
		
	}

}
