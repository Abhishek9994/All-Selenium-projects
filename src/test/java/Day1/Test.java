package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		////input[@name='radioButton']
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='radioButton']"));
	
	   for (WebElement  checkbox :  checkboxes ) {
	   
	   checkbox.click();
	   Thread.sleep(1000);
	   }
    
	}

}
