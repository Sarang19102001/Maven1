package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver a=new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://demoapp.skillrary.com/");
		a.findElement(By.xpath("//a[text()='LOGIN']")).click();
		a.findElement(By.id("email")).sendKeys("admin");
		a.findElement(By.id("password")).sendKeys("admin");
		a.findElement(By.id("last")).click();
		

	}

}
