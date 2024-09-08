package testNGcode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class WorkingwithExcel {
 

@Test
  public void excelcode() throws IOException {
	  String path = "C:\\Users\\Manish\\OneDrive\\Desktop\\TestNG.xlsx";
	  File f = new File(path);
	  FileInputStream fis = new FileInputStream(f);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sh = wb.getSheet("random");
	  int row = sh.getLastRowNum();    // it will give the total count of row of data from indexing 0.
	  System.out.println(row);
	  int col = sh.getRow(0).getLastCellNum(); //it will give the total count of column from 1 indexing
	  System.out.println(col);
	 
//	  for(int r = 1 ;r<=row;r++) {
//		  for(int c = 0;c<col;c++) {
//			  System.out.println(sh.getRow(r).getCell(c).getStringCellValue());
//		  }
//	  }
	  
/*  ##############  OR ################# */
	  
	  for(int r = 1;r<=row;r++) {
		  for(int c = 0;c<col;c++) {
			  DataFormatter df = new DataFormatter();
			  String value = df.formatCellValue(sh.getRow(r).getCell(c));
			  System.out.println(value);
		  }
		  System.out.println();
	  }
	  


 /* ###########  Read file by using switch case  ##################### */

//      for(int r = 1;r<=row;r++) {
//    	  XSSFRow rw = sh.getRow(r);
//    	  for(int c =0;c<col;c++) {
//    		 XSSFCell cell = rw.getCell(c);
//    		 CellType cellType = cell.getCellType();
//    		 
//    		 switch(cellType) {
//    		 case STRING:
//    			 System.out.println(cell.getStringCellValue());
//    			 
//    			 break;
//    		 case NUMERIC:
////    			 System.out.println(cell.getNumericCellValue());
//    			 System.out.println(Integer.toString((int)cell.getNumericCellValue()));
//    			 break;
//    		 case BOOLEAN:
//    			 System.out.println(cell.getBooleanCellValue());
//    			 
//    			 break;
//    		 default:
//    			 System.out.println("incorrect data");
//    		 }
//    	  }
//      }
      fis.close();
	  wb.close();
  }
}
