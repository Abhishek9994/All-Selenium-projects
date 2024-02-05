package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DividedIntoGroups {

WebDriver driver;
	
     @BeforeTest(alwaysRun = true)
	  public void firstStep() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
	     driver.get("https://data.gov.in/metrics/");
	     driver.manage().window().maximize();
     }
	@Test(groups = {"Somke"})
	 public void CDO() throws InterruptedException {
		
	  driver.findElement(By.linkText("CHIEF DATA OFFICER")).click();	
	  Thread.sleep(2000);
	}
	  @Test(groups = {"Somke"})
	  public void sector() throws InterruptedException {
		  driver.findElement(By.linkText("SECTOR")).click();
		  Thread.sleep(2000);
	  }
	     
	  @Test(groups= {"Regreesion"})
	  public void catalog() throws InterruptedException {
		  driver.findElement(By.linkText("CATALOG")).click();
		  Thread.sleep(2000);
	  }
	  
	  @Test(groups = {"Somke"})
	  public void API() throws InterruptedException {
		  driver.findElement(By.linkText("APIs")).click();
		  Thread.sleep(2000);
	  }
	  
	  
	  @Test(groups= {"Regreesion"})
	  public void zsearch() throws InterruptedException {
		  driver.findElement(By.xpath("//input[@placeholder='Search Catalog/Resources/API']")).sendKeys("Rajya sabha");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@title='Click to Search Database']")).click();
		  Thread.sleep(2000);
	  }
	  
	@AfterTest(alwaysRun = true)
	public void LastStep() {
		driver.close();
	}
}
