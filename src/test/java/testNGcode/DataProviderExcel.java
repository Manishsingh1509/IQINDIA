package testNGcode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class DataProviderExcel {
	@DataProvider(name="Excel")
	  public Object[][] excelcode() throws IOException {
		  String path = "C:\\Users\\Manish\\OneDrive\\Desktop\\TestNG.xlsx";
		  File f = new File(path);
		  FileInputStream fis = new FileInputStream(f);
		  XSSFWorkbook wb = new XSSFWorkbook(fis);
		  XSSFSheet sh = wb.getSheet("random");
		  int row = sh.getLastRowNum();    // it will give the total count of row of data from indexing 0.
		  System.out.println(row);
		  int col = sh.getRow(0).getLastCellNum(); //it will give the total count of column from 1 indexing
		  System.out.println(col);
		  Object obj [][] = new Object[row][col];
		  for(int r = 0;r<row;r++) {
	    	  XSSFRow rw = sh.getRow(r+1);
	    	  for(int c =0;c<col;c++) {
	    		 XSSFCell cell = rw.getCell(c);
	    		 CellType cellType = cell.getCellType();
	    		 
	    		 switch(cellType) {
	    		 case STRING:
	    			 obj[r][c]=cell.getStringCellValue();
	    			 
	    			 break;
	    		 case NUMERIC:
//	    			 System.out.println(cell.getNumericCellValue());
	    			 obj[r][c]=Integer.toString((int)cell.getNumericCellValue());
	    			 break;
	    		 case BOOLEAN:
	    			 obj[r][c]=cell.getBooleanCellValue();
	    			 
	    			 break;
	    		 default:
	    			 System.out.println("incorrect data");
	    		 }
	    	  }
	      }
		  
/*   ########   OR  #################### */
		  
//		  for(int r = 0;r<row;r++) {
//			  XSSFRow rw = sh.getRow(r+1);
//			  for(int c = 0;c<col;c++) {
//				  XSSFCell cell = rw.getCell(c);
//				  CellType celltype = cell.getCellType();
//				  
//				  DataFormatter df = new DataFormatter();
//				  
//				  obj[r][c]=df.formatCellValue(sh.getRow(r).getCell(c));
//			  }
//		  }
		  
	      fis.close();
		  wb.close();
		  return obj;
}
}
