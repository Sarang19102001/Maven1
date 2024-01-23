package TestngTool;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Url {
	
	@Test
	public void AjioTest() {
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("https://www.ajio.com/");
		WebElement stf = w.findElement(By.name("searchVal"));
		stf.sendKeys("Perfumes");
		stf.sendKeys(Keys.ENTER);
		WebElement checkbox = w.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']"));
		Assert.assertTrue(checkbox.isSelected());
//		System.out.println(w.findElement(By.xpath("//div[text()="BodyLovin' Vanilla Vibes Body Mist\"]")).getText());

}
	
}
