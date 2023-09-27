package frameWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT_UsingTestNG
{
	WebDriver driver;


	@BeforeTest
	public void SetUp() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipr\\OneDrive\\Documents\\Automation Testing\\Eclipse Back up\\JPetStore_SeleniumProject\\JPetStore_Documents\\Drivers\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@Test(dataProvider = "dp")
	public void f(String usn, String pwd) throws Exception 
	{

		DataDrivenTestingUsing_POI obj=new DataDrivenTestingUsing_POI();

		obj.maximizebrowser(driver);
		Thread.sleep(2000);
		obj.deleteAllCookies(driver);
		Thread.sleep(2000);
		obj.urlJPetStore(driver);
		Thread.sleep(2000);
		obj.clickonSignIn(driver);
		Thread.sleep(2000);
		obj.actionUserName(driver);
		Thread.sleep(2000);
		obj.enteruserName(driver,usn);
		Thread.sleep(2000);
		obj.actionPassword(driver);
		Thread.sleep(2000);
		obj.enterPassword(driver, pwd);
		Thread.sleep(2000);
		obj.clickLoginButton(driver);
		Thread.sleep(2000);
		obj.clickLogoutButton(driver);
		Thread.sleep(2000);


	}


	@DataProvider
	public Object[][] dp() 
	{
		return new Object[][] 
				{
			new Object[] { "Saiprasanna", "Prashu@123"},
			new Object[] {"Saiprasa2nna", "Prashu@1223"},
			new Object[] { "Saiprasannna", "Prashu@123"},
			new Object[] { "Saiprasanna", "Prashu@123"},
			new Object[] { "Saiprasanna", "Prashu@1234"},

				};
	}


	@AfterTest
	public void tearUp() 
	{
		driver.close();
	}

}


