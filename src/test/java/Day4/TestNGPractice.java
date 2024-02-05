package Day4;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {

	WebDriver driver;
	
	@BeforeTest
	public void FirstStep() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
	     driver.get("https://www.india.gov.in/");
	     driver.manage().window().maximize();
		}
	
	
	@Test
	public void RTI() throws InterruptedException {
		JavascriptExecutor js =(JavascriptExecutor)driver;
	     
	      WebElement RTI = driver.findElement(By.linkText("Right to Information"));
	     
	      js.executeScript("arguments[0].scrollIntoView()", RTI);
	      Thread.sleep(2000);

	      driver.findElement(By.linkText("Right to Information")).click();      
	      
	      Alert alert = driver.switchTo().alert();
	      Thread.sleep(2000);
	      alert.accept();
	}
	
	@Test
	public void frame() throws InterruptedException {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		 Thread.sleep(3000);
	      js.executeScript("document.getElementById('jsAlert2_okButton').click();");
	      Thread.sleep(2000);
	      js.executeScript("document.getElementById('jsAlert3_okButton').click();");
	      Thread.sleep(2000);
	      WebElement faq = driver.findElement(By.linkText("FAQ"));
		  Thread.sleep(2000);
	      faq.click();
	}
	
	@Test
	public void new_window() throws InterruptedException {
		 String child_url = "https://dopt.gov.in/employees-corner/faq";
	      String prent_tab = driver.getWindowHandle();
	     Set<String> All_ID = driver.getWindowHandles();
	     for (String One_ID : All_ID) {
			driver.switchTo().window(One_ID);
			if(driver.getCurrentUrl().contains(child_url)) {
				break;
			}
		}
	     JavascriptExecutor js =(JavascriptExecutor)driver;
	     Thread.sleep(2000);
	     js.executeScript("window.scrollBy(0,8000)");
	     
	     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    Thread.sleep(1000);
	    WebElement feedback = driver.findElement(By.linkText("Feedback"));
	    feedback.click();
	     
	    
	    
	}
	
	@Test
	public void Text() throws InterruptedException {
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,200)");
		  WebElement dropdown = driver.findElement(By.xpath("//select[@id='edit-submitted-feedback-topic']"));
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
		    
		    
	}
	
	
	
	
	
	
	@AfterTest
	public void LastStep() {
		driver.close();
	}
	
}
