package execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
	
	
	@Test
	public void NykaaTest()
	{
		WebDriver w= new ChromeDriver();
//		w.manage().window().maximize();
		w.get("https://www.nykaa.com/");
		
	}
	@Test
	public void SwiggyTest()
	{
		WebDriver w= new ChromeDriver();
//		w.manage().window().maximize();
		w.get("https://www.swiggy.com/");
		
	}
	

}
