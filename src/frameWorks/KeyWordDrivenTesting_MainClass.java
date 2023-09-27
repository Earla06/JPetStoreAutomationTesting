package frameWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyWordDrivenTesting_MainClass {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipr\\OneDrive\\Documents\\Automation Testing\\Eclipse Back up\\JPetStore_SeleniumProject\\JPetStore_Documents\\Drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Cresting object for ReadExcelClass 
		KeyWordDrivenTesting_ReadExcelClass kd=new KeyWordDrivenTesting_ReadExcelClass();
		kd.readExcel(driver);
		
	}

}
