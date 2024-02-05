package JustDoIt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadFile {

	
	public static void main(String[] args) throws InterruptedException {
		
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	     driver.get("https://demo.guru99.com/test/upload/");
	     driver.manage().window().maximize();
	
	

	     WebElement uploadButton = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		  
	        uploadButton.click();
	        //C:\Users\admin\Downloads\1704470409641.jpeg
	        uploadButton.sendKeys("C:\\Users\\admin\\Downloads");
	        driver.findElement(By.xpath("//input[@id='terms']")).click();
	        driver.findElement(By.xpath("//button[@id='submitbutton']")).click(); 
	        Thread.sleep(2000);
	        
	
}
}
