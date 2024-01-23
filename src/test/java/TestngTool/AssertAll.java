package TestngTool;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertAll {

	
//
//	@Test
//	public void AjioTest() {
//		WebDriver w=new ChromeDriver();
//		w.get("https://www.ajio.com/");
//		String acturl = w.getCurrentUrl();
//		String expurl = "https://www.ajio.com/pune";
////		WebDriverWait wu=new WebDriverWait(w,Duration.ofSeconds(10));
////		wu.until(ExpectedConditions.urlToBe(expurl));
//		Assert.assertEquals(acturl, expurl);	
//	}
	@Test
	public void MyntraTest() {
		WebDriver w=new ChromeDriver(); 
		SoftAssert s=new SoftAssert();
		w.get("https://www.myntra.com/");
		String acturl = w.getCurrentUrl();
		String expurl = "https://www.myntra.com/pop";
//		Assert.assertEquals(acturl, expurl);
		s.assertEquals(acturl, expurl);
		System.out.println("My name is sarang");
		s.assertAll();
		
		

		
		
		
	}
	
	

}
