package Day3;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkbySir {
	
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	
    WebDriver driver = new ChromeDriver();
			
    driver.get("https://www.bcci.tv/");
    driver.manage().window().maximize();
    
    
    List<WebElement> links = driver.findElements(By.tagName("a"));
 // Iterating each link and checking the response status
 for (WebElement link : links) {
 String url = link.getAttribute("href");
 verifyLink(url);
 }
 }
 private static void verifyLink(String url){
 // TODO Auto-generated method stub
 try {
 // Creating an Object of URL class and passing the URL of each link inside the Constructor.
   URL link = new URL(url);
 //Converting our link to HTTPURLCOnnection and connecting with the server of the  URL
 //This is happening in the Backend, this we cant see in our website.
 HttpURLConnection httpURLConnection = (HttpURLConnection)link.openConnection();
 httpURLConnection.setConnectTimeout(3000); // Set connection timeout to seconds
 httpURLConnection.connect();// Http Request has been sent 
 if (httpURLConnection.getResponseCode() == 200) // if the response code is 200  then the URL is successful- not a broken link
 {
 System.out.println(url + " - " + httpURLConnection.getResponseMessage());
 } 
 else 
 {
 System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
 }
 }// End of Try block
 catch (Exception e)
 {
 System.out.println(url + " - " + "is a broken link");
 }
 }
 
    

}
