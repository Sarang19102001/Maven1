package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInfoPage {
	
	@FindBy(name="firstname")
	 private WebElement FN;
	
	@FindBy(name="lastname")
	 private WebElement LN;
	
	@FindBy(name="salutationtype")
	private WebElement PRE;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	 private WebElement rdobtn;
	
	@FindBy(name="assigned_group_id")
	private WebElement GROUP;

	@FindBy(xpath="(//img[@alt='Select'])[1]")
	private WebElement Org;
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement Stf;
	
	@FindBy(xpath="//a[text()='Ready Player 1']")
     private WebElement orgname;
	
	@FindBy(xpath="//img[@id='jscal_trigger_birthday']")
	private WebElement btday;
	
	@FindBy(xpath="//input[@name='birthday']")
	private WebElement btdstf;
	
	@FindBy(xpath="(//input[@name='button'])[1]")
	private WebElement savebtn;
	
	
	
	
	public WebElement getOrgname() {
		return orgname;
	}

	public void setOrgname(WebElement orgname) {
		this.orgname = orgname;
	}

	public WebElement getBtday() {
		return btday;
	}

	public void setBtday(WebElement btday) {
		this.btday = btday;
	}

	public WebElement getBtdstf() {
		return btdstf;
	}

	public void setBtdstf(WebElement btdstf) {
		this.btdstf = btdstf;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public void setSavebtn(WebElement savebtn) {
		this.savebtn = savebtn;
	}

	public WebElement getFN() {
		return FN;
	}

	public WebElement getLN() {
		return LN;
	}

	public WebElement getPRE() {
		return PRE;
	}

	public WebElement getRdobtn() {
		return rdobtn;
	}

	public WebElement getGROUP() {
		return GROUP;
	}

	public WebElement getOrg() {
		return Org;
	}

	public WebElement getStf() {
		return Stf;
	}
	
	
	

}
