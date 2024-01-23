package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationPage {

	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement OgPlusicon;

	public WebElement getPlusicon() {
		return OgPlusicon;

}
	
}
