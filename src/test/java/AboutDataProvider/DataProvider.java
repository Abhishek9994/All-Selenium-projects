package AboutDataProvider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider {
	
	WebDriver driver;
	
	@org.testng.annotations.DataProvider(name ="getdata")
	public Object[][] getdata() throws EncryptedDocumentException, IOException{
		
		// crate an object of dataextract class
		DataExtract get = new DataExtract();
		
		Object [][] data = get.getdatafromexcel();
		//calling data from excel
		
		return data;
	}

	  @BeforeMethod public void setup() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe"  );
	  
	  driver = new ChromeDriver();
	  
	  driver.get("https://www.india.gov.in/"); 
	  driver.manage().window().maximize();
	  
	  }  
	  
	  @Test(dataProvider = "getdata")
	  public void sign_in(String uname,String pass) throws InterruptedException {//excel data stored in String
		  
		  
		  driver.findElement(By.linkText("Sign In")).click();
		  
	      WebElement username = driver.findElement(By.xpath("//input[@id='edit-name']"));
//		  edit-pass
	      WebElement password = driver.findElement(By.xpath("//input[@id='edit-pass']"));
	      
	      Thread.sleep(2000);
	      username.sendKeys(uname);
	      password.sendKeys(pass);
	      Thread.sleep(2000);
		  
		  
	  }
	  
	  
	  @AfterMethod
	  public void teardown() {
		  driver.close();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	
}
