package JustPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
       driver.get("https://www.epfindia.gov.in/site_en/index.php");
       driver.manage().window().maximize();
       
       Actions action = new Actions(driver);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
    WebElement misc = driver.findElement(By.xpath("//a[@title='Misc.']"));
       
       action.moveToElement(misc).build().perform();
       
       driver.findElement(By.linkText("RTI Act")).click();       
       
     WebElement download = driver.findElement(By.xpath("//a[@title='EPFO Corner'])"));
       
       action.moveToElement(download).build().perform();
}
}
