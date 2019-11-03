package pois;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		 Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		 Cell c1 = wb.getSheet("Sheet1").getRow(0).getCell(0);
		 String un = c1.getStringCellValue();
		 System.out.println(un);
		   
		 //Cell c2 = wb.getSheet("Sheet1").getRow(1).getCell(1);--> we wiil get java.lang.NullPointerException
		 Cell c2 = wb.getSheet("Sheet1").getRow(0).getCell(1);
		 String pw = c2.getStringCellValue();
		 System.out.println(pw);
		   
		
	}

}
