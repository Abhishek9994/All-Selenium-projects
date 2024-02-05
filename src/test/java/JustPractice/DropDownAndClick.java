package JustPractice;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAndClick {
	

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://rahulshettyacademy.com/AutomationPractice");
				driver.manage().window().maximize();
				
	  	WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
	 	    
	 	    Select sc = new Select(dropdown);
	 	    
	 	    for (int i = 0; i <=3; i++) {
				sc.selectByIndex(i);
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

			}
	 	    
	 	    
}
}