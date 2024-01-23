package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nykaa {
	
	@Test
	public void Nykaaa() {
		WebDriver w= new ChromeDriver();
//		w.manage().window().maximize();
		w.get("https://www.nykaa.com/");
	}

}
