package listener;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonutils.ListenerImplementation;


@Listeners(ListenerImplementation.class)
public class TiraTest {

	@Test
	public void LaunchTest()
	{
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.tirabeauty.com/");
		Assert.assertEquals("sarang", "sarang");
		
		WebElement tira = w.findElement(By.id("search"));
		tira.sendKeys("Perfume");
		tira.sendKeys(Keys.ENTER);
	}
		@Test
		public void LTest()
		
		{
			WebDriver w=new ChromeDriver();
			w.manage().window().maximize();
			w.get("https://www.flipkart.com/");
			
		}
		
		
	
		
		


}
