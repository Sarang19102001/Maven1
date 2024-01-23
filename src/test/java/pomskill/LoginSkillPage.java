package pomskill;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSkillPage {
   
	
	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement logintf;
	
	@FindBy(id="email")
	private WebElement email;

	public WebElement getLogintf() {
		return logintf;
	}

	public WebElement getEmail() {
		return email;
	}
	
}
