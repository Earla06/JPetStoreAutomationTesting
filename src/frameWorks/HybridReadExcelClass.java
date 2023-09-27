package frameWorks;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class HybridReadExcelClass {
    public void readExcel(WebDriver driver) throws Exception {
        FileInputStream file = new FileInputStream("C:\\Users\\saipr\\OneDrive\\Documents\\Automation Testing\\poi\\poi-bin-5.1.0\\poi.xlsx");
        XSSFWorkbook w = new XSSFWorkbook(file);
        XSSFSheet s = w.getSheet("Hybrid");

        int rowSize = s.getLastRowNum();
        System.out.println("No of Rows:" + rowSize);
        
        // Create object of pom class >> Repository
        HybridOperationalClass oh = new HybridOperationalClass();

        for (int i = 1; i <= rowSize; i++) {
            String Username = s.getRow(i).getCell(1).getStringCellValue();
            String Password = s.getRow(i).getCell(2).getStringCellValue();
            System.out.println("Username: " + Username);
            System.out.println("Password: " + Password);

            try {
                for (int j = 1; j <= rowSize; j++) {
                    String key = s.getRow(j).getCell(0).getStringCellValue();
                    
                    if (key.equals("URL")) {
                        oh.urlJPetStore(driver);
                        System.out.println(key);
                        Thread.sleep(2000);
                    } else if (key.equals("MaximizeBrowser")) {
                        oh.maximizeBrowser(driver);
                        System.out.println(key);
                        Thread.sleep(2000);
                    } else if (key.equals("ClickonSignin")) {
                        oh.clickonSignIn(driver);
                        System.out.println(key);
                        Thread.sleep(2000);
                    } else if (key.equals("ActionUserName")) {
                        oh.actionUserName(driver);
                        System.out.println(key);
                        Thread.sleep(2000);
                    } else if (key.equals("EnterUserName")) {
                        oh.enteruserName(driver, Username);
                        System.out.println(key);
                        Thread.sleep(2000);
                    } else if (key.equals("ActionPassword")) {
                        oh.actionPassword(driver);
                        System.out.println(key);
                        Thread.sleep(2000);
                    } else if (key.equals("EnterPassword")) {
                        oh.enterPassword(driver, Password);
                        System.out.println(key);
                        Thread.sleep(2000);
                    } else if (key.equals("ClickonLoginButton")) {
                        oh.clickLoginButton(driver);
                        System.out.println(key);
                        Thread.sleep(2000);
                    } else if (key.equals("ClickonLogoutButton")) {
                        oh.clickLogoutButton(driver);
                        System.out.println(key);
                        Thread.sleep(2000);
                    }
                }
                System.out.println("Valid Credentials");
                System.out.println("");
                s.getRow(i).createCell(3).setCellValue("Valid Credentials");
            } catch (Exception e) {
                System.out.println("Invalid Credentials");
                System.out.println("");
                s.getRow(i).createCell(3).setCellValue("Invalid Credentials");
            }
        }
        FileOutputStream out = new FileOutputStream("C:\\Users\\saipr\\OneDrive\\Documents\\Automation Testing\\poi\\poi-bin-5.1.0\\poi.xlsx");
        w.write(out);

        oh.closedriver(driver);
    }
}