package Day4;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 {

	WebDriver driver;
	
  @BeforeMethod
	public void FirstStep() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
	     driver.get("https://www.india.gov.in/");
	     driver.manage().window().maximize();
		}
	
	@Test
	public void scrollAndclick() throws InterruptedException {
      JavascriptExecutor js = (JavascriptExecutor)driver;
		
        WebElement iGOD = driver.findElement(By.xpath("(//div[@class='quilcklinks_outer'])[1]"));
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView()", iGOD);
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//div[@class='quilcklinks_outer'])[1]")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
    	alert.accept();
    	Thread.sleep(2000); 
    	
    	 String child_url = "https://igod.gov.in/";
         String prent_tab = driver.getWindowHandle();
        Set<String> All_ID = driver.getWindowHandles();
        for (String One_ID : All_ID) {
   		driver.switchTo().window(One_ID);
   		if(driver.getCurrentUrl().contains(child_url)) {
   			break;
   		}
   	}
        Thread.sleep(2000); 
    	driver.findElement(By.xpath("//input[@placeholder='Search by Keyword']")).sendKeys("youth parliment question answers");
    	Thread.sleep(2000); 
    	driver.findElement(By.xpath("//img[@alt='Search Icon']")).click();
    	Thread.sleep(2000);
	}
	

	@AfterMethod
	public void lastStep() {
		driver.close();
	}
	
	
	
	
	
}
