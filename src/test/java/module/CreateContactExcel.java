package module;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import commonutils.ExcelUtils;

public class CreateContactExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver a;
		
		ExcelUtils eu=new ExcelUtils();
		
		String Brow=eu.getdatafromExcel("contact", 0, 1);
		String Url = eu.getdatafromExcel("contact", 1, 1);
		String UN = eu.getdatafromExcel("contact", 2, 1);
		String PD = eu.getdatafromExcel("contact", 3, 1);
		String FN = eu.getdatafromExcel("contact", 4, 1);
		String LN = eu.getdatafromExcel("contact", 5, 1);
		String PRE = eu.getdatafromExcel("contact", 6, 1);
    	 String VALUE = eu.getdatafromExcel("contact",7, 1);
		
		
		if (Brow.equalsIgnoreCase("chrome"))
		 {
			 a=new ChromeDriver();
		 }
		 else if(Brow.equalsIgnoreCase("browser"))
		 {
			 a=new EdgeDriver();
			 
		 }
		 else {
			 a=new FirefoxDriver();
		 }
		 a.get(Url);
		 a.manage().window().maximize();
		 a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 a.findElement(By.name("user_name")).sendKeys(UN);
			a.findElement(By.name("user_password")).sendKeys(PD);
			a.findElement(By.id("submitButton")).click();
			a.findElement(By.xpath("//a[text()='Contacts']")).click();
			a.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
			 WebElement prefix = a.findElement(By.xpath("//select[@name='salutationtype']"));
			Select s=new Select(prefix);
			s.selectByValue(PRE);
			a.findElement(By.name("firstname")).sendKeys(FN);
			a.findElement(By.name("lastname")).sendKeys(LN);
			Thread.sleep(1000);
			a.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
			
			WebElement dropdown = a.findElement(By.name("assigned_group_id"));
			Select s1=new Select(dropdown);
			s1.selectByValue(VALUE);
			a.findElement(By.xpath("(//img[@alt='Select'])[1]")).click();
			Set<String> ids = a.getWindowHandles();
			for(String k:ids) {
				String acturl = a.switchTo().window(k).getCurrentUrl();
				System.out.println(acturl);
				String expurl = "http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=";
				
				if(acturl.contains(expurl)) {
					break;
				}
			}
			WebElement stf = a.findElement(By.xpath("//input[@id='search_txt']"));
			stf.sendKeys("Ready Player 1");
			stf.sendKeys(Keys.ENTER);
			a.findElement(By.xpath("//a[text()='Ready Player 1']")).click();
			for(String j:ids) {
				String actur1 = a.switchTo().window(j).getCurrentUrl();
				String expectedurl = "http://localhost:8888/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing";
				if(actur1.contains(expectedurl)) {
					break;
				}
			}
			
			a.findElement(By.xpath("//img[@id='jscal_trigger_birthday']")).click();
			a.findElement(By.xpath("//input[@name='birthday']")).sendKeys("2001-10-19");
			a.findElement(By.xpath("(//input[@name='button'])[1]")).click();
			Thread.sleep(1000);
			 WebElement mouse = a.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			 Thread.sleep(1000);
			 Actions j=new Actions(a);
			 j.moveToElement(mouse).perform();
			 Thread.sleep(2000);
			 a.findElement(By.xpath("//a[text()='Sign Out']")).click();

	}

}
