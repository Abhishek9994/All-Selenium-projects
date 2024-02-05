package Day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonscreenshot {

	public static void main(String[] args) throws IOException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=16405110004193929313&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301240&hvtargid=kwd-10573980&hydadcr=14453_2316415)");
		 driver.manage().window().maximize();
		TakesScreenshot ts =(TakesScreenshot)driver;
		
         File file1 = ts.getScreenshotAs(OutputType.FILE);
		
         File file2 = new File("C:\\Users\\admin\\Pictures\\Screenshot\\image.png");
         
        FileUtils.copyFile(file1, file2);
        
         
         
		
	}
	
	
}
