package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RailwayYatri {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver a=new ChromeDriver();
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fls=new FileInputStream("src\\main\\resources\\RailwayData.properties");
		Properties p=new Properties();
		 p.load(fls);
		 String site = p.getProperty("url");
		 String stn = p.getProperty("station");
		String destn = p.getProperty("destination");
		String IRC = p.getProperty("irctcid");
		String Eml = p.getProperty("email");
		 String MBl = p.getProperty("mobile");
		a.get(site);
		a.findElement(By.xpath("//input[@class='stationpicker check-loader ui-autocomplete-input']")).sendKeys(stn);
		a.findElement(By.xpath("//input[@class='to-dest stationpicker check-loader ui-autocomplete-input']")).sendKeys(destn);
		a.findElement(By.xpath("//button[@class='detail-submit']")).click();
		Thread.sleep(4000);
		a.findElement(By.xpath("//p[text()='Filter By']")).click();
		a.findElement(By.xpath("(//span[@class='filterby_slider__2p50L filterby_round__Mw4Au'])[1]")).click();
		a.findElement(By.xpath("(//span[@class='filterby_slider__2p50L filterby_round__Mw4Au'])[2]")).click();
		a.findElement(By.xpath("(//label[@class='false'])[3]")).click();
		a.findElement(By.xpath("//span[text()='05 AM - 11 AM']")).click();
		a.findElement(By.xpath("//span[text()='PUNE (Pune Jn)']")).click();
		a.findElement(By.xpath("//span[text()='NGP (Nagpur)']")).click();
		a.findElement(By.xpath("//label[text()=' Apply Changes ']")).click();
		a.findElement(By.xpath("(//div[@class='flexCenter card_enable__bYOl0 false'])[1]")).click();
		Thread.sleep(3000);
		a.findElement(By.xpath("//input[@placeholder='Enter IRCTC User ID']")).sendKeys(IRC);
		a.findElement(By.name("user_email")).sendKeys(Eml);
		a.findElement(By.name("phone_no")).sendKeys(MBl);
		Thread.sleep(5000);
		JavascriptExecutor j=(JavascriptExecutor)a;
		j.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		a.findElement(By.xpath("//button[text()='Continue']")).click();


	}

}
