package JustPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollAndClick {

public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
       driver.get("https://www.epfindia.gov.in/site_en/index.php");
       driver.manage().window().maximize();
	
	
      JavascriptExecutor js = (JavascriptExecutor)driver;
      WebElement porter = driver.findElement(By.xpath("//div[@class='imp_butn' and @id='bt3']"));
      
      
       js.executeScript("arguments[0].scrollIntoView()", porter);
//       js.executeScript("document.getElementById('alertbtn').click();")
       Thread.sleep(2000);
//       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
       js.executeScript("document.getElementById('bt3').click();"); 
       
       
       
       
		
		  // driver.switchTo().alert();
         Alert alertpopup = driver.switchTo().alert();
		  Thread.sleep(2000); 
		  alertpopup.accept();
		 
       
		/*
		 * WebElement frame1 =
		 * driver.findElement(By.xpath("(//div[@class='modal-content'])[2]"));
		 * 
		 * driver.switchTo().frame(frame1); frame1.click();
		 */
       
}
}
