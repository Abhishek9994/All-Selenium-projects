package Nop_Commerce_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;
           
        // Here I copy paste clothing class and make a groups of smoke and sanity
        // Then convert into TestNG 
        // also added assertion in this script 

public class ClothingGroups {
	WebDriver driver;
	SoftAssert sa;
	
	
	@BeforeTest(alwaysRun = true)
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		 sa = new SoftAssert();
		 String actual_url = "https://demo.nopcommerce.com/";
	     String expected_url = driver.getCurrentUrl();
	     sa.assertEquals(actual_url, expected_url);
		 
	     String actual_title = "nopCommerce demo store";
	     String expected_title = driver.getTitle();
	     sa.assertEquals(actual_title, expected_title);
	}
	
	 @Test(groups = {"smoke"})
	  public void FirstProduct() throws InterruptedException { 
		  //mouse over apparel 
	  Actions act = new  Actions(driver);
	  WebElement Apparel = driver.findElement(By.linkText("Apparel"));
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  act.moveToElement(Apparel).build().perform();

	  
	  //clicking on clothing
	  driver.findElement(By.linkText("Clothing")).click();
	  
	 
	  //Scroll down till products
	  JavascriptExecutor js =(JavascriptExecutor)driver; 
	  js.executeScript("window.scrollBy(0,400)");
	  
	  
	  //Select first product 
	  WebElement addtocart = driver.findElement(By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[1]"));
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.elementToBeClickable(addtocart));
	  addtocart.click();
	  
	  
	  //Enter the text in text field box
	  driver.findElement(By.xpath("//input[@id='product_attribute_12']")).sendKeys("Welcome to Selenium World");
	  //click on add to Wishlist
	  driver.findElement(By.id("add-to-wishlist-button-29")).click();
	  //Click on cancel button
	  driver.findElement(By.xpath("//span[@class='close']")).click();
	  Thread.sleep(2000);
	  //click on add to cart
	  driver.findElement(By.xpath("//button[@id='add-to-cart-button-29']")).click() ;
	   Thread.sleep(1000);
	  
	 }
	 
	 @Test(groups = {"sanity"})
		public void secoundProduct() throws InterruptedException {
			Actions act = new Actions(driver);
			WebElement Apparel  = driver.findElement(By.linkText("Apparel"));
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			act.moveToElement(Apparel).build().perform();
			
			//clicking on clothing
			driver.findElement(By.linkText("Clothing")).click();
			
			//Scroll down till products
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,400)");
			
			//Select secound product
			driver.findElement(By.linkText("Levi's 511 Jeans")).click();
			
			//Click on address
			driver.findElement(By.xpath("//span[text()='Please select the address you want to ship to']")).click();
			 
			//Enter detail address and click on apply
			 WebElement dropdown = driver.findElement(By.xpath("//select[@id='CountryId']"));
			 Select sel = new Select(dropdown);
			 sel.selectByIndex(100);
			 driver.findElement(By.xpath("//input[@id='ZipPostalCode']")).sendKeys("415109");
			 driver.findElement(By.xpath("//div[text()='2nd Day Air']")).click();
			
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//button[@class='button-2 apply-shipping-button']")).click();
			 Thread.sleep(2000);
			 
			 //Click on add to cart
			 js.executeScript("document.getElementById('add-to-cart-button-30').click();");
			 driver.findElement(By.xpath("//span[@class='close']")).click();
			 Thread.sleep(2000);
			 
		  }
	 @Test(groups = {"sanity"})
		public void ThirdProduct() throws InterruptedException {
			Actions act = new Actions(driver);
			WebElement Apparel  = driver.findElement(By.linkText("Apparel"));
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			act.moveToElement(Apparel).build().perform();
			
			//clicking on clothing
			driver.findElement(By.linkText("Clothing")).click();
			
			//Scroll down till products
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,400)");
			
			//Select 3rd product
			driver.findElement(By.linkText("Nike Tailwind Loose Short-Sleeve Running Shirt")).click();
			
		     //Select size in dropdown
			 WebElement dropdown = driver.findElement(By.xpath("//select[@id='product_attribute_11']"));
			 Select sel = new Select(dropdown);
			 sel.selectByIndex(2);
			
			 Thread.sleep(2000);
			 //Click on Email a Friend
			 driver.findElement(By.xpath("//button[@class='button-2 email-a-friend-button']")).click();
		      //Enter details of email
			 driver.findElement(By.xpath("//input[@id='FriendEmail']")).sendKeys("You_loser@gmail.com");
			 driver.findElement(By.xpath("//input[@id='YourEmailAddress']")).sendKeys("SilentKiller@gmail.com");
			 driver.findElement(By.xpath("//textarea[@id='PersonalMessage']")).sendKeys("Look what I found for your GF, give her a T-shirt as a gift");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//button[@name='send-email']")).click();
			 Thread.sleep(2000);
			
		}
	    
     @Test(groups = {"smoke"})
	 
	 public void LastProduct() throws InterruptedException {
		 Actions act = new Actions(driver);
			WebElement Apparel  = driver.findElement(By.linkText("Apparel"));
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			act.moveToElement(Apparel).build().perform();
			
			//clicking on clothing
			driver.findElement(By.linkText("Clothing")).click(); 
			
			//Scroll down till products
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,400)");
			//Click on Last product
			driver.findElement(By.linkText("Oversized Women T-Shirt")).click();
			
		     Thread.sleep(2000);
			//Click on Compare list
			driver.findElement(By.xpath("//button[text()='Add to compare list']")).click();
			
			Thread.sleep(1000);
			//Click on Cancel button
			driver.findElement(By.xpath("//span[@class='close']")).click();
			//Click on Add to Cart
			driver.findElement(By.xpath("//button[@id='add-to-cart-button-28']")).click();
			 Thread.sleep(2000);
			
	 }
      
     @AfterTest(alwaysRun = true)
     public void TearDown() {
    	 driver.close();
    	 sa.assertAll();
     }
 
 
	
	
	
}
