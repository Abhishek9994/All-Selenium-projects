package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		
	   Actions act = new Actions(driver);
	   
	  WebElement football = driver.findElement(By.xpath("//img[@id='draggable']"));
	    
	  WebElement box = driver.findElement(By.xpath("//div[@id='dropzone2']"));
	    
	    act.dragAndDrop(football, box).build().perform();
	    
	   
	    
	    
	   
	   
	   
	}
	

}
