package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollandclick {
	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
        driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
        driver.manage().window().maximize();
        
        JavascriptExecutor js =(JavascriptExecutor)driver;
//        WebElement mousehover = driver.findElement(By.id("mousehover"));
        
       js.executeScript("document.getElementById('alertbtn').click();");
//        js.executeScript("arguments[0].scrollIntoView()", mousehover);
        
//        js.executeScript("document.getElementById('alertbtn').click();" );
//        js.executeScript("document.getElementById('autocomplete').value='Tester of the day';");
        
//          js.executeScript("document.getElementById('name').value='silent killer';");
        
	}

}
