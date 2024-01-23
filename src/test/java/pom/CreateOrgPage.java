package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOrgPage {
	
	@FindBy(xpath="(//input[@class='detailedViewTextBox'])[1]")
	private WebElement OrgName;
	
	@FindBy(xpath="(//input[@onclick='toggleAssignType(this.value)'])[2]")
	private WebElement Toggle;
	
	@FindBy(xpath="//select[@name='assigned_group_id']")
	private WebElement grpid ;
	
	@FindBy(xpath="//option[text()='Support Group']")
	private WebElement Group ;
	
	@FindBy(name="industry")
	private WebElement Grpname;
	
	@FindBy(xpath="(//input[@class='crmbutton small save'])[1]")
	private WebElement Savebtn;

	public WebElement getOrgName() {
		return OrgName;
	}

	public WebElement getToggle() {
		return Toggle;
	}

	public WebElement getGrpid() {
		return grpid;
	}

	public WebElement getGroup() {
		return Group;
	}

	public WebElement getGrpname() {
		return Grpname;
	}

	public WebElement getSavebtn() {
		return Savebtn;
	}

}
