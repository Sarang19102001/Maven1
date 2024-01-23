package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver a=new ChromeDriver();
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fls=new FileInputStream("src\\main\\resources\\Data3Skill.properties");
		Properties p=new Properties();
		 p.load(fls);
	 String Skill = p.getProperty("skillurl");
		String Email = p.getProperty("email");
		 String Spsd = p.getProperty("skillpassword");
		
		 a.get(Skill);
		 a.findElement(By.xpath("//a[text()='LOGIN']")).click();
		 a.findElement(By.id("email")).sendKeys(Email);
		 a.findElement(By.id("password")).sendKeys(Spsd);
		 a.findElement(By.id("last")).click();
		 

	}

}
