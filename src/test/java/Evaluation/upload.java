package Evaluation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) {
		
	
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
	driver.manage().window().maximize();
	
	
	WebElement upload_button = driver.findElement(By.id("uploadfile_0"));
	upload_button.click();
	upload_button.sendKeys("C:\\Users\\admin\\Download\\JPGFile.jpg");
	
	driver.findElement(By.id("terms")).click();
	driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
	
}
}