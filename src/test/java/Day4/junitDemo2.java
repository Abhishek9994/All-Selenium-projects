package Day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitDemo2 {

WebDriver driver;
	
	@Before
	public void fiststep() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.bcci.tv/");
		driver.manage().window().maximize();	             
}
	

	@Test
	public void screenShot() throws IOException { 
		TakesScreenshot ts =(TakesScreenshot)driver;
        
	      File file1 = ts.getScreenshotAs(OutputType.FILE);
	         
	       File file2 = new File("C:\\Users\\admin\\Pictures\\Screenshot\\image.png");
	       
	        FileUtils.copyFile(file1, file2);
	}
	
	@After
	public void lastStep() {
		driver.close();
	}
	
}