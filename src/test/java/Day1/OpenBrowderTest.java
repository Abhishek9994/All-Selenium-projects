package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		// ID syntax
		driver.findElement(By.id("head#Head1"));
		driver.findElement(By.id("meta#page_name"));
		driver.findElement(By.id("section#rh_main"));
		driver.findElement(By.id("div#mBWrapper"));
		driver.findElement(By.id("footer#rh_footer_new"));
		driver.findElement(By.id("div#vimeo-record-extension"));
		driver.findElement(By.id("div#root"));
		driver.findElement(By.id("div#accountDataDump"));
		driver.findElement(By.id("#cltd-root"));
		driver.findElement(By.id("div#homeV2-root"));
		
	  // Name syntax 
		driver.findElement(By.className("div.rb_header "));
		driver.findElement(By.className("span.vertical_seperator "));
		driver.findElement(By.className("ul.rb_verticals"));
		driver.findElement(By.className("ul.rb_secondary_items "));
		driver.findElement(By.className("main.rh_content"));
		driver.findElement(By.className("div.msg-header"));
		driver.findElement(By.className("div.msg-success"));
		driver.findElement(By.className("div.msg-error"));
		driver.findElement(By.className("div.offerWrapper"));
		driver.findElement(By.className("div.partialListContainer"));
		
		//CSS selector syntax
		driver.findElement(By.cssSelector("[property='og:title']"));
		driver.findElement(By.cssSelector("[content='Online Bus Ticket Booking with Best Offers and Lowest Price - redBus']"));
		driver.findElement(By.cssSelector("[content='company']"));
		driver.findElement(By.cssSelector("[content='www.redbus.in']"));
		driver.findElement(By.cssSelector("[tabindex='3']"));
		driver.findElement(By.cssSelector("[tabindex='1']"));
		driver.findElement(By.cssSelector("[data-isredirect='True']"));
		driver.findElement(By.cssSelector("[data-url='/info/redcare']"));
		driver.findElement(By.cssSelector("[content='JseePqwPY1canvnThFLN1HSoTTHDfwhf0sUuEJwVUO4']"));
		driver.findElement(By.cssSelector("[rel='canonical']"));
	}

}
