package Day5;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dataDriven {

	WebDriver driver;
	
	  @BeforeTest
		public void FirstStep() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
		     driver.get("https://the-internet.herokuapp.com/login");
		     driver.manage().window().maximize();
			}
	 
	  @Test
	  public void LogInTest() throws EncryptedDocumentException, IOException {
		  
		  // Declaring locator 
		  WebElement username = driver.findElement(By.cssSelector("#username"));
		  WebElement password=driver.findElement(By.cssSelector("input#password"));
		  
		  
		  FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\selenium_project\\src\\main\\resources\\Book1.xlsx");
		  
		  
		  //creating workbook
		  
		  Workbook book = WorkbookFactory.create(fis);
		  
		  
		 
	      //For username   
	         
	     String username_value = book.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
	     
	     //For password
    	  String password_value = book.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
	      
    	  //send the values
    	  username.sendKeys(username_value);
    	  password.sendKeys(password_value);
    	  
    	  driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
    	  
    	  book.close();
	      
	  }
	  @AfterTest
	  public void LastStep() {
		  driver.close();
	  }

}
