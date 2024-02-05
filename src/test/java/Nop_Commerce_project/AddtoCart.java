package Nop_Commerce_project;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

      // In this class I thoroughly test the Add to cart functionality with checkout as a guest.
      // At the end of this script I took the screenshot as well
  
public class AddtoCart {
	WebDriver driver;
	
	@BeforeTest
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	   
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority =1)
	public void SelectProduct() {
		
		  //mousehover form apparel
	      Actions act = new  Actions(driver);
		  WebElement Apparel = driver.findElement(By.linkText("Apparel"));
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		  act.moveToElement(Apparel).build().perform();
		  
		   //clicking on clothing
		  driver.findElement(By.linkText("Clothing")).click();
		  //Scroll down until products
		  JavascriptExecutor js =(JavascriptExecutor)driver; 
		  js.executeScript("window.scrollBy(0,600)");
		  
		  //select one product
		  driver.findElement(By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[4]")).click();
		  driver.findElement(By.xpath("//span[@class='close']")).click();
		 
	}
	
	
	@Test(priority = 2)
	public void AddtoCart() throws InterruptedException {
		//click on Add to cart
	 WebElement cart = driver.findElement(By.xpath("//span[@class='cart-label']"));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.elementToBeClickable(cart));
		cart.click();
	   //scroll down 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//Handel dropdwon
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='checkout_attribute_1']"));
        Select sel = new Select(dropdown);
        sel.selectByIndex(1);
		
        // Enter value in discount coupon
		driver.findElement(By.xpath("//input[@id='discountcouponcode']")).sendKeys("FirstOrder500");
		//Enter Value in Giftcard coupon
		driver.findElement(By.xpath("//input[@id='giftcardcouponcode']")).sendKeys("FreeForFirstOrder");
		//Click on checkbox
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		Thread.sleep(2000);
		//Click on checkOut
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
		
	}
	@Test(priority = 3)
	public void checkout() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		//Click on CheckOut As guest 
		driver.findElement(By.xpath("//button[@class='button-1 checkout-as-guest-button']")).click();
		
		driver.findElement(By.xpath("//input[@data-val-required='First name is required.']")).sendKeys("Abhishek");
		driver.findElement(By.xpath("//input[@data-val-required='Last name is required.']")).sendKeys("Patil");
		driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("SilentKiller@gmail.com");
		
     	WebElement dropdown = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
     	Select sel = new Select(dropdown);
     	sel.selectByIndex(100);
     	
     	driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("Pune");
     	driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("Sai Sillicon vally A-402, Balewadi");
     	driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("411045");
     	driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("100");
     	Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='button-1 new-address-next-step-button'])[1]")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']")).click();
		
		driver.findElement(By.xpath("//button[@class='button-1 confirm-order-next-step-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click here for order details.")).click();
		
		
	}
	
	@Test(priority = 4)
	public void screenshot() throws IOException, InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,570)");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File file1 = ts.getScreenshotAs(OutputType.FILE);
	    File file2 = new File("C:\\Users\\admin\\Pictures\\Screenshot\\image.png");
	    
	    FileUtils.copyFile(file1, file2);
		
		
		
	}
	
	
	@AfterTest
	public void TearDown() {
		driver.close();
	}
		  
	}	  
		  
		 
		
		
	
	


