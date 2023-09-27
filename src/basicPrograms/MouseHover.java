package basicPrograms;

import java.io.File;

import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saipr\\OneDrive\\Documents\\Automation Testing\\Eclipse Back up\\JPetStore_SeleniumProject\\JPetStore_Documents\\Drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		Thread.sleep(2000);
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
		String usn=JOptionPane.showInputDialog("Enter UserName");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usn);
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
		String pwd=JOptionPane.showInputDialog("Enter Password");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='signon']")).click();
		Thread.sleep(2000);
		//SmokeTesting
		driver.findElement(By.xpath("//img[@src='../images/sm_fish.gif']")).click();//clicking on Fish
		Thread.sleep(2000);
		driver.findElement(By.linkText("Return to Main Menu")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='../images/sm_dogs.gif']")).click();//clicking on Dogs
		Thread.sleep(2000);
		driver.findElement(By.linkText("Return to Main Menu")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='../images/sm_reptiles.gif']")).click();//clicking on Reptiles
		Thread.sleep(2000);
		driver.findElement(By.linkText("Return to Main Menu")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='../images/sm_cats.gif']")).click();//clicking on Cats
		Thread.sleep(2000);
		driver.findElement(By.linkText("Return to Main Menu")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='../images/sm_birds.gif']")).click();//clicking on Birds
		Thread.sleep(2000);
		driver.findElement(By.linkText("Return to Main Menu")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/actions/Account.action?editAccountForm=']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[]@src='../images/cart.gif'")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
