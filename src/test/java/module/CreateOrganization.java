package module;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonutils.PropertyFileUtils;

import commonutils.WebDriverutils;

public class CreateOrganization {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
WebDriver a;
		
		PropertyFileUtils putils=new PropertyFileUtils();
		WebDriverutils w=new WebDriverutils();
//		Read the data from property file
		
		String URL = putils.getdatafromPropertyFile("url");
		String UN  =putils.getdatafromPropertyFile("username");
		String PD = putils.getdatafromPropertyFile("password");
		 String Brow = putils.getdatafromPropertyFile("browser");
		String ORG = putils.getdatafromPropertyFile("orgname");
		String IND = putils.getdatafromPropertyFile("industry");
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
		 
		 
		 a.get(URL);
		 w.maximizeWindow(a);
		 a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 a.findElement(By.name("user_name")).sendKeys(UN);
			a.findElement(By.name("user_password")).sendKeys(PD);
			a.findElement(By.id("submitButton")).click();
			a.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
			a.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
			a.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys(ORG);
			a.findElement(By.xpath("(//input[@onclick='toggleAssignType(this.value)'])[2]")).click();
			a.findElement(By.xpath("//select[@name='assigned_group_id']")).click();
			Thread.sleep(1000);
			a.findElement(By.xpath("//option[text()='Support Group']")).click();
			
			 WebElement ind = a.findElement(By.name("industry"));
			Select y=new Select(ind);
			y.selectByValue(IND);
			a.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();
			
		
			String acttitle = a.getTitle();
			System.out.println(acttitle);
			String expTitle = "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM";
               			WebDriverWait wait=new WebDriverWait(a,Duration.ofSeconds(20));
               			wait.until(ExpectedConditions.titleIs(expTitle));
               			
			
			Thread.sleep(4000);
			 WebElement mouse = a.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			 Actions j=new Actions(a);
			 j.moveToElement(mouse).perform();
			 Thread.sleep(2000);
			 a.findElement(By.xpath("//a[text()='Sign Out']")).click();


	}

}
