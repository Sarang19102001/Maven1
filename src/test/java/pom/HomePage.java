package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public WebDriver w;
	@FindBy(xpath="//a[text()='Contacts']")
       private WebElement contactEle;
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement Orgname;
	
	
	
	
	public HomePage(WebDriver w)
	{
		PageFactory.initElements(w, this);	
	}
	public OrganizationPage Home2( )
	{
		Orgname.click();
		return new OrganizationPage();
	}
	
	public WebElement getOrgname() {
		return Orgname;
	}
	public ContactPage Home() {
		contactEle.click();
		return new ContactPage();
	}

	public WebElement getContactEle() {
		return contactEle;
	}
	
	
	

}
