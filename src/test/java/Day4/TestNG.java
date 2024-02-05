package Day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class TestNG {
	
	WebDriver driver;
	
    @BeforeTest(alwaysRun = true)
	public void firstStep() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
	     driver.get("https://www.india.gov.in/");
	     driver.manage().window().maximize();
	}
	
    @Test(groups = {"Somke"})
    public void sing_in() throws InterruptedException {
    	Thread.sleep(1000);
    	driver.findElement(By.linkText("Sign In")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys("SilentKiller@gmail.com");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys("12345678");
    	Thread.sleep(2000);
    }
    

  @Test(groups= {"Regreesion"})
  public void pan() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Pan card")).click();
	  Thread.sleep(2000);
	  
  }
 @Test(groups= {"Regreesion"})
 public void licence() throws InterruptedException {
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("Driving Licence")).click();
	 Thread.sleep(2000);
 }
 @Test(groups = {"Somke"})
 public void certificate() throws InterruptedException {
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("Birth Certificate")).click();
	 Thread.sleep(2000); 
	 
 }
	
    
   

	@AfterTest(alwaysRun = true)
	public void lastStep() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}