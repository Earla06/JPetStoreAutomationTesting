package frameWorks;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class KeyWordDrivenTesting_ReadExcelClass {
	public void readExcel(WebDriver driver) throws Exception{
		FileInputStream file=new FileInputStream("C:\\Users\\saipr\\OneDrive\\Documents\\Automation Testing\\poi\\poi-bin-5.1.0\\PoiFrame.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(file);
		XSSFSheet s=w.getSheet("JPetStore_KeyWordDriven");

		int rowSize=s.getLastRowNum();
		System.out.println("No of KeyWords:"+rowSize);
		KeyWordDrivenTesting_OperationalClass o=new KeyWordDrivenTesting_OperationalClass();

		for(int i=1;i<=rowSize;i++)
		{
			String key=s.getRow(i).getCell(0).getStringCellValue();
			System.out.println(key);

			if(key.equals("MaximizeBrowser"))
			{
				o.maximizeBrowser(driver);
				Thread.sleep(2000);
			}
			else if(key.equals("DeleteAllCookies"))
			{
				o.deleteAllCookies(driver);
				Thread.sleep(2000);
			}

			else if(key.equals("URL"))
			{
				o.urlJPetStore(driver);
				Thread.sleep(2000);
			}
			else if(key.equals("ClickonSignin"))
			{
				o.clickonSignIn(driver);
			}
			else if(key.equals("ActionUserName"))
			{
				o.actionUserName(driver);
				Thread.sleep(2000);
			}
			else if(key.equals("EnterUserName"))
			{
				o.enteruserName(driver, "Saiprasanna");
				Thread.sleep(2000);
			}
			else if(key.equals("ActionPassword"))
			{
				o.actionPassword(driver);
				Thread.sleep(2000);
			}
			else if(key.equals("EnterPassword"))
			{
				o.enterPassword(driver,"Prashu@123");
				Thread.sleep(2000);
			}
			else if(key.equals("ClickonLoginButton"))
			{
				o.clickLoginButton(driver);
				Thread.sleep(2000);
			}
			else if(key.equals("ClickonLogoutButton"))
			{
				o.clickLogoutButton(driver);
				Thread.sleep(2000);
			}
			else if(key.equals("CloseBrowser"))
			{
				o.closedriver(driver);
				Thread.sleep(2000);
			}


		}

	}

}
