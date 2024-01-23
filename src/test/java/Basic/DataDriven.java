package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver a=new ChromeDriver();
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	  
//	Step1:	To read the data from  external file
		FileInputStream fls=new FileInputStream("src\\main\\resources\\Data2.properties");
//  Step2: To  read data from property File
		Properties p=new Properties();
//	Step3: To fetch the location of property File
		p.load(fls);
//	Step 4:We read all keys present in property files
		String Url = p.getProperty("url");
		String usn = p.getProperty("username");
		String psd = p.getProperty("password");
//	Step 5:Load the Url
		a.get(Url);
//	Step 6:Login to application	
		a.findElement(By.name("user_name")).sendKeys(usn);
		a.findElement(By.name("user_password")).sendKeys(psd);
		a.findElement(By.id("submitButton")).click();
	}

}
//a.get("http://localhost:8888/index.php");
//a.findElement(By.name("user_name")).sendKeys("admin");
//a.findElement(By.name("user_password")).sendKeys("admin@1910");
//a.findElement(By.id("submitButton")).click();
