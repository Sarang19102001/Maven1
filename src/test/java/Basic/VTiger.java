package Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VTiger {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver a=new ChromeDriver();
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fls=new FileInputStream("src\\main\\resources\\VTiGER.properties");
		Properties p=new Properties();
		p.load(fls);
		String Url = p.getProperty("url");
		String Pname = p.getProperty("pname");
		String Pno = p.getProperty("partno");
		 String St = p.getProperty("strtdate");
		 String EXp = p.getProperty("exp");
		 String WEB = p.getProperty("website");
		 String MPN = p.getProperty("mpnum");
		 String VPN = p.getProperty("vpn");
		 String PROD = p.getProperty("prodshit");
		 String SN = p.getProperty("serialno");
		
		a.get(Url);
		a.findElement(By.xpath("//button[text()='Sign in']")).click();
		a.findElement(By.id("appnavigator")).click();
		 WebElement inventory = a.findElement(By.xpath("//span[text()=' INVENTORY']"));
		 Actions s=new Actions(a);
		 Thread.sleep(1000); 
		 s.moveToElement(inventory).perform();
		 Thread.sleep(1000); 
		 a.findElement(By.xpath("(//a[@title='Products'])[2]")).click();
		 a.findElement(By.xpath("(//button[@class='btn addButton btn-default module-buttons'])[1]")).click();
		 a.findElement(By.id("Products_editView_fieldName_productname")).sendKeys(Pname);
		 a.findElement(By.id("Products_editView_fieldName_productcode")).sendKeys(Pno);
		WebElement ssd = a.findElement(By.id("Products_editView_fieldName_sales_start_date"));
		 ssd.sendKeys(St);
		 ssd.sendKeys(Keys.ENTER);
		 WebElement sd = a.findElement(By.id("Products_editView_fieldName_start_date"));
		 sd.sendKeys(St);
		 sd.sendKeys(Keys.ENTER);
		WebElement Ed = a.findElement(By.id("Products_editView_fieldName_expiry_date"));
		Ed.sendKeys(EXp);
		Ed.sendKeys(Keys.ENTER);
		WebElement ESd = a.findElement(By.id("Products_editView_fieldName_sales_end_date"));
		ESd.sendKeys(EXp);
		ESd.sendKeys(Keys.ENTER);
		 a.findElement(By.id("Products_editView_fieldName_website")).sendKeys(WEB);
		 a.findElement(By.id("Products_editView_fieldName_mfr_part_no")).sendKeys(MPN);
		 a.findElement(By.id("Products_editView_fieldName_vendor_part_no")).sendKeys(VPN);
		 a.findElement(By.id("Products_editView_fieldName_productsheet")).sendKeys(PROD);
		 a.findElement(By.id("Products_editView_fieldName_serial_no")).sendKeys(SN);
		 a.findElement(By.id("vendor_id_display")).sendKeys(SN);
		 a.findElement(By.xpath("(//div[@class='select2-container inputElement select2'])[1]")).click();
		 Thread.sleep(1000);
		 a.findElement(By.xpath("(//li[@class='select2-results-dept-0 select2-result select2-result-selectable'])[3]")).click();
		 Thread.sleep(1000);
		 a.findElement(By.xpath("(//span[text()='Select an Option'])[1]")).click();
		 Thread.sleep(1000);
		 a.findElement(By.xpath("//div[text()='AltvetPet Inc.']")).click();
		 a.findElement(By.xpath("(//span[@class='select2-chosen'])[3]")).click();
		 Thread.sleep(1000);
		 a.findElement(By.xpath("(//div[@class='select2-result-label'])[3]")).click();
		 Thread.sleep(2000);
		 a.findElement(By.xpath("//button[text()='Save']")).click();
		 Thread.sleep(2000);
		 TakesScreenshot t=(TakesScreenshot)a;
		 File screen = t.getScreenshotAs(OutputType.FILE);
		 File dfile = new File("./VTiger/data.png");
		 FileUtils.copyFile(screen, dfile);
		 a.findElement(By.xpath("//a[@class='userName dropdown-toggle pull-right']")).click();
		 Thread.sleep(1000);
		 a.findElement(By.xpath("//a[text()='Sign Out']")).click();
		 
		 
		 
		 
		 
		
		
		
		
		
		
		


	}

}
