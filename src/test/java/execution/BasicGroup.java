package execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicGroup {
	
//	@Test(groups="Shopping")
//	public void NykaaTest()
//	{
//		WebDriver w= new ChromeDriver();
//		w.manage().window().maximize();
//		w.get("https://www.nykaa.com/");
//		
//	}
//	
//	@Test(groups="Shopping")
//	public void TiraTest()
//	{
//		WebDriver w= new ChromeDriver();
//		w.manage().window().maximize();
//		w.get("https://www.tirabeauty.com/");
//		
//	}
//	@Test(groups="Food")
//	public void ZomatoTest()
//	{
//		WebDriver w= new ChromeDriver();
//		w.manage().window().maximize();
//		w.get("https://www.zomato.com/india");
//		
//	}
	@Test(groups="Food")
	public void SwiggyTest()
	{
		WebDriver w= new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.swiggy.com/");
		Reporter.log("Sarang",true);
	}
	
	
	

}
