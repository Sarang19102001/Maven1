package basicPom;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonutils.ExcelUtils;
import commonutils.WebDriverutils;
import pom.CreateOrgPage;
import pom.HomePage;
import pom.LoginPage;
import pom.OrganizationPage;

public class BaseOrgPage {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		WebDriver w=new ChromeDriver();
		WebDriverutils web=new WebDriverutils();
		ExcelUtils e=new ExcelUtils();
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("http://localhost:8888/");
		
		
		String ORG = e.getdatafromExcelOrg("OgPom", 0, 1);
		String INDUSTRY = e.getdatafromExcelOrg("OgPom", 1, 1);
		  
		  
		LoginPage lp=new LoginPage( w);
		
		{
			lp.Login("admin", "admin@1910");	
		}
		HomePage hp=new HomePage(w);
		hp.Home2();
		
		 
		
		OrganizationPage op=new OrganizationPage();
		PageFactory.initElements(w, op);
		op.getPlusicon().click();
		
		CreateOrgPage cp=new CreateOrgPage();
		PageFactory.initElements(w, cp);
		
		cp.getOrgName().sendKeys(ORG);
		cp.getToggle().click();
		cp.getGrpid().click();
		cp.getGroup().click();
		WebElement Ind = cp.getGrpname();
		web.dropDownValue(Ind, INDUSTRY);
		cp.getSavebtn().click();
		
		 
		String expTitle = "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM";
		WebDriverWait wait=new WebDriverWait(w,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.titleIs(expTitle));
		
		
		
		
		
		

	}

}
