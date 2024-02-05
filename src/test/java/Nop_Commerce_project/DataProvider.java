package Nop_Commerce_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AboutDataProvider.DataExtract;

public class DataProvider {
WebDriver driver;
	
	@org.testng.annotations.DataProvider(name ="getdata")
	public Object[][] getdata() throws EncryptedDocumentException, IOException{
		
		// crate an object of dataextract class
		Nop_Commerce_project.DataExtract  get = new Nop_Commerce_project.DataExtract();
		
		Object [][] data = get.getdatafromexcel();
		//calling data from excel
		
		return data;
	}

	  @BeforeTest
	  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe"  );
	  
	  driver = new ChromeDriver();
	  
	  driver.get("https://demo.nopcommerce.com/"); 
	  driver.manage().window().maximize();
	  
	  }  
	  
	  @Test(dataProvider = "getdata")
	  public void register(String FirstN, String LastN, String email, String password, String ConfirmPass) throws InterruptedException {
			
			//locate Register and click on it
			driver.findElement(By.xpath("//a[@class='ico-register']")).click();
					
			//locate FirstName element
			WebElement FirstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
					
			//locate LastName element
			WebElement LastName = driver.findElement(By.xpath("//input[@id='LastName']"));
					
			//locate Email element
			WebElement Email = driver.findElement(By.xpath("//input[@name='Email']"));
					
			//locate Password element
			WebElement Password = driver.findElement(By.xpath("//input[@name='Password']"));
					
			//locate ConfirmPassword element
			WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
					
			FirstName.sendKeys(FirstN);
			LastName.sendKeys(LastN);
			Email.sendKeys(email);
			Thread.sleep(2000);
			Password.sendKeys(password);
			ConfirmPassword.sendKeys(ConfirmPass);
			driver.findElement(By.xpath("//button[@id='register-button']")).click();
			Thread.sleep(1000);
			
			
		}
		  
		  
	@AfterTest
	  public void teardown() {
		  driver.close();
	  }
	  

}
