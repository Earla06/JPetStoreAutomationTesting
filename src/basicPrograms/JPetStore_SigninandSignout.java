package basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JPetStore_SigninandSignout {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saipr\\OneDrive\\Documents\\Automation Testing\\Eclipse Back up\\JPetStore_SeleniumProject\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.get("https://jpetstore.aspectran.com/catalog/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/div[2]/div/a[2]")).click();
		Thread.sleep(2000);
		Actions actions=new Actions(driver);
		actions.click(driver.findElement(By.name("username")))
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.build()
		.perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Saiprasanna");
		Thread.sleep(2000);
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
		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/form/div/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/div[2]/div/a[3]")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}