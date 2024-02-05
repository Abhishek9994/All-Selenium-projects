package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://demo.automationtesting.in/Frames.html");
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
				
				WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
						driver.switchTo().frame(outerframe);
				
			   WebElement innerframe = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
						driver.switchTo().frame(innerframe);

			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Silent Killer is Here");
			
}
}