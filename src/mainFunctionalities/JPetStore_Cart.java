package mainFunctionalities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class JPetStore_Cart {
	WebDriver driver;
	@BeforeTest
	public void beforeTest()throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saipr\\OneDrive\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		Thread.sleep(2000);
	}
	@Test
	public void addCrat() throws Exception
	{
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		Actions actions=new Actions(driver);
		actions.click(driver.findElement(By.name("username")))
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.build()
		.perform();
		Thread.sleep(2000);
		//Using JOptionPane
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Saiprasanna");
		Thread.sleep(2000);
		//Action Class To Handle Mouse and KeyBoard Controls
		Actions action=new Actions(driver);
		action.click(driver.findElement(By.name("password")))
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.build()
		.perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Prashu@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='signon']")).click();
		driver.findElement(By.xpath("//img[@src='../images/sm_cats.gif']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/actions/Catalog.action?viewProduct=&productId=FL-DSH-01']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-15']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Return to Main Menu")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("img_cart")).click();
		Thread.sleep(2000);
		TakesScreenshot ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File des= new File("./Functionalities_ScreenShots/addcart.png");
		FileUtils.copyFile(src, des);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(2000);
	
		}
	@AfterTest
	public void afterTest() 
	{
		driver.close();
	}

}
