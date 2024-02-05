package Evaluation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataDriven {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
    driver.get("https://the-internet.herokuapp.com/login");
    driver.manage().window().maximize();
    
    
   WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
   WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
   
   FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\selenium_project\\src\\main\\resources\\DataText.xlsx");
   
   Workbook book = WorkbookFactory.create(fis);
   
    String username_vaule = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
     String password_vaule = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
     
     
   
    username.sendKeys(username_vaule);
    password.sendKeys(password_vaule);
    book.close();

}
}