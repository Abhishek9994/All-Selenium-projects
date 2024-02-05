package Day2;

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
		
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']")).click();
		
		String child_url =( "https://www.selenium.dev/");
		
		String parent_tab = driver.getWindowHandle();
		
	     Set<String> All_ID = driver.getWindowHandles();
	     
	     for (String One_ID : All_ID) {
	    	  
	    	driver.switchTo().window(One_ID);
	    	if(driver.getCurrentUrl().contains(child_url)) {
	    		break;
	    	}
			
		}
		
		driver.findElement(By.xpath("(//span[contains(text(),'Blog')])[1]")).click();
		
}
}
