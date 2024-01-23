package basicPom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillRary {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://demoapp.skillrary.com/");
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.findElement(By.xpath("//a[text()='LOGIN']")).click();
		WebElement EMAIL = w.findElement(By.name("email"));
		EMAIL.sendKeys("Sarang");
		w.navigate().refresh();
		EMAIL.sendKeys("admin");

	}

}
