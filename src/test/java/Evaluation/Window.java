package Evaluation;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		
        String child_url =("https://www.selenium.dev/");
        String parent_tab = driver.getWindowHandle();
        Set<String> All_Id = driver.getWindowHandles();
        
        for (String One_ID : All_Id) {
        	driver.switchTo().window(One_ID);
        	if(driver.getCurrentUrl().contains(child_url)){
        		break;
        	}
			
		}
        Thread.sleep(1000);
		 driver.findElement(By.linkText("Documentation")).click();

}
}