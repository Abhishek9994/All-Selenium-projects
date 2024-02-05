package Assignment;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Day5.DataExtract;

public class Data_provider {
	
WebDriver driver;
	
	@org.testng.annotations.DataProvider(name="getdata")
	public Object [][] getdata() throws EncryptedDocumentException, IOException{
		Data_Extract get = new Data_Extract();
		
		Object [][] data = get.getdatafromexcel();
		return data;
	}

	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
	     driver.get("https://v1.training-support.net/selenium/simple-form");
	     driver.manage().window().maximize();
	     
	}
	
	@Test(dataProvider = "getdata")
	public void test(String firstName, String lastName, String email, String num, String message) throws InterruptedException {
	   WebElement fname = driver.findElement(By.xpath("//input[@id='firstName']"));
	  WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
	  WebElement email1 = driver.findElement(By.xpath("//input[@id='email']"));
	   WebElement contact = driver.findElement(By.xpath("//input[@id='number']"));
	  WebElement message1 = driver.findElement(By.xpath("//textarea[@rows='2']"));
	 
	  Thread.sleep(2000);
	  fname.sendKeys(firstName);
	  lname.sendKeys(lastName);
	  email1.sendKeys(email);
	  contact.sendKeys(num);
	  message1.sendKeys(message);
	  Thread.sleep(3000);
	}
	@AfterMethod
	public void last() {
		driver.close();
	}
	

	
		
	}
	
	

