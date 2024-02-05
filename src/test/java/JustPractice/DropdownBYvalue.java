package JustPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownBYvalue {
	
public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://rahulshettyacademy.com/AutomationPractice");
				driver.manage().window().maximize();
				
	  	WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
	 	    
	  	Select sel = new Select(dropdown);
	  	
	  
	  		sel.selectByValue("option1");
	  		
//	  		sel.selectByValue("option2");
	    	sel.deselectByValue("option2");
	  		sel.selectByValue("option3");
	  		

}
}