package jPetStoreSigninUsing_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginandLogut_MainClass {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipr\\OneDrive\\Documents\\Automation Testing\\Eclipse Back up\\JPetStore_SeleniumProject\\JPetStore_Documents\\Drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		pom_LoginandLogut p=new pom_LoginandLogut();
		Thread.sleep(2000);
		p.maximizeBrowser(driver);	
		Thread.sleep(2000);
		p.deleteAllCookies(driver);
		Thread.sleep(2000);
		p.urlJPetStore(driver);
		Thread.sleep(2000);
		p.clickonSignIn(driver);
		Thread.sleep(2000);
		p.actionUserName(driver);
		Thread.sleep(2000);
		p.enteruserName(driver, "Saiprasanna");
		Thread.sleep(2000);
		p.actionPassword(driver);
		Thread.sleep(2000);
		p.enterPassword(driver, "Prashu@123");
		Thread.sleep(2000);
		p.clickLoginButton(driver);
		Thread.sleep(2000);
		p.clickLogoutButton(driver);
		Thread.sleep(2000);
		p.closedriver(driver);
		
		

	}

}
