package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		////input[@placeholder='Full Name']
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Abhishek Vilas Patil.");
		
		////input[@id='userEmail']
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("patil.abhishek9994@gmail.com");
		
		////textarea[@placeholder='Current Address']
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("Sai silicon vally, A-402, Balewadi raod, Balewadi, Pune, Maharashtra-411045");
		
		////textarea[@id='permanentAddress']
		//
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Shri Samarth Krupa, Near Tasawade Toll Plaza, Tasawade, Karad, Satara, Maharashtra-415109");
	}

}
