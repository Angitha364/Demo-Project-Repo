package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtilities;

public class ManageNewsTest extends Base{
	@Test
	
public void manageNews() throws Exception
{
		/*String usrname="admin";
		String paswrd="admin";
		String message="Best of Luck";*/
		String usrname=ExcelUtilities.readStringData(1, 0, "LoginPage");
		String paswrd=ExcelUtilities.readStringData(1, 1, "LoginPage");
		String message=ExcelUtilities.readStringData(0, 1, "ManageNewsPage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usrname);
		loginpage.enterPassword(paswrd);
		loginpage.clickSignIn();
		loginpage.isHomePageLoaded();
		
		ManageNewsPage managenews=new ManageNewsPage(driver);
	managenews.manageMoreInfo();
	managenews.clickNew();
	managenews.enterText(message);//variable name in method and variable for calling method should be different
	managenews.saveButton();
	managenews.alertMessageLoaded();
	boolean alertmessageloaded=managenews.alertMessageLoaded();
	Assert.assertTrue(alertmessageloaded);
}
}
