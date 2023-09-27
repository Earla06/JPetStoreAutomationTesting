package jPetStoreSigninUsing_pom;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageObjectModel_JPetStoreRegister {
	
	public void maximizeBroswer(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void url(WebDriver driver)
	{
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}
	public void clickOnSignUp(WebDriver driver)
	{
		driver.findElement(By.linkText("Sign In")).click();
	}
	public void clickOnRegister(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[@href='/actions/Account.action?newAccountForm=']")).click();
	}
	public void enterUserID(WebDriver driver,String usn)
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usn);
	}
	public void enterNewPassword(WebDriver driver,String pwd)
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	}
	public void enterConfirmpassword(WebDriver driver,String cpwd)
	{
		driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys(cpwd);
	}
	public void enterFirstName(WebDriver driver,String fname)
	{
		driver.findElement(By.xpath("//input[@name='account.firstName']")).sendKeys(fname);
	}
	public void enterLastName(WebDriver driver,String lname)
	{
		driver.findElement(By.xpath("//input[@name='account.lastName']")).sendKeys(lname);
	}
	public void enterEmail(WebDriver driver,String email)
	{
		driver.findElement(By.xpath("//input[@name='account.email']")).sendKeys(email);
	}
	public void enterPhoneNumber(WebDriver driver,String phone)
	{
		driver.findElement(By.xpath("//input[@name='account.phone']")).sendKeys(phone);
	}
	public void enterAddress1(WebDriver driver,String ad1)
	{
		driver.findElement(By.xpath("//input[@name='account.address1']")).sendKeys(ad1);
	}
	public void enterAddress2(WebDriver driver,String ad2)
	{
		driver.findElement(By.xpath("//input[@name='account.address2']")).sendKeys(ad2);
	}
	public void enterCity(WebDriver driver,String city)
	{
		driver.findElement(By.xpath("//input[@name='account.city']")).sendKeys(city);
	}
	public void enterState(WebDriver driver,String state)
	{
		driver.findElement(By.xpath("//input[@name='account.state']")).sendKeys(state);
	}
	public void enterZip(WebDriver driver,String zip)
	{
		driver.findElement(By.xpath("//input[@name='account.zip']")).sendKeys(zip);
	}
	public void enterCountry(WebDriver driver,String country)
	{
		driver.findElement(By.xpath("//input[@name='account.country']")).sendKeys(country);
	}
	public void selectLanguagePreference(WebDriver driver)
	{
		WebElement we=driver.findElement(By.xpath("//select[@name='account.languagePreference']"));
		Select s1= new Select(we);
		s1.selectByIndex(1);
	}
	public void selectFavouriteCategory(WebDriver driver)
	{
		WebElement we1=driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']"));
		Select s2= new Select(we1);
		s2.selectByValue("CATS");
	}
	public void clickCheckBox1(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@name='account.listOption']")).click();
	}
	public void clickCheckBox2(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@name='account.bannerOption']")).click();
	}
	public void screenshots(WebDriver driver) throws IOException
	{
		TakesScreenshot ss=(TakesScreenshot) driver;
		File src= ss.getScreenshotAs(OutputType.FILE);
		File des= new File("./JPetStoreScreenShots/img5.jpg");
		FileUtils.copyFile(src,des);
	}
	public void clickSaveAccountInformationButton(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@name='account.listOption']")).click();
	}

	public void screenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot ss=(TakesScreenshot) driver;
		File sr= ss.getScreenshotAs(OutputType.FILE);
		File d= new File("./JPetStoreScreenShots/img6.jpg");
		FileUtils.copyFile(sr,d);
	}
	public void closeBrowser(WebDriver driver)
	{
		driver.close();
	}
	

}
