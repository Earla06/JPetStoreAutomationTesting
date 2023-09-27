package mainFunctionalities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fish_Main 
{
	WebDriver driver;
	@BeforeTest
	public void beforeTest() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saipr\\OneDrive\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");


	}
	@Test
	public void fishModule() throws Exception 
	{
		Fish_POM fp=new Fish_POM();
		fp.urlJPetStore(driver);
		Thread.sleep(2000);
		fp.clickonSignIn(driver);
		Thread.sleep(2000);
		fp.actionUserName(driver);
		Thread.sleep(2000);
		fp.enteruserName(driver,"Saiprasanna");
		Thread.sleep(2000);
		fp.actionPassword(driver);
		Thread.sleep(2000);
		fp.enterPassword(driver,"Prashu@123");
		Thread.sleep(2000);
		fp.clickLoginButton(driver);
		Thread.sleep(2000);
		fp.fishModule(driver);
		Thread.sleep(2000);
		fp.scrollingpage(driver);
		Thread.sleep(2000);
		fp.screenshotpage(driver);
		Thread.sleep(2000);
		fp.selectAngelfish(driver);
		Thread.sleep(2000);
		fp.addCart(driver);
		Thread.sleep(2000);
		fp.quantityclear(driver);
		Thread.sleep(2000);
		fp.enterQuantity(driver);
		Thread.sleep(2000);
		fp.processedToCheckout(driver);
		Thread.sleep(2000);
		TakesScreenshot ss=(TakesScreenshot) driver;
		File sr= ss.getScreenshotAs(OutputType.FILE);
		File d= new File("./Functionalities_ScreenShots/paymentdetails.jpg");
		FileUtils.copyFile(sr,d);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='newOrder']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/actions/Order.action?newOrder=&confirmed=true']")).click();
		TakesScreenshot s=(TakesScreenshot) driver;
		File src= ss.getScreenshotAs(OutputType.FILE);
		File des= new File("./Functionalities_ScreenShots/paymentdetails.jpg");
		FileUtils.copyFile(src,des);
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)", "");
		TakesScreenshot s1=(TakesScreenshot) driver;
		File source= ss.getScreenshotAs(OutputType.FILE);
		File destination= new File("./Functionalities_ScreenShots/paymentdetails.jpg");
		FileUtils.copyFile(source,destination);



	}


	@AfterTest
	public void afterTest() 
	{
		driver.close();

	}

}
