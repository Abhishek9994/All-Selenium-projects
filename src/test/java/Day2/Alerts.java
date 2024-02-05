package Day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);

		
		/*
		 * driver.findElement( By.xpath("//button[@id='alertButton']")).click(); Alert
		 * popup = driver.switchTo().alert(); popup.accept(); Thread.sleep(2000);
		 * 
		 * 
		 * driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		 * Alert popup2 = driver.switchTo().alert(); popup2.accept();
		 * Thread.sleep(2000);
		 */
		 
	    
	    driver.findElement(By.id("confirmButton")).click();
	    Alert popup3 = driver.switchTo().alert();
	     popup3.accept();
	     Thread.sleep(2000);
		   
	    driver.findElement(By.id("confirmButton")).click();
	    Alert popup4 = driver.switchTo().alert();
	    popup4.dismiss();

	    
	    

}
}