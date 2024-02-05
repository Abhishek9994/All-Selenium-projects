package Nop_Commerce_project;

import java.time.Duration;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

         //Here we make sure that clothing functionality is working in both Chrome and FireFox.
         // Then convert into TestNG
   
public class ParallelTest_Clothing {
	
	WebDriver driver;
	WebDriver driver1;
	  
	
	
	@Test
	public void chromeTest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		 Actions act = new  Actions(driver);
		 WebElement Apparel = driver.findElement(By.linkText("Apparel"));
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	     act.moveToElement(Apparel).build().perform();
	
	     
	     
	     //Verify Clothing functionality in chrome
	     Actions act1 = new  Actions(driver);
		 WebElement Apparel1 = driver.findElement(By.linkText("Apparel"));
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	     act1.moveToElement(Apparel1).build().perform();
	     
	     driver.findElement(By.linkText("Clothing")).click();
	     driver.findElement(By.linkText("Levi's 511 Jeans")).click();
	     driver.findElement(By.xpath("//button[@id='add-to-cart-button-30']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[@class='close']")).click();
	     
	      driver.close();
		
	}
	
	

	  @Test public void firefoxTest() throws InterruptedException {
	  
	  WebDriverManager.firefoxdriver().setup(); 
	  driver1 = new FirefoxDriver();
	  
	  driver1.get("https://demo.nopcommerce.com/");
	  
		
		
	      //Verify Clothing functionality in firefox
	     Actions act1 = new  Actions(driver1);
		 WebElement Apparel1 = driver1.findElement(By.linkText("Apparel"));
		 driver1.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	     act1.moveToElement(Apparel1).build().perform();
	     JavascriptExecutor js = (JavascriptExecutor)driver1;
	     driver1.findElement(By.linkText("Clothing")).click();
	     driver1.findElement(By.linkText("Levi's 511 Jeans")).click();
	     driver1.findElement(By.xpath("//button[@id='add-to-cart-button-30']")).click();
	     Thread.sleep(2000);
	     driver1.findElement(By.xpath("//span[@class='close']")).click();
	     
         
	     
	     
	     driver1.close();
	   }
	 
	
	

}
