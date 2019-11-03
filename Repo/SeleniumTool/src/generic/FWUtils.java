package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public  abstract class FWUtils  implements IAutoConstant
{
	public static String read_XL_Data(String path,String sheet,int r,int c)
	{
		String s="";
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			s=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
	}
	
	public static int xlrow_Count(String path,String sheet)
	{
		int s=0;
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			s=wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
	}

}
