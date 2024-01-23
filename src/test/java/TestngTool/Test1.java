package TestngTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

	
		@Test( invocationCount=2,priority=1)
		public void SarangTest()
		{
//		Method name should End with suffix TEst----------MAndatory		{
		WebDriver w=new ChromeDriver();
		
		w.get("https://www.facebook.com/login/");
//		System.out.println("My name is sarang");

	}
		@Test(invocationCount= 3,priority=2)
		
		public void AhockTest() {
//			System.out.println("Ramedwar");
			WebDriver w=new ChromeDriver();
			w.get("https://animeheaven.me");
		}

}
