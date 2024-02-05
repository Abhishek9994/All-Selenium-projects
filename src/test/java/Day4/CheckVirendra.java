package Day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckVirendra {

	WebDriver driver;
	@BeforeTest
	public void before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws InterruptedException {
		 driver.findElement(By.id("timerAlertButton")).click();
			Thread.sleep(5000);
			// to handle Pop up - First we have to Switch to the Pop up.
			Alert alert_popup = driver.switchTo().alert();
			Thread.sleep(2000);
			alert_popup.accept();
	}
	@Test
	public void test2() throws InterruptedException{
		driver.findElement(By.id("alertButton")).click();
		// to handle Pop up - First we have to Switch to the Pop up .
		Alert alert_popup = driver.switchTo().alert();
		Thread.sleep(2000);
		alert_popup.accept();
	}
	@AfterTest
	public void aftertest() {
	driver.close();
	}
}
