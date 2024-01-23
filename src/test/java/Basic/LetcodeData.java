package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LetcodeData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver a=new ChromeDriver();
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fls=new FileInputStream("src\\main\\resources\\LetcodeData.properties");
		Properties p=new Properties();
		 p.load(fls);
		 String URL = p.getProperty("url");
		 String NAME = p.getProperty("name");
		String APPend = p.getProperty("append");
		String LOC = p.getProperty("location");
		String SUR = p.getProperty("surname");
		a.get(URL);
		a.findElement(By.xpath("//a[text()='Edit']")).click();
		a.findElement(By.id("fullName")).sendKeys(NAME);
		WebElement jk = a.findElement(By.id("join"));
		jk.clear();
		jk.sendKeys(APPend);
		a.findElement(By.id("getMe")).clear();
		a.findElement(By.id("getMe")).sendKeys(LOC);
		a.findElement(By.id("clearMe")).clear();
		a.findElement(By.id("clearMe")).sendKeys(SUR);
		
		

	}

}
