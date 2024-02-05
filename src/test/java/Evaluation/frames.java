package Evaluation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/iframes");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
     	WebElement frame = driver.findElement(By.id("actionButton"));
     	frame.click(); 	
		

		
}
}