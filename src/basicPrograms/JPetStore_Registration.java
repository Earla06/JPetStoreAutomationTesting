package basicPrograms;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JPetStore_Registration {

	public static void main(String[] args) throws Exception{
		Select s;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\saipr\\OneDrive\\Documents\\Automation Testing\\Eclipse Back up\\JPetStore_SeleniumProject\\JPetStore_Documents\\Drivers\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Thread.sleep(2000);
	driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Sign In")).click();
	Thread.sleep(2000);
	//Scrolling By pixel
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,200)","");
	driver.findElement(By.xpath("//a[@href='/actions/Account.action?newAccountForm=']")).click();//Register
	Thread.sleep(2000);
	//Scrolling By pixel
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,200)","");
	Thread.sleep(2000);
	//User Information
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prasanna");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Prashu@12");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("Prashu@12");
	Thread.sleep(2000);
	//User Information
	driver.findElement(By.xpath("//input[@name='account.firstName']")).sendKeys("prasanna");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='account.lastName']")).sendKeys("Earla");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='account.email']")).sendKeys("prasannaachinni06@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='account.phone']")).sendKeys("7338518358");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='account.address1']")).sendKeys("2-21/B,Mahi Marg");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='account.address2']")).sendKeys("2-21/B,VC Colony");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='account.city']")).sendKeys("Sedam");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='account.state']")).sendKeys("Karnataka");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='account.zip']")).sendKeys("585222");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='account.country']")).sendKeys("India");
	Thread.sleep(2000);
	//Profile Information
	WebElement we=driver.findElement(By.xpath("//select[@name='account.languagePreference']"));
	Select s1= new Select(we);
	s1.selectByIndex(1);
	Thread.sleep(2000);
	WebElement we1=driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']"));
	Select s2= new Select(we1);
	s2.selectByValue("CATS");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='account.listOption']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='account.bannerOption']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Save Account Information']")).click();
	Thread.sleep(2000);
	JavascriptExecutor js3=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)","");
	Thread.sleep(2000);
	TakesScreenshot ss=(TakesScreenshot) driver;
	File sr= ss.getScreenshotAs(OutputType.FILE);
	File d= new File("./JPetStoreScreenShots/img4.jpg");
	FileUtils.copyFile(sr,d);
	Thread.sleep(2000);
	driver.close();
	

	
	}

}
