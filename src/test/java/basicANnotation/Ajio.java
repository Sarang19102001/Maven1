package basicANnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio {
        
	@Test
	public void AJJioTest() {
		WebDriver w= new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.ajio.com/");
	}

	
}
