package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver a=new ChromeDriver();
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fls=new FileInputStream("src\\main\\resources\\Ajio.properties");
		Properties p=new Properties();
		p.load(fls);
		String Url = p.getProperty("url");
		String srch = p.getProperty("search");
		a.get(Url);
		 WebElement ajo = a.findElement(By.name("searchVal"));
			ajo.sendKeys(srch);
			ajo.sendKeys(Keys.ENTER);
	}

}
