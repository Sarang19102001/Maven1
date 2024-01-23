package basicPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pomskill.LoginSkillPage;

public class BaseSkillPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://demoapp.skillrary.com/");
		
		LoginSkillPage lp=new LoginSkillPage();
		PageFactory.initElements(w, lp);
		lp.getLogintf().click();
		lp.getEmail().sendKeys("sarang");
		w.navigate().refresh();
		lp.getEmail().sendKeys("admin");

	}

}
