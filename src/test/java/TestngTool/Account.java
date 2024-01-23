package TestngTool;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Account {

	
	  @Test
	  public void CreateAccountTest()
	  {
		  Assert.assertEquals("Pune", "Deccan");
		  System.out.println("Created");
	  }
	  
	  @Test(dependsOnMethods="CreateAccountTest")
	  public void DeleteAccoTest()
	  {
		  System.out.println("DEleted");
	  }
	  public void EditAccoTest()
	  {
		  System.out.println("Edited");
	  }
}
