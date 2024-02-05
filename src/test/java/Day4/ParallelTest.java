package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {

	WebDriver driver;
	WebDriver driver1;
	
	@Test
	public void chromeTest() throws InterruptedException {
     WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
	     driver.get("https://the-internet.herokuapp.com/login");
	     
	     driver.findElement(By.cssSelector("#username")).sendKeys("Abhishek");
		 driver.findElement(By.cssSelector("input#password")).sendKeys("777777");
		 driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
		 Thread.sleep(3000);
	     driver.close();
	}
	
	@Test
	public void firefooxTest() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		 
		driver1= new FirefoxDriver();
         driver1.get("https://the-internet.herokuapp.com/login");
	     
	     driver1.findElement(By.cssSelector("#username")).sendKeys("Abhishek");
		 driver1.findElement(By.cssSelector("input#password")).sendKeys("777777");
		 driver1.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
		 
		 driver1.close();
		
	}
	
	@AfterClass
	public void LastStep() {
		
		driver.quit();
	}
	
}
