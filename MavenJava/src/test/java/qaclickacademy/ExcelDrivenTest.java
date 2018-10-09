package qaclickacademy;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExcelDrivenTest {
	
	@Test
	 public void ReadData() throws IOException
	 {
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFCell cell;
		 // Import excel sheet.
		 File src=new File("Test Data.xlsx");
		 
		 // Load the file.
		 FileInputStream finput = new FileInputStream(src);
		 
		 // Load he workbook.
		workbook = new XSSFWorkbook(finput);
		 
	     // Load the sheet in which data is stored.
		 sheet= workbook.getSheetAt(0);
		 System.out.println(sheet);
		 
		 Iterator<Row> rows = sheet.iterator();
		 Row row = rows.next();
		 int colNum = row.getLastCellNum();
	     int rowNum = sheet.getLastRowNum();
		 
		 while (rows.hasNext())
		 {
			 Row row1 = rows.next();
			 if(row1.getRowNum()==0)
			       continue;
			 
			 Iterator<Cell> cellIterator = row1.cellIterator();
			 
			 while(cellIterator.hasNext())
			 {
				 Cell cells = cellIterator.next();
				 System.out.println(cells.toString());
				 
			 }
			 System.out.println();
			 
		 }
		 workbook.close();
		 finput.close();
			 
//				 for(int i=1; i &lt; sheet.getLastRowNum(); i++)
//		 {
//			 // Import data for Email.
//			 cell = sheet.getRow(i).getCell(1);
//			 cell.setCellType(Cell.CELL_TYPE_STRING);
//			 driver.findElement(By.id("login-email")).sendKeys(cell.getStringCellValue());
//			 
//			 // Import data for password.
//			 cell = sheet.getRow(i).getCell(2);
//			 cell.setCellType(Cell.CELL_TYPE_STRING);
//			 driver.findElement(By.id("login-password")).sendKeys(cell.getStringCellValue());
//			   		
//		 }
	  } 

	}
