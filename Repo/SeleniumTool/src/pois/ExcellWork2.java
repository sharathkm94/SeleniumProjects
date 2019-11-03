package pois;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellWork2 
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		Workbook wb=WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
//		Cell c1 = wb.getSheet("sheet2").getRow(0).getCell(0);
//		String s = c1.getStringCellValue();
//		System.out.println(s);
		
		String un = wb.getSheet("sheet2").getRow(0).getCell(0).toString();
		System.out.println(un);
		String pw = wb.getSheet("sheet2").getRow(0).getCell(1).toString();
		System.out.println(pw);
	}

}
