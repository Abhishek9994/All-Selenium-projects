package Day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.get("https://v1.training-support.net/selenium/iframes");
		driver.manage().window().maximize();
		

		
		  driver.switchTo().frame(0); 
		  WebElement frame1 =
		  driver.findElement(By.id("actionButton")); 
		  frame1.click();
		  
		  driver.switchTo().defaultContent();
		  Thread.sleep(1000);
		 
	  
	    driver.switchTo().frame(1);
     	WebElement frame2 = driver.findElement(By.id("actionButton"));
     	frame2.click();
	  
	}

}
