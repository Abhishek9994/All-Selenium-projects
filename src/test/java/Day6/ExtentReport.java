package Day6;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	
	WebDriver driver;
	 ExtentTest test ;
	 ExtentReports report;
	
	
	@BeforeClass
	public void configreport() {
		 report = new ExtentReports(System.getProperty("user.dir")+"\\Abhishek.html");
	     test = report.startTest("herokuTest");
	    		
	}
	
	
	
	
	  @BeforeMethod(alwaysRun = true)
		public void FirstStep() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			 test.log(LogStatus.PASS, "Chorme driver has opned successfully");
		     driver.get("https://the-internet.herokuapp.com/login");
		     driver.manage().window().maximize();
		     test.log(LogStatus.PASS, "Entered URL is vaild");
			}
	 
	  @Test
	  public void LogInTest() throws EncryptedDocumentException, IOException {
		  
		  // Declaring locator 
		  WebElement username = driver.findElement(By.cssSelector("#username"));
		  WebElement password=driver.findElement(By.cssSelector("input#password"));
		  
		  
		
  	  username.sendKeys("tomsmith");
    	test.log(LogStatus.PASS, "Username tomsmith entered successfully");
  	  password.sendKeys("SuperSecretPassword!");
  	    test.log(LogStatus.PASS, "password SuperSecretPassword! entered successfully ");
  	  
  	  driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
  	  
  	 
	      
	  }
	  @AfterMethod(alwaysRun = true)
	  public void LastStep() {
		  driver.close();
	  }
	  
	  @AfterClass
	  public void last() {
		 report.endTest(test);
		 report.flush();
	  }

}
