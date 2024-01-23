package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
       public WebDriver w;
	@FindBy(name="user_name")
	 private WebElement USNTF;

	@FindBy(name="user_password")
	 private WebElement PSWTF;
	
	@FindBy(id="submitButton")
	 private WebElement LoginBtn;
//	create a constructor
	public LoginPage(WebDriver w)
	{
		PageFactory.initElements(w, this);	
	}
//	create a method
	public HomePage Login(String usrnamedata,String psddata)
	{
		USNTF.sendKeys(usrnamedata);
		PSWTF.sendKeys(psddata);
		LoginBtn.click();
		return new HomePage( w);
		
	}
	

	public WebElement getUSNTF() {
		return USNTF;
	}

	public WebElement getPSWTF() {
		return PSWTF;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	

}
