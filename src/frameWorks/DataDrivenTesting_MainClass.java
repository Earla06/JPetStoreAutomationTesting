package frameWorks;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import jPetStoreSigninUsing_pom.pom_LoginandLogut;

public class DataDrivenTesting_MainClass {

    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("C:\\Users\\saipr\\OneDrive\\Documents\\Automation Testing\\poi\\poi-bin-5.1.0\\PoiFrame.xlsx");
        XSSFWorkbook w = new XSSFWorkbook(file);
        XSSFSheet s = w.getSheet("JPetStore_DataDriven");
        int rowsize = s.getLastRowNum();
        System.out.println("No of Credentials: " + rowsize);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saipr\\OneDrive\\Documents\\Automation Testing\\Eclipse Back up\\JPetStore_SeleniumProject\\JPetStore_Documents\\Drivers\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        for (int i = 1; i <= rowsize; i++) {
            // Create a new instance of POM class for each iteration
            DataDrivenTestingUsing_POI d = new DataDrivenTestingUsing_POI();
            String Username = s.getRow(i).getCell(0).getStringCellValue();
            String password = s.getRow(i).getCell(1).getStringCellValue();
            System.out.println(Username + "\t\t" + password);
            try {
                d.maximizebrowser(driver);
                Thread.sleep(2000);
                d.urlJPetStore(driver);
                Thread.sleep(2000);
                d.deleteAllCookies(driver);
                Thread.sleep(2000);
                d.clickonSignIn(driver);
                Thread.sleep(2000);
                d.scrolling(driver);
                Thread.sleep(2000);
                d.actionUserName(driver);
                Thread.sleep(2000);
                d.enteruserName(driver, Username);
                Thread.sleep(2000);
                d.actionPassword(driver);
                Thread.sleep(2000);
                d.enterPassword(driver, password);
                Thread.sleep(2000);
                d.scrolling(driver);
                Thread.sleep(2000);
                d.clickLoginButton(driver);
                Thread.sleep(2000);
                d.scrolling(driver);
                Thread.sleep(5000);
                d.screenshot(driver);
                Thread.sleep(5000);
                d.clickLogoutButton(driver);
                Thread.sleep(2000);
                d.screenshot(driver);
                Thread.sleep(2000);
                System.out.println("Valid Credentials");
                s.getRow(i).createCell(2).setCellValue("Valid Credentials");
            } 
            catch (Exception e)
            {
                System.out.println("Invalid Credentials");
                s.getRow(i).createCell(2).setCellValue("Invalid Credentials");
            }
        }

        FileOutputStream out = new FileOutputStream("C:\\Users\\saipr\\OneDrive\\Documents\\Automation Testing\\poi\\poi-bin-5.1.0\\PoiFrame.xlsx");
        w.write(out);
        driver.close();
    }
}