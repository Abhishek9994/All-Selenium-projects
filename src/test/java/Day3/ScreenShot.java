package Day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
       driver.get("https://www.ebay.com/");
       driver.manage().window().maximize();

      TakesScreenshot ts =(TakesScreenshot)driver;
      
       File file1 = ts.getScreenshotAs(OutputType.FILE);
       
       File file2 = new File("C:\\Users\\admin\\Pictures\\Screenshot\\image.png");
       
       FileUtils.copyFile(file1, file2);
       
      
      






}
}