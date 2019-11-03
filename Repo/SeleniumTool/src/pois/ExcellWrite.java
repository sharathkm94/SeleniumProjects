package pois;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcellWrite 
{
		@Test
		public static  void test() throws FileNotFoundException, IOException
		{
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		wb.getSheet("sheet1").createRow(1).createCell(0).setCellValue("qsp");
		
		wb.write(new FileOutputStream("./data/input.xlxs"));
		}

}
