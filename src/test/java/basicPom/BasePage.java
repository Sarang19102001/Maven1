package basicPom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import commonutils.ExcelUtils;
import commonutils.WebDriverutils;
import pom.ContactInfoPage;
import pom.ContactPage;
import pom.HomePage;
import pom.LoginPage;
import pom.SavedContactPage;

public class BasePage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver w=new ChromeDriver();
		WebDriverutils web=new WebDriverutils();
		ExcelUtils e=new ExcelUtils();
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("http://localhost:8888/");
		
		LoginPage lp=new LoginPage( w);
		
		{
			lp.Login("admin", "admin@1910");	
		}
		HomePage hp=new HomePage(w);
		
		String PRE = e.getdatafromExcel("ConPom", 0, 1);
	    String FN = e.getdatafromExcel("ConPom", 1, 1);
	    String LN = e.getdatafromExcel("ConPom", 2, 1);
	    String VALUE = e.getdatafromExcel("ConPom", 3, 1);
		hp.getContactEle().click();
		
		ContactPage cp=new ContactPage();
		PageFactory.initElements(w, cp);
		cp.getPlusicon().click();
		
		ContactInfoPage ip=new ContactInfoPage();
		PageFactory.initElements(w, ip);
		WebElement PRED = ip.getPRE();
		web.dropDownValue(PRED, PRE);
		ip.getFN().sendKeys(FN);
		ip.getLN().sendKeys(LN);
	    ip.getRdobtn().click();
		Thread.sleep(2000);
		 WebElement dropdown = ip.getGROUP();
		 web.dropDown(dropdown, VALUE);
		 ip.getOrg().click();
		 web.Switch(w, "http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=");
		 WebElement ogname = ip.getOrgname();
		 ogname.sendKeys("Ready Player 1");
		 ogname.sendKeys(Keys.ENTER);
		 web.Switch(w, "http://localhost:8888/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing");
		 ip.getBtday().click();
		 ip.getBtdstf().sendKeys("2001-10-19");
		 ip.getSavebtn().click();

          web.takescreenShot(w);
          
          SavedContactPage sp=new SavedContactPage();
          PageFactory.initElements(w, sp);
          WebElement SP = sp.getSignout();
          web.mousehover(w, SP);
          sp.getSignoutbtn().click();
          
          
	
		 
	
		
		

		
	     
	
		
		
		
	
	
		
	}
	


}
