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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
   
     // In this class I thoroughly test the clothing functionality 
     // I check each and every component is working according to customer requirement or not
     // I also added Extent report in this class 
     // Mention the priority as well

public class Clothing {
	WebDriver driver;
	ExtentTest test ;
	 ExtentReports report;
	 
	 @BeforeClass
	   public void configreport() {
			 report = new ExtentReports(System.getProperty("user.dir")+"\\NopCommerce.html");
		     test = report.startTest("NopCommerceTest");
		    		
		}
	
	
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    test.log(LogStatus.PASS, "Chorme driver has opened successfully");
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		test.log(LogStatus.PASS, "Entered URL is vaild");
	}
	
	
	  @Test(priority = 1)
	  public void FirstProduct() throws InterruptedException { 
		  //mousehover form apparel 
	  Actions act = new  Actions(driver);
	  WebElement Apparel = driver.findElement(By.linkText("Apparel"));
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  act.moveToElement(Apparel).build().perform();
	  test.log(LogStatus.PASS, "successfully mousehover on Apparel");
	  
	  //clicking on clothing
	  driver.findElement(By.linkText("Clothing")).click();
	  test.log(LogStatus.PASS, "successfully clicked on clothing option");
	  
	  //Scroll down till products
	  JavascriptExecutor js =(JavascriptExecutor)driver; 
	  js.executeScript("window.scrollBy(0,400)");
	  test.log(LogStatus.PASS, "Successfully scroll down till products");
	  
	  //Select first product 
	  WebElement addtocart = driver.findElement(By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[1]"));
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.elementToBeClickable(addtocart));
	  addtocart.click();
	  test.log(LogStatus.PASS, "Successfully selected the 1st product");
	  
	  //Enter the text in text field box
	  driver.findElement(By.xpath("//input[@id='product_attribute_12']")).sendKeys("Welcome to Selenium World");
	  //click on add to Wishlist
	  driver.findElement(By.id("add-to-wishlist-button-29")).click();
	  test.log(LogStatus.PASS, "Clicked on Add to WishList");
	  //Click on cancel button
	  driver.findElement(By.xpath("//span[@class='close']")).click();
	  Thread.sleep(2000);
	  //click on add to cart
	  driver.findElement(By.xpath("//button[@id='add-to-cart-button-29']")).click() ;
	  test.log(LogStatus.PASS, "successfully added 1st product into Cart");
	  Thread.sleep(1000);
	  
	  
	  
	 }
	 
	
	@Test(priority = 2)
	public void secoundProduct() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement Apparel  = driver.findElement(By.linkText("Apparel"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		act.moveToElement(Apparel).build().perform();
		
		//clicking on clothing
		driver.findElement(By.linkText("Clothing")).click();
		 test.log(LogStatus.PASS, "successfully clicked on clothing option");
		
		//Scroll down till products
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		//Select secound product
		driver.findElement(By.linkText("Levi's 511 Jeans")).click();
		 test.log(LogStatus.PASS, "successfully selected the 2nd Product");
		//Click on address
		driver.findElement(By.xpath("//span[text()='Please select the address you want to ship to']")).click();
		 test.log(LogStatus.PASS, "successfully clicked on address");
		
		//Enter detail address and click on apply
		 WebElement dropdown = driver.findElement(By.xpath("//select[@id='CountryId']"));
		 Select sel = new Select(dropdown);
		 sel.selectByIndex(100);
		 driver.findElement(By.xpath("//input[@id='ZipPostalCode']")).sendKeys("415109");
		 driver.findElement(By.xpath("//div[text()='2nd Day Air']")).click();
		 test.log(LogStatus.PASS, "successfully Entered all details of address");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@class='button-2 apply-shipping-button']")).click();
		 Thread.sleep(2000);
		 test.log(LogStatus.PASS, "successfully Clicked on Apply");
		 
         //Click on add to cart
		 js.executeScript("document.getElementById('add-to-cart-button-30').click();");
		 driver.findElement(By.xpath("//span[@class='close']")).click();
		 Thread.sleep(2000);
		 test.log(LogStatus.PASS, "successfully added the 2nd product into Cart");
	  }
	
	@Test(priority = 3)
	public void ThirdProduct() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement Apparel  = driver.findElement(By.linkText("Apparel"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		act.moveToElement(Apparel).build().perform();
		
		//clicking on clothing
		driver.findElement(By.linkText("Clothing")).click();
		 test.log(LogStatus.PASS, "successfully clicked on clothing option");
		
		//Scroll down till products
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		//Select 3rd product
		driver.findElement(By.linkText("Nike Tailwind Loose Short-Sleeve Running Shirt")).click();
		 test.log(LogStatus.PASS, "successfully Selected the 3rd product");
		
         //Select size in dropdown
		 WebElement dropdown = driver.findElement(By.xpath("//select[@id='product_attribute_11']"));
		 Select sel = new Select(dropdown);
		 sel.selectByIndex(2);
		 test.log(LogStatus.PASS, "Size is Selected");
		 
		 Thread.sleep(2000);
		 //Click on Email a Friend
		 driver.findElement(By.xpath("//button[@class='button-2 email-a-friend-button']")).click();
		 test.log(LogStatus.PASS, "successfully clicked on Email a Friend option");
		 //Enter details of email
		 driver.findElement(By.xpath("//input[@id='FriendEmail']")).sendKeys("You_loser@gmail.com");
		 driver.findElement(By.xpath("//input[@id='YourEmailAddress']")).sendKeys("SilentKiller@gmail.com");
		 driver.findElement(By.xpath("//textarea[@id='PersonalMessage']")).sendKeys("Look what I found for your GF, give her a T-shirt as a gift");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@name='send-email']")).click();
		 Thread.sleep(2000);
		 test.log(LogStatus.PASS, "successfully Entered all details");
		 
	}
	
	 @Test(priority = 4)
	 
	 public void LastProduct() throws InterruptedException {
		 Actions act = new Actions(driver);
			WebElement Apparel  = driver.findElement(By.linkText("Apparel"));
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			act.moveToElement(Apparel).build().perform();
			
			//clicking on clothing
			driver.findElement(By.linkText("Clothing")).click(); 
			test.log(LogStatus.PASS, "successfully clicked on clothing option");
			
			//Scroll down till products
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,400)");
			//Click on Last product
			driver.findElement(By.linkText("Oversized Women T-Shirt")).click();
			 test.log(LogStatus.PASS, "successfully Selected last product");
		     Thread.sleep(2000);
			//Click on Compare list
			driver.findElement(By.xpath("//button[text()='Add to compare list']")).click();
			 test.log(LogStatus.PASS, "successfully Added the product to Add to compare list");
			Thread.sleep(1000);
			//Click on Cancel button
			driver.findElement(By.xpath("//span[@class='close']")).click();
			//Click on Add to Cart
			driver.findElement(By.xpath("//button[@id='add-to-cart-button-28']")).click();
			 Thread.sleep(2000);
			 test.log(LogStatus.PASS, "successfully added last product into Cart");
		 
	 }
	
	 @AfterMethod
	 public void TearDown() {
		 driver.close();
	 }
	 
	 @AfterClass
	  public void last() {
		 report.endTest(test);
		 report.flush();
	  }

}
