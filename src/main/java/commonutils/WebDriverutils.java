package commonutils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverutils {
	public void maximizeWindow(WebDriver a)
	{
		a.manage().window().maximize();
	}
	
	public void minimizeWindow(WebDriver a)
	{
		a.manage().window().minimize();
	}
	public void fullscreenWindow(WebDriver a)
	{
		a.manage().window().fullscreen();
	}
	
	
	public void WaitWebElementToLoad(WebDriver a)
	{
		 a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void dropDown(WebElement target ,String text)
	
	{
		 Select s=new Select(target);
		 s.selectByVisibleText(text);
	}
    public void dropDown(WebElement target ,int index)
	
	{
		 Select s=new Select(target);
		 s.selectByIndex(index);
	}
	
     public void dropDownValue(WebElement target ,String value)
	
	{
		 Select s=new Select(target);
		 s.selectByValue(value);
	}
	public void mousehover(WebDriver a,WebElement target)
	{
		Actions s=new Actions(a);
		s.contextClick(target).perform();
		
	}
	public void doubleClick(WebDriver a,WebElement target)
	{
		Actions s=new Actions(a);
		s.doubleClick(target).perform();
		
	}
	public void click(WebDriver a,WebElement target)
	{
		Actions s=new Actions(a);
		s.click(target).perform();
	}
	public void Switch(WebDriver a,String expurl )
	{
		Set<String> ids = a.getWindowHandles();
		for(String k:ids)
		{
			String acturl = a.switchTo().window(k).getCurrentUrl();
			
			if(acturl.contains(expurl)) {
				break;
			}
			
		}
	}
	
     public void takescreenShot(WebDriver a) throws IOException	
     {
    	 LocalDateTime LDT = LocalDateTime.now();
		 String Timestamp = LDT.toString().replace(':', '-');
		TakesScreenshot t=(TakesScreenshot)a;
		File ScreenSht = t.getScreenshotAs(OutputType.FILE);
		File dfile = new File("./ScreenShot/ContactModule"+Timestamp+".png");
		FileUtils.copyFile(ScreenSht, dfile);
	
      }
     public void okpopup(WebDriver a)
     {
    	 a.switchTo().alert().accept();
     }
     public void cancelPopup(WebDriver a)
     {
    	 a.switchTo().alert().dismiss();
     }
     public void fetchText(WebDriver a)
     {
    	 a.switchTo().alert().getText();
     }
     public void Enterdata(WebDriver a,String text)
     {
    	 a.switchTo().alert().sendKeys(text);
     }
     
     public void frames(WebDriver a,int index)
     {
    	 a.switchTo().frame(index);
     }
     public void frames(WebDriver a,String name)
     {
    	 a.switchTo().frame(name);
     }
     public void frames(WebDriver a,WebElement element)
     {
    	 a.switchTo().frame(element);
     }
     
     public void pageload (WebDriver a)
     {
    	 a.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
     }
     public void explicitWait(WebDriver a,String Expectedurl)
     {
    	 WebDriverWait w=new WebDriverWait(a,Duration.ofSeconds(10));
    	 w.until(ExpectedConditions.urlToBe(Expectedurl));
     }
     
     
     
     
     
     
     
     
     
}