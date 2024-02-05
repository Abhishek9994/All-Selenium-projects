package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollByelement {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
        driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 		
		driver.manage().window().maximize();
		
      WebElement sell = driver.findElement(By.id("mousehover"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
//		js.executeScript("argument[0].scrollIntoview()", sing_in);
	    js.executeScript("arguments[0].scrollIntoView()", sell);
		
//		js.executeScript(null, args)
}
}