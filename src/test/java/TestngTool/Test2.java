package TestngTool;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test2 {
	
	@Test
	public void MyntraTest()
	{
		SoftAssert s=new SoftAssert();
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("https://www.myntra.com/");
		WebElement STF = w.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		s.assertTrue(STF.isDisplayed());
		s.assertTrue(STF.isSelected());
		s.assertFalse(STF.isDisplayed());
		s.assertFalse(STF.isSelected());
		s.assertAll(); 
		
		
	}

}
