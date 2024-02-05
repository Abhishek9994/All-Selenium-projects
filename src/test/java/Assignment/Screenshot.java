package Assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import dev.failsafe.internal.util.Assert;

public class Screenshot {
	
	WebDriver driver;
	SoftAssert sa;
	ExtentTest test ;
	 ExtentReports report;
	
	@BeforeClass
	public void configreport() {
		report = new ExtentReports(System.getProperty("user.dir")+"\\Abhishek.html");
		test = report.startTest("Upload File");
	}
	
	
	
	@BeforeMethod
     public void setup() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.get("https://v1.training-support.net/selenium/upload");
		driver.manage().window().maximize();
		 sa = new SoftAssert();
		String actual_URl = ("https://v1.training-support.net/selenium/upload");
		String Expected_URL = driver.getCurrentUrl();
		sa.assertEquals(actual_URl, Expected_URL);
		
		
	
	}
	@Test
	public void UploadAndScreenshot() throws InterruptedException, IOException {
	     
	 WebElement upload_button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
	 
	 upload_button.sendKeys("C:\\Users\\admin\\Downloads\\Abhishek Vilas Patil.jpg");
	 test.log(LogStatus.PASS, "Successfully choose the file");

	 Thread.sleep(2000);
	 driver.findElement(By.id("uploadButton")).click();
	
	test.log(LogStatus.PASS, "Clicked on upload button");
	
	 
	 
	 TakesScreenshot ts = (TakesScreenshot)driver;
     File file1 = ts.getScreenshotAs(OutputType.FILE);
    	
     File file2 = new File("C:\\Users\\admin\\Pictures\\Screenshot\\image.png");
     
    
     FileUtils.copyFile(file1, file2);
     test.log(LogStatus.PASS, "Successfully took the screenshot");
	 
	 
		
	}
		
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		sa.assertAll();
	}
		
	@AfterClass
	public void last() {
		report.endTest(test);
		report.flush();
	}
		

}
