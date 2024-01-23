package TestngTool;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Myntra1 {
	
	
	@Test
	public void myntraTest() {
		WebDriver w=new ChromeDriver();
		w.get("https://www.myntra.com/");
		
		WebElement stf = w.findElement(By.cssSelector("input[class='desktop-searchBar']"));
		Assert.assertTrue(stf.isDisplayed());   //  True condition pass 
		Assert.assertTrue(stf.isSelected());      // False condition Fail
		Assert.assertFalse(stf.isDisplayed());    //   True condition fail
		Assert.assertFalse(stf.isSelected());      //   false Condition Pass
		
		
		
	}

}
