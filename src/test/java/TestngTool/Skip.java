package TestngTool;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Skip {
	
	@Test
	public void AJioTest()
	
	{
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("https://www.ajio.com/");
		String acturl = w.getCurrentUrl();
		String expurl = "https://www.ajio.com/";
		Assert.assertEquals(acturl, expurl);
		System.out.println("AGme");
		
	}
	@Test
	public void AjioHomeTest()
	{
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("https://www.ajio.com/");	
	}

}
