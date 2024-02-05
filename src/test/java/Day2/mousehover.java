package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
			
			Actions act = new Actions(driver);
			
			WebElement Sports = driver.findElement(By.linkText("Sports"));
			act.moveToElement(Sports).build().perform();
			Thread.sleep(1000);
			
			
	     	WebElement healthandbeauty = driver.findElement(By.linkText("Health & Beauty"));
			act.moveToElement(healthandbeauty).build().perform();
			Thread.sleep(1000);
			
		    WebElement fashion = driver.findElement(By.linkText("Fashion"));
			act.moveToElement(fashion).build().perform();
			Thread.sleep(1000);
			
			WebElement art = driver.findElement(By.xpath("(//a[@_sp='p4375194.m1382.l3250'])[1]"));
			act.moveToElement(art).build().perform();
			Thread.sleep(1000);
			
			WebElement industrial_equipment = driver.findElement(By.xpath("(//a[@_sp='p4375194.m1385.l3250'])[1]"));
			act.moveToElement(industrial_equipment).build().perform();
			
	}
	
	
}
