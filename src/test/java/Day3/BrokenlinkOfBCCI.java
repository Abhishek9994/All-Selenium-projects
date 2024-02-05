package Day3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenlinkOfBCCI {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	     driver.get("https://www.bcci.tv/");
	     driver.manage().window().maximize();
	     
	     
     	 List<WebElement> links = driver.findElements(By.tagName("a"));
     	 for (WebElement link : links) {
     		 String url=link.getAttribute("href");
     		 verifyLink(url);
			
		}
	
}

	private static void verifyLink(String url) {
		// TODO Auto-generated method stub
		
		try {
			URL link = new URL(url);
			
			HttpURLConnection httpURLConnection = (HttpURLConnection)link.openConnection();
			httpURLConnection.setConnectTimeout(3000);
			httpURLConnection.connect();
			if(httpURLConnection.getResponseCode()==200) {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage());
			}else {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
			}
		}
		catch (Exception e)
		 {
		 System.out.println(url + " - " + "is a broken link");
		 }
		
		
	}
}