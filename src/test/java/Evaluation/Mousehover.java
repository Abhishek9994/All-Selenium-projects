package Evaluation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mousehover {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	Actions act = new Actions(driver);
	
	
      WebElement sports = driver.findElement(By.linkText("Sports"));
      
      wait.until(ExpectedConditions.visibilityOf(sports));
      act.moveToElement(sports).build().perform();
      Thread.sleep(2000);
      
    WebElement motor = driver.findElement(By.linkText("Motors"));
    
	act.moveToElement(motor).build().perform();
	  Thread.sleep(2000);
      

}
}