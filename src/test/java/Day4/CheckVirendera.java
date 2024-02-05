package Day4;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckVirendera {
	
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement computer = driver.findElement(By.xpath("//a[@href='/computers']"));
		Actions act = new Actions(driver);
		act.moveToElement(computer).build().perform();
		
		driver.findElement(By.xpath("//a[@href='/software']")).click();
		
		 List<WebElement> drops = driver.findElements(By.xpath("//select[@id='products-orderby']"));
		 for(WebElement drop : drops) {
			 drop.click();
		 }
		
		
		 driver.findElement(By.xpath("//a[@href='/windows-8-pro']")).click();
		
		   
		  String link_child = "https://demo.nopcommerce.com/sound-forge-pro-11-recurring";
		 
		   String link_parent = driver.getWindowHandle();
		  
		      Set<String> all_links = driver.getWindowHandles();
		     
		      for( String single_link : all_links) {
		    	  driver.switchTo().window(single_link);
		    	  if(single_link.contains(link_child)) {
		    		  break;
		    	  }
		      }
		      Thread.sleep(8000);
		      driver.findElement(By.xpath("//button[@id='add-to-cart-button-11']")).click();
		     
		     
		      Thread.sleep(4000);
		     
		      driver.findElement(By.xpath("//a[@href='/cart']")).click();
		     
		     
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		     
		     
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//button[@id='checkout']")).click();
		     
		      Thread.sleep(3000);
		     
		   driver.findElement(By.xpath(" //input[@id='Email']")).sendKeys("chakravartiavinash@gmial.com");
		     
		   Thread.sleep(3000);
		   driver.findElement(By.xpath(" //input[@id='Password']")).sendKeys("avinash@121");
		     
		  
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		     
		   
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//button[text()='Log in']")).click();
		    
	}

}
