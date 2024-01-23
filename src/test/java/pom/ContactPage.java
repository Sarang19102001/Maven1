package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {
	
	@FindBy(xpath="//img[@alt='Create Contact...']")
	private WebElement Plusicon;

	public WebElement getPlusicon() {
		return Plusicon;
	}

}
