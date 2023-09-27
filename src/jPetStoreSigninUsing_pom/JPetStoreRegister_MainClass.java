package jPetStoreSigninUsing_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JPetStoreRegister_MainClass {

	public static void main(String[] args) throws Exception{
		// Launching browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saipr\\OneDrive\\Documents\\Automation Testing\\Eclipse Back up\\JPetStore_SeleniumProject\\JPetStore_Documents\\Drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Creating an Object 
		PageObjectModel_JPetStoreRegister jp=new PageObjectModel_JPetStoreRegister();
		jp.maximizeBroswer(driver);
		Thread.sleep(2000);
		jp.url(driver);
		Thread.sleep(2000);
		jp.clickOnSignUp(driver);
		Thread.sleep(2000);
		jp.clickOnRegister(driver);
		Thread.sleep(2000);
		jp.enterUserID(driver, "Sanjana");
		Thread.sleep(2000);
		jp.enterNewPassword(driver, "Prashu@123");
		Thread.sleep(2000);
		jp.enterConfirmpassword(driver, "Prashu@123");
		Thread.sleep(2000);
		jp.enterFirstName(driver, "Sanjana");
		Thread.sleep(2000);
		jp.enterLastName(driver, "Earla");
		Thread.sleep(2000);
		jp.enterEmail(driver,"sanjana21@gmail.com");
		Thread.sleep(2000);
		jp.enterPhoneNumber(driver, "9160507650");
		Thread.sleep(2000);
		jp.enterAddress1(driver,"2-21/B");
		Thread.sleep(2000);
		jp.enterAddress2(driver,"2-21/C");
		Thread.sleep(2000);
		jp.enterCity(driver,"Karimnagar");
		Thread.sleep(2000);
		jp.enterState(driver,"Telanagana");
		Thread.sleep(2000);
		jp.enterZip(driver,"585222");
		Thread.sleep(2000);
		jp.enterCountry(driver,"India");
		Thread.sleep(2000);
		jp.selectLanguagePreference(driver);
		Thread.sleep(2000);
		jp.selectFavouriteCategory(driver);
		Thread.sleep(2000);
		jp.clickCheckBox1(driver);
		Thread.sleep(2000);
		jp.clickCheckBox2(driver);
		Thread.sleep(5000);
		jp.screenshots(driver);
		Thread.sleep(2000);
		jp.clickSaveAccountInformationButton(driver);
		Thread.sleep(2000);
		jp.screenshot(driver);
		Thread.sleep(2000);
		jp.closeBrowser(driver);
		
		
		
		
		
		

	}

}
