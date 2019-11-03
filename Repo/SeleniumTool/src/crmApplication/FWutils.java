package crmApplication;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FWutils implements IAutoConstant
{
	public static String XL_Data_Read(String XL_Data_Path,String S1_name,int r,int c)
	{
		String s="";
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(XL_Data_Path));
			s = wb.getSheet(S1_name).getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
			//System.out.println(e);
		}
		return s;
	}

}
