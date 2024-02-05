package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pactice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/stores/page/76D65652-EC1B-4078-AEB9-B2FA4875E5E4/search?_encoding=UTF8&pd_rd_plhdr=t&pd_rd_i=B0BRQ1TQGN&ref_=sbx_be_s_sparkle_ssd&store_ref=SBV_A0960262205YFRXJVCSA9&lp_asins=B0BRQ1TQGN%2CB09P8MVHP2&pd_rd_w=IJfcX&content-id=amzn1.sym.bc0e77cc-908d-4121-87d3-b355b997dda7%3Aamzn1.sym.bc0e77cc-908d-4121-87d3-b355b997dda7&pf_rd_p=bc0e77cc-908d-4121-87d3-b355b997dda7&pf_rd_r=TJ924549P2BBNPN76EJH&pd_rd_wg=igppd&pd_rd_r=20f3dac4-6834-4cd5-9f89-aea7470439a7&terms=Hoddies%20for%20men");
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("T-shirts for men");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("(//input[@type='checkbox'])[1]"));
		
		   for (WebElement  checkbox :  checkboxes ) {
		   
		   checkbox.click();
		
		
		   }
		 
		
		
		
		
	}

}
