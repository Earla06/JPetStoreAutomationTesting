package mainFunctionalities;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Fish_POM {
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
	public void fishModule(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]")).click();
	}
	public void scrollingpage(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)","");
		
	}
	public void screenshotpage(WebDriver driver) throws Exception{
		TakesScreenshot ss=(TakesScreenshot) driver;
		File src= ss.getScreenshotAs(OutputType.FILE);
		File des= new File("./Functionalities_ScreenShots/fishpage.jpg");
		FileUtils.copyFile(src,des);
		
	}
	public void selectAngelfish(WebDriver driver) 
	{
		driver.findElement(By.xpath("//a[@href='/actions/Catalog.action?viewProduct=&productId=FI-SW-01']")).click();
	}
	public void addCart(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-1']")).click();
	}
	public void quantityclear(WebDriver driver)
	{
			Actions actions=new Actions(driver);
			actions.click(driver.findElement(By.name("EST-1")))
			.keyDown(Keys.CONTROL)
			.sendKeys("a")
			.keyUp(Keys.CONTROL)
			.build()
			.perform();
		
	}
	
	public void enterQuantity(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@name='EST-1']")).sendKeys("2");
	}
	public void processedToCheckout(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[@href='/actions/Order.action?newOrderForm=']")).click();
	}

}
