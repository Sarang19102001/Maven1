package basicANnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Myntra {
	
	
	@AfterMethod
	public void Af() {
		System.out.println("After Method");
	}
	@Test
	public void MyntraTest() {
		WebDriver w= new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.myntra.com/");
	}
	@Test
	public void AjioTest() {
		WebDriver w= new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.ajio.com/");
	}
	
	@BeforeMethod
	public void Bm() {
		System.out.println("BEfore Method");
	}
	@BeforeClass
	public void BC()
	
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void AC()
	
	{
		System.out.println("After class");
	}
	@BeforeSuite
	public void BS() {
		System.out.println("Before suite");
	}
	@AfterSuite
	public void AF() {
		System.out.println("After suite");
	}
	
	

}
