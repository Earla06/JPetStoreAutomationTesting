package frameWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HybridOperationalClass 
{
	public void urlJPetStore(WebDriver driver) 
	{
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}
	public void maximizeBrowser(WebDriver driver) 
	{
		driver.manage().window().maximize();
	}
	public void clickonSignIn(WebDriver driver)
	{
		driver.findElement(By.linkText("Sign In")).click();
	}
	public void actionUserName(WebDriver driver) 
	{
		Actions actions=new Actions(driver);
		actions.click(driver.findElement(By.name("username")))
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.build()
		.perform();
		
	}
	public void enteruserName(WebDriver driver,String usn) 
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usn);
	}
	public void actionPassword(WebDriver driver) 
	{
		Actions action=new Actions(driver);
		action.click(driver.findElement(By.name("password")))
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.build()
		.perform();
	}
	public void enterPassword(WebDriver driver,String pwd)
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	}
	public void clickLoginButton(WebDriver driver) {
		driver.findElement(By.xpath("//input[@name='signon']")).click();
	}
	public void clickLogoutButton(WebDriver driver) {
		driver.findElement(By.linkText("Sign Out")).click();
	}
	public void closedriver(WebDriver driver)
	{
		driver.close();
	}

}