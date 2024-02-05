package Assignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class DropDown {

	WebDriver driver;
	
	@Before
	public void setup() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
	
	}
	
	@Test
	public void Fisdrop() throws InterruptedException {
		
	 WebElement DD = driver.findElement(By.xpath("//select[@id='first']"));
	 
	 Select sel = new Select(DD);
	 
	 for (int i = 0; i < 4; i++) {
		 
		 sel.selectByIndex(i);
		 Thread.sleep(2000);
		
	}
	}
	
	@Test
	public void SecDrop() throws InterruptedException {
	   WebElement DD2 = driver.findElement(By.xpath("//select[@id='animals']"));
	   Select sel = new Select(DD2);
		 
		 for (int i = 0; i < 4; i++) {
			 
			 sel.selectByIndex(i);
			 Thread.sleep(2000);
	}
	}
	 
	 @Test
	 public void tirdrop() throws InterruptedException {
	  WebElement DD3 = driver.findElement(By.xpath("//select[@id='second']"));
	  
	  Select sel = new Select(DD3);
	  for (int i = 0; i < 4; i++) {
		  sel.selectByIndex(i);
		  Thread.sleep(2000);
		
	}
	 }
	 
	 
	 
      @After
	 public void TearDown() {
		 driver.close();
	 }
	 
	
	 
	}
	
	

