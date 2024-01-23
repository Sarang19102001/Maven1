package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver y=new ChromeDriver();
		y.manage().window().maximize();
		y.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		y.get("https://www.youtube.com/");
		Thread.sleep(1000);
	    y.findElement(By.name("search_query")).sendKeys("Animal Songs");
	    y.findElement(By.id("search-icon-legacy")).click();
	    y.findElement(By.xpath("(//a[@class='yt-simple-endpoint style-scope ytd-video-renderer'])[2]")).click();
	    Thread.sleep(30000);
		WebElement video = y.findElement(By.xpath("//video[@controlslist='nodownload']"));
		Actions a =new Actions(y);
		
		a.moveToElement(video).perform();
		
		
		y.findElement(By.xpath("(//button[@class='ytp-play-button ytp-button'])[1]")).click();
		Thread.sleep(1000);
		y.findElement(By.xpath("//button[@aria-label='Play keyboard shortcut k']")).click();
		Thread.sleep(1000);
		y.findElement(By.xpath("//span[@class='ytp-volume-area']")).click();
		WebElement drag = y.findElement(By.xpath("//div[@class='ytp-volume-slider-handle']"));
		a.dragAndDropBy(drag, 100, 0).perform();
		Thread.sleep(1000);
//		y.findElement(By.xpath("(//button[@title='I like this'])[1]")).click();
//		Thread.sleep(1000);
		y.findElement(By.xpath("(//span[text()='Share'])[1]")).click();
	}

}
