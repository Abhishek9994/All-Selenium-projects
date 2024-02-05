package Day2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowpractice {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
       driver.get("https://www.epfindia.gov.in/site_en/index.php");
       driver.manage().window().maximize();
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//a[@alt='Payroll Data']")).click();
       
       String child_URL =("https://www.epfindia.gov.in/site_en/Estimate_of_Payroll.php");
       
       String parent_tab = driver.getWindowHandle();
       
       Set<String> All_ID = driver.getWindowHandles();
	
       for (String One_ID : All_ID) {
    	   driver.switchTo().window(One_ID);
    	   if(driver.getCurrentUrl().contains(child_URL)) {
    		   break;                 
    	   }
		
	}       
       Thread.sleep(2000);
     driver.findElement(By.xpath("//a[@alt='Covid-19']")).click();
     
     
      String Child_URL = "https://www.epfindia.gov.in/site_docs/PDFs/Circulars/Y2020-2021/FAQ_Reduced_rate_of_contribution_20052020.pdf";
      String parent_WID =driver.getWindowHandle();
      Set<String> COL_Id = driver.getWindowHandles();
      for (String SIN_Id : COL_Id) {
    	  
    	  driver.switchTo().window(SIN_Id);
    	  if(driver.getCurrentUrl().contains(Child_URL)) {
    		  break;
    	  }
		
	}
      Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@alt='ABRY']")).click();
     
     
}
}