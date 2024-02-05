package Evaluation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
	  WebElement drop = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	  
	  Select sel = new Select(drop);
	  
	  for (int i = 0; i <=3 ; i++) {
		  sel.selectByIndex(i);
		  Thread.sleep(2000);
		
	}
		
		
		
	}

}
