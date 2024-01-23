package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver y=new ChromeDriver();
		y.manage().window().maximize();
		y.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		y.get("https://www.irctc.co.in/nget/train-search");
		WebElement origin = y.findElement(By.id("origin"));
		y.findElement(By.id("disha-banner-close")).click();
		Thread.sleep(4000);
		origin.sendKeys("Pune");
		origin.sendKeys(Keys.ENTER);
		WebElement destination = y.findElement(By.id("destination"));
		destination.sendKeys("Nagpur");
		destination.sendKeys(Keys.ENTER);
		y.findElement(By.id("jDate")).sendKeys("30/12/2023");
		y.findElement(By.xpath("//button[text()='Search']")).click();

	}

}
