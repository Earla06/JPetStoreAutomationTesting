package basicPrograms;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageTitle_Verfication {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saipr\\OneDrive\\Documents\\Automation Testing\\Eclipse Back up\\JPetStore_SeleniumProject\\JPetStore_Documents\\Drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		Thread.sleep(2000);
		String acceptedTitle="JPetStore Demo";
		String actualTitle=driver.getTitle();
		
		if(actualTitle.equals(acceptedTitle))
		{
		    System.out.println("Title Verification passed");
		}
		else
		{
			System.out.println("Title Verification Failed");
		}
		driver.close();
		
	}

}
