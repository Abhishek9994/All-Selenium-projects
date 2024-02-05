package JustPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataExtract {

	public Object[][] getdatafromexcel() throws EncryptedDocumentException, IOException {//Reading data from Excel
		//copy path of excel from src/main/resources
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\selenium_project\\src\\main\\resources\\DataText.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
	    Sheet sh = book.getSheet("Sheet1");//sheetname in Excel
	    
	      short cellsize = sh.getRow(0).getLastCellNum();//for coloum 
	      int rowcount = sh.getLastRowNum();//for row
	      Object [][] obj = new Object[rowcount][cellsize];
	      
	      
	      //Iterating both rows and coloumns
	      for (int i = 0; i < rowcount; i++) {
	    	  for (int j = 0; j < cellsize; j++) {
				obj[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
			}
			
		}
	      return obj;//Return obj for Dataprovider
	}
	
	
	
	
}
