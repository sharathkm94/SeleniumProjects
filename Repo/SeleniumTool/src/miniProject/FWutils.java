package miniProject;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FWutils implements IAutoconstant
{
	public static void verifyPage(WebDriver driver,String eTitle) 
	{
		WebDriverWait wait = new WebDriverWait(driver,ETO);
		wait.until(ExpectedConditions.titleContains(eTitle));
		String aTitle = driver.getTitle();
		if(aTitle.equals(eTitle))
		{
			System.out.println("Expected page is displayed");
		}
		else
		{
			System.out.println("Expected page is not displayed");
		}
	}
	
	public static String read_XL_Data(String path,String sheet,int r,int c)
	{
		String s="";
		try
		{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		s = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch (Exception e) 
		{
			//e.printStackTrace();
		}
		return s;
	}
	public static int XL_RowCount(String path,String sheet)
	{
		int s=0;
		try
		{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		s = wb.getSheet(sheet).getLastRowNum();
		}
		catch (Exception e) 
		{
			//e.printStackTrace();
		}
		return s;
	}

}

