package JustDoIt;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTests {


WebDriver driver;
	
    @BeforeTest(alwaysRun = true)
	public void firstStep() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
	     driver.get("https://eshram.gov.in/");
	     driver.manage().window().maximize();
	     
}
    @Test
    public void searchJob() throws InterruptedException {
    	JavascriptExecutor js =(JavascriptExecutor)driver;
    	 js.executeScript("window.scrollBy(0,600)");
    	 Thread.sleep(2000);
    
    driver.findElement(By.linkText("Looking for Job")).click();
    //    https://www.ncs.gov.in/
    String child_url = "https://www.ncs.gov.in/";
    String prent_tab = driver.getWindowHandle();
     Set<String> All_ID = driver.getWindowHandles();
       for (String One_ID : All_ID) {
		driver.switchTo().window(One_ID);
		if(driver.getCurrentUrl().contains(child_url)) {
			break;
		}
	}
       Thread.sleep(2000);
       
       WebElement job = driver.findElement(By.xpath("//a[@id='afindJob']"));
       js.executeScript("arguments[0].scrollIntoView()", job);
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@id='ctl00_SPWebPartManager1_g_de4e63a9_db8a_4b11_b989_4b13991e94ee_ctl00_txtJKeywords']")).sendKeys("Software Testing And QA Engineer");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@id='ctl00_SPWebPartManager1_g_de4e63a9_db8a_4b11_b989_4b13991e94ee_ctl00_ucSALocations_txtLocation']")).sendKeys("Pune Maharashtra");
       Thread.sleep(2000);
       driver.findElement(By.id("ctl00_SPWebPartManager1_g_de4e63a9_db8a_4b11_b989_4b13991e94ee_ctl00_btnSearch")).click();
       Thread.sleep(2000);
      
}
  
    @Test
    public void zDashboard() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.linkText("Dashboard")).click();
    }
    
    
    
    
  @AfterMethod(alwaysRun = true)
  public void tearDwon() {
	  driver.close();
	  driver.quit();
	  
  }
    
    
}