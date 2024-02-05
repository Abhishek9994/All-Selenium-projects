package Day5;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataProvider {

	WebDriver driver;
	
	@org.testng.annotations.DataProvider(name="getdata")
	public Object[][] getdata() throws EncryptedDocumentException, IOException  {

		DataExtract get = new DataExtract();
		Object [][] data = get.getdatafromexcel();
	    return data;
		
	}
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
	     driver.get("https://the-internet.herokuapp.com/login");
	     
	}
	
	@Test(dataProvider = "getdata")
	public void logintest(String uname, String pass) throws InterruptedException {
		
		WebElement username = driver.findElement(By.cssSelector("#username"));
		WebElement password = driver.findElement(By.cssSelector("input#password"));
		Thread.sleep(2000);
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		Thread.sleep(2000);
		
		}
	@AfterMethod
	public void LastStep() {
		driver.close();
		
	}
	
	
}
