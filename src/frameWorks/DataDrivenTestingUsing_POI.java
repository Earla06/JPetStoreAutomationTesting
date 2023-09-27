package frameWorks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DataDrivenTestingUsing_POI {
	public void maximizebrowser(WebDriver driver) {
		driver.manage().window().maximize();
		
	}
	public void deleteAllCookies(WebDriver driver) {
		driver.manage().deleteAllCookies();
	}
	public void urlJPetStore(WebDriver driver) {
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}
	public void clickonSignIn(WebDriver driver) {
		driver.findElement(By.linkText("Sign In")).click();
	}
	public void actionUserName(WebDriver driver) {
		Actions actions=new Actions(driver);
		actions.click(driver.findElement(By.name("username")))
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.build()
		.perform();
		
	}
	public void enteruserName(WebDriver driver,String usn) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usn);
	}
	public void actionPassword(WebDriver driver) {
		Actions action=new Actions(driver);
		action.click(driver.findElement(By.name("password")))
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.build()
		.perform();
	}
	public void enterPassword(WebDriver driver,String pwd) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	}
	public void clickLoginButton(WebDriver driver) {
		driver.findElement(By.xpath("//input[@name='signon']")).click();
	}
	public void scrolling(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)", "");
		
	}
	public void clickLogoutButton(WebDriver driver) {
		driver.findElement(By.linkText("Sign Out")).click();
	}
	public void screenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot ss=(TakesScreenshot) driver;
		File src= ss.getScreenshotAs(OutputType.FILE);
		File des= new File("./JPetStoreScreenShots/img5.jpg");
		FileUtils.copyFile(src,des);
	}
	
	public void closedriver(WebDriver driver)
	{
		driver.close();
	}

}

