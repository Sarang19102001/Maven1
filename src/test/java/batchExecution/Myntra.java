package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra {
	
	
	@Test
	public void Myntra()
	{
		WebDriver w= new ChromeDriver();
//		w.manage().window().maximize();
		w.get("https://www.myntra.com/");
	}

}
