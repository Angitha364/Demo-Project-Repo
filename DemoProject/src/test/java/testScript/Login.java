package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base {
	
	@Test
	public void login()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String u="admin";
		String p="admin";
		
WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
username.sendKeys(u);
WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
password.sendKeys(p);
WebElement submit=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
submit.click();
//Assert class //Assertion for validation
WebElement dashboard=driver.findElement(By.xpath("//p[text()='Dashboard']"));

boolean ishomepageloaded=dashboard.isDisplayed();
Assert.assertTrue(ishomepageloaded);
	}
	@Test
	public void correctUserNameWrongPassword()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String u="admin";
		String p="Aadmin";
		WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys(u);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(p);
		WebElement submit=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
		submit.click();
		WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));

		boolean alertmessageloaded=alert.isDisplayed();
		Assert.assertFalse(alertmessageloaded);
	}
	@Test
	public void wrongUserNameCorrectPassword()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String u="Aadmin";
		String p="admin";
		WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys(u);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(p);
		WebElement submit=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
		submit.click();
		WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));

		boolean alertmessageloaded=alert.isDisplayed();
		Assert.assertFalse(alertmessageloaded);
	}
	@Test
	public void wrongUserNameWrongPassword()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String u="Aadmin";
		String p="Aadmin";
		WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys(u);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(p);
		WebElement submit=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
		submit.click();
		WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));

		boolean alertmessageloaded=alert.isDisplayed();
		Assert.assertFalse(alertmessageloaded);
	}
}