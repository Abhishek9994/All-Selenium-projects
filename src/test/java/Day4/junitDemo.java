package Day4;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitDemo {

	WebDriver driver;
	
	@Before
	public void fiststep() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
	}
	@Test
	public void alert() throws InterruptedException {
		 driver.findElement(By.id("confirmButton")).click();
		    Alert popup3 = driver.switchTo().alert();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		     popup3.accept();
		    
			   
				/*
				 * driver.findElement(By.id("confirmButton")).click(); Alert popup4 =
				 * driver.switchTo().alert(); popup4.dismiss();
				 */
	}
	
	@After
	public void laststep() {
		driver.close();
	}
	
	
	
}
