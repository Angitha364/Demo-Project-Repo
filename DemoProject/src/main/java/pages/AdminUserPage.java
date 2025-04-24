package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUserPage {
	WebDriver driver;
	@FindBy(xpath="((//a[contains(@href,'https://groceryapp.uniqassosiates.com/admin/list-admin')])[2])")WebElement adminusermoreinfo ;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement adminusernewbutton ;
	@FindBy(xpath="//input[@id='username']")WebElement adminuserusername ;
	@FindBy(xpath="//input[@id='password']")WebElement adminuserpassword ;
	@FindBy(xpath="//select[@id='user_type']")WebElement adminuserusertype;
	@FindBy(xpath="//button[@name='Create']")WebElement adminuserssave ;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement adminuseralert;
	@FindBy(xpath="//body[@class='sidebar-mini layout-fixed sidebar-collapse']")WebElement alertmessagefornamealreadyexist;
	
	public AdminUserPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	public void adminUserMoreInfo()
	{
		adminusermoreinfo.click();
	}
	public void adminUserNew()
	{
		adminusernewbutton.click();
	}
	public void adminUserName(String usernamevalue)
	{
		adminuserusername.sendKeys(usernamevalue);
	}
	public void adminUserPassWord(String passwordvalue)
	{
		adminuserpassword.sendKeys(passwordvalue);
	}
	public void adminUserType()
	{
		//Select select = new Select(adminuserusertype);
		//select.selectByIndex(1);
		
		PageUtility pu=new PageUtility();
		pu.selectByIndex(adminuserusertype, 0);
		
	
	}
	public void adminUsersaveButton()
	{
		adminuserssave.click();
	}
	public boolean alertMessageLoaded()
	{
		return adminuseralert.isDisplayed();	
	}
	public boolean alertMessageForNameAlreadyExist()
	{
		return alertmessagefornamealreadyexist.isDisplayed();
	}
}
