package Day4;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParcticeJunit {
	WebDriver driver;

	@Before
	public void firstStep() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.india.gov.in/");
		driver.manage().window().maximize();	   
	}
	
	
	@Test
	public void scrollAndClickiGOD() throws InterruptedException {
		
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
	}
	
	@Test
	public void new_window() {
		
		String child_url = "https://igod.gov.in/";
	    String parent_tab = driver.getWindowHandle();
		
	    Set<String> All_ID = driver.getWindowHandles();
	    for (String One_ID : All_ID) {
			driver.switchTo().window(One_ID);
			if(driver.getCurrentUrl().contains(child_url)) {
				break;
			}
		}
//		Parliament of India
	    
	    driver.findElement(By.xpath("//input[@placeholder='Search by Keyword']")).sendKeys("Parliament of India");
	}
	
	
	
	
	
	
	@After
	public void laststep() {
		driver.close();
	}
	
	
}
