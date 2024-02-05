package Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebeyscroll {
	public static void main(String[] args) {
		
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	
	
  WebElement contact_us = driver.findElement(By.linkText("Contact us"));
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
	
	js.executeScript("window.scrollBy(0,3000)");
	
	
	}	
}
