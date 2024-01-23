package execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	
	@Test
	public void NykaaTest()
	{
		WebDriver w= new ChromeDriver();
//		w.manage().window().maximize();
		w.get("https://www.nykaa.com/");
		
	}
	
	@Test
	public void TiraTest()
	{
		WebDriver w= new ChromeDriver();
//		w.manage().window().maximize();
		w.get("https://www.tirabeauty.com/");
		
	}

}
