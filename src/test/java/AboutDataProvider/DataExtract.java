package AboutDataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataExtract {

	public Object[][] getdatafromexcel() throws EncryptedDocumentException, IOException {
		// getting data from excel and storing it
		
		FileInputStream fis =  new FileInputStream("C:\\Users\\admin\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\selenium_project\\src\\main\\resources\\DataText.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		// mention sheet name
	 Sheet sh = book.getSheet("Sheet1");
	 //getting last row and last col
	 
         short cellsize = sh.getRow(0).getLastCellNum();//for col
         int rowsize = sh.getLastRowNum();//for row
         
         Object [][] obj = new Object[rowsize][cellsize];
         
         for (int i = 0; i < rowsize; i++) {
			for (int j = 0; j < cellsize; j++) {
				
				obj[i][j] = sh.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return obj;
		
	}
	 
	
	
}
