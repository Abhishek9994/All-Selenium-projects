package JustPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllOperations{

public static void main(String[] args) throws InterruptedException, IOException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
     driver.get("https://www.india.gov.in/");
     driver.manage().window().maximize();
     Thread.sleep(2000);
     JavascriptExecutor js =(JavascriptExecutor)driver;
     
      WebElement RTI = driver.findElement(By.linkText("Right to Information"));
     
      js.executeScript("arguments[0].scrollIntoView()", RTI);
      Thread.sleep(2000);

      driver.findElement(By.linkText("Right to Information")).click();      
      
      Alert alert = driver.switchTo().alert();
      Thread.sleep(2000);
      alert.accept();
      
//      driver.findElement(By.id("jsAlert2_okButton")).click();      
      
		/*
		 * WebElement ok_button = driver.findElement(By.id("jsAlert2_okButton"));
		 * 
		 * driver.switchTo().frame(ok_button); ok_button.click();
		 */
      Thread.sleep(3000);
      js.executeScript("document.getElementById('jsAlert2_okButton').click();");
      Thread.sleep(2000);
      js.executeScript("document.getElementById('jsAlert3_okButton').click();");
      Thread.sleep(2000);
      
    WebElement faq = driver.findElement(By.linkText("FAQ"));
      faq.click();
      
      String child_url = "https://dopt.gov.in/employees-corner/faq";
      String prent_tab = driver.getWindowHandle();
     Set<String> All_ID = driver.getWindowHandles();
     for (String One_ID : All_ID) {
		driver.switchTo().window(One_ID);
		if(driver.getCurrentUrl().contains(child_url)) {
			break;
		}
	}
     Thread.sleep(2000);
     js.executeScript("window.scrollBy(0,8000)");
     
     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    Thread.sleep(1000);
    WebElement feedback = driver.findElement(By.linkText("Feedback"));
    feedback.click();
     
    WebElement dropdown = driver.findElement(By.xpath("//select[@id='edit-submitted-feedback-topic']"));
    
    Thread.sleep(2000);
    js.executeScript("window.scrollBy(0,200)");
    
    Select sel = new Select(dropdown);
    for(int i=0;i<=3;i++) {
    	sel.selectByIndex(i);
    	Thread.sleep(2000);
    }
    
    js.executeScript("document.getElementById('edit-submitted-name').value='Abhishek patil';");
    Thread.sleep(2000);
    js.executeScript("document.getElementById('edit-submitted-email-address').value='slientKiller@gmail.com';");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//textarea[@placeholder='Please enter feedback']")).sendKeys("In conflict between Maldives and Lakshadweep.... I choose my home because I don't have money !!!");
    
    
    TakesScreenshot ts = (TakesScreenshot)driver;
           File file1 = ts.getScreenshotAs(OutputType.FILE);
           File file2 = new File("C:\\Users\\admin\\Pictures\\Screenshot\\image.png");
           
           FileUtils.copyFile(file1, file2);
           
    }
}
