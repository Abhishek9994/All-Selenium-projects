package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollpractice1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=245869069539195073&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301240&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		
		driver.manage().window().maximize();
		
		
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  
		  js.executeScript("window.scrollBy(0,6000)");
		  
		  driver.findElement(By.xpath("//span[contains(text(),'English')]")).click();
		 
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("window.scrollBy(0,4000)");
		 * driver.findElement(By.linkText("Sell on Amazon")).click();
		 */
		
		
		
	}

}
