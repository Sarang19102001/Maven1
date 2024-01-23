package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavedContactPage {
	
	
	@FindBy(xpath="(//td[@class='small'])[2]")
    private  WebElement Signout; 
	
	@FindBy(xpath="//a[text()='Sign Out']")
    private  WebElement Signoutbtn;

	public WebElement getSignout() {
		return Signout;
	}

	public WebElement getSignoutbtn() {
		return Signoutbtn;
	} 
	
	
}
