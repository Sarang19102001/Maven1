	package Basic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PepperFry {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver a=new ChromeDriver();
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		a.get("https://www.pepperfry.com/");
	    WebElement stf = a.findElement(By.id("search"));
	    stf.sendKeys("Sofa");
	    stf.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    
	    a.findElement(By.xpath("//span[text()=' Milan Fabric 3 Seater Sofa in Sky Blue Colour ']")).click();
	    Thread.sleep(1000);
	    Set<String> ids = a.getWindowHandles();
	    for(String s:ids) {
	    	a.switchTo().window(s).getTitle();
	    }
	    Thread.sleep(5000);
	    
	    a.findElement(By.xpath("(//button[@class='button-container button-size--large vip-action-cta button-primary ng-star-inserted'])[2]")).click();
	    Thread.sleep(1000);
	    a.findElement(By.xpath("//button[@class='button-container ck-sticky-desktop-cta button-primary ng-star-inserted']")).click();
	    Thread.sleep(1000);
	    a.findElement(By.xpath("//input[@formcontrolname='userPhoneEmail']")).sendKeys("9011786440");
	    Thread.sleep(6000);
	    a.findElement(By.xpath("//button[@class='button-container button-size--large mobile-email-input-button button-primary']")).click();
	    Thread.sleep(15000);
	    a.findElement(By.xpath("//button[@class='button-container button-size--large mobile-email-input-button button-primary ng-star-inserted']")).click();
	    Thread.sleep(4000);
	    a.findElement(By.xpath("//button[@class='button-container ck-sticky-desktop-cta button-primary ng-star-inserted']")).click();
	    Thread.sleep(1000);
	    a.findElement(By.xpath("(//h4[@class='panel-title'])[2]")).click();
	    Thread.sleep(1000);
	    a.findElement(By.id("ccnum")).sendKeys("96878436");
	    Thread.sleep(1000);
	    a.findElement(By.xpath("//input[@placeholder='Valid Thru (MM/YY)']")).sendKeys("19/24");
	    Thread.sleep(1000);
	    a.findElement(By.xpath("//input[@placeholder='CVV']")).sendKeys("456");
	    Thread.sleep(1000);
	    a.findElement(By.xpath("//input[@placeholder='Name on Card']")).sendKeys("Prashant Zagade");
	    Thread.sleep(2000);
	    TakesScreenshot t=(TakesScreenshot)a;
	     File sofa = t.getScreenshotAs(OutputType.FILE);
	    File dfile = new File("./Pepper/sofa.png");
	    FileUtils.copyFile(sofa, dfile);
	    		
	
	}

}
