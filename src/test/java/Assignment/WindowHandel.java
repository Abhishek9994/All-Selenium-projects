package Assignment;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WindowHandel {
	

	WebDriver driver;
	ExtentTest test ;
	 ExtentReports report;
	
	@BeforeClass
	public void configreport() {
		report = new ExtentReports(System.getProperty("user.dir")+"\\Abhishek.html");
		test = report.startTest("National Portal of India");
		
	}
	
	
  @BeforeMethod(alwaysRun = true)
	public void FirstStep() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
	     driver.get("https://www.india.gov.in/");
	     driver.manage().window().maximize();
	     
	     SoftAssert sa = new SoftAssert();
	     String actual_URL = "https://www.india.gov.in/";
	     String expected_URL = driver.getCurrentUrl();
	     sa.assertEquals(actual_URL, expected_URL);
	     sa.assertAll();
	     test.log(LogStatus.PASS, "Entered URL is vaild");

}
  
  @Test
  public void window() throws InterruptedException, IOException {
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
		
      WebElement iGOD = driver.findElement(By.xpath("(//div[@class='quilcklinks_outer'])[1]"));
      Thread.sleep(2000);
      js.executeScript("arguments[0].scrollIntoView()", iGOD);
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("(//div[@class='quilcklinks_outer'])[1]")).click();
      test.log(LogStatus.PASS, "iGOD is clickable");
     
      Alert alert = driver.switchTo().alert();
      Thread.sleep(2000);
    	alert.accept();
  	 test.log(LogStatus.PASS,"Alret is accepted");
  	  
  	 String child_url = "https://igod.gov.in/";
     String prent_tab = driver.getWindowHandle();
     Set<String> All_ID = driver.getWindowHandles();
     for (String One_ID : All_ID) {
		driver.switchTo().window(One_ID);
		if(driver.getCurrentUrl().contains(child_url)) {
			break;
		}
  }
        test.log(LogStatus.PASS, "Another window opened successfully");
        
         WebElement Grams = driver.findElement(By.xpath("//img[@alt='Centralised Public Grievance Redress and Monitoring System']"));
         Thread.sleep(2000);
          test.log(LogStatus.PASS, "Scroll down till Grams");
        js.executeScript("arguments[0].scrollIntoView()", Grams);
        Thread.sleep(2000);
         Grams.click();
         test.log(LogStatus.PASS, "Successfully Clicked on Grams");
         
         String child_url1 = "https://pgportal.gov.in/";
         String prent_tab1 = driver.getWindowHandle();
         Set<String> All_ID1 = driver.getWindowHandles();
         for (String One_ID1: All_ID1) {
    		driver.switchTo().window(One_ID1);
    		if(driver.getCurrentUrl().contains(child_url1)) {
    			break;
    		}
      }
         test.log(LogStatus.PASS, "Third window opened successfully");
         Thread.sleep(2000);
          driver.navigate().refresh();
          test.log(LogStatus.PASS,"successfully refreshed entire page");
          
          TakesScreenshot ts =(TakesScreenshot)driver;
          
          File file1 = ts.getScreenshotAs(OutputType.FILE);
          
          File file2 = new File("C:\\Users\\admin\\Pictures\\Screenshot\\image.png");
          
          FileUtils.copyFile(file1, file2);
          test.log(LogStatus.PASS, "Screenshot is taken successfully");
          
  
}
  @AfterMethod
  public void teardown() {
	  driver.close();
	  driver.quit();
	  
  }
  @AfterClass
  public void last() {
	  report.endTest(test);
	  report.flush();
  }
  
}